package com.example.controller;

import com.example.study.TestCollection;

public class UserController {

    int age;//实例属性
    static int money;//类属性

    public static void main(String[] args) {

        //多态
        /*
        Feeder feeder = new Feeder();
        Cat cat = new Cat();
        Dog dog = new Dog();
        feeder.feed(cat);
        feeder.feed(dog);
        */

        TestCollection tc = new TestCollection();
        tc.testLinkedList();
    }
}
