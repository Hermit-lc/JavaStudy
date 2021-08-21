package com.example.exercise;

import java.util.Scanner;

/*
* 编写一个圆类Circle，该类拥有：
* 一个成员变量  radius(私有，浮点型);存放圆的半径；
* 两个构造方法 Circle( );将半径设为0
*            Circle(double r);创建Circle对象时将半径初始化为r
* double getArea( );获取圆的面积
* double getPerimeter( );获取圆的周长
* void show( );将圆的半径、周长、面积输出到屏幕
* */

public class Circle {
    double radius;
    public final float PI = 3.14f;

    public Circle() { radius = 0; }

    public Circle(double r) {
        this.radius = r;
    }

    public double getArea(double r){
        double area;
        area = PI*r*r;
        return area;
    }

    public double getPerimeter(double r){
        double perimeter;
        perimeter = 2*PI*r;
        return perimeter;
    }
    public void show(){
        System.out.println("圆的半径:"+radius+"厘米");
        System.out.println("圆的周长:"+getPerimeter(radius)+"厘米");
        System.out.println("圆的面积:"+getArea(radius)+"平方厘米");
    }

}
