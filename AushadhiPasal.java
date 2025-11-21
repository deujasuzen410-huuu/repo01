import java.util.Scanner;

/**
 * Write a description of class AushadhiPasal here.
 *
 * @author Sujen Deuja
 * @version v1.0    
 */
public class AushadhiPasal
{
    public static void main(String[] args){
                
        Scanner input = new Scanner(System.in);
        System.out.println("==============================================================================================================");

        System.out.println("----------------------------Aushadhi Pasal(Medicine Store)----------------------------------------------------");
        System.out.println("-----------------------------------Dharan,Nepal---------------------------------------------------------------");
        
        String Medfirst =  "Paracetamol(प्यारासिटामोल)";
        double PriceFirst = 20;
        int Quantity1 = 300;
        
        String Medsecond = "Flexon(फ्लेक्सन)";
        double PriceSecond = 25;
        int Quantity2 = 400;

        
        String Medthird = "Aspirin(एस्पिरिन)";
        double PriceThird = 10;
        int Quantity3 = 170;



        System.out.println("Medicine Name: "+Medfirst+"\nPrice(per tablet): Rs "+PriceFirst+"\nQuantity in stock: "+Quantity1+"\nPrescription Required");
        
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        System.out.println("Medicine Name: "+Medsecond+"\nPrice(per tablet): Rs "+PriceSecond+"\nQuantity in stock: "+Quantity2+"\nPrescription Required");
        
        System.out.println("-------------------------------------------------------------------------------------------------------------");

        System.out.println("Medicine Name: "+Medthird+"\nPrice(per tablet): Rs "+PriceThird+"\nQuantity in stock: "+Quantity3+"\nPrescription Not Required");

        System.out.println("--------------------------------------------------------------------------------------------------------------");
        
        System.out.println("==============================================================================================================");


    }
}