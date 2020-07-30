package Synchronized2;

//创建Runnable接口的实现类
public class RunnableImpl implements Runnable {
   private int ticket = 100;


   //重写run方法
    @Override
    public void run() {
        while (true){
            payTicket();
            }
        /*
            定义一个同步方法
         */
    }
    public synchronized void payTicket(){
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
