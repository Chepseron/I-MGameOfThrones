package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;
import okhttp3.*;

@ManagedBean(name = "characterService")
@ApplicationScoped
public class characterService {

    private final OkHttpClient httpClient = new OkHttpClient();

    public List getData() throws Exception {
        String data = sendGet();
        List characterList = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(data);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject json = jsonArray.getJSONObject(i);
            characterList.add(new character(json.getString("url"), json.getString("name"), json.getString("gender"), json.getString("culture"),
                    json.getString("born"), json.getString("died"), json.getJSONArray("titles").join(",").split(","), json.getJSONArray("aliases").join(",").split(","),
                    json.getString("father"), json.getString("mother"), json.getString("spouse"), json.getString("allegiances"), json.getJSONArray("books").join(",").split(","),
                    json.getJSONArray("povBooks").join(",").split(","), json.getJSONArray("tvSeries").join(",").split(","), json.getJSONArray("playedBy").join(",").split(",")));
        }
        return characterList;
    }

    private String sendGet() throws Exception {
        try {
            System.out.println("I got here characters");
            return httpClient.newCall(new Request.Builder().url("https://anapioficeandfire.com/api/characters/").build()).execute().body().string();
        } catch (Exception ex) {
            return ex.getMessage();
        }

    }
}
