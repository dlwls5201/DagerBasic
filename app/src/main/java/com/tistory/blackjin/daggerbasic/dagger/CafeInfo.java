package com.tistory.blackjin.daggerbasic.dagger;

import javax.inject.Inject;

public class CafeInfo {

    private String name;

    @Inject
    CafeInfo() {
    }

    public CafeInfo(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Welcome " + (name == null ? "" : name));
    }

}