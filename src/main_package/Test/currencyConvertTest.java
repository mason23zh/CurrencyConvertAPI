package main_package.Test;

import main_package.SetCurrencyRate;

/**
 * Created by Zhengyang on 2016/3/23.
 */
public class currencyConvertTest {
    public static void main(String[] args) {
        SetCurrencyRate setCurrencyRate = new SetCurrencyRate("CAD", "CNY");
        System.out.println(setCurrencyRate.getConvertRate());
        System.out.println(setCurrencyRate.getDate());
    }
}
