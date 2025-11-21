package big03;
import java.util.Scanner;

public class mathsOperations
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("take 1st input");

        int a = sc.nextInt();

        String result = (a >= 40) ? "Passed" : "Failed";

        System.out.println("The student has " + result);
    }
}

