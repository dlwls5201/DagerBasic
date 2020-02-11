package com.tistory.blackjin.daggerbasic.dagger.component;

import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.bean.CoffeeBean;
import com.tistory.blackjin.daggerbasic.dagger.module.CafeModule;

import java.util.Map;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = CafeModule.class)
public interface CafeComponent {

    CafeInfo cafeInfo();

    Map<String,CoffeeBean> coffeeBean();
}
