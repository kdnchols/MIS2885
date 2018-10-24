package kevinNichols;

import java.util.Date;
import java.util.Scanner;

public class ShipmentDisplayLoopKevinNichols {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner (System.in); //Declares scanner object
		System.out.println("Enter the Shipment ID: "); //Prompts user entry
		String shipID = scan1.nextLine(); //Reads user entry
		
		
		
		int shipWeight = scan2.nextInt(); //Reads user entry
		
		Scanner scan3 = new Scanner (System.in);
		
		int shipVolume = scan3.nextInt(); //Reads user entry
		
		Scanner scan4 = new Scanner (System.in);
		System.out.println("Enter the Shipment Origin Station: ");
		String shipOrigin = scan4.nextLine(); //Reads user entry
		
		Scanner scan5 = new Scanner (System.in);
		System.out.println("Enter the Shipment Destination: ");
		String shipDestination = scan5.nextLine(); //Reads user entry
		
		double shipCost; //Declares shipCost variable as a double
		shipCost = shipWeight * 10 + shipVolume * 1.5; //Calculates shipment cost
		
		
		
		double processedshipTotal = 0;
		double totalCost;
		
		 while (true)
		 {
			System.out.print("Enter Shipment I.D: ");
			 
		    if (shipId.equalsIgnoreCase("END"))
               		 break;
			 
            	    System.out.println("Enter the Shipment Weight: ");
			shipWeight = input.next();
 		System.out.println("Enter the Shipment Volume: ");
				shipVolume = input.next();
		
		        if (shipWeight<70 && shipVolume < 120){
		            processedshipTotals++;
		            totalCost += shipWeight * 10 + shipVolume * 1.5; //Calculates shipment cost
			}
		           
		            
			 
		 }
		
		Date date = new Date(); //Creates an new date object
		System.out.println("ShipmentDisplayKevinNichols"+ date);
		
	}

}
