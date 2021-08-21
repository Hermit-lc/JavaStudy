package com.example.study;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class TestArray {
    /*
    * 数组:数据容器,引用数据类型
    * 创建数组的方法
    * */
    public void test1(){
        String[] arr1 = {"张三","李四","王五"};
        double[] arr2 = {11,22,33};
        int[] arr3 = new int[5];
        for (int i=0;i<arr3.length;i++){
            int j = (int)(Math.random()*100);
            arr3[i] = j;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
    }

    /*
    * 数组一旦定义长度不可变
    * 数组扩容:
    * */
    public void addArray(){
        String[] arr1 = new String[1];
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(true){
            System.out.println("请输入第"+i+"名学生姓名:");
            String name = sc.next();

            if ("结束".equals(name)){
                break;
            }else{
                /*第一次输入时不需要扩容直接插入*/
                if (i==1){
                    arr1[i-1] = name;
                }else{
                    /*数组长度不够需要扩容*/
                    String[] arr2 = new String[arr1.length +1];

                    for (i=0;i<arr1.length;i++){
                        arr2[i] = arr1[i];
                    }
                    arr2[arr2.length-1] = name;
                    arr1 = arr2;
                }
                i++;
            }
        }
        System.out.println(Arrays.toString(arr1));
    }



    /*
     * 随机数组
     * sort方法
     * 冒泡排序
     * 选择排序
     * */
    //要生成多少个随机数
    int num = 10;
    int[] array = new int[num];

    //生成随机数组
    public void ProduceNum(){
        for(int i=0;i<num;i++){
            int j = (int)(Math.random()*100);
            array[i] = j;
        }
    }

    //冒泡排序
    public void BubbleSort(){
        TestArray testArray = new TestArray();
        testArray.ProduceNum();

        int []arr = testArray.array;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
    }

    //选择排序
    public void SelectSort(){
        TestArray testArray = new TestArray();
        testArray.ProduceNum();

        int[] arr = testArray.array;
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    //Arrays.sort方法排序
    public void sort() {
        TestArray testArray = new TestArray();
        testArray.ProduceNum();

        int[] arr = testArray.array;
        Arrays.sort(testArray.array);
        for (int i = 0; i< testArray.num; i++){
            System.out.print(testArray.array[i]+"\t");
        }
        System.out.println();
    }

    public void three() {
        //三目运算符排序
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数字");
        int num3 = sc.nextInt();
        int max = 0;
        max = num1>num2?num1:num2;
        max = max>num3?max:num3;
        System.out.println(max);
    }

}







