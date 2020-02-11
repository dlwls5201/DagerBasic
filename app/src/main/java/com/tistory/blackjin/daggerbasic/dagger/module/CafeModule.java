package com.tistory.blackjin.daggerbasic.dagger.module;

import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeBean;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CafeModule {

    private String cafeName;

    public CafeModule(String cafeName) {
        this.cafeName = cafeName;
    }

    @Singleton
    @Provides
    CafeInfo provideCafeInfo() {
        return new CafeInfo(cafeName);
    }

    @Provides
    CoffeeBean provideCoffeeBean() {
        return new CoffeeBean();
    }
}