package compilerclass;

public class TestClass {
    public static void main(String []args){
//        new Son();
//        new Son();
        OverloadMethods overloadMethods = new OverloadMethods();
        overloadMethods.method(new Integer(7));
        overloadMethods.method();
//        overloadMethods.methodNew(1,2);
    }
}
