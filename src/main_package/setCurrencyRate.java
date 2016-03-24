package main_package;

/**
 * Created by Zhengyang on 2016/3/23.
 */
public class SetCurrencyRate extends GetJSON{


    public SetCurrencyRate(String base, String convertTo) {
        super(base, convertTo);
    }


    public double getConvertRate() {
        return super.getConvertRate();
    }

    public String getDate() {
        return super.getDate();
    }






}
