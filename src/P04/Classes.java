package P04;

public class Classes {


    public static void main(String[] args) {

        System.out.println("pries rusiavima ");

        Mokinys[] mokiniai = new Mokinys[]{
                new Mokinys(),
                new Mokinys("Jonas"),
                new Mokinys("Lindeišis", 1),
                new Mokinys("Angele", 3),
                new Mokinys("Severinas", 2),
                new Mokinys("Kalinauskas", 2)

        };

        mokiniai[0].name = "Donny";


        for (Mokinys m : mokiniai) {

            System.out.println("vardas: " + m.name + ", Klasė: " + m.level + ", adresas: " + m.address);
        }

        System.out.println("po rusiavimo ");

        for (int i = 0; i < mokiniai.length - 1; i++) {
            for (int j = i + 1; j < mokiniai.length; j++) {
                if (mokiniai[i].level > mokiniai[j].level) {
                    Mokinys tmp = mokiniai[i];
                    mokiniai[i] = mokiniai[j];
                    mokiniai[j] = tmp;
                }
            }
        }
        for (Mokinys m : mokiniai) {

            System.out.println("vardas: " + m.name + ", Klasė: " + m.level + ", adresas: " + m.address);


        }
    }

}





