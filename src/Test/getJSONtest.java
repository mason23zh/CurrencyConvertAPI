package Test;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Zhengyag's PC on 2016/3/23.
 */
public class getJSONtest {
    public static void main(String[] args) {
        getJSON();

    }

    public static void getJSON() {
        try {
            String baseURL = "http://api.fixer.io/latest?base=USD";
            URL url = new URL(baseURL);
            InputStream is = url.openStream();

            JSONTokener tokener = new JSONTokener(is);
            JSONObject root = new JSONObject(tokener);

            String date = root.getString("date");
            System.out.println("date:" + date);

            String base = root.getString("base");
            System.out.println("base:" + base);

            JSONObject rateObj = root.getJSONObject("rates");
            double CNY = rateObj.getDouble("CNY");
            System.out.println("CNY rate:" + CNY);


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
