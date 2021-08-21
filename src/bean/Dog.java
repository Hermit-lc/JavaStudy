package com.example.bean;

//狗类，继承动物类
public class Dog extends Animal{

    @Override
    public void eat(){
        System.out.println("狗狗吃骨头");
    }
}
