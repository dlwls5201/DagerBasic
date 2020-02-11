package com.tistory.blackjin.daggerbasic;

import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeBean;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeMaker;
import com.tistory.blackjin.daggerbasic.dagger.component.CafeComponent;
import com.tistory.blackjin.daggerbasic.dagger.component.CoffeeComponent;
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

        //@SingleTon 이기 때문에 두 객체는 값은 값을 반환합니다.
        System.out.println("cafeInfo1 : " + cafeInfo1.hashCode() + " , cafeInfo2 : " + cafeInfo2.hashCode());

        //카페에서 커피 구성을 생성합니다.
        CoffeeComponent coffeeComponent1 = cafe.coffeeComponent().build();
        CoffeeComponent coffeeComponent2 = cafe.coffeeComponent().build();

        //커피 구성은 생성 할 때마다 다른 객체를 반환해야 합니다.
        System.out.println("coffee1 : " + coffeeComponent1.hashCode() + " , coffee2 : " + coffeeComponent2.hashCode());

        //커피 구성에 커피 메이커는 동일합니다.
        CoffeeMaker coffeeMaker1 = coffeeComponent1.coffeeMaker();
        CoffeeMaker coffeeMaker2 = coffeeComponent1.coffeeMaker();
        System.out.println("coffeeMaker1 : " + coffeeMaker1.hashCode() + " , coffeeMaker2 : " + coffeeMaker2.hashCode());

        //커피기기와 히터는 동일합니다.
        //커피 콩은 카페에서 매번 생성하므로 다릅니다.
        System.out.println();

        CoffeeBean coffeeBean1 = cafe.coffeeBean();
        coffeeMaker1.brew(coffeeBean1);

        System.out.println();

        CoffeeBean coffeeBean2 = cafe.coffeeBean();
        coffeeMaker2.brew(coffeeBean2);
    }
}
