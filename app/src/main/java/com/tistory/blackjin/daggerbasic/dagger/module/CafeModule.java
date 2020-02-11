package com.tistory.blackjin.daggerbasic.dagger.module;

import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeBean;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CafeModule {

    @Singleton
    @Provides
    CafeInfo provideCafeInfo() {
        return new CafeInfo("BlackJin");
    }

    @Provides
    CoffeeBean provideCoffeeBean() {
        return new CoffeeBean();
    }
}