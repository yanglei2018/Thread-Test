package Runnable;

//创建一个runnalbe接口的实现类
public class RunnableImpl implements Runnable{

    //重写Runnable接口的run方法，设置线程任务
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
        }
    }
}
