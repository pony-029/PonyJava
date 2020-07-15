package mutiplThread;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SleepThread {
    private static final Lock lock = new ReentrantLock();
    public static void main(String []args) throws InterruptedException{
//        Thread threadOne = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try{
//                    System.out.println("child thread is in sleep");
//                    Thread.sleep(1000);
//                    System.out.println("child thread is in awaked");
//
//                }catch (InterruptedException e){
//                    e.printStackTrace();
//                }
//            }
//        });
//        threadOne.start();
//        Thread.sleep(2000);
//        threadOne.interrupt();
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try{
                    System.out.println("child threadA is in sleep");
                    Thread.sleep(1000);
                    System.out.println("child threadA is in awaked");
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                lock.lock();
                try{
                    System.out.println("child threadB is in sleep");
                    Thread.sleep(1000);
                    System.out.println("child threadB is in awaked");
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    lock.unlock();
                }
            }
        });
        threadA.start();
        threadB.start();
    }
}
