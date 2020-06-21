package mutiplThread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 使用继承的方式的好处是方便传参数，你可以在子类里面添加成员变量，通过set方法设置参数表或者通过
 * 构造函数进行传递，如果使用Runnable方式，则只能使用主线程里面被声明为final的变量。由于java不支持
 * 多线程，如果继承了Thread类，那么子类不能再继承其他类，而Runale则没有这个限制，前两种方式都没有办法拿到任务的返回
 * 结果，但事实FutureTask可以
 */


public class MulThread3Ways {
    //继承Thread类并重写run方法
    public static class Mythread extends Thread{
        @Override
        public void run(){
            System.out.println("I am a child thread");
        }
    }

    //实现Runnable接口的run方法
    public static class RunnableTask implements Runnable{
        @Override
        public void run(){
            System.out.println("I am a child thread");
        }
    }

    //创建任务，实现Runnble
    public static class CalllerTask implements Callable<String> {
        public String call() throws Exception{
            return "hello";
        }
    }
    public static void  main(String []args) throws  InterruptedException{
//        Mythread mythread = new Mythread();
//        mythread.start();
//        RunnableTask runnableTask = new RunnableTask();
//        new Thread(runnableTask).start();
//        new Thread(runnableTask).start();
        FutureTask<String> futureTask = new FutureTask<>(new CalllerTask());
        new Thread(futureTask).start();
        try{
            String result = futureTask.get();
            System.out.println(result);
        }catch (ExecutionException e){
            e.printStackTrace();
        }


    }

}
