package com.tistory.blackjin.daggerbasic.dagger;

import javax.inject.Inject;

public class CoffeeMaker {

    @Inject
    Heater heater;

    @Inject
    Pump pump;

    @Inject
    CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public CoffeeMaker() {

    }

    public void brew() {
        System.out.println("heater : " + heater.hashCode() + " , pump : " + pump.hashCode());

        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}