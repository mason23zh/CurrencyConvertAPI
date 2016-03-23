package main_package;

import org.json.JSONObject;
import org.json.JSONTokener;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Zhengyag's PC on 2016/3/23.
 */
public class getJSON{

    private String base;
    private String convertTo;
    private String date;
    private String baseURL = "http://api.fixer.io/latest";
    private double baseRate;
    private double convertRate;

    public getJSON(String base) {
        this.base = base;
    }

    public getJSON(String base, String convertTo) {
        this.base = base;
        this.convertTo = convertTo;

        String finlaURL = baseURL + "?base="+base;

        try {
            URL url = new URL(finlaURL);
            InputStream is = url.openStream();

            JSONTokener tokener = new JSONTokener(is);
            JSONObject root = new JSONObject(tokener);

            date = root.getString("date");



            JSONObject rateObj = root.getJSONObject("rates");
            convertRate = rateObj.getDouble(convertTo);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public double getConvertRate() {
        return convertRate;
    }

    public String getDate() {
        return date;
    }

}
