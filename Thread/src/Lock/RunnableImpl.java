package Lock;

/*
使用Lock解决线程安全问题
Lock接口方法;lock();unlock();
实现步骤;
1.在成员位置创建一个ReentrantLock对象
2.在可能出现安全问题的代码前调用Lock接口的方法lock获取锁；
3.在可能出现安全问题的代码后调用unlock接口的方法lock释放锁
 */


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//创建Runnable接口的实现类
public class RunnableImpl implements Runnable {
   private int ticket = 100;

   //创建ReentrantLock对象
   Lock l = new ReentrantLock();
   //重写run方法
    @Override
    public void run() {
        while (true){
            l.lock();
                if(ticket>0){
                    try {
                        //提高线程安全问题出现的频率
                        Thread.sleep(10);
                        System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                        ticket--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    finally {
                        l.unlock();//无论程序是否异常，锁都会被释放
                    }
                }
            }

    }
}
