package com.tistory.blackjin.daggerbasic.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = CafeModule.class)
public interface CafeComponent {

    CafeInfo cafeInfo();

    //CoffeeMaker coffeeMaker();
    CoffeeComponent.Builder coffeeComponent();
}
