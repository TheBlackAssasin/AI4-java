import java.util.Scanner;
public class Student_information
{
    public static void main (String[]arg)
    {
        
        Scanner sc =new Scanner (System.in);
        System.out.println("Enter Student Name ");
        String studentName =sc.nextLine();
        System.out.println("Enter age");
        int age=sc.nextInt();
        System.out.println("Enter gpa");
        float gpa =sc.nextFloat();
        System.out.println("Student's name is "+studentName);
        System.out.println("Student's age is "+age);
        System.out.println("Student gpa is"+gpa);
        
        
    }
}