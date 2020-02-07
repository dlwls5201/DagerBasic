package com.tistory.blackjin.daggerbasic.dagger;

public class A_Heater implements Heater {

    boolean heating;

    public void on() {
        this.heating = true;
    }

    public void off() {
        this.heating = false;
    }

    public boolean isHot() {
        return heating;
    }
}