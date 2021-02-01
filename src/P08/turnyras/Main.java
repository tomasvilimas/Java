package P08.turnyras;

public class Main {

    public static void main(String[] args) {
//        Zmogus z1= new Zmogus("Jonas");
//        Zmogus z2= new Zmogus("Amtanas");
//        Zmogus z3= new Zmogus("Kazys");
//        Pora p1= new Pora(z1,z2);
//        Pora p2= new Pora (p1,z3);
//        Pora p3= new Pora(z1,p2);
//        Pora p4= new Pora(p1,p2);
//
//        System.out.println(z1.getNumber()+"."+ z1.vardas());
//        System.out.println(z2.getNumber()+"."+ z2.vardas());
//        System.out.println(z3.getNumber()+"."+ z3.vardas());
//        System.out.println(p1.getNumber()+"."+ p1.vardas());
//        System.out.println(p4.getNumber()+"."+ p4.vardas());
//        System.out.println(p3.getNumber()+"."+ p3.vardas());

        Zaidejas[] zaidejai = pradiniaiDuomenys();

        int ratas= 1;
        do {
            zaidejai = ratas(zaidejai);
            printRatas(ratas, zaidejai);
            ratas++;
        }while (zaidejai.length>1);

    }


    static Zaidejas [] pradiniaiDuomenys(){

        Zaidejas[] zaidejai= new Zaidejas[]{
                new Zmogus("Petras"),
                new Zmogus("Antanas"),
                new Zmogus("Angele"),
                new Zmogus("Zigmas"),
                new Zmogus("Povilas"),
                new Zmogus("jurgis"),
                new Zmogus("Zose"),
                new Zmogus("Michailas")
        };
        System.out.println("Zaidejai: ");
            for(Zaidejas z : zaidejai){
                System.out.println("" +z.getNumber()+"  "+ z.vardas());
            }

            return zaidejai;
    }

    static Zaidejas[] ratas(Zaidejas[] zaidejai){

        Zaidejas[] naujas= new Zaidejas[zaidejai.length/2];

        for (int i=0; i< naujas.length;i++){
            int x= 2*i;
            naujas[i] = new Pora(zaidejai[x], zaidejai[x+1]);
        }
            return  naujas;


    }

    static void printRatas(int nr, Zaidejas [] zaidejai){
        System.out.println("ratas" + nr);
        for (Zaidejas z : zaidejai){
            System.out.println(z.getNumber()+"."+ z.vardas());

        }

    }
}
