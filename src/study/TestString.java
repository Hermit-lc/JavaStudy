package com.example.study;

public class TestString {
    /*
    * String对象:字符串不变，它们的值在创建后不能被更改。
    * 字符串也有下标，从0开始。
    * */

    //统计字符串中每个字符出现的次数。
    public void statistics(){
            String str = "leeString";

        /*在统计一个字符前判断该字符有没有出现过，如果没有出现过说明已经统计过*/
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);//接收字符
            int num = 0;//计算出现次数
            boolean flag = true;//判断是否出现过

            //判断i之前有没有出现该字符
            for (int y = 0; y < i; y++) {
                if (c==str.charAt(y)){
                    //如果出现过了，结束这个字符的循环
                    flag = false;
                    break;
                }
            }
            //如果flag为true说明没有出现过，需要统计
            if (flag) {
                //将字符和字符串中每一个字符比较
                for (int n = 0; n < str.length(); n++) {
                    if (c == str.charAt(n)) {
                        num++;
                    }
                }
                System.out.println(c + "出现了" + num + "次");
            }
        }
    }
}
