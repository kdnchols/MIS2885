package kevinNichols;

import java.util.Date;
import java.util.Scanner;

public class ShipmentDisplayLoopKevinNichols {

	public static void main(String[] args) {
		
		Scanner scan1 = new Scanner (System.in); //Declares scanner object
		System.out.println("Enter the Shipment ID: "); //Prompts user entry
		String shipID = scan1.nextLine(); //Reads user entry
		
		Scanner scan2 = new Scanner (System.in);
		System.out.println("Enter the Shipment Weight: ");
		int shipWeight = scan2.nextInt(); //Reads user entry
		
		Scanner scan3 = new Scanner (System.in);
		System.out.println("Enter the Shipment Volume: ");
		int shipVolume = scan3.nextInt(); //Reads user entry
		
		Scanner scan4 = new Scanner (System.in);
		System.out.println("Enter the Shipment Origin Station: ");
		String shipOrigin = scan4.nextLine(); //Reads user entry
		
		Scanner scan5 = new Scanner (System.in);
		System.out.println("Enter the Shipment Destination: ");
		String shipDestination = scan5.nextLine(); //Reads user entry
		
		double shipCost; //Declares shipCost variable as a double
		shipCost = shipWeight * 10 + shipVolume * 1.5; //Calculates shipment cost
		
		System.out.println("Shipment ID: " + shipID); //Displays shipment's ID
        System.out.println("Shipment Weight: " + shipWeight); //Displays shipment's weight		
        System.out.println("Shipment Volume: " + shipVolume); //Displays shipment's volume
		System.out.println("Shipment Origin: " + shipOrigin); //Displays shipment's origin
        System.out.println("Shipment Destination: " + shipDestination); //Display's shipment's destination
		System.out.println("Shipment Cost: " + shipCost); //Displays shipment cost
		
		int shipCount = 0;
		double processedshipTotal = 0;
		double totalCost;
		
		 while (shipCount < processedshipTotal)
		 {
		    if (shipId.equalsIgnoreCase("END"))
                break;
            
		    else
		        if (shipWeight<70 && shipVolume < 120)
		            processedshipTotals +=;
		            totalCost = shipCost.shipcount + totalCost;
		            shipCount++;
		            
		        else 
		            shipcount++
			 
		 }
		
		Date date = new Date(); //Creates an new date object
		System.out.println("ShipmentDisplayKevinNichols"+ date);
		
	}

}
