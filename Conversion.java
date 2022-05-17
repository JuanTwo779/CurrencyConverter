import java.util.HashMap;
import java.text.DecimalFormat;

public class Conversion
{
    public Conversion()
    {
    }

//    public void currencyHashMap()
//    {
//        //HashMap object called currencyCodes
//        HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();
//
//        //keys and values (choice, Country currency)
//        currencyCodes.put(1, "AUD"); //AUS
//        currencyCodes.put(2, "MXN"); //Mexico
//        currencyCodes.put(3, "PHP"); //Philippines
//        currencyCodes.put(4, "USD"); //United States
//        currencyCodes.put(5, "GBP"); //Great Britain
//    }

    public void centralConvertor(int from, int to, double amount)
    {
        if(from == 1)
        {
            convertAUS(to, amount);
        }
    }

    /**
     * make single method for all conversions
     * use if else statements?
     */
    public double convertAUS(int to, double amount)
    {
        double convAmount = 0;
        if (to == 2)
        {
            convAmount = amount * 14.04;
        }
        return convAmount;
    }






}
