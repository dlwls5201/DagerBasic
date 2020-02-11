package com.tistory.blackjin.daggerbasic.dagger.bean;

import javax.inject.Inject;

public class BlackBean implements CoffeeBean {

    @Inject
    BlackBean() {

    }

    @Override
    public String name() {
        return "BlackBin";
    }
}
