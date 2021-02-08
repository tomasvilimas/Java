package p11;

import java.util.List;

public class FirmaMain {

    public static void main(String[] args) {

        if (args.length !=1){
            System.err.println("nera");
            return;
        }

        System.out.println(args[0]);

        IFirmaService firmaService = new FirmaService();

        List<Firma> firmos = firmaService.read(args[0]);

        for (Firma firma : firmos) {
            System.out.println(firma.getId() + " " + firma.getName() + " " +
                    firma.getDate() + " " + firma.getQty() + " " + firma.getPrice());
        }

//        firmos.forEach(firma -> {
//            System.out.println(firma.getId()+"" + firma.getName()+ "" + firma.getDate()+ "" + firma.getQty()+""+ firma.getPrice());
//        });



    }
}
