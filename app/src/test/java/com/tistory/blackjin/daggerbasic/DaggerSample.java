package com.tistory.blackjin.daggerbasic;

import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.component.CafeComponent;
import com.tistory.blackjin.daggerbasic.dagger.component.DaggerCafeComponent;
import com.tistory.blackjin.daggerbasic.dagger.module.CafeModule;

import org.junit.Test;

public class DaggerSample {

    @Test
    public void sample() {

        //카페를 생성합니다.
        CafeComponent cafe = DaggerCafeComponent.create();

        CafeInfo cafeInfo = cafe.cafeInfo();
        cafeInfo.welcome();

        System.out.println("bean : " + cafe.coffeeBean().get("black").name());
        System.out.println("bean : " + cafe.coffeeBean().get("white").name());
    }
}
