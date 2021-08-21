package com.example.study;

public class TestSingleton {

    /*
    * 单例模式:内存中只能存在该类的一个实例。
    *   1. 私有化构造方法。
    *   2. 定义一个私有的静态的本类变量,并且实例化。
    *   3. 提供一个公共的静态的方法返回本类类型的实例。
    * */
    private  static TestSingleton sl = new TestSingleton();
    private TestSingleton(){

    }

    public static TestSingleton init(){
        return sl;
    }

    public void eat(){
        System.out.println("吃的真饱！");
    }

    public static void main(String[] args) {
        TestSingleton s1 = TestSingleton.init();
        TestSingleton s2 = TestSingleton.init();
        s1.eat();
        s2.eat();
        System.out.println(s1==s2);//判断对象内存地址值。
    }

}
