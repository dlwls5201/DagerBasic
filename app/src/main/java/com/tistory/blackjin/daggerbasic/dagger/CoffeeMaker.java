package com.tistory.blackjin.daggerbasic.dagger;

import javax.inject.Inject;

public class CoffeeMaker {
    private Heater heater;

    @Inject
    public CoffeeMaker(Heater heater) {
        this.heater = heater;
        System.out.println(this.hashCode() + " -> heater : " + heater.hashCode());
    }

    public void brew(CoffeeBean coffeeBean) {
        if (heater != null) {
            System.out.println("CoffeeBeen(" + coffeeBean.hashCode() + ") [_]P coffee! [_]P ");
        } else {
            System.out.println("heater is null");
        }
    }
}