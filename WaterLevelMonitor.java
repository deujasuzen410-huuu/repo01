import java.util.Scanner;

/**
 * Write a description of class WaterLevelMonitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelMonitor
{
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println( " Enter Water Level in Litres: " );
     System.out.println( " Example: 800 , 950 , 1000 , 1200 etc" );
     int WaterLVL =  input.nextInt();
     String isValid = (WaterLVL>=1000) ? "WARNING!! Water level has reached more than 1000 Litres" : "Status: Normal";
        System.out.println(isValid);
     
    }
}