

import java.util.ArrayList;					//imports to make sure variables are working

public class Data_Passengers {	
	static ArrayList<String> fullName = new ArrayList<String>();
	static ArrayList<String> email = new ArrayList<String>();
	static ArrayList<String> tNumber = new ArrayList<String>();
	static ArrayList<String> DoB = new ArrayList<String>();
	static ArrayList<String> ticketNo = new ArrayList<String>();
	static ArrayList<String> nBags = new ArrayList<String>();
	static ArrayList<String> dSeat = new ArrayList<String>();
	static ArrayList<String> rSeat = new ArrayList<String>();
	public static int PassengerCountData = 0;

	public static int getPassengerCountData() {

		return PassengerCountData;

	}

	public static ArrayList <String> getFullName() {					//getter for first name (retrieves data)

		return fullName;

	}


	public static ArrayList <String> getEmail() {					 //getter for email (retrieves data)

		return email;

	}


	public static ArrayList <String> getTNumber() {					//getter for telephone number (retrieves data)

		return tNumber;

	}


	public static ArrayList <String> getDoB() {						//getter for date of birth (retrieves data)

		return DoB;

	}


	public static ArrayList <String> getTicketNo() {					//getter for ticket number (retrieves data)

		return ticketNo;

	}


	public static ArrayList <String> getNBags() {					//getter for number of bags (retrieves data)

		return nBags;

	}


	public static ArrayList <String> getDSeat() {					//getter for departure seat (retrieves data)

		return dSeat;

	}


	public static ArrayList <String> getRSeat() {				//getter for return seat (retrieves data)

		return rSeat;

	}

}
