package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;

@ManagedBean(name = "booksService")
@ApplicationScoped
public class booksService {

    private final OkHttpClient httpClient = new OkHttpClient();

    public List getData() throws Exception {
        String data = sendGet();
        List booksList = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(data);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject json = jsonArray.getJSONObject(i);
            booksList.add(new books(json.getString("url"),
                    json.getString("name"),
                    json.getString("isbn"),
                    json.getJSONArray("authors").join(",").split(","),
                    json.getString("numberOfPages"),
                    json.getString("publisher"),
                    json.getString("country"),
                    json.getString("mediaType"),
                    json.getString("released"),
                    json.getJSONArray("characters").join(",").split(","),
                    json.getJSONArray("povCharacters").join(",").split(",")));
        }
        return booksList;
    }

    private String sendGet() throws Exception {
        try {

            System.out.println("I got here books");
            return httpClient.newCall(new Request.Builder().url("https://anapioficeandfire.com/api/books/").build()).execute().body().string();
        } catch (Exception ex) {
            return ex.getMessage();
        }

    }
}
