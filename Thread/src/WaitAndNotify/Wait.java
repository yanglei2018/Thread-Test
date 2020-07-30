package WaitAndNotify;
/*
等待唤醒案例
创建一个顾客案例：告知老板要的包子种类和数量 调用wait方法
创建一个老板线程：花5秒做包子 调用notify方法

使用同步代码块包裹起来 保证等待唤醒只能有一个在执行
 */
public class Wait {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread(){//创建顾客线程（内部类方法）
            @Override
            public void run() {//重写run方法
                synchronized (obj){//同步代码块方法解决代码安全问题
                    System.out.println("告知老板包子的种类");
                    try {
                        obj.wait();//进入等待状态
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("开始吃包子");
                }

            }
        }.start();//线程开启

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("5秒后，包子做好了");
                    obj.notify();//使用obj的notify()方法唤醒线程
                }
            }
        }.start();
    }
}
