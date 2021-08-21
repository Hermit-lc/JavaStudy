package com.example.study;

import java.util.Arrays;
import java.util.Scanner;

public class TestGame {
    /*
    * 生成随机数,猜数
    * Math.random:随机生成一个0-1之间的数,并包含0不包含1
    * */
    public void GuessNumber() {
        Scanner sc = new Scanner(System.in);
        double i = Math.random();

        int num = (int)(i*100);

        for (int j=1;j<=10;j++){
            System.out.println("请猜一个数[0-99]:");
            int input = sc.nextInt();
            if (input==num){
                System.out.println("猜对了！");
                return;
            } else if (input>num){
                System.out.println("比随机数大了");
            }else if (input<num){
                System.out.println("比随机数小了");
            }
        }
        System.out.println("可惜！没有猜到");

    }


    /*
     * 抽奖
     * 随机生成6个红球(1-33)和一个蓝球(1-16)
     * 输入自己的号码,对比
     * 开奖
     * */
    public void Lottery(){
        //红球池
        int [] redPool = new int[33];
        for (int i=0;i<33;i++){
            redPool[i] = i+1;
        }
        //蓝球池
        int [] bluePool = new int[16];
        for (int i=0;i<16;i++){
            bluePool[i] = i+1;
        }
        //奖池
        int [] systemPool = new int[7];

        //随机获取6个红球
        for (int i=0;i<6;i++){
            int index = (int)(Math.random()*redPool.length);
            systemPool[i] = redPool[index];
            //选中的下标之后的元素往前移一位
            for (int y=index;y< redPool.length-i-1;y++){
                redPool[y] = redPool[y+1];
            }
        }
        //获取1个蓝球
        int blueIndex = (int)(Math.random()*bluePool.length)+1;
        systemPool[6] = blueIndex;

        System.out.println(Arrays.toString(systemPool));
        int[] myNum = new int[7];
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个红球号码");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个红球号码");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个红球号码");
        int num3 = sc.nextInt();
        System.out.println("请输入第四个红球号码");
        int num4 = sc.nextInt();
        System.out.println("请输入第五个红球号码");
        int num5 = sc.nextInt();
        System.out.println("请输入第六个红球号码");
        int num6 = sc.nextInt();
        System.out.println("请输入第一个蓝球号码");
        int num7 = sc.nextInt();

    }
}
