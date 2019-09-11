package com.tistory.blackjin.daggerbasic;

import com.tistory.blackjin.daggerbasic.dagger.CoffeeComponent;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeMaker;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeMakerModule;
import com.tistory.blackjin.daggerbasic.dagger.DaggerCoffeeComponent;

import org.junit.Test;

//https://cmcmcmcm.blog/2017/07/27/didependency-injection-%ec%99%80-dagger2/
public class DaggerSample {

    private CoffeeMaker coffeeMaker1 = new CoffeeMaker();
    private CoffeeMaker coffeeMaker2 = new CoffeeMaker();

    @Test
    public void sample() {

        //생성자 주입 사용
        CoffeeMaker coffeeMaker = DaggerCoffeeComponent.create().coffeeMaker();
        coffeeMaker.brew();

        //변수 주입 사용
        //coffeeMaker1 변수에 주입
        DaggerCoffeeComponent.create().inject(coffeeMaker1);
        coffeeMaker1.brew();

        //빌더 패턴 사용
        //이 경우 모듈을 지정해 줄 수 있다.
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder()
                .coffeeMakerModule(new CoffeeMakerModule()).build();

        /**
         * Single Tone 설정을 하게되면 같은 객체가 생성됩니다.
         */
        coffeeComponent.inject(coffeeMaker2);
        coffeeComponent.inject(coffeeMaker1);

        coffeeMaker1.brew();
        coffeeMaker2.brew();

    }
}
