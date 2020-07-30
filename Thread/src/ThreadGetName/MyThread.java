package ThreadGetName;

//创建thread子类
public class MyThread extends Thread{
    //重写run方法
    @Override
    public void run(){
        String name = getName();
        System.out.println(name);

    }
}
