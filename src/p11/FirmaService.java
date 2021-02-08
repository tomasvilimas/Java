package p11;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedMap;

public class FirmaService implements IFirmaService {

    @Override
    public List<Firma> read(String filename) {
        try {
            InputStream inputStream = new FileInputStream(filename);
            System.out.println("atidarytas");

            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));

            List<Firma> firmos = new ArrayList<>();


            String line;
            while ((line = reader.readLine()) != null){
                Firma firma= parse(line);
                firmos.add(firma);


            }

            return firmos;


        } catch (FileNotFoundException e) {
            System.err.println("nerasta");
        } catch (IOException e){
            System.err.println("klaida");
        }

        return new ArrayList<>();
    }

    private Firma parse(String line){
        String[] fields = line.split(",");
       if(fields.length != 5) return null;

       try {
           Firma firma = new Firma();
           firma.setId(Integer.parseInt(fields[0]));
           firma.setDate(LocalDate.parse(fields[1]));
           firma.setName(fields[2]);
           firma.setQty(Integer.parseInt(fields[3]));
           firma.setPrice(new BigDecimal(fields[4]));

           return firma;

       }catch (Exception e){
           System.err.println("melas     " + line);
       }

       return null;
    }
}
