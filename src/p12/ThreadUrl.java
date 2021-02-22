package p12;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;

public class ThreadUrl {

    private static final String YOUR_API_KEY = "HjKKj2WAaPKX7_BrBnwYrSJxSa6WEyuNmBStsXkn6Xc";

    public static void main(String[] args) throws UnsupportedEncodingException {
        long start = System.currentTimeMillis();

        Thread t1 = new Thread(() -> {

        }))

        response("petrol station");
        response("restaurant");
        response("Mcdonald");

        long time= System.currentTimeMillis() - start;
        System.out.println("laikas: "+ time+ "ms");

    }

    static void response(String search) throws UnsupportedEncodingException {

        try {

            URL url = new URL("https://discover.search.hereapi.com/v1/discover" +
                    "?at=52.5228,13.4124" + "&q=" + URLEncoder.encode(search, "UTF-8") +
                    "&lang=en-US" + "&apiKey=" + YOUR_API_KEY);

            ObjectMapper mapper = new ObjectMapper();

            DiscoverResponse response= mapper.readValue(url, DiscoverResponse.class);

            System.out.println("viso items"+ response.getItems().size());

        } catch (IOException e){
            System.err.println(e.toString());
        }


    }
}

class DiscoverResponse {
    private List<DiscoverItem> items;

    public List<DiscoverItem> getItems() {
        return items;
    }

    public void setItems(List<DiscoverItem> items) {
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
class DiscoverItem {
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
