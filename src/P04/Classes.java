package P04;

public class Classes {


    public static void main(String[] args) {

        Mokinys[] mokiniai= readFromDB();

        System.out.println("pries rusiavima ");

        print(mokiniai);


        System.out.println("po rusiavimo ");

        for (int i = 0; i < mokiniai.length - 1; i++) {
            for (int j = i + 1; j < mokiniai.length; j++) {
                if(compare(mokiniai[i], mokiniai[j]) >0){
                    Mokinys tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }
            }

        }

        print(mokiniai);
    }

        static void print(Mokinys[] mokiniai){
        for (Mokinys m : mokiniai) {
            System.out.println("vardas: " + m.getName() + ", Klasė: " + m.getLevel() + ", adresas: " + m.getAddress());
        }
    }

        static int compare(Mokinys m1, Mokinys m2){
            if(m1.getLevel()< m2.getLevel()) return -1;
            if(m1.getLevel()>m2.getLevel()) return 1;
            return m1.getName().compareTo(m2.getName());

        }

        static Mokinys[] readFromDB(){
            Mokinys[] mokiniai = new Mokinys[]{
                    new Mokinys(),
                    new Mokinys("Jonas"),
                    new Mokinys("Lindeišis", 1),
                    new Mokinys("Angele", 3),
                    new Mokinys("Severinas", 2),
                    new Mokinys("Kalinauskas", 2)

            };


            mokiniai[0].setName("Donny");

            return mokiniai;


        }

}





