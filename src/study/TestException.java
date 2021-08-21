package com.example.study;

import java.util.Scanner;

public class TestException {

/*
* Error:错误。
* Exception:异常，java中所有异常的父类
*   编译器异常:除了运行时异常的其他异常。
*           IOException以及子类
*           SQLException以及子类
*           ParseException以及子类
*   运行时异常:RuntimeException以及其子类都是运行时异常
*
* */

    public void testException() {
        System.out.println("请输入数字:");
        Scanner sc = new Scanner(System.in);
        /*
        * 异常处理tcy{}catch(){}finally{}
        * try中程序可能出错，如果出错跳到catch执行
        * throws:抛出异常,并没有被处理，谁调用该方法谁处理异常，主函数类似的方法最好不要抛出异常
        * finally最终处理,写在try-catch后，不能单独使用，这块代码不论有没有出现异常都会执行，可以用来进行垃圾回收
        * */
        try{
//            认为有异常的代码块
            int i = sc.nextInt();
            System.out.println("数字是:"+i);
        }catch (Exception e){
            System.out.println("exception:"+e);
        }finally{
            sc.close();
        }
    }
}
