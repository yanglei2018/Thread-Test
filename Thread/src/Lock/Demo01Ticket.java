package Lock;
/*
使用Lock解决线程安全问题
Lock接口方法;lock();unlock();
实现步骤;
1.在成员位置创建一个ReentrantLock对象
2.在可能出现安全问题的代码前调用Lock接口的方法lock获取锁；
3.在可能出现安全问题的代码后调用unlock接口的方法lock释放锁
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
