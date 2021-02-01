package P04;

public class Mokinys {

    private String name;
    private int level;
    private String address;
    private  int [] pazymiai;

    public double getPazymiai() {
        int suma = 0;

        if (pazymiai == null) return 0;
        for (int i = 0; i < pazymiai.length; i++) {
            suma += pazymiai[i];
        }
        return (double)suma/pazymiai.length;
    }

    public void setPazymiai(int[] pazymiai) {

        this.pazymiai = pazymiai;
    }

    public Mokinys(String name){

        setName(name);
        this.level= 1;
        this.pazymiai= new int []{10, 10, 9, 10};
    }

    public Mokinys(String name, int level, int [] pazymiai){
        this(name);
        this.name =name ;
        this.level = level;
        this.pazymiai=pazymiai;




    }
    public Mokinys(){
        level=2;
        address= "Kupiškis";
        pazymiai= new int []{2, 3, 3, 10};


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








