package com.tistory.blackjin.daggerbasic

import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun testHelloWorld() {
        val myComponent = DaggerMyComponent.create()
        println("result : ${myComponent.getString()}")
    }

    @Test
    fun testMemberInjection() {
        val myClass = MyClass()
        val myComponent = DaggerMyComponent.create()
        myComponent.inject(myClass)

        val str = myClass.str
        println("str : $str")
    }

    @Test
    fun testInjection() {
        val personComponent = DaggerPersonComponent.create()

        val personA = personComponent.getPersonA()
        println("personA : $personA")

        val personB = PersonB()
        personComponent.inject(personB)
        println("personB : $personB")
    }
}