package com.example.study;

import java.util.Date;

/*
* StringBuffer:线程安全的带缓冲区的可变字符串
* 相当于字符串拼接,不会生成新的对象
* 遇到大量字符串处理一定要使用StringBuffer
* */

public class TestStringBuffer {

    public void stringBuffer() {

        String str = new String("abc");//创建两个对象:‘abc’、‘String’
        String str1 = "abc";//创建一个对象:‘abc’
        str1 = str+str1;//创建一个新对象:‘abcabc’

        StringBuffer sb = new StringBuffer(str1);
        sb.append(str);
        System.out.println(sb);

//      删除
        sb.delete(2,3);
        System.out.println(sb);

//      插入
        sb.insert(2,"中国");
        System.out.println(sb);

//      替换
        sb.replace(3,5,"bababa");
        System.out.println(sb);

//      效率测试
//      Date对象获取当前电脑时间
        System.out.println("String拼接开始:"+new Date());
        String strs="";
        for (int i=0;i<50000;i++){
            strs+=i;
        }
        System.out.println("String拼接结束:"+new Date());

        System.out.println("StringBuffer拼接开始:"+new Date());
        System.out.println("StringBuffer");
        StringBuffer sb1 = new StringBuffer("");
        for (int i=0;i<50000;i++){
            sb1.append(i);
        }
        System.out.println("StringBuffer拼接结束:"+new Date());

    }
}
