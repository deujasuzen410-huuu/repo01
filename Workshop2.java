import java.util.Scanner;

/**
 * Write a description of class Workshop2 here.
 *
 * @author Sujen Deuja
 * @version v1.0
 */
public class Workshop2
{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Number:");
        
        int firstNum =  input.nextInt();
        
        System.out.println("Enter your Second Number");
        
        double secondNum = input.nextDouble();
        
        System.out.println("My first number is:"+firstNum);
        System.out.println("My second number is:"+secondNum);
        
        //post and pre increment operator 
        int h = 1;
        int j = ++h;
        int k = h++;
        System.out.println("h + j + k");
        
        //Ternery Operator
        
        int age = 18;
        String isValid = (age>=18) ? "Driving is allowwed" : "Driving is not allowed";
        System.out.println(isValid);
    }
}
