package com.tistory.blackjin.daggerbasic;

import com.tistory.blackjin.daggerbasic.dagger.CafeComponent;
import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeMaker;
import com.tistory.blackjin.daggerbasic.dagger.DaggerCafeComponent;

import org.junit.Test;

//https://cmcmcmcm.blog/2017/08/02/didependency-injection-%ec%99%80-dagger2-2/
public class DaggerSample {

    @Test
    public void sample() {

        CafeComponent cafeComponent = DaggerCafeComponent.create();

        CafeInfo cafeInfo1 = cafeComponent.cafeInfo();
        CafeInfo cafeInfo2 = cafeComponent.cafeInfo();
        System.out.println("cafeInfo1 : " + cafeInfo1.hashCode() + " , cafeInfo2 : " + cafeInfo2.hashCode());

        CoffeeMaker coffeeMaker1 = cafeComponent.coffeeMaker();
        CoffeeMaker coffeeMaker2 = cafeComponent.coffeeMaker();
        System.out.println("coffeeMaker1 : " + coffeeMaker1.hashCode() + " , coffeeMaker2 : " + coffeeMaker2.hashCode());

    }
}
