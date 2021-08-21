package com.example.exercise;

/*
* 分配问题
*
* */
public class Distribute {

    /*
    * 百元百鸡：
    *  公司有100员工有100块钱保证每一个员工都得有一张票；
    *  中国馆 5元一张；
    *  美国馆 3元一张；
    *  日本馆 一元3张
    *  请问一共有几种方案打印出每一种方案。备注，100块钱刚刚用完，每个人都有且只有一张票
    * */
    public void HundredChicken() {
        //中国馆票数
        for(int i = 1 ;i < 20 ;i++) {
            //美国馆票数
            for(int j = 1 ;j < 33 ;j++) {
                //日本馆票数
                int k = 100-i-j;//

                //钱数
                double money = i*5 + j*3+ k*0.33;
                if(money <= 100.0) {
                    System.out.println("中国馆:"+i+",美国馆:"+j+",日本馆:"+k);
                }
            }
        }
    }
}
