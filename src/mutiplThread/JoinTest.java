package mutiplThread;


public class JoinTest {

    public static void main(String []args) throws InterruptedException{
//        Thread threadOne = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                try{
//                    Thread.sleep(1000);
//                }catch(InterruptedException e){
//                    e.printStackTrace();
//                }
//                System.out.println("child threadOne over!");
//            }
//        });
//        Thread threadTwo = new Thread(new Runnable() {
//            @Override
//            public void run() {
//               try {
//                   Thread.sleep(1000);
//               }catch(InterruptedException e){
//                   e.printStackTrace();
//               }
//                System.out.println("child threadTwo over!");
//            }
//        });
//        threadOne.start();
//        threadTwo.start();
//        System.out.println("wait all child thread over!");
//        threadOne.join();
//        threadTwo.join();

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("threadOne begin run!");
                for(;;){

                }
            }
        });
        final Thread mainThread = Thread.currentThread();
        Thread thredaTwo = new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(1000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                mainThread.interrupt();
            }
        });
        threadOne.start();
        thredaTwo.start();
        try{
            threadOne.join();
        }catch (InterruptedException e){
            System.out.println("main Thread"+e);
        }

    }
}
