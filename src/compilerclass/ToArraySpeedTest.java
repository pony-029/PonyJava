package compilerclass;

import java.util.ArrayList;
import java.util.List;

public class ToArraySpeedTest {

    private  static final int COUNT = 100*100*100;

    public static void main(String []args){

        List<Double> list = new ArrayList<>();
        for(int i = 0;i < COUNT;i++){
            list.add(i*1.0);
        }
        long start = System.nanoTime();
        Double [] notEnoughArray = new Double[COUNT -1];
        list.toArray(notEnoughArray);
        long middle1 = System.nanoTime();
        Double []equalArray = new Double[COUNT];
        list.toArray(equalArray);
        long middle2 = System.nanoTime();
        Double[] doubleArray = new Double[2*COUNT];
        list.toArray(doubleArray);
        long end = System.nanoTime();
        long notEnoughArrayTime = middle1 -start;
        long equalArrayTime = middle2 - middle1;
        long doubleArrayTime = end - middle2;
        System.out.println("数组容量小于集合大小： notEnoughArrayTimes: "
                        +notEnoughArrayTime/(1000*1000)+"ms");
        System.out.println("数组容量等于集合大小： EnoughArrayTimes: "
                +equalArrayTime/(1000*1000)+"ms");
        System.out.println("数组容量2倍集合大小： doubleArrayTimes: "
                +doubleArrayTime/(1000*1000)+"ms");

    }
}
