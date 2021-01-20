public class trikampiai {

    public static void main(String[] args) {


        int[][] trikampiai = {{3, 4, 5}, {2, 10, 8}, {5, 6, 5}, {5, 5, 5}};

        System.out.println(trikampiai.length);
        for (int i = 0; i < trikampiai.length; i++) {

            int[] a = trikampiai[i];

            System.out.println("Triangle: " + a[0] + ", " + a[1] + ", " + a[2]);


        }
    }
}