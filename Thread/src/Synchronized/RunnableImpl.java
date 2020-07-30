package Synchronized;

//创建Runnable接口的实现类
public class RunnableImpl implements Runnable {
   private int ticket = 100;

   //创建一个锁对象
    Object obj = new Object();


   //重写run方法
    @Override
    public void run() {
        while (true){
            //同步代码块
            synchronized (obj){//线程代码放入到同步代码块中
                if(ticket>0){
                    try {
                        //提高线程安全问题出现的频率
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"-->正在卖第"+ticket+"张票");
                    ticket--;
                }
            }
        }

    }
}
