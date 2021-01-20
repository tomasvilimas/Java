public class classes {


    public static void main(String[] args) {

    Mokinys[] mokiniai= {null,null, null, };

        System.out.println(mokiniai.length);

        Mokinys z1= new Mokinys();
        z1.klase= 5;
        z1.vardas= "Antantas";
        z1.pavarde= "Lindeišis";
        mokiniai[0]= z1;

        Mokinys z2= new Mokinys();
        z2.klase= 7;
        z2.vardas= "Petras";
        z2.pavarde= "Lindeišis";
        mokiniai[1]= z2;

        Mokinys z3= new Mokinys();
        z3.klase= 7;
        z3.vardas= "Aldona";
        z3.pavarde= "Juode";
        mokiniai[2]= z3;

        for(Mokinys z : mokiniai){
            System.out.println("pavarde:" + z.pavarde+ "; vardas:"+ z.vardas+ "; mokosi klaseje:"+ z.klase);
        }






    }
}

class Mokinys{
    int klase;
    String vardas;
    String pavarde;


}
