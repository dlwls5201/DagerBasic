package com.tistory.blackjin.daggerbasic.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class CafeModule {

    //@Singleton
    @Provides
    CafeInfo provideCafeInfo() {
        return new CafeInfo();
    }

    //@Singleton
    @Provides
    CoffeeMaker provideCoffeeMaker(Heater heater) {
        return new CoffeeMaker(heater);
    }

    //@Singleton
    @Provides
    Heater provideHeater() {
        return new Heater();
    }
}