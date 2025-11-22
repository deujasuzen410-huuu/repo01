import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main (String[] args){
    
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter Distace in Km");
        double d = input.nextDouble();
        
        System.out.println("Enter Time in Minutes");
        double t = input.nextDouble();
        
        System.out.println("Is the customer a local?(yes or no)");
        String isLocalInput = input.next();
        boolean isLocal = isLocalInput.equalsIgnoreCase("yes");
        
        System.out.println("Is it night travel?(yes or no)");
        String isNightInput = input.next();
        boolean isNight = isNightInput.equalsIgnoreCase("yes");
        
        double baseFare = 100;
        double perkm = 10;
        double perMin = 1;
        double nightRateExtra = 0.15;
        double localDiscount = 0.30;
        
        double fare = baseFare + (d * perkm) + (t * perMin);
        
        fare = (isLocal) ? fare - (fare * localDiscount) : fare;
        
        fare = (isNight) ? fare + (fare * nightRateExtra) : fare;
        
        System.out.println("---------------------------------");
        System.out.println("Final Fare: Rs. "+ fare);
        System.out.println("---------------------------------");
    }
}