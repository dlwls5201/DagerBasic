package com.tistory.blackjin.daggerbasic.dagger.bean;

import javax.inject.Inject;

public class WhiteBean implements CoffeeBean {

    @Inject
    WhiteBean() {

    }

    @Override
    public String name() {
        return "WhiteBin";
    }
}
