package com.tistory.blackjin.daggerbasic;

import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeBean;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeMaker;
import com.tistory.blackjin.daggerbasic.dagger.component.CafeComponent;
import com.tistory.blackjin.daggerbasic.dagger.component.CoffeeComponent;
import com.tistory.blackjin.daggerbasic.dagger.component.DaggerCafeComponent;
import com.tistory.blackjin.daggerbasic.dagger.module.CafeModule;

import org.junit.Test;

public class DaggerSample {

    @Test
    public void sample() {

        //카페를 생성합니다.
        CafeComponent cafe = DaggerCafeComponent.builder()
                .cafeModule(new CafeModule("Tistory World"))
                .build();

        CafeInfo cafeInfo = cafe.cafeInfo();
        cafeInfo.welcome();
    }
}
