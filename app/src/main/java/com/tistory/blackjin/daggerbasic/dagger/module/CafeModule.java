package com.tistory.blackjin.daggerbasic.dagger.module;

import com.tistory.blackjin.daggerbasic.dagger.bean.BlackBean;
import com.tistory.blackjin.daggerbasic.dagger.CafeInfo;
import com.tistory.blackjin.daggerbasic.dagger.bean.CoffeeBean;
import com.tistory.blackjin.daggerbasic.dagger.bean.WhiteBean;

import javax.inject.Singleton;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
public abstract class CafeModule {

    @Singleton
    @Provides
    static CafeInfo provideCafeInfo() {
        return new CafeInfo("BlackJin");
    }

    @Binds
    @IntoMap
    @StringKey("black")
    abstract CoffeeBean provideBlackCoffeeBean(BlackBean blackBean);

    @Binds
    @IntoMap
    @StringKey("white")
    abstract CoffeeBean provideWhiteCoffeeBean(WhiteBean whiteBean);
}