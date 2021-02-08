package P10;

import java.util.*;

public class Main {


    public static void main(String[] args) {


        mapTest(new TreeMap<>());

        System.out.println("------");

        mapTest(new HashMap<>());

        System.out.println("------");

        mapTest2(new TreeMap<>());


    }

    static void mapTest(Map<String, Zmogus> sarasas) {
        sarasas.put("39103080649", new Zmogus("Jonas", "Lindeisis", "39103080649"));
        sarasas.put("467060365", new Zmogus("Antanas", "Petravicius", "467060365"));
        sarasas.put("390010111", new Zmogus("Thomas", "Williams", "390010111"));
        sarasas.put("1269546234164", new Zmogus("Petras", "Petrauskas", "1269546234164"));
        sarasas.put("39103080649", new Zmogus("Zigmas", "Zigmiontas", "39103080649"));


        for (Zmogus a : sarasas.values()) {
            System.out.println(a.getName() + "  " + a.getSurname() + "  " + a.getCode());
        }

        for (String k : sarasas.keySet()) {
            System.out.println(k);
        }


    }

    static void mapTest2(Map<String, List<Zmogus>> sarasas) {
        addMapTest2(sarasas, new Zmogus("Jonas", "Lindeisis", "39103080649"));
        addMapTest2(sarasas, new Zmogus("Antanas", "Petravicius", "467060365"));
        addMapTest2(sarasas, new Zmogus("Thomas", "Williams", "390010111"));
        addMapTest2(sarasas, new Zmogus("Petras", "Petrauskas", "1269546234164"));
        addMapTest2(sarasas, new Zmogus("Zigmas", "Zigmiontas", "39103080649"));


        for (List<Zmogus> listas : sarasas.values()) {
            System.out.println(listas.size());
            for (Zmogus z : listas) {
                System.out.println(z.getName() + "  " + z.getSurname() + "  " + z.getCode());
            }
        }

    }


    static void addMapTest2(Map<String, List<Zmogus>> sarasas, Zmogus z) {
        String ak = z.getCode();

        if (!sarasas.containsKey(ak)) {
            List<Zmogus> zmonesAk = new ArrayList<>();
            zmonesAk.add(z);
            sarasas.put(ak, zmonesAk);

        } else {
            List<Zmogus> zmonesAk = sarasas.get(ak);
            zmonesAk.add(z);
        }

    }

}
