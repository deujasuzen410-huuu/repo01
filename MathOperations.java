
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[] args){
        // arithmetic operators
        int a = 20;
        int b = 10;
        int sum = a+b;
        int sub = a-b;
        int multiply = a*b;
        int division = a/b;
        int modulus = a%b;
        System.out.println("sum:"+sum);
        System.out.println("subtract:"+sub);
        System.out.println("multily:"+multiply);
        System.out.println("division:"+division);
        System.out.println("modulus:"+modulus);
        
        //Unary (post-increment and pre-increment operators)
       
        System.out.println(++a ); //pre increment
        System.out.println(a++); //post increment
        
        //Relational operator
        System.out.println(a == b);//false
        System.out.println(a !=b);//true
        System.out.println(a > b);//true
        System.out.println(a < b);//false
        System.out.println(a >= b);//true
        System.out.println(a <= b);//false
        
        //Logical Operators
        System.out.println(a > b && a != b);//true
        System.out.println(a < b && a == b);//false
        
        //Ternary Operators
        
        String isValid = (a>b) ? "A is greater than B" : "B is greater than A";
        System.out.println(isValid);
        
        
        
        
        
    }
}