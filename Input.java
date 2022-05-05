import java.util.Scanner;

public class Input
{
    public int acceptIntInput(String message)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(message);
        int input = Integer.parseInt(console.nextLine());
        return input;
    }

    public double acceptDoubleInput(String message)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(message);
        return Double.parseDouble(console.nextLine());
    }
}
