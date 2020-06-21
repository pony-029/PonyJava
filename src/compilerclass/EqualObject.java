package compilerclass;

public class EqualObject {

    private  int id;
    private String name;

    public EqualObject(int id,String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }
        if(this == obj){
            return true;
        }
        EqualObject temp = (EqualObject)obj;
        if(temp.getId() == this.getId() && this.name.equals(temp.getName())){
            return  true;
        }
        return false;
    }

    @Override
    public int hashCode(){
        return id+name.hashCode();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
