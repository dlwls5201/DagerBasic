package com.tistory.blackjin.daggerbasic.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = CoffeeMakerModule.class)
public interface CoffeeComponent {

    //생성자에 주입
    CoffeeMaker coffeeMaker();

    //맴버 변수에 주입
    void inject(CoffeeMaker coffeeMaker);

}