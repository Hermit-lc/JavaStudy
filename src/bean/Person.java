package com.example.bean;

/*
* 包机制:
* package--使用该包下的所有对象
* import--导入该包下的所有对象
* */

/*
* 面向对象:
*   类:一类事物共同特征的抽象描述
*   对象:类的具体事例
*   类是对象的模板
*
* 四种访问修饰符:
*   public:公共--可以在任意类任意包中访问
*   private:私有--只允许在本类中访问
*   protected:受保护的--允许在本类，本包，子类中访问
*   默认的--允许在本类，本包中访问
* */

//一个类中只写跟该类有关的代码:低耦合高内聚
//人类  继承Comparable重写自定义排序规则->TestCollection->treeSet
public class Person implements Comparable{
    /*
    * 封装:
    *   所有属性必须私有化，根据需求提供get/set方法
    *   属性:私有化属性，并且给每个属性提供get/set方法对其访问
    *   方法:把相同的功能代码集中写在方法中，方法一般是public
    *
    * 全局属性:直接定义在类中的属性
    * 局部属性:定义在方法内的属性
    * 区别:
    *   1.全局属性在使用前如果不赋值,系统会赋默认值,局部属性在使用前必须赋值
    *   2.局部变量的名字可以和全局变量一致,但是使用时默认使用局部变量,不建议名字一致
    *   3.全局变量的作用域是整个类,局部变量作用域在方法内
    *
    * 参数:方法在执行之前需要动态的给定一些数据,那么这些数据就通过参数的方式传递到方法内部
    *   1.在调用该方法时传递的参数类型以及顺序必须和定义时一致
    *   2.如果方法有返回值在定义方法的必须把void替换成对应类型返回值,方法执行完后必须在最后使用return返回对应类型的结果
    * */
    private String name;
    private int age;
    private int grade;

    /*
     * 方法重载:在一个类中方法名一致,但是参数列表(个数或顺序)不同就实现了方法的重载,根据传入的参数执行对应方法,是否有返回值不影响重载的效果。
     * */
    public void print(){
        System.out.println("有猪头,但我不说是谁");
    }

    public void print(String name){
        System.out.println("猪头"+name);
    }

    /*
     * 构造方法:
     *   修饰符 类名(参数列表){
     *       方法体;
     *   }
     * 注意:
     *   1.构造方法没有返回值(void都没有),并且方法名必须和类名一致。
     *   2.系统会给所有的类提供一个默认的无参构造方法,该方法是隐藏的,如果显式的写了自定义构造方法,那么系统默认的无参数构造方法就会销毁。
     * 作用:
     *   1.用来创建对象,也就是对象在创建之前必须要执行构造方法。
     *   2.用来赋初始值。
     * */

    //无参构造
    public Person() {
    }
    //有参构造，赋值
    public Person(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    //get和set方法
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /*
    * 重写equals()方法
    * */
    @Override
    public boolean equals(Object obj){

        //this代表本类对象，谁调用该方法this代表谁
        if (this == obj){
            return true;
        }

        if (obj instanceof  Person){
            Person p = (Person)obj;
            if (this.getName().equals(p.getName())&&this.getAge()==p.getAge()&&this.getGrade()==p.getGrade()){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }

    /*
    * 重写自定义比较规则
    *   负数：表示后面大
    *   正数：表示前面大
    *   0：相等
    * */
    @Override
    public int compareTo(Object o) {
        if (this==o){
            return 0;
        }
        /*
        * 先比较分数，如果分数相等比较年龄，年龄相等比较姓名。
        * */
        if (o instanceof Person){
            if (this==o){
                return 0;
            }
            Person p = (Person)o;
            if (this.grade < p.getGrade()){
                return -1;
            }else if (this.grade > p.getGrade()){
                return 1;
            }else{
                //说明分数相等，再比较年龄
                if (this.getAge()<p.getAge()){
                    return -1;
                }else if (this.getAge()>p.getAge()){
                    return 1;
                }else{
                    //说明年龄相等，比较姓名
                    return this.getName().compareTo(p.getName());
                }
            }

        }
        return 0;
    }
}
