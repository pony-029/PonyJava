package compilerclass;

public class OverloadMethods {
    /**
     * 1、精确匹配
     * 2、如果是基本数据类型，自动转换成更大的表示范围的基本类型
     * 3、通过自动拆箱和装箱
     * 4、通过子类向上转型继承路线依次匹配
     * 5、通过可变参数匹配
     */
    //无参数的方法
    public void method(){
        System.out.println("无参数的方法");
    }

    public void method(int param){
        System.out.println("参数基本类型为int的方法");
    }

    public void method(Integer param){
        System.out.println("参数包装类型为Integer的方法");
    }

    public  void method(Integer ...param){
        System.out.println("可变参数方法");
    }

    public  void method(Object param){
        System.out.println("参数为Object方法");
    }

    public void methodNew(int param1,Integer param2){

    }
    public void methodNew(Integer param1,int param2){

    }
}
