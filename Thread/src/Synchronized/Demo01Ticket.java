package Synchronized;
/*
使用同步代码块解决线程安全问题
 */

public class Demo01Ticket {
    public static void main(String[] args) {
        //3.创建Runnable接口的实现类对象
        RunnableImpl run = new RunnableImpl();

        //4.创建Thread对象 构造方法传递Runnable接口的实现类对象
        Thread t0 = new Thread(run);
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);

        //5.调用start方法开启线程
        t0.start();
        t1.start();
        t2.start();

    }
}
