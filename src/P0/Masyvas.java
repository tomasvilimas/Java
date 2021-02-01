package P0;

public class Masyvas {

    public static void main(String[] args) {


  int [] masyvai =  {-10, 0, 2, -35, 22, 9, -5};
        for( int i=0; i<masyvai.length-1; i++){
            for(int j= i+1; j< masyvai.length; j++){
                if( masyvai[i] > masyvai[j]){
                    int tmp= masyvai[i];
                    masyvai[i]= masyvai[j];
                    masyvai[j]= tmp;
                }
            }
        }
        for (int m : masyvai){
            System.out.println(m);
        }


    }
}
