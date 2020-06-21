package compilerclass;

import java.sql.SQLException;

public class Father {

    static { System.out.println("Father static code block");}

    public Father(){
        System.out.println("Father's 构造方法");
    }
    public void method(){
        System.out.println("Father's method");
    }

    protected Number doSomething(int a,Integer b,Object c) throws SQLException{
        System.out.println("Father's doSomething");
        return new Integer(7);
    }
}
