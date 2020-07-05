package homeworktwo;


import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class GetRequestCheckText {
    static String sURL = "https://speller.yandex.net/services/spellservice/checkText?text=";

    public static void main(String[] args) {
        CloseableHttpResponse response1 = null;
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet httpGet = new HttpGet(sURL + "в+москве+дожд");

            response1 = httpClient.execute(httpGet);
            System.out.println(EntityUtils.toString(response1.getEntity()));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                response1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
