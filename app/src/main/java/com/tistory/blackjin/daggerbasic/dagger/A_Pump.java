package com.tistory.blackjin.daggerbasic.dagger;

public class A_Pump implements Pump {

    private final Heater heater;

    A_Pump(Heater heater) {
        this.heater = heater;
    }

    public void pump() {
        if (heater.isHot()) {
            System.out.println("A_Pump => => pumping => =>");
        }
    }
}