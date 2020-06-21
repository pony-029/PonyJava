package compilerclass;


public class IntegerLongTest {

    public static void main(String []args){
        Long a = 127L;
        Long b = 127L;

        System.out.println("Long max cached value is 127, "
                +" and the result is: "+(a == b));

        Long c = 128L;
        Long d = 128L;

        System.out.println("Long = 128, cache is " +(c == d));


        Long e = -128L;
        Long f = -128L;

        System.out.println("Long min cached value is -128, "
                +" and the result is: "+(e == f));

        Long g = -129L;
        Long h = -129L;

        System.out.println("Long = -129, cache is " +(g == h));

        Long g1 = 1000L;
        Long h1 = 1000L;

        System.out.println("Long = 1000, cache is " +(g1 == h1));

        Integer x1 = 1001;
        Integer y1 = 1001;

        System.out.println("Integer = 1001, cache is " +(x1 == y1));
    }
}
