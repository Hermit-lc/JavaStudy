package com.example.study;

import com.example.bean.Person;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*
* IO流
* 输入输出流
* 字节字符流
* */

public class TestIO {
    public void IO() {
//        复制文件
        File oldFile = new File("D:/awork/oldFile.txt");
        File newFile = new File("D:/newFile1.txt");

//        创建输入输出流
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            Date d1 = new Date();
            fis = new FileInputStream(oldFile);
            fos = new FileOutputStream(newFile);

//        将输入流里面的数据导入到输出流中
//        字节输入输出流
            byte[] b = new byte[1024*1024];
            int index=-1;
            while((index=fis.read(b))!=-1){
                fos.write(b,0,index);
                System.out.println();
            }
            Date d2 = new Date();
            fos.flush();
            System.out.println("复制完成！耗时："+(d2.getTime()-d1.getTime())+"毫秒");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (fis!=null){
                    fis.close();
                }
                if (fos!=null){
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

//      字符流输入输出流
        File oldFile1 = new File("D:/awork/oldFile.txt");
        File newFile1 = new File("D:/newFile1.txt");
//        创建字符输入输出流
        FileReader fr=null;
        FileWriter fw=null;

        try {
            fr=new FileReader(oldFile1);
            fw=new FileWriter(newFile1);
//            通过输入流获取文件数据，通过输出流把数据写到文件中
            char[] c = new char[1024];
            int len = -1;
            while((len=fr.read(c))!=-1){
                fw.write(c,0,len);
            }
//        刷新
            fw.flush();
            System.out.println("复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if (fr!=null) {
                    fr.close();
                }
                if (fw!=null){
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
        * 包装流(过滤流):在基本流的基础上提供了一些特殊的概念
        *BufferedReader:一行一行读的字符包装类
        * PrintWrite:一行一行写的字符包装类
        * */

        File oldFile2 = new File("D:/awork/oldFile.txt");
        File newFile2 = new File("D:/awork/newFile.txt");

        FileReader fr1=null;
        FileWriter fw1=null;
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            fr1 = new FileReader(oldFile2);
            fw1 = new FileWriter(newFile2,true);//true参数要求复制的数据追加到文件后
            br = new BufferedReader(fr1);
            pw = new PrintWriter(fw1,true);//true参数要求复制的数据追加到文件后
            String str = null;
            while ((str=br.readLine())!=null){
                pw.write(str);
            }
            pw.flush();
            System.out.println("复制完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
//        只需要关闭包装流，基本流会自动关掉
            try{
                if (pw!=null){
                    pw.close();
                 }
                if (br!=null){
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        /*
        * 对象输入输出流
        * ObjectInputStream
        * ObjectOutputStream
        * */

        Person p1 = new Person("张三",18,80);
        Person p2 = new Person("李四",18,80);
        Person p3 = new Person("王五",18,80);

        List<Person> ps = new ArrayList<Person>();
        ps.add(p1);
        ps.add(p2);
        ps.add(p3);

        File file = new File("D:/aword/oldFile.txt");

        FileOutputStream fos1 = null;
        ObjectOutputStream oos = null;

        try {
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(ps);
            oos.flush();
            System.out.println("保存完成");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try{
                if (oos!=null){
                    oos.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
