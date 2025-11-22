import java.util.Scanner;

/**
 * Write a description of class GradeSheet here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GradeSheet
{
    public static void main(String[] args){
    System.out.println();
    Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Marks:");
        
        double Marks =  input.nextDouble();
        
        String isValid = (Marks>=40) ? "Pass" : "Fail";
        System.out.println(isValid);
               

}
}