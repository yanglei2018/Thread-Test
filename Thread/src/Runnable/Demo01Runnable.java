package Runnable;

public class Demo01Runnable {
    public static void main(String[] args) {
        //创建Runnable接口实现类对象
        RunnableImpl run = new RunnableImpl();

        //创建Thread对象 构造方法传递unnable接口实现类对象
        Thread t = new Thread(run);

        //调用start方法执行run方法
        t.start();

        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }

}
