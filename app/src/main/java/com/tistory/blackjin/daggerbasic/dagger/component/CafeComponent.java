package com.tistory.blackjin.daggerbasic.dagger.component;

import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.CoffeeBean;
import com.tistory.blackjin.daggerbasic.dagger.module.CafeModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = CafeModule.class)
public interface CafeComponent {

    CafeInfo cafeInfo();

    CoffeeBean coffeeBean();

    //CoffeeMaker coffeeMaker();
    CoffeeComponent.Builder coffeeComponent();
}
