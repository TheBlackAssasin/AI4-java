import java.util.Scanner;

/**
 * Write a description of class studentGrade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class studentGrade
{
    static void main(String[]arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("The students grade is");
        int grade = sc.nextInt();
        String store = (grade >= 80)?"grade A":
                       (grade >= 60)?"grade B":
                       (grade >= 40)?"grade C":
                       "FAIL";
        System.out.println("The student got "+store);
        
        
        
        
    }
    
}