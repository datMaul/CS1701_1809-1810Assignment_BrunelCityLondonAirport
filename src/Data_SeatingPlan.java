

import java.util.ArrayList;

public class Data_SeatingPlan {

	private String flightDurationMinutes;
	private String rSeatNumber;
	private String dSeatNumber;
	
	ArrayList<String> DSeatNameList = new ArrayList<String>();
	ArrayList<String> RSeatNameList = new ArrayList<String>();

	
	public String getFlightDurationMinutes() {

		return this.flightDurationMinutes;

	}

	public void setrSeatNumber(String text) {

		this.rSeatNumber = text;

	}

	public String getrSeatNumber() {

		return this.rSeatNumber;
	}

	public void setdSeatNumber(String text) {

		this.dSeatNumber = text;

	}

	public String getdSeatNumber() {


		return this.dSeatNumber;

	}

	public ArrayList<String> getDSeatName() {
		return this.DSeatNameList;
	}
	
	public ArrayList<String> getRSeatName() {
		return this.RSeatNameList;
	}

}



