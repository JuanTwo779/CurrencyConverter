import java.util.HashMap;
import java.text.DecimalFormat;

public class Conversion
{
    public Conversion()
    {
    }

    public void currencyHashMap()
    {
        //HashMap object called currencyCodes
        HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();

        //keys and values (choice, Country currency)
        currencyCodes.put(1, "AUD"); //AUS
        currencyCodes.put(2, "MXN"); //Mexico
        currencyCodes.put(3, "PHP"); //Philippines
        currencyCodes.put(4, "USD"); //United States
        currencyCodes.put(5, "GBP"); //Great Britain
    }

    public double convertAUS(double from)
    {
        double amount = 0;
        return amount;
    }






}
