import java.util.HashMap;
import java.util.Scanner;

public class MainClass {
    public MainClass() {
    }

    public static void main(String[] args) {
        //variables
        String fromCode = "";
        String toCode = "";
        double amount = 0.0;

        //scanner
        Scanner console = new Scanner(System.in);

        //HashMap object called currencyCodes
        HashMap<Integer, String> currencyCodes = new HashMap<Integer, String>();

        //keys and values (choice, Country currency)
        currencyCodes.put(1, "AUD"); //AUS
        currencyCodes.put(2, "ARS"); //Argentina
        currencyCodes.put(3, "CLP"); //Chile
        currencyCodes.put(4, "COP"); //Columbia
        currencyCodes.put(5, "CUP"); //Cuba
        currencyCodes.put(6, "DOP"); //Dominican Republic
        currencyCodes.put(7, "MXN"); //Mexico
        currencyCodes.put(8, "UYU"); //Uruguay
        currencyCodes.put(9, "PHP"); //Philippines
        currencyCodes.put(10, "USD"); //United States
        currencyCodes.put(11, "GBP"); //Great Britain

        //welcome method prints to screen
        Welcome();

        //put in one method later
        System.out.println("Currency converting FROM?");
        System.out.println("1:AUD (Australian Dollar) \t 2:ARS (Argentinian Peso) \t 3:CLP (Chilean Peso)" +
                "\n 4:COP (Columbian Peso) \t 5:CUP  (Cuban Peso) \t 6:DOP (Dominican Peso)" +
                "\n 7:MXN (Mexican Peso) \t 8:UYU (Uruguayan Peso) \t 9:PHP (Filipino Peso)" +
                "\n 10:USD (United States Dollar \t 11:GBP (Great British Pound");
        fromCode = currencyCodes.get(console.nextInt());

        //put in another method later
        System.out.println("Currency converting TO?");
        System.out.println("1:AUD (Australian Dollar) \t 2:ARS (Argentinian Peso) \t 3:CLP (Chilean Peso)" +
                "\n 4:COP (Columbian Peso) \t 5:CUP  (Cuban Peso) \t 6:DOP (Dominican Peso)" +
                "\n 7:MXN (Mexican Peso) \t 8:UYU (Uruguayan Peso) \t 9:PHP (Filipino Peso)" +
                "\n 10:USD (United States Dollar \t 11:GBP (Great British Pound");
        toCode = currencyCodes.get(console.nextInt());


    }

    public static void Welcome()
    {
        System.out.println("Welcome to the best cash converter!");
    }
}
