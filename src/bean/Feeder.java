package com.example.bean;

//食物类
public class Feeder {

    public void feed(Animal animal){

        /*
         * 多态:
         *    一个对象的多种形态。
         *    程序中定义的引用变量指向的具体类型和发出的方法调用在编程时不确定，在程序运行时才确定。
         *    一个引用变量指向哪个实例对象，调用哪个类的方法，在程序运行时才确定具体的类。
         *    让一个引用变量绑定在不同的实现上，不用修改源码可以改变程序运行时的具体实现代码，让程序可以选择多个运行状态，这就是多态性。
         * 特点:
         *   1. 多态建立在继承关系上。
         *   2. 如果子类重写了父类中的方法，父类的引用在调用该方法时是子类重写后的方法。(多态实现原理)
         *   3. 父类的引用只能调用子类和父类共有的方法(也就是父类中的方法)，不能调用子类独有的方法。
         *   4. 子类类型可以自动转换为父类类型，但是父类类型需要强制类型转换为子类。
         * 优点:
         *   1. 清除类型之间的耦合关系
         *   2. 可扩充性
         *   3. 接口性
         *   4. 灵活性
         *   5. 简化性
         * */

        //这里不确定调用的方法，多态的体现
        //instanceof:判断当前对象是否是该类的一个实例，如果是返回true。
        //多态可以实现不改变原有的代码，增加新的功能。
        if(animal instanceof Cat){
            Cat cat = new Cat();
            cat.eat();
        }
        if(animal instanceof Dog){
            Dog dog = new Dog();
            dog.eat();
        }
        animal.eat();
    }

    public static void main(String[] args) {
        Feeder feeder = new Feeder();
        Cat cat = new Cat();
        Dog dog = new Dog();
        feeder.feed(cat);
        feeder.feed(dog);

    }
}
