package com.example.bean;

/*
* 继承:
*   继承是从已有的类中派生出新的类，新的类能吸收已有类的数据属性和行为，并能扩展新的能力。
*   在程序设计中可以通过继承来删减同一类事物的相同代码。
*   降低类之间的耦合。
*
*   1. 子类继承父类非私有属性和方法。
*   2. 子类无法继承父类的构造方法。但是子类在创建对象之前必先创建父类对象(在子类的构造方法中会默认调用父类的无参构造方法)。
*   3. Java只能单继承,一个类只能有一个直接父类。
*   4. 如果子类重写了父类中的方法,不管怎么调用全部执行的是子类重写后的方法。
*   5. 在Java中(除了8种基本数据类型),所有的类全部直接或间接的继承Object方法。
*   6. 子类在创建对象时先加载父类再加载子类
*
* super:在子类中代表父类对象,可以通过super调用父类的方法和属性。
*   1. 在子类的构造方法中调用父类的构造方法,必须写在第一行。
*   2. 在子类的方法中通过super调用父类的属性以及方法。先执行父类的静态方法-->子类的静态方法-->父类的非静态方法-->子类的非静态方法
*
* this:在构造方法中区分局部变量和全局变量。表示本类对象，在方法中调用另一个方法。
*
* static:使用static修饰的属性和方法是类成员，类成员是属于类的。
*   实例成员:普通的属性和方法(非static修饰)，实例成员必须要使用对象调用。
*   1. 使用static修饰的属性是所有该类实例共享的属性。一般使用类名调用。
*   2. 静态(类成员)在类加载时就已经执行了，此时对象还没有创建。
*   3. 静态成员无论对象创建多少个只会执行一次。因为类只加载一次。
*   4. 在静态方法中无法调用普通方法，也无法使用this和super关键字。
*
* 静态代码块:
*   static{}:用来给静态变量赋初始值。
*   静态代码块随着类一起加载。
*
* final:常量，使用final修饰的变量是常量，常量在创建时必须要赋值，定义后不可改变，常量名全部大写。
*
* Object:所有类的直接或间接父类。
*       hashCode():返回对象的哈希码值
*       finalize():当垃圾回收确定不再有对象的引用时，垃圾收集器在对象上调用该对象
*       toString():返回对象的字符串表示形式
*       .equals():指示一些其他对象是否等于此
* */

//猫类，继承动物类
public class Cat extends Animal{
    /*
     * 方法重写:当子类继承至父类的方法不满足子类的业务逻辑时需要重写子类继承的该方法。
     *   1. 子类方法定义的访问范围必须比父类大。
     * */
    @Override
    public void eat() {
        System.out.println("猫猫在吃鱼");
    }

}

