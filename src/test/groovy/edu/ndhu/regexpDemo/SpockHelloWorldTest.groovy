package edu.ndhu.regexpDemo


import spock.lang.Specification

/**
 * Created by tedc on 10/15/14.
 */
class SpockHelloWorldTest extends Specification {
    def "SayHello"() {
        expect:
        hello == "Hello !!"

        where:
        hello = new SpockHelloWorld().sayHello()
    }
}
