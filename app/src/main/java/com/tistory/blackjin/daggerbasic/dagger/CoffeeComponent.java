package com.tistory.blackjin.daggerbasic.dagger;

import dagger.Subcomponent;

@CoffeeScope
@Subcomponent(modules = {CoffeeModule.class})
public interface CoffeeComponent {

    CoffeeMaker coffeeMaker();

    CoffeeBean coffeeBean();

    @Subcomponent.Builder
    interface Builder {
        CoffeeComponent build();
    }
}
