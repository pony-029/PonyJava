package compilerclass;

import java.util.*;

public class EqualObjectTest {

    public static void  main(String []args){
//        Set<EqualObject> hashSet  = new HashSet<>();
//        EqualObject a = new EqualObject(1,"one");
//        EqualObject b = new EqualObject(1,"one");
//        EqualObject c = new EqualObject(1,"one");
//        hashSet.add(a);
//        hashSet.add(b);
//        hashSet.add(c);
//        System.out.println(hashSet.size());

        LinkedList<Integer> list =  new LinkedList<>();
        list.add(1);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        if(arrayList.equals(list)){
            System.out.println("equal is true");
        }else{
            System.out.println("equal is false");
        }
    }
}
