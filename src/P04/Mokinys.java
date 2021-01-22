package P04;

public class Mokinys {

    private String name;
    private int level;
    private String address;

    public Mokinys(String name){

        setName(name);
        this.level= 1;
    }

    public Mokinys(String name, int level){
        this(name);
        this.name =name ;
        this.level = level;

    }
    public Mokinys(){
        level=2;
        address= "Kupiškis";

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name==null || name.length() <=1){
            throw new IllegalArgumentException("neteisingas vardas");
        }
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}







