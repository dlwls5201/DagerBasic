package com.tistory.blackjin.daggerbasic.dagger;

public class CoffeeMaker {

    private Heater heater;

    public CoffeeMaker(Heater heater) {
        this.heater = heater;
    }

    public void brew(CoffeeBean coffeeBean) {
        if (heater == null) {
            System.out.println("heater null");
        } else {
            System.out.println("brew");
            System.out.println("coffeeMaker : " + hashCode() + " , heater : " + heater.hashCode());
            System.out.println("coffeeBean name : " + coffeeBean.name() + " , hashCode : " + coffeeBean.hashCode());
        }
    }
}