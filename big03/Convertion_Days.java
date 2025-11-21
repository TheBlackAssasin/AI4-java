package big03;
import java.util.Scanner;

public class Convertion_Days
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("TAKE DAYS");
        int days = sc.nextInt();
        int year = days/365;
        int month = (days%365)/30;
        int day = days%30;
        System.out.println("Year"+year);
        System.out.println("month"+month);
        System.out.println("day"+day);
        
    }
}