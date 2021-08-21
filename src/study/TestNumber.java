package com.example.study;

import java.util.Scanner;

public class TestNumber {

    /*
    * 判断是否是质数
    * */
    public void ifPrimeNumber(){
        System.out.println("[判断质数]请输入一个数:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean bool = false;
        int i =2;
        while(i<num){
            if (num%i==0){
                bool = true;
                break;
            }
            i++;
        }

        if (bool) {
            System.out.println(num+"不是质数");
        }else{
            System.out.println(num+"是质数");
        }
    }

    /*
    * 求100内的质数和
    * */
    public void sumPrimeNumber(){
        System.out.print("100以内的质数和:");
        int sum = 0;

        for (int num =2;num<=100;num++){
            boolean b = false;
            for (int i=2;i<num;i++){
                if (num%i==0){
                    b = true;
                    break;
                 }
            }
            if (!b){
                sum+=num;
            }
        }
        System.out.println(sum);
    }

    /*
     * 反转一个数字
     * break:结束循环
     * continue:跳出本次循环继续下次循环
     * */
    public static void reverse() {
        Scanner sc = new Scanner(System.in);
        System.out.println("[数字反转]请输入一个数字:");
        int num = sc.nextInt();
        int reverseNum = num;
        while(reverseNum>0){
            System.out.print(reverseNum%10);
            reverseNum = reverseNum/10;
        }
    }

    /*
     * 位运算符:在二进制上进行运算
     *
     * .equals():比较内容 一般常量在左边
     * ==:比较内存地址值
     * 比较String类型需要.equals()方法
     *
     *三元运算符:min=x>y?y:x
     * */

    public void operator() {
        String s1 = "123456";
        String s2 = new String("123456");
        System.out.println(s1.equals(s2));//true
        System.out.println(s1==s2);//false
    }

    /*
    * 求100以内的奇数和与偶数和
    * */
    public void sum(){
        int oddSum = 0;
        int evenSum = 0;

        for (int i=1;i<=100;i=i+2){
            oddSum +=i;
        }
        for (int i=0;i<=100;i=i+2){
            evenSum +=i;
        }
        System.out.println("100以内奇数和为:"+oddSum);
        System.out.println("100以内偶数和为:"+evenSum);
    }



    //计算方法
    public void calculate(){
        Scanner scanner = new Scanner(System.in);
        double num1 = scanner.nextDouble();
        String type = scanner.next();
        double num2 = scanner.nextDouble();

        double result = -1;
        if ("+".equals(type)){
            result = num1+num2;
        }else if ("-".equals(type)){
            result = num1-num2;
        }else if ("*".equals(type)){
            result = num1*num2;
        }else if ("/".equals(type)){
            if (num2==0.0){
                System.out.println("除数不能为0");
                return;
            }
            result = num1/num2;
        }else{
            System.out.println("运算符错误");
        }
        System.out.println(result);
    }

}
