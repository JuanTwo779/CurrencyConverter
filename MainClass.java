
public class MainClass
{
    public MainClass() {
    }

    public static void main(String[] args)
    {
        //objects
        Input input = new Input();
        Messages objMessage = new Messages();

        //variables
        int from = 0;
        int to = 0;
        double amount = 0;

        //methods
        objMessage.Menu(); //1. Show menu
        from = input.acceptIntInput("Which currency do you want to convert from?"); //2. ask for original currency
        to = input.acceptIntInput("Which currency do you want to conver to?"); //3. ask for new currency
        amount = input.acceptDoubleInput("How much money do you want to convert?"); //4. ask for amount




    }




}
