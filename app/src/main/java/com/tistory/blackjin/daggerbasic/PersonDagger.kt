package com.tistory.blackjin.daggerbasic

import dagger.Component
import dagger.Module
import dagger.Provides
import javax.inject.Inject

@Module
class PersonModule {
    @Provides
    fun provideName(): String {
        return "BlackJin"
    }

    @Provides
    fun provideAge(): Int {
        return 100
    }
}

@Component(modules = [PersonModule::class])
interface PersonComponent {

    fun getPersonA(): PersonA

    fun inject(personB: PersonB)
}

data class PersonA @Inject constructor(val name: String, val age: Int)

class PersonB {

    @Inject // 필드 주입
    lateinit var name: String

    private var age = 0

    @Inject // 메서드 주입
    fun setMyAge(age: Int) {
        this.age = age
    }

    override fun toString(): String {
        return "name : $name , age : $age"
    }
}
