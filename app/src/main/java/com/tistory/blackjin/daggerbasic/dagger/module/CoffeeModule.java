package com.tistory.blackjin.daggerbasic.dagger.module;

import com.tistory.blackjin.daggerbasic.dagger.CoffeeMaker;
import com.tistory.blackjin.daggerbasic.dagger.Heater;
import com.tistory.blackjin.daggerbasic.dagger.scope.CoffeeScope;

import dagger.Module;
import dagger.Provides;

@Module
public class CoffeeModule {

    @CoffeeScope
    @Provides
    CoffeeMaker provideCoffeeMaker(Heater heater) {
        return new CoffeeMaker(heater);
    }

    @CoffeeScope
    @Provides
    Heater provideHeater() {
        return new Heater();
    }

}
