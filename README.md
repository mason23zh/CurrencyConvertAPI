# CurrencyConvertAPI
This is a simple get currency rate API, using the live data from "http://fixer.io/".
How to use: 
SetCurrencyRate setCurrencyRate = new SetCurrencyRate("CAD","USD");
double rate = setCurrencyRate.getConvertRate();
String date = setCurrencyRate.getDate();

Note: The first argument in the SetCurrencyRate is the base currency, and second argument is the convert currency. 
The example above means that "convert 1 CAD to USD". 
