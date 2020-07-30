package ThreadGetName;

public class Demo {
    public static void main(String[] args) {
        //创建子类对象
        MyThread mt = new MyThread();
        //start()方法开启线程
        mt.start();

        MyThread mt2 = new MyThread();
        mt2.start();

        System.out.println(Thread.currentThread().getName());
    }
}
