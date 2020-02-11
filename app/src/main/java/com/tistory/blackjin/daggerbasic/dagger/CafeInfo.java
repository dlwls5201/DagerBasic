package com.tistory.blackjin.daggerbasic.dagger;

public class CafeInfo {

    private String name;

    public CafeInfo(String name) {
        this.name = name;
    }

    public void welcome() {
        System.out.println("Welcome " + (name == null ? "" : name));
    }
}