import java.util.Scanner;

public class Input
{
    public int acceptIntInput(String message)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(message);
        //second way to do it
        int input = Integer.parseInt(console.nextLine());
        return input;
    }
}
