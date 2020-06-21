package compilerclass;

public class Stove {
    public static <T> T heat(T food){
        System.out.println(food+" is done");
        return food;

    }
}
