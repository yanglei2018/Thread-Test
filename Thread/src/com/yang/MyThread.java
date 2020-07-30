package com.yang;

//创建Thread的子类
public class MyThread extends Thread{
   //重新Thread类的run方法
    @Override
    public void run(){
        for (int i = 0; i < 20; i++) {
            System.out.println("run:"+ i);
        }
    }
}
