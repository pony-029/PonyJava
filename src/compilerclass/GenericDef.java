package compilerclass;

public class GenericDef<T> {
    static  <String ,T,Alibaba> String get(String string,Alibaba alibaba){
        return string;
    }
    public static  void main(String []args){
        Integer first = 222;
        Long second = 333L;
        Integer result = get(first,second);
    }
}
