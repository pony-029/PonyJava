package compilerclass;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class COWTest {

    public static void  main(String []args){
//        Set<EqualObject> hashSet  = new HashSet<>();
//        EqualObject a = new EqualObject(1,"one");
//        EqualObject b = new EqualObject(1,"one");
//        EqualObject c = new EqualObject(1,"one");
//        hashSet.add(a);
//        hashSet.add(b);
//        hashSet.add(c);
//        System.out.println(hashSet.size());

        List<Integer> copy = new CopyOnWriteArrayList<>();
        List<Integer> array  = new ArrayList<>();

        for(int i = 0 ;i< 20*10000;i++){
            array.add(i);
        }
        long start = System.nanoTime();
        copy.addAll(array);
        long end = System.nanoTime();
        System.out.println(copy.size());
        System.out.println("拷贝时间： "
                +(end - start)/(1000*1000)+"ms");
    }
}
