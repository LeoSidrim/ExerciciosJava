package util;

public class CurrencyConverter {
    public static final double iof = 0.06;
    public static final double dollarValue = 3.1;
    public static double converter(double real){
        return (real * dollarValue) +(iof *(real * dollarValue));
    }
}
