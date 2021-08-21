package com.example.exercise;
import java.util.Scanner;

/*
* 特殊数问题
* */

public class Number {

    /*
    * 输入一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
    * */
    public static void test1() {
        System.out.println("请输入一个5位数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (9999 < num && num < 100000) {
            int num1 = num/10000;
            int num2 = num/1000%10;
            int num3 = num/100%10;
            int num4 = num/10%10;
            int num5 = num%10;
            if(num1 == num5 && num2 == num4) {
                System.out.println(num+"是回文数");
            }else {
                System.out.println(num+"不是回文数。");
            }
        }else {
            System.out.println("输入的不是一个5位数");
        }
    }

    /*
    * 水仙花数:三位数,各位数字的立方和等于该数本身
    * */
    public void test2(){
        int num1 = 0;
        int num2 = 0;
        int num3 = 0;
        for (int i=100;i<1000;i++){
            num1 = i%10;
            num2 = i/10%10;
            num3 = i/100%10;
            if (num1*num1*num1+num2*num2*num2+num3*num3*num3==i){
                System.out.println(i+"是水仙花数");
            }
        }
    }
}
