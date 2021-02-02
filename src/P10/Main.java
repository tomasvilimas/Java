package P10;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {



        List<Zmogus> sarasas= new ArrayList();
        sarasas.add(new Zmogus("Jonas","Lindeisis",391030804));
        sarasas.add(new Zmogus("Antanas","Petravicius",467060365));
        sarasas.add(new Zmogus("Thomas","Williams",390010111));




//        for(int i=0; i<sarasas.size()-1; i++){
//            for(int j=i+1; j< sarasas.size(); j++){
//                if(compare(sarasas[i], sarasas[j])>0){
//
//                }
//            }
//        }

        for (Zmogus a : sarasas){
            System.out.println(a.getName()+"  "+ a.getSurname()+"  "+ a.getCode());
        }
    }

    static int compare(Zmogus a1, Zmogus a2){
        if(a1.getCode()< a2.getCode()) return -1;
        if(a1.getCode() > a2.getCode()) return  1;
        return a1.getName().compareTo(a2.getName());
    }


}
