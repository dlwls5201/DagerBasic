package com.tistory.blackjin.daggerbasic

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class MyModule {
    @Provides
    fun provideHelloWorld(): String {
        return "Hello World"
    }
}


@Component(modules = [MyModule::class])
interface MyComponent {
    
    fun getString(): String

    fun inject(myClass: MyClass)
}

class MyClass {
    @Inject
    lateinit var str: String
}
