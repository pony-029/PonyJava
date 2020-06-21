package compilerclass;

import java.sql.SQLClientInfoException;

public class Son  extends  Father{
    static {
        System.out.println("Son's static code block");
    }
    Son(){
        System.out.println("Son's 构造函数");
    }
    @Override
    public void method(){
        System.out.println("Son's method");
    }

    /**
     *  1、权限扩大，由protected 到 public（一大）
     *  2、返回值是父类的Number的子类（两小）
     *  3、抛出的异常时SQLException
     *  4、方法签名必须严格一致
     *  5、参数类型和个数必须完全一致
     *  6、必须加上Override
     * @param a
     * @param b
     * @param c
     * @return
     * @throws SQLClientInfoException
     */
    @Override
    public Integer doSomething(int a, Integer b,Object c) throws SQLClientInfoException{
        if(a == 0){
            throw  new SQLClientInfoException();
        }
        return new Integer(17);
    }
}
