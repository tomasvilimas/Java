package P04;

import P04.Mokinys;

public class Vidurkis  {

    public static void main(String[] args) {

        int suma= 0;

        int [] skaiciai = {8, 9, 8, 10};
        for ( int i =0; i< skaiciai.length; i++){
            suma+=skaiciai[i];

        }

        double vidurkis = suma * 1.0 / skaiciai.length;
        System.out.println(vidurkis);


    }
}
