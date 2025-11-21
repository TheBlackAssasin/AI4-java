import java.util.Scanner;
public class TemperatureCheck
{
   public static void main(String[]arg)
   {
       Scanner sc = new Scanner(System.in);
       System.out.println("input the temp");
       int temp = sc.nextInt();
       String checktemp = (temp< 10) ? "Very Cold" :
                       (temp> 25) ? "Hot day" :
                       "Normal Weather";
        
       System.out.println("THE WEATHER IS"+checktemp);
       
   }
}