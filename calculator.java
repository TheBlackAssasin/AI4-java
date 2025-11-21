import java.util.Scanner;


public class calculator
{
    public static void main (String[]arg)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first Number");
        float num1=sc.nextFloat();
        System.out.println("Enter second Number");
        float num2=sc.nextFloat();
        System.out.println("The sum of two Number is "+(num1+num2));
        System.out.println("The diffrence of two Number is "+(num1-num2));
        System.out.println("The multiplication of two Number is "+(num1*num2));
        System.out.println("The divison of two Number is "+(num1/num2));
        float greater = (num1>num2)?num1:num2;
        System.out.println("The greater number is"+greater);
        
        
        
    }
    
}