package p12;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public class duomenys {

    private static final String YOUR_API_KEY = "HjKKj2WAaPKX7_BrBnwYrSJxSa6WEyuNmBStsXkn6Xc";

    public static void main(String[] args) throws IOException {


//        https://discover.search.hereapi.com/v1/discover
//                ?at=52.5228,13.4124
//                &q=petrol+station
//                &lang=en-US
//                &apiKey={YOUR_API_KEY}

        String search = "petrol station";

        URL url = new URL("https://discover.search.hereapi.com/v1/discover" +
                "?at=52.5228,13.4124" + "&q=" + URLEncoder.encode(search, "UTF-8") +
                "&lang=en-US" + "&apiKey=" + YOUR_API_KEY);

        System.out.println(url.toString());
        ObjectMapper mapper = new ObjectMapper();

//        1 variantas skaitymas per reader

        try (InputStream is = url.openStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(is))

        ) {
            //            String line;
            //            while ((line= reader.readLine()) != null){
            //                System.out.println(line);
            //            }


            Map o = mapper.readValue(reader, Map.class);

            System.out.println(o);

            String label1 = (String) ((Map) ((List) o.get("items")).get(0)).get("title");
            System.out.println(label1);

            //is.close();
        } catch (IOException e) {
            System.out.println("kazkas negerai su GET");
        }


//        2variantas tiesiai is url
        try {

            Response response1 = mapper.readValue(url, Response.class);
            System.out.println(response1);

            System.out.println("id=" + response1.getItems().get(0).getId());

        }catch(IOException e){
                System.out.println("kazkas negerai su GET");
            }


    }

}

class Response {
   private List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Response{" +
                "items=" + items +
                '}';
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Item {
    String title;
    String id;
    String ontologyId;
    String type;
    String resultType;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOntologyId() {
        return ontologyId;
    }

    public void setOntologyId(String ontologyId) {
        this.ontologyId = ontologyId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getResultType() {
        return resultType;
    }

    public void setResultType(String resultType) {
        this.resultType = resultType;
    }

    @Override
    public String toString() {
        return "Item{" +
                "title='" + title + '\'' +
                ", id='" + id + '\'' +
                ", ontologyId='" + ontologyId + '\'' +
                ", type='" + type + '\'' +
                ", resultType='" + resultType + '\'' +
                '}';
    }
}
