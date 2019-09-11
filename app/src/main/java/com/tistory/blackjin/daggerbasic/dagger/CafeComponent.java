package com.tistory.blackjin.daggerbasic.dagger;

import dagger.Component;

//@Singleton
@Component(modules = CafeModule.class)
public interface CafeComponent {

    CafeInfo cafeInfo();

    CoffeeMaker coffeeMaker();
}
