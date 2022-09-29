

public class Calc_Finance {
	//flightCost method returns double value and takes input of string for ticket and double for flightDistance
		public static double flightCost(String ticket,double flightDistance) { 
			if(ticket == "Economy") {
				return flightDistance * 0.5;
			}
			else if(ticket == "Business") {
				return  flightDistance;
			}
			else if(ticket == "FirstClass") {
				return flightDistance * 1.5;
			} 
			else {
				return 0;
			}
		
		}
		//passengerComp method returns an int value and takes a double value input for flightDelay
		public static int passengerComp(double flightDelay) {
			if(flightDelay < 1) {
				return 0;
			}
			else if(flightDelay > 1 && flightDelay <= 2) {
				return 100;
			}
			else if(flightDelay > 2 && flightDelay <= 3) {
				return 200;
			}
			else 
				return 300;
			
		}
		//method bagTotal returns an int value and takes and int value for nBags input
		public static int bagTotal(int nBags) {
			int newCounter = 1;
			int bagCost = 0;
			if(nBags <= newCounter) {
				return bagCost;
			}
			else {
				while(nBags != newCounter) {
					newCounter = newCounter + 1; 
					bagCost = bagCost + 25;
				}
				return bagCost;
			}
		}
		
		

}
