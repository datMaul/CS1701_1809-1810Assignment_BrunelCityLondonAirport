

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.util.ArrayList;

public class GUI_CheckInPage {

	JFrame frame;
	private JTextField PNRNumber;
	private JButton BackToMainPage2;
	private JTextField PassengerFullName;

	private ArrayList <Data_Flights> AllFlights;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASSIGNMENT_APP_CHECK_IN_PAGE window = new ASSIGNMENT_APP_CHECK_IN_PAGE();
					window.frame.setVisible(true);
				} catch (Exception CheckInPage) {
					CheckInPage.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GUI_CheckInPage() {

		System.out.println("Check In Page");
		System.out.println();

		AllFlights = Data_CSVReader.getAllFlights();
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
		frame.setTitle("Check In Page");


		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(835, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		//when the task of (initially) unknown length begins:
		progressBar.setIndeterminate(true);
		int newLength = 7;
		//do some work; get length of task...
		progressBar.setMaximum(newLength);
		int newValue = 3;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);	



		BackToMainPage2 = new JButton("BACK");
		BackToMainPage2.setName("BackToMainPage2");
		BackToMainPage2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Previous Page");
				System.out.println();

				try {
					GUI_MainPage window = new GUI_MainPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception BackToMainPage) {
					BackToMainPage.printStackTrace();
				}
			}
		});

		BackToMainPage2.setBounds(0, 110, 117, 29);
		frame.getContentPane().add(BackToMainPage2);

		JLabel FAndLNameLabel = new JLabel("First and Last Name:");
		FAndLNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		FAndLNameLabel.setForeground(Color.WHITE);
		FAndLNameLabel.setBounds(280, 290, 150, 30);
		frame.getContentPane().add(FAndLNameLabel);

		JLabel TicketNumberLabel = new JLabel("Ticket Number:");
		TicketNumberLabel.setForeground(Color.WHITE);
		TicketNumberLabel.setHorizontalAlignment(SwingConstants.CENTER);
		TicketNumberLabel.setBounds(305, 342, 100, 30);
		frame.getContentPane().add(TicketNumberLabel);


		PassengerFullName = new JTextField();
		PassengerFullName.setHorizontalAlignment(SwingConstants.CENTER);
		PassengerFullName.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (PassengerFullName.getText().equals("ENTER YOUR FIRST AND LAST NAME")) {
					PassengerFullName.setText("");
					PassengerFullName.setForeground(Color.BLACK);
					PassengerFullName.setHorizontalAlignment(SwingConstants.CENTER);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (PassengerFullName.getText().isEmpty()) {
					PassengerFullName.setForeground(Color.BLACK);
					PassengerFullName.setText("ENTER YOUR FIRST AND LAST NAME");
					PassengerFullName.setHorizontalAlignment(SwingConstants.CENTER);
				}
			}
		});
		PassengerFullName.setBounds(455, 285, 250, 40);
		frame.getContentPane().add(PassengerFullName);
		PassengerFullName.setColumns(10);



		PNRNumber = new JTextField();
		PNRNumber.setHorizontalAlignment(SwingConstants.CENTER);
		PNRNumber.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				if (PNRNumber.getText().equals("ENTER YOUR PNR NUMBER")) {
					PNRNumber.setText("");
					PNRNumber.setForeground(Color.BLACK);
					PNRNumber.setHorizontalAlignment(SwingConstants.CENTER);
				}
			}
			@Override
			public void focusLost(FocusEvent e) {
				if (PNRNumber.getText().isEmpty()) {
					PNRNumber.setForeground(Color.BLACK);
					PNRNumber.setText("ENTER YOUR PNR NUMBER");
					PNRNumber.setHorizontalAlignment(SwingConstants.CENTER);
				}
			}
		});
		PNRNumber.setBounds(480, 337, 200, 40);
		frame.getContentPane().add(PNRNumber);
		PNRNumber.setColumns(10);


		System.out.println("----------");
		System.out.println(Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getPassengers().getPassengerCountData()
				+ " " + Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getPassengers().getFullName() 
				+ " " + Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getPassengers().getTicketNo());
		System.out.println("----------");


		JButton NextPage = new JButton("NEXT PAGE");
		NextPage.setName("NextPage");
		NextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Next Page");
				System.out.println();


				String getData1 = PassengerFullName.getText();
				String getData2 = PNRNumber.getText();


				for (int i = 0 ; i < Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getPassengers().getPassengerCountData() ; i++) {
					if (getData1.contentEquals(Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getPassengers().getFullName().get(i)) == true 
						&& getData2.contentEquals(Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getPassengers().getTicketNo().get(i)) == true) {						
						System.out.println("Checked Full Name");
						System.out.println("Checked Ticket Number");
						System.out.println();

						try {
							GUI_RestaurantPage window = new GUI_RestaurantPage();
							window.frame.setVisible(true);
							frame.setVisible(false);
						} catch (Exception Restaurant) {
							Restaurant.printStackTrace();
						}	
						
						return;
					}
				}
				
				for (int i = 0 ; i < Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getPassengers().getPassengerCountData() ; i++) {
					if (getData1.contentEquals(Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getPassengers().getFullName().get(i)) == false) {
						System.out.println("Wrong Full Name");
						System.out.println();
						JOptionPane.showMessageDialog(frame, "Please input valid Passenger Full Name!");
						break;
					} else if (getData2.contentEquals(Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getPassengers().getTicketNo().get(i)) == false) {
						System.out.println("Wrong Ticket Number");
						System.out.println();
						JOptionPane.showMessageDialog(frame, "Please input valid Ticket Number!");
						break;
					} 
				}

			}

		});
		NextPage.setBounds(440, 390, 120, 30);
		frame.getContentPane().add(NextPage);



		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setBounds(0, 0, 1000, 624);
		frame.getContentPane().add(Background);
	}
}
