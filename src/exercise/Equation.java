package com.example.exercise;

/*
* 方程式问题
* */

public class Equation {

    /*
    * 两位数X，8*X的结果为两位数，9*X的结果为3位数
    * 求X代表的两位数，及809*X后的结果
    * */
    public static void test1() {
        int number = 0;
        boolean flag = false;

        for(int i=10;i<100;i++){
            int j = 8*i;
            int k = 9*i;
            if(j>=10&&j<=100&&k>=100&&k<=999){
                    flag = true;
                    number = i;
            }
        }
        System.out.println(number);
        System.out.println(number*809);
    }
}
