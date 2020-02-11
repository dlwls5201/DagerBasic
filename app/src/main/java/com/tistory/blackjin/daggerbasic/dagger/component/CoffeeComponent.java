package com.tistory.blackjin.daggerbasic.dagger.component;

import com.tistory.blackjin.daggerbasic.dagger.CoffeeMaker;
import com.tistory.blackjin.daggerbasic.dagger.module.CoffeeModule;
import com.tistory.blackjin.daggerbasic.dagger.scope.CoffeeScope;

import dagger.Subcomponent;

@CoffeeScope
@Subcomponent(modules = {CoffeeModule.class})
public interface CoffeeComponent {

    CoffeeMaker coffeeMaker();

    @Subcomponent.Builder
    interface Builder {
        CoffeeComponent build();
    }
}
