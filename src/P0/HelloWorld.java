package P0;

public class HelloWorld {

    public static void main(String[] args) {

        int[] a = {5, 6, 10, 15, 8, 4};
        int suma= 0;


        for(int i=0; i<a.length; i++) {

            suma += a[i];



        };

        int vidurkis=  suma/a.length;

        int[] b = {8, 5, 3};
        int suma2= 0;
                for(int i=0; i<b.length;i++){
                    suma2+=b[i];
                }
        double vidurkis2=suma2/ (double) b.length;

                double bendras= vidurkis-vidurkis2;


        System.out.println(bendras);

    }

}
