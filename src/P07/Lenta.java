package P07;


import java.math.BigInteger;

public class Lenta {

    public static void main(String[] args) {
        BigInteger visi= BigInteger.ONE;
        BigInteger big= BigInteger.ONE;
        for(int i=1;i<=64;i++){
            System.out.println("langelis nr:"+i+"=" + big+"  is viso:"+visi);

            big= big.multiply(BigInteger.TWO);
            visi= visi.add(big);


        }



    }
}
