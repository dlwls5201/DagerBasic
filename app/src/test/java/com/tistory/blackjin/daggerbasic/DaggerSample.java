package com.tistory.blackjin.daggerbasic;

import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeBean;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeMaker;
import com.tistory.blackjin.daggerbasic.dagger.component.CafeComponent;
import com.tistory.blackjin.daggerbasic.dagger.component.DaggerCafeComponent;

import org.junit.Test;

public class DaggerSample {

    @Test
    public void sample() {

        //카페를 생성합니다.
        CafeComponent cafe = DaggerCafeComponent.create();

        //생성한 카페 정보를 가져옵니다.
        CafeInfo cafeInfo1 = cafe.cafeInfo();
        CafeInfo cafeInfo2 = cafe.cafeInfo();

        cafeInfo1.welcome();
        cafeInfo2.welcome();
        System.out.println();

        //@SingleTon 이기 때문에 두 객체는 값은 값을 반환합니다.
        System.out.println("cafeInfo1 : " + cafeInfo1.hashCode() + " , cafeInfo2 : " + cafeInfo2.hashCode());

        CoffeeMaker coffeeMaker1 = cafe.coffeeMaker();
        CoffeeMaker coffeeMaker2 = cafe.coffeeMaker();

        System.out.println("coffeeMaker1 : " + coffeeMaker1.hashCode() + " , coffeeMaker2 : " + coffeeMaker2.hashCode());

        CoffeeBean coffeeBean = cafe.coffeeBean();

        System.out.println();
        coffeeMaker1.brew(coffeeBean);

        System.out.println();
        coffeeMaker2.brew(coffeeBean);
    }
}
