package com.tistory.blackjin.daggerbasic;

import com.tistory.blackjin.daggerbasic.dagger.CafeComponent;
import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeBean;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeComponent;
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

        CoffeeComponent coffeeComponent1 = cafeComponent.coffeeComponent().build();
        CoffeeComponent coffeeComponent2 = cafeComponent.coffeeComponent().build();
        System.out.println("coffeeComponent1 : " + coffeeComponent1.hashCode() + " , coffeeComponent2 : " + coffeeComponent2.hashCode());

        CoffeeMaker coffeeMaker1 = coffeeComponent1.coffeeMaker();
        CoffeeMaker coffeeMaker2 = coffeeComponent1.coffeeMaker();
        CoffeeMaker coffeeMaker3 = coffeeComponent2.coffeeMaker();
        System.out.println("coffeeMaker1 : " + coffeeMaker1.hashCode() + " , coffeeMaker2 : " + coffeeMaker2.hashCode() + " , coffeeMaker3 : " + coffeeMaker3.hashCode());

        CoffeeBean coffeeBean1 = coffeeComponent1.coffeeBean();
        CoffeeBean coffeeBean2 = coffeeComponent1.coffeeBean();
        System.out.println("coffeeBean1 : " + coffeeBean1.hashCode() + " , coffeeBean2 : " + coffeeBean2.hashCode());

    }
}
