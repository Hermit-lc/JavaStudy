package com.example.study;

import com.example.bean.Person;

import java.util.*;

public class TestCollection {

    /*
    * 集合(Collection):集合框架的跟接口。
    *   1. 集合默认可以存放任意类型的数据(但代码规范禁止存放任意类型)。
    *   2. Collection自动扩容。
    * */
    public void testList() {
        /*
        * List(接口)：有序集合(也称为序列)，类似于数组集合，经常使用。
        * ArrayList：数组集合，可以看作是数组升级版(自动扩容)，是List接口的完全实现类(没有自己独有的方法)。
        * 1. List集合也是有下标的，有序(存放顺序)。
        * 2. List集合可以存放重复元素。
        * list系列的集合存元素很快，但是查找或其他操作性能较低。
        * */

        List list1 = new ArrayList<>();//默认存放Object类型
        List list2 = new ArrayList<String>();//<>中是集合存放的泛型，泛型只能写包装类，使集合中只能存放一类元素。

        //存放元素
        list2.add("集合");
        list2.add("list");
        list2.add("list");
        list2.add("list");
        list2.add("list");
        list2.add("string");
        list2.add(1,"lee");//在下标为1的地方插入元素
        //获取元素
        System.out.println(list2.get(1));
        //获取长度
        System.out.println(list2.size());
        //替换
        list2.set(3,"Object");
        //删除，若表中有重复元素，remove一次只能删一个匹配的元素
        list2.remove("list");

        //删除表中所有remove匹配的元素
        while(list2.indexOf("list")>=0){
            list2.remove("list");
        }

        //普通for循环遍历集合
        for (int i = 0; i < list2.size(); i++) {
            System.out.println(list2.get(i));
        }
        //foreach循环遍历集合
        for (Object s1 : list2) {
            System.out.println(s1);
        }
        System.out.println(list2);
        /*
        * 使用迭代器遍历集合
        * 先把集合中的元素导入到迭代器中
        * */
        Iterator<String> it = list2.iterator();
        //如果还有下一个就循环
        while(it.hasNext()){
            System.out.println(it.next());//输出下一个元素
        }
    }


    public void  testLinkedList(){
        /*
        * LinkedList:链表集合，基本方法和List一样，本身又提供了一些对集合头部和尾部的操作
        *   addFirst()
        *   addLash():对比ArrayList效率进行了优化
        * 特点：LinkedList是链表结构，插入元素效率很快。
        * */
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.addFirst(20);
        ll.addLast(66);
        ll.addFirst(10);
        ll.addLast(99);
        System.out.println(ll);
        System.out.println(ll.peek());//检索第一个元素
        System.out.println(ll.poll());//检索并删除第一个元素
        System.out.println(ll.pop());//删除并返回第一个元素
        System.out.println(ll);

    }


    public void  testVector(){
        /*
        * Vector:和ArrayList唯一的区别是线程安全的，基本不使用靠其他方法使用线程安全。
        * */
    }


    public void testSet(){
        /*
        * Set:接口，不包含重复元素的集合。
        *   HashSet:里面元素是根据元素的内存地址值进行排列的。
        *   1. 无序(不会按照存放顺序排列，没有下标)。
        *   2. 不能存放重复元素。
        * HashSet首先会调用HashCode方法判断两个元素是否相等，无法判断时再调用equals方法判断。
        * */
        HashSet<String> hs = new HashSet<String>();
        hs.add("s1");
        hs.add("s2");
        hs.add("s3");
        hs.add("s4");
        hs.remove("s1");
        System.out.println(hs);
        //foreach遍历set集合
        for (String s: hs) {
            System.out.println(s);
        }
        //迭代器遍历set集合
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


    }


    public void testTreeSet(){
        /*
        * TreeSet:自然顺序排列(123...,abc...)，自定义排序的set集合。
        * */
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        ts1.add(3);
        ts1.add(4);
        ts1.add(1);
        ts1.add(2);
        System.out.println(ts1);

        //添加对象，由于无法按自然顺序排列，所以会报错，需要在对象中继承Comparable重写自定义排序规则。
        TreeSet<Person> ts2 = new TreeSet<Person>();
        Person p1 = new Person();
        p1.setName("法外狂徒");
        p1.setAge(22);
        p1.setGrade(66);

        Person p2 = new Person();
        p2.setName("李四");
        p2.setAge(18);
        p2.setGrade(77);

        ts2.add(p1);
        ts2.add(p2);
        System.out.println(ts2);

    }


    public void testHashMap() {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        /*
         * Map集合:map集合由两部分组成:键-值(key-value)
         * 1.可以充当万能对象
         * 2.Map集合不能存放重复元素(key不能重复)
         * 3.如果key重复了,相当于覆盖
         * 4.一般情况下key使用String类型,值无所谓
         * 5.在Map集合中只能通过key获取元素
         * */
        //添加元素
        hm.put("张三",99);
        hm.put("李四",68);
        hm.put("王五",90);
        hm.put("赵六",55);
        //删除
        hm.remove("张三");
        Scanner sc = new Scanner(System.in);
        //取出所有key
        Set<String> keys = hm.keySet();
        for (String str:keys){
            System.out.print(str+"\t");
            System.out.println();
            //取出所有value
            //System.out.println(hm.get(str)+"\t");
        }
        System.out.println("请输入姓名查询成绩:");
        String name = sc.nextLine();
        System.out.println(hm.get(name));

        String str = "qwertyuqwertyuiopkjuio";
        HashMap<Character,Integer> hh = new HashMap<Character,Integer>();
        for (int i=0;i<str.length();i++){
            if (hh.get(str.charAt(i))!=null){
                hh.put(str.charAt(i),hh.get(str.charAt(i))+1);
            }else{
                hh.put(str.charAt(i),1);
            }
        }
        Set<Character> sc1 = hh.keySet();
        for (Character c:sc1){
            System.out.print(c+"出现"+hh.get(c)+"次"+"\t");
        }
        System.out.println();
    }

    //统计字符串中每个字符出现的次数。
    public void statistics1(){
        String s1 = "leeLuoUpperWater";
        //创建HashSet集合
        HashSet<Character> hs = new HashSet<Character>();
        //将字符串插入到Set集合，利用Set集合去重复的特性找到出现过的字符
        for (int i = 0; i < s1.length(); i++) {
            hs.add(s1.charAt(i));
        }
        //用出现过的字符与字符串对比
        for (Character s2 : hs) {
            int num = 0;
            for (int i = 0; i < s1.length(); i++) {
                if (s2.equals(s1.charAt(i))){
                    num++;
                }
            }
            System.out.println(s2+"出现"+num+"次");
        }
    }
}



