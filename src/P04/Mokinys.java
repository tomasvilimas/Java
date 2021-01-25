package P04;

import P06.Vidurkis;

public class Mokinys {

    private String name;
    private int level;
    private String address;
    private int[] average;

    public int[] getAverage() {
        return average;
    }

    public void setAverage(int[] average) {

        this.average = average;
    }

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
        average= new int[]{8, 9, 8, 10};



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







