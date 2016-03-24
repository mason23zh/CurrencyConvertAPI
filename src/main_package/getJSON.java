
/**
 * Created by Zhengyang's PC on 2016/3/23.
 */

package main_package;
import org.json.JSONObject;
import org.json.JSONTokener;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;


public class GetJSON {

    private String base;
    private String convertTo;
    private String date;
    private String baseURL = "http://api.fixer.io/latest";
    private double baseRate;
    private double convertRate;

    public GetJSON() {}

    public GetJSON(String base, String convertTo) {
        this.base = base;
        this.convertTo = convertTo;

        //Construct the final url with baseURL + parameter
        String finlaURL = baseURL + "?base="+base;

        try {
            //open stream with final url
            URL url = new URL(finlaURL);
            InputStream is = url.openStream();

            JSONTokener tokener = new JSONTokener(is);
            //Get root object
            JSONObject root = new JSONObject(tokener);
            //Get data
            date = root.getString("date");
            //Get rates object
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
