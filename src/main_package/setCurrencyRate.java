package main_package;

/**
 * Created by Zhengyag's PC on 2016/3/23.
 */
public class setCurrencyRate {

    //The base currency, ex: USD
    private String base;
    //The currency convert from base, ex: USD -> CAD
    private String convertTo;

    private double convertRate;
    private String date;

    public setCurrencyRate(String base) {
        this.base = base;
    }

    public setCurrencyRate(String base, String convertTo) {
        this.base = base;
        this.convertTo = convertTo;

        getJSON getJ = new getJSON(base, convertTo);

        convertRate = getJ.getConvertRate();
        date = getJ.getDate();

    }

    public String getBaseCurrency() {
        return this.base;
    }

    public String getConvertToCurrency() {
        return  this.convertTo;
    }

    public double getConvertRate() {
        return convertRate;
    }

    public String getDate() {
        return date;
    }






}
