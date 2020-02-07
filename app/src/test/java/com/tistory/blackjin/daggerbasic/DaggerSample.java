package com.tistory.blackjin.daggerbasic;

import com.tistory.blackjin.daggerbasic.dagger.CoffeeComponent;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeMaker;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeMakerModule;
import com.tistory.blackjin.daggerbasic.dagger.DaggerCoffeeComponent;

import org.junit.Test;

public class DaggerSample {

    @Test
    public void sample1() {

        //생성자 주입 사용
        CoffeeMaker coffeeMaker1 = DaggerCoffeeComponent.create().coffeeMaker();
        coffeeMaker1.brew();

        //변수 주입 사용
        CoffeeMaker coffeeMaker2 = new CoffeeMaker();
        DaggerCoffeeComponent.create().inject(coffeeMaker1);
        coffeeMaker2.brew();
    }

    @Test
    public void sample2() {

        //빌더 패턴 사용
        //모듈을 따로 지정해 줄 수 있습니다.
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder()
                .coffeeMakerModule(new CoffeeMakerModule()).build();

        //생성자 주입
        coffeeComponent.coffeeMaker().brew();

        //변수 주입
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeComponent.inject(coffeeMaker);
        coffeeMaker.brew();
    }

    @Test
    public void sample3() {

        //@SingleTone 추가해주면 설정을 하게되면 같은 객체가 생성됩니다.
        CoffeeMaker coffeeMaker1 = new CoffeeMaker();
        CoffeeMaker coffeeMaker2 = new CoffeeMaker();

        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.create();

        coffeeComponent.inject(coffeeMaker1);
        coffeeComponent.inject(coffeeMaker2);

        coffeeMaker1.brew();
        coffeeMaker2.brew();
    }
}
