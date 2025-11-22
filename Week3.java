
/**
 * Write a description of class Week3 here.
 *
 * @author Sujen Deuja
 * @version v1.0
 */

public class Week3
{
    int  qty; //instance variable
    static int rrt; //static variable
    public static void main(String[] args){
    
        int age = 18; // local variable
        
        //<class name> <variable> = new <className>();
        
        Week3 w1 = new Week3();
        System.out.println(w1);
        
        System.out.println(age);
        System.out.println(Week3.rrt);
        
        // Implicit Typecasting
        
        double dtr = age;
        System.out.println(dtr);
        
        // Explicit Typecasting
        
        double db = 10.09;
        int itr = (int)db;
        System.out.println(itr);
        
        //Exception in arithmetic
        byte b1 = 10;
        byte b2 = 11;
        byte sum = (byte) (b1+b2);
        System.out.println(sum);
        
        // same exception in short and char
    
        //Minimum,maximum,size,bytes
        System.out.println(Byte.MAX_VALUE);//Maximum values
        System.out.println(Byte.MIN_VALUE);//Minimum values
        System.out.println(Byte.SIZE);// bits
        System.out.println(Byte.BYTES);// bytes
        
        //Escape Sequence
        System.out.println("Hello\nWorld");
        System.out.println("Hello\tWorld");
        System.out.println("She said \"Hi\" ");
         //Unicode Escape 
    }
}