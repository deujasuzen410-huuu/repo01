import java.util.Scanner;

/**
 * Write a description of class Using_Scanner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Using_Scanner
{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter First Number:");
        
        int firstNum =  input.nextInt();
        
        System.out.println("Enter your Second Number");
        
        int secondNum = input.nextInt();
        
        System.out.println("My first number is:"+firstNum);
        System.out.println("My second number is:"+secondNum);
    }
}