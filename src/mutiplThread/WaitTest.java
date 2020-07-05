package mutiplThread;

public class WaitTest {

    /**
     * 当一个线程调用一个共享变量的wait（）方法时，该调用线程会被阻塞挂起，直到发生（1）其他线程调用了该共享对象的notify()或者notifyAll()
     * 方法，(2)其他线程调用了该线程的interrupt()方法，该线程抛出InterruptException异常返回。
     *
     */
    //创建线程
    private static volatile  Object resourceA = new Object();
    private static  volatile Object resourceB = new Object();
    public static void main(String []args) throws InterruptedException{
        //创建线程
        Thread threadA = new Thread(new Runnable(){
            @Override
            public void run() {
                try {
                    //获取resourceA共享资源的监视器锁
                    synchronized (resourceA) {
                        System.out.println("threadA get resourceA lock");
                        //获取resourceB共享资源的监视器锁
                        synchronized (resourceB) {
                            System.out.println("threadA get resourceB lock");
                            System.out.println("threadA release resourceA lock");
                            resourceA.wait();
                        }

                    }

                } catch (InterruptedException exception) {
                    exception.printStackTrace();
                }
            }

        });
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    //休眠1秒
                    Thread.sleep(1000);
                    //获取resourceA共享资源的监视器锁
                    synchronized (resourceA){
                        System.out.println("threadB get resourceA lock");
                        System.out.println("threadB try get resouceB lock...");
                        //获取resourceB共享资源的监视器锁
                        synchronized (resourceB){
                            System.out.println("threadB release resourceB lock");
                            resourceA.wait();
                        }
                    }
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        });
        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
        System.out.println("main over");

    }
}
