package com.example.exercise;

import com.example.exercise.Circle;
import java.util.Scanner;

/*
* 编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
*       一个成员变量  double height（私有，浮点型）;圆柱体的高；
*       构造方法 Cylinder (double r, double  h ) ;创建Circle对象时将半径初始化为r
*       成员方法 double getVolume( ) ;  获取圆柱体的体积
*               void  showVolume( ) ; 将圆柱体的体积输出到屏幕
* */
public class Cylinder extends Circle {
    private double height;
    public Cylinder(double r,double h) {
        this.radius = r;
        this.height = h;
    }
    public double getVolume(){
        double Volume;
        final double PI = 3.14;
        Volume = 2*PI*radius*height/2;
        return Volume;
    }
    public void showVolume(){
        System.out.println("圆柱的体积是"+getVolume()+"m³");
    }
}



