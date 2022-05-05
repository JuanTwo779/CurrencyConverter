
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
        int choice = 0;
        double amount = 0;

        //methods
        objMessage.Menu();
        choice = input.acceptIntInput("Which currency do you want to convert from?");
        amount = input.acceptDoubleInput("How much money do you want to convert?");




    }




}
