package com.yang;
/*
通过Thread类实现多线程类
 */
public class Demo02Thread {
    public static void main(String[] args) {
        //创建一个Thread子类对象
        MyThread mt = new MyThread();

        //调用Thread类中的start()方法，开启新的线程
        mt.start();

        for (int i = 0; i < 20; i++) {
            System.out.println("main:"+ i);
        }
    }
}
