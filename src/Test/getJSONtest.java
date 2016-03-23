package Test;

import org.json.JSONObject;

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
            String baseURL = "http://api.fixer.io/latest";
            URL url = new URL("http://api.fixer.io/latest");
            InputStream is = url.openStream();

            JSONObject obj = new JSONObject("F:\\Java_Project_NEW\\CurrencyConvertAPI\\testJSON.json");

            String cRates = obj.getJSONObject("base").toString();
            System.out.println(cRates);

            



        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
