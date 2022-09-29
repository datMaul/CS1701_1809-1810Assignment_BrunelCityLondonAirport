

/*
 *  DataController is a class that is used to create an object of each row in the CSV file
 *  DataController can be used as type of ArrayList<DataController> 
 *  set methods are used for creating the columns in this row of the object
 *  get methods are used for getting the data from the individual column
 */

public class Data_Flights {

	//	Variables

	private String dateOfDeparture;
	private String departureTime;
	private String arrivalTime;
	private String flightDurationMinutes;
	private String distanceTravelledMiles;
	private String flightDelayMinutes;
	private String departureAirport;
	private String departureCity;
	private String arrivalAirport;
	private String arrivalCity;
	private String flightNumber;
	private String airlineCompany;

	private Boolean isBeingProccessed;
	private Boolean isItCompleted;

	private Data_SeatingPlan SeatingPlan;
	private Data_Passengers Passengers;
	private Data_Restaurant Restaurant;
	private GUIController_Shop Shop;
	private Data_Finance Finance;
	
	


	//	Setters & Getters Methods	

	public void setDateOfDeparture(String input) {
		this.dateOfDeparture = input;
	}

	public String getDateOfDeparture() {
		return this.dateOfDeparture;
	}	



	public void setDepartureTime(String input) {
		this.departureTime = input;
	}


	public String getDepartureTime() {
		return this.departureTime;
	}



	public void setArrivalTime(String input) {
		this.arrivalTime = input;
	}

	public String getArrivalTime() {
		return this.arrivalTime;
	}



	public void setFlightDurationMinutes(String input) {
		this.flightDurationMinutes = input;
	}

	public String getFlightDurationMinutes() {
		return this.flightDurationMinutes;
	}



	public void setDistanceTravelledMiles(String input) {
		this.distanceTravelledMiles = input;
	}

	public String getDistanceTravelledMiles() {
		return this.distanceTravelledMiles;
	}



	public void setFlightDelayMinutes(String input) {
		this.flightDelayMinutes = input;
	}

	public String getFlightDelayMinutes() {
		return this.flightDelayMinutes;
	}



	public void setDepartureAirport(String input) {
		this.departureAirport = input;
	}

	public String getDepartureAirport() {
		return this.departureAirport;
	}



	public void setDepartureCity(String input) {
		this.departureCity = input;
	}

	public String getDepartureCity() {
		return this.departureCity;
	}



	public void setArrivalAirport(String input) {
		this.arrivalAirport = input;
	}

	public String getArrivalAirport() {
		return this.arrivalAirport;
	}



	public void setArrivalCity(String input) {
		this.arrivalCity = input;
	}

	public String getArrivalCity() {
		return this.arrivalCity;
	}



	public void setFlightNumber(String input) {
		this.flightNumber = input;
	}

	public String getFlightNumber() {
		return this.flightNumber;
	}



	public void setAirlineCompany(String input) {
		this.airlineCompany = input;
	}

	public String getAirlineCompany() {
		return this.airlineCompany;
	}



	public void setIsBeingProccessed(Boolean input) {
		this.isBeingProccessed = input;
	}

	public Boolean getIsBeingProccessed() {
		return this.isBeingProccessed;
	}	


	public void setIsItCompleted(Boolean input) {
		this.isItCompleted = input;
	}

	public Boolean getIsItCompleted() {
		return this.isItCompleted;
	}	

	public Data_Flights getCurrentInstance() {
		return this;
	}



	public Data_SeatingPlan getSeatingPlan() {
		return this.SeatingPlan;
	}

	public void setSeatingPlan(Data_SeatingPlan input) {
		this.SeatingPlan = input;
	}		


	public Data_Passengers getPassengers() {
		return this.Passengers;
	}

	public void setPassengers(Data_Passengers input) {
		this.Passengers = input;
	}


	public Data_Restaurant getRestaurant() {
		return this.Restaurant;
	}

	public void setRestaurant(Data_Restaurant input) {
		this.Restaurant = input;
	}	


	public GUIController_Shop getShop() {
		return this.Shop;
	}

	public void setShop(GUIController_Shop input) {
		this.Shop = input;
	}	


	public Data_Finance getFinance() {
		return this.Finance;
	}

	public void setFinance(Data_Finance input) {
		this.Finance = input;
	}	

}