package com.tistory.blackjin.daggerbasic.dagger.module;

import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeBean;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeMaker;
import com.tistory.blackjin.daggerbasic.dagger.Heater;

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

    @Provides
    CoffeeMaker provideCoffeeMaker(Heater heater) {
        return new CoffeeMaker(heater);
    }

    @Provides
    Heater provideHeater() {
        return new Heater();
    }
}