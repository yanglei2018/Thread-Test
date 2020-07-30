package com.yang;

public class Demo01Thread {
    /*
    主线程：执行主方法的线程
     */
    public static void main(String[] args) {
        Person p1 = new Person("小杨");
        p1.run();

        Person p2 = new Person("小钱");
        p2.run();
    }
}
