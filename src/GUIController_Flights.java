

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import org.jdatepicker.impl.JDatePickerImpl;

/*
 * FlightsGUIController class is used for the ActionListeners of ASSIGNMENT_APP_BOOK_A_FLIGHT_PAGE
 * 
 */

public class GUIController_Flights implements ActionListener{

	private ArrayList <Data_Flights> AllFlights;

	/*

		These are the available Components in the ASSIGNMENT_APP_BOOK_A_FLIGHT_PAGE

		0 javax.swing.JProgressBar
		1 javax.swing.JButton
		2 javax.swing.JLabel
		3 javax.swing.JLabel
		4 javax.swing.JLabel
		5 javax.swing.JLabel
		6 javax.swing.JLabel
		7 javax.swing.JLabel
		8 javax.swing.JTextField
		9 javax.swing.JTextField
		10 javax.swing.JTextField
		11 javax.swing.JTextField
		12 javax.swing.JButton
		13 javax.swing.JTextField
		14 javax.swing.JTextField
		15 javax.swing.JButton
		16 javax.swing.JLabel

	 */

	@Override
	public void actionPerformed(ActionEvent event) {

		//	Variables		

		JButton button = (JButton) event.getSource();

		JPanel parent = (JPanel) button.getParent();

		Component[] comp = parent.getComponents();

		String name = button.getName();



		JProgressBar progressBar = (JProgressBar) comp[0];

		JLabel DepartureCity = (JLabel) comp[2];
		JLabel ArrivalCity = (JLabel) comp[3];
		JLabel DepartureDate = (JLabel) comp[4];
		JLabel ReturnDate = (JLabel) comp[5];
		JLabel DepartureAvaliableFlights = (JLabel) comp[6];
		JLabel ReturnAvaliableFlights = (JLabel) comp[7];

		JComboBox DepartureCityInput = (JComboBox) comp[8];
		JComboBox ArrivalCityInput = (JComboBox) comp[9];

		JDatePickerImpl DepartureDateInput = (JDatePickerImpl) comp[10];
		JDatePickerImpl ReturnDateInput = (JDatePickerImpl) comp[11];
		JTextField DepartureFlightsOutput = (JTextField) comp[13];
		JTextField ReturnFlightsOutput = (JTextField) comp[14];

		JButton BackToMainPage1 = (JButton) comp[1];
		JButton GetData = (JButton) comp[12];
		JButton NextPage = (JButton) comp[15];

		JLabel BackgroundImage = (JLabel) comp[16];

		JFrame main = (JFrame) SwingUtilities.getRoot(button);


		AllFlights = Data_CSVReader.getAllFlights();

		//	Switch Statement For Buttons

		switch (name) {
		case "BackToMainPage1":

			System.out.println("Previous Page");
			System.out.println();

			goToPreviousPage(main);


			break;

		case "GetData":

			ArrayList <Data_Flights> result = checkFlights(DepartureCityInput, 
					ArrivalCityInput,
					DepartureDateInput,
					ReturnDateInput,
					DepartureFlightsOutput,
					ReturnFlightsOutput,
					main);

			System.out.println("Get Data");
			System.out.println();
			
			/*
			 * NEED TO FIX:
			 * When a D date is 2022 and R date is 2021, it flips the 0 and 1 from the result.
			 * This shouldn't be happening. Instead of it should give the error.	
			 */

			if (result.size() == 2) {
				//	Displaying The Available Flights

				if (DepartureDateInput.getJFormattedTextField().getText().compareTo(ReturnDateInput.getJFormattedTextField().getText()) <= 0) {
					DepartureFlightsOutput.setText(result.get(0).getDepartureCity() + " to " + result.get(0).getArrivalCity()
							+ " | Departure Time: " + result.get(0).getDepartureTime() + " | Arrival Time: " + result.get(0).getArrivalTime()
							+ " | Flight Delay: " + result.get(0).getFlightDelayMinutes() + " | Flight Number: " + result.get(0).getFlightNumber()
							+ " | Airline Company: " + result.get(0).getAirlineCompany());

					System.out.println("----------");
					System.out.println("Departure Flight:");
					System.out.println(result.get(0).getDepartureCity() + " to " + result.get(0).getArrivalCity()
							+ " | Departure Time: " + result.get(0).getDepartureTime() + " | Arrival Time: " + result.get(0).getArrivalTime()
							+ " | Flight Delay: " + result.get(0).getFlightDelayMinutes() + " | Flight Number: " + result.get(0).getFlightNumber()
							+ " | Airline Company: " + result.get(0).getAirlineCompany());
					System.out.println("----------");


					ReturnFlightsOutput.setText(result.get(1).getDepartureCity() + " to " + result.get(1).getArrivalCity()
							+ " | Departure Time: " + result.get(1).getDepartureTime() + " | Arrival Time: " + result.get(1).getArrivalTime()
							+ " | Flight Delay: " + result.get(1).getFlightDelayMinutes() + " | Flight Number: " + result.get(1).getFlightNumber()
							+ " | Airline Company: " + result.get(1).getAirlineCompany());

					System.out.println("----------");
					System.out.println("Return Flight:");
					System.out.println(result.get(1).getDepartureCity() + " to " + result.get(1).getArrivalCity()
							+ " | Departure Time: " + result.get(1).getDepartureTime() + " | Arrival Time: " + result.get(1).getArrivalTime()
							+ " | Flight Delay: " + result.get(1).getFlightDelayMinutes() + " | Flight Number: " + result.get(1).getFlightNumber()
							+ " | Airline Company: " + result.get(1).getAirlineCompany());
					System.out.println("----------");
				} else {
					JOptionPane.showMessageDialog(main, "Return Date Occurs Before Departure Date, Please Select A Return Date That Occurs After Departure Date!");
					break;
					}
			}
			break;

		case "NextPage":

			System.out.println("Next Page");
			System.out.println();

			goToNextPage(DepartureCityInput, 
					ArrivalCityInput,
					DepartureDateInput,
					ReturnDateInput,
					DepartureFlightsOutput,
					ReturnFlightsOutput, 
					main);

			break;

		default:
			System.out.println(name + " gives Error");
		}
	}

	//	Methods


	private void goToPreviousPage(JFrame frame) {
		try {
			GUI_MainPage window = new GUI_MainPage();
			window.frame.setVisible(true);
			frame.setVisible(false);
		} catch (Exception MainPage) {
			MainPage.printStackTrace();
		}
	}


	private void goToNextPage(JComboBox DepartureCityInput,
			JComboBox ArrivalCityInput,
			JDatePickerImpl DepartureDateInput,
			JDatePickerImpl ReturnDateInput,
			JTextField DepartureFlightsOutput,
			JTextField ReturnFlightsOutput, 
			JFrame frame) {

		if (DepartureFlightsOutput.getText().isEmpty() && ReturnFlightsOutput.getText().isEmpty()) {
			JOptionPane.showMessageDialog(frame, "Please Book A Flight Before Moving To The Next Page");
		} else {
			try {
				GUI_SeatingPlanDeparturePage window = new GUI_SeatingPlanDeparturePage();
				window.frame.setVisible(true);
				frame.setVisible(false);
			} catch (Exception SeatingPlanDeparture) {
				SeatingPlanDeparture.printStackTrace();
			}
		}
	}


	private ArrayList <Data_Flights> checkFlights(JComboBox DepartureCityInput,
			JComboBox ArrivalCityInput,
			JDatePickerImpl DepartureDateInput,
			JDatePickerImpl ReturnDateInput,
			JTextField DepartureFlightsOutput,
			JTextField ReturnFlightsOutput, 
			JFrame frame) {

		ArrayList <Data_Flights> findAvailableFlights = new ArrayList <Data_Flights>();

		for (int i = 0 ; i < AllFlights.size() ; i++) {

			if (DepartureCityInput.getSelectedItem().equals("Please Select City") || ArrivalCityInput.getSelectedItem().equals("Please Select City")) {
				JOptionPane.showMessageDialog(frame, "Please Select City");
				return findAvailableFlights;
			} else if (DepartureCityInput.getSelectedItem().equals(ArrivalCityInput.getSelectedItem()) == true) {
				JOptionPane.showMessageDialog(frame, "Please Select Different Cities For Departure And Arrival Cities");
				return findAvailableFlights;
			} else if (DepartureDateInput.getJFormattedTextField().getText().equals("Please Select Date") == true || DepartureDateInput.getJFormattedTextField().getText().isBlank() == true || DepartureDateInput.getJFormattedTextField().getText().isEmpty() == true) {
				JOptionPane.showMessageDialog(frame, "Please Select Departure Date");
				return findAvailableFlights;
			} else if (ReturnDateInput.getJFormattedTextField().getText().equals("Please Select Date") == true || ReturnDateInput.getJFormattedTextField().getText().isBlank() == true || ReturnDateInput.getJFormattedTextField().getText().isEmpty() == true) {
				JOptionPane.showMessageDialog(frame, "Please Select Return Date"); 
				return findAvailableFlights;
			} 

		}


		//	Filtering The Flight According To The User's Input From The ArrayList

		for (int i = 0 ; i < AllFlights.size() ; i++) {

			if (AllFlights.get(i).getDepartureCity().equals(DepartureCityInput.getSelectedItem()) 
					&& AllFlights.get(i).getDateOfDeparture().contentEquals(DepartureDateInput.getJFormattedTextField().getText()) 
					&& AllFlights.get(i).getArrivalCity().equals(ArrivalCityInput.getSelectedItem())) {

				//	Selecting The Flight And Making The Flight Accessible For The Other Components

				Data_CSVReader.setDepartureFlightID(i);

				findAvailableFlights.add(AllFlights.get(i).getCurrentInstance());
			} 


			if (AllFlights.get(i).getArrivalCity().equals(DepartureCityInput.getSelectedItem()) 
					&& AllFlights.get(i).getDateOfDeparture().contentEquals(ReturnDateInput.getJFormattedTextField().getText()) 
					&& AllFlights.get(i).getDepartureCity().equals(ArrivalCityInput.getSelectedItem())) {

				//	Selecting The Flight And Making The Flight Accessible For The Other Components

				Data_CSVReader.setReturnFlightID(i);

				findAvailableFlights.add(AllFlights.get(i).getCurrentInstance());

			}
			/*
			if (!((AllFlights.get(i).getDepartureCity().equals(DepartureCityInput.getSelectedItem()) 
					&& AllFlights.get(i).getDateOfDeparture().contentEquals(DepartureDateInput.getJFormattedTextField().getText()) 
					&& AllFlights.get(i).getArrivalCity().equals(ArrivalCityInput.getSelectedItem())) 
					&& (AllFlights.get(i).getArrivalCity().equals(DepartureCityInput.getSelectedItem()) 
					&& AllFlights.get(i).getDateOfDeparture().contentEquals(ReturnDateInput.getJFormattedTextField().getText()) 
					&& AllFlights.get(i).getDepartureCity().equals(ArrivalCityInput.getSelectedItem())))) {
				JOptionPane.showMessageDialog(frame, "Please Check The Information Has Entered!");
			return findAvailableFlights;
			}
			 */

		}

		return findAvailableFlights;

	}

}
