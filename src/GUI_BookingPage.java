

import javax.swing.JFrame;
import java.awt.Color;
import java.util.Properties;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;
import javax.swing.JProgressBar;
import javax.swing.JComboBox;


/*
 * ASSIGNMENT_APP_BOOK_A_FLIGHT_PAGE is a class that is used to generate the GUI
 * This class will allow to user to book their flight
 * They can input departure & arrival city, departure & return date, and book their flight
 * FlightsGUIController class is used for the ActionListeners of ASSIGNMENT_APP_BOOK_A_FLIGHT_PAGE
 */

public class GUI_BookingPage {

	//	Variables

	JFrame frame;

	//	private JComboBox DepartureCityInput;
	//	private JComboBox ArrivalCityInput;
	//	private JTextField DepartureCityInput;
	//	private JTextField ArrivalCityInput;
	private JTextField DepartureDateInput;
	private JTextField ReturnDateInput;
	private JTextField DepartureFlightsOutput;
	private JTextField ReturnFlightsOutput;



	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_BookingPage window = new GUI_BookingPage();
					window.frame.setVisible(true);
				} catch (Exception BookingPage) {
					BookingPage.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GUI_BookingPage() {

		System.out.println("Booking A Flight");
		System.out.println();

		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 990, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Booking A Flight");



		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(719, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		progressBar.setIndeterminate(true);
		int newLength = 4;
		progressBar.setMaximum(newLength);
		int newValue = 1;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);



		JButton BackToMainPage1 = new JButton("BACK");
		BackToMainPage1.setName("BackToMainPage1");
		BackToMainPage1.addActionListener(new GUIController_Flights());
		BackToMainPage1.setBounds(0, 110, 117, 29);
		frame.getContentPane().add(BackToMainPage1);



		JLabel DepartureCity = new JLabel("DEPARTURE CITY:");
		DepartureCity.setForeground(Color.WHITE);
		DepartureCity.setHorizontalAlignment(SwingConstants.CENTER);
		DepartureCity.setBounds(110, 225, 150, 20);
		frame.getContentPane().add(DepartureCity);	



		JLabel ArrivalCity = new JLabel("ARRIVAL CITY:");
		ArrivalCity.setForeground(Color.WHITE);
		ArrivalCity.setHorizontalAlignment(SwingConstants.CENTER);
		ArrivalCity.setBounds(110, 265, 150, 20);
		frame.getContentPane().add(ArrivalCity);



		JLabel DepartureDate = new JLabel("DEPARTURE DATE:");
		DepartureDate.setForeground(Color.WHITE);
		DepartureDate.setHorizontalAlignment(SwingConstants.CENTER);
		DepartureDate.setBounds(525, 225, 150, 20);
		frame.getContentPane().add(DepartureDate);



		JLabel ReturnDate = new JLabel("RETURN DATE:");
		ReturnDate.setForeground(Color.WHITE);
		ReturnDate.setHorizontalAlignment(SwingConstants.CENTER);
		ReturnDate.setBounds(525, 265, 150, 20);
		frame.getContentPane().add(ReturnDate);



		JLabel DepartureAvaliableFlights = new JLabel("DEPARTURE AVALIABLE FLIGHTS:");
		DepartureAvaliableFlights.setForeground(Color.WHITE);
		DepartureAvaliableFlights.setHorizontalAlignment(SwingConstants.CENTER);
		DepartureAvaliableFlights.setBounds(375, 385, 250, 20);
		frame.getContentPane().add(DepartureAvaliableFlights);



		JLabel ArrivalAvaliableFlights = new JLabel("RETURN AVALIABLE FLIGHTS:");
		ArrivalAvaliableFlights.setForeground(Color.WHITE);
		ArrivalAvaliableFlights.setHorizontalAlignment(SwingConstants.CENTER);
		ArrivalAvaliableFlights.setBounds(375, 465, 250, 20);
		frame.getContentPane().add(ArrivalAvaliableFlights);



		String[] cities = new String[] {"Please Select City","Amsterdam", "Athens", "Bangkok", "Cairo", "Delhi", "Dubai", "Dublin", "Hong Kong",
				"Johannesburg", "Lagos", "Las Vegas", "Lisbon", "London", "Madrid", "Marrakesh", "Mexico", "Moscov", "New York",
				"Paris", "Rome", "San Paulo", "Sweden", "Sydney", "Texas", "Tokyo", "Toronto"};

		JComboBox DepartureCityInput = new JComboBox(cities);
		DepartureCityInput.setBounds(275, 220, 160, 30);
		frame.getContentPane().add(DepartureCityInput);



		JComboBox ArrivalCityInput = new JComboBox(cities);
		ArrivalCityInput.setBounds(275, 260, 160, 30);
		frame.getContentPane().add(ArrivalCityInput);



		UtilDateModel model1 = new UtilDateModel();
		Properties p1 = new Properties();
		p1.put("text.today", "Today");
		p1.put("text.month", "Month");
		p1.put("text.year", "Year");
		JDatePanelImpl datePanel1 = new JDatePanelImpl(model1, p1);
		JDatePickerImpl DepartureDateInput = new JDatePickerImpl(datePanel1, new DateLabelFormatter());
		DepartureDateInput.getJFormattedTextField().setEditable(false);
		DepartureDateInput.getJFormattedTextField().setText("Please Select Date");
		DepartureDateInput.getJFormattedTextField().setHorizontalAlignment(SwingConstants.CENTER);
		DepartureDateInput.setBounds(690, 220, 200, 30);
		frame.getContentPane().add(DepartureDateInput);



		UtilDateModel model2 = new UtilDateModel();
		Properties p2 = new Properties();
		p2.put("text.today", "Today");
		p2.put("text.month", "Month");
		p2.put("text.year", "Year");
		JDatePanelImpl datePanel2 = new JDatePanelImpl(model2, p2);
		JDatePickerImpl ReturnDateInput = new JDatePickerImpl(datePanel2, new DateLabelFormatter());
		ReturnDateInput.getJFormattedTextField().setEditable(false);
		ReturnDateInput.getJFormattedTextField().setText("Please Select Date");
		ReturnDateInput.getJFormattedTextField().setHorizontalAlignment(SwingConstants.CENTER);
		ReturnDateInput.setBounds(690, 260, 200, 30);
		frame.getContentPane().add(ReturnDateInput);



		JButton GetData = new JButton("CHECK FLIGHTS");
		GetData.addActionListener(new GUIController_Flights());
		GetData.setName("GetData");
		GetData.setBounds(425, 315, 150, 30);
		frame.getContentPane().add(GetData);



		DepartureFlightsOutput = new JTextField();
		DepartureFlightsOutput.setEditable(false);
		DepartureFlightsOutput.setHorizontalAlignment(SwingConstants.CENTER);
		DepartureFlightsOutput.setBounds(20, 415, 960, 40);
		frame.getContentPane().add(DepartureFlightsOutput);
		DepartureFlightsOutput.setColumns(10);



		ReturnFlightsOutput = new JTextField();
		ReturnFlightsOutput.setEditable(false);
		ReturnFlightsOutput.setHorizontalAlignment(SwingConstants.CENTER);
		ReturnFlightsOutput.setBounds(20, 495, 960, 40);
		frame.getContentPane().add(ReturnFlightsOutput);
		ReturnFlightsOutput.setColumns(10);



		JButton NextPage = new JButton("NEXT PAGE");
		NextPage.setName("NextPage");
		NextPage.addActionListener(new GUIController_Flights());
		NextPage.setBounds(877, 110, 117, 29);
		frame.getContentPane().add(NextPage);



		// Blue starts at 142
		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setText("OKEY ");
		Background.setBounds(0, 0, 1000, 624);
		frame.getContentPane().add(Background);




	}
}
