

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
 *  CSVReader is a class that is used to read the CSV File to an ArrayList
 *  Object for the ArrayList is DataController class
 */

public class Data_CSVReader {

	static ArrayList <Data_Flights> flightDataArrayList = new ArrayList<Data_Flights>();
	
	private static int departureFlightID;
	private static int returnFlightID;

	public static void LoadCSVFile() {
		String path = "Flights.csv";
		String line = "";

		try {
			//			Reading the CSV File

			BufferedReader flightData = new BufferedReader(new FileReader(path));

			while ((line = flightData.readLine()) != null) {

				String[] value = line.split(",");

				Data_Flights column1 = new Data_Flights();

				//			Adding the data to the ArrayList

				column1.setDateOfDeparture(value[0]);
				column1.setDepartureTime(value[1]);
				column1.setArrivalTime(value[2]);
				column1.setFlightDurationMinutes(value[3]);
				column1.setDistanceTravelledMiles(value[4]);
				column1.setFlightDelayMinutes(value[5]);
				column1.setDepartureAirport(value[6]);
				column1.setDepartureCity(value[7]);
				column1.setArrivalAirport(value[8]);
				column1.setArrivalCity(value[9]);
				column1.setFlightNumber(value[10]);
				column1.setAirlineCompany(value[11]);

				
				flightDataArrayList.add(column1);
					
//				System.out.println(value[0] + value[1] + value[2] + value[3] + value[4] + value[5] 
//								+ value[6] + value[7] + value[8] + value[9] + value[10] + value[11]);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void setDepartureFlightID(int input) {
		departureFlightID = input;
	}

	public static int getDepartureFlightID() {
		return departureFlightID;
	}	
	
	public static void setReturnFlightID(int input) {
		returnFlightID = input;
	}

	public static int getReturnFlightID() {
		return returnFlightID;
	}	
	

	public static ArrayList <Data_Flights> getAllFlights() {

		return flightDataArrayList;

	}	
}	