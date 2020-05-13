package bean;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import okhttp3.OkHttpClient;
import org.primefaces.json.JSONArray;
import org.primefaces.json.JSONObject;
import okhttp3.*;

@ManagedBean(name = "housesService")
@ApplicationScoped
public class housesService {

    private final OkHttpClient httpClient = new OkHttpClient();

    public List getData() throws Exception {
        String data = sendGet();
        List housesList = new ArrayList<>();
        JSONArray jsonArray = new JSONArray(data);
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject json = jsonArray.getJSONObject(i);
            housesList.add(new houses(json.getString("url"),
                    json.getString("name"),
                    json.getString("region"),
                    json.getString("coatOfArms"),
                    json.getString("words"),
                    json.getJSONArray("titles").join(",").split(","),
                    json.getJSONArray("seats").join(",").split(","),
                    json.getString("currentLord"),
                    json.getString("heir"),
                    json.getString("overlord"),
                    json.getString("founded"),
                    json.getString("founder"),
                    json.getString("diedOut"),
                    json.getJSONArray("ancestralWeapons").join(",").split(","),
                    json.getJSONArray("cadetBranches").join(",").split(","),
                    json.getJSONArray("swornMembers").join(",").split(",")));
        }
        return housesList;
    }

    private String sendGet() throws Exception {
        try {

            System.out.println("I got here houses");
            return httpClient.newCall(new Request.Builder().url("https://anapioficeandfire.com/api/houses/").build()).execute().body().string();
        } catch (Exception ex) {
            return ex.getMessage();
        }

    }
}
