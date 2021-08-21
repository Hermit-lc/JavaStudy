package com.example.study;

import java.io.File;
import java.io.IOException;

public class TestFile {
    /*
    * File:用于表示硬盘上的一个文件夹或文件
    * */
    //通过构造方法创建文件:表示硬盘上的目录
    File file = new File("D:/awork/File/oldFile.txt");
    public void test1() {
        //新建文件
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void test2() {
        //是否只读
        file.canRead();
        //是否只写
        file.canWrite();
        //查询是否存在,返回地址
        file.getAbsolutePath();
        //获得文件或者目录名
        file.getName();
        //返回父文件或目录名
        file.getParent();
        //获取文件或文件夹路径
        file.getPath();
        //查询是否是目录
        file.isDirectory();
        //查询是否是文件
        file.isFile();
        //最后修改时间
        file.lastModified();
        //文件或文件夹长度,空文件夹长度为0,在win上文件夹不占空间
        file.length();
    }
    public void test3(){
        //获取该目录下所有子目录子文件的名字
        String[] names = file.list();
        for (String str:names) {
            System.out.println(str);
        }
    }
    public void test4() {
        //创建一层目录目录
        File newFileDir = new File("D:/awork/fileDir");
        boolean mkdir = newFileDir.mkdir();
        System.out.println(newFileDir.mkdir());//true
    }
    public void test5(){
        //创建多层目录
        File fileDirs = new File("D:/awork/File/aa/bb/cc");
        fileDirs.mkdirs();
    }
    public void test6(){
        //删除空文件夹
        File fileDleDir = new File("D:/awork/File/aa/");
        fileDleDir.delete();
    }

    public void test7(){
        //打印src目录所有文件和目录
        File file = new File("src");
        String[] names = file.list();
        for (int i=0;i< names.length;i++){
            file = new File(names[i]);
            if (file.isFile()){
                System.out.println(file.getName()+"\t");
            }else if (file.isDirectory()){
                test7();
            }else{
                System.out.println("出错了");
            }

        }


    }

}
