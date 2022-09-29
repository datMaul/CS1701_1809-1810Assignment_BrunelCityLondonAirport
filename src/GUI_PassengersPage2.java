

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;			
import javax.swing.JFrame;
import javax.swing.JLabel;					//imports to make sure variables are working
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;
import javax.swing.JComboBox;


public class GUI_PassengersPage2 {          //name of the class

	JFrame frame;
	private JTextField fName;       ///variables for Text Fields
	private JTextField eMail;
	private JTextField sName;
	private JTextField DoB;
	private JTextField tNumber;
	private JTextField numberBags;
	private JTextField TicketNumberBox;
	private String TicketNumber;
	public static int PassengerCount = 0;

	static Data_Passengers pc;

	/**
	 * Launch the application.			
	 */
	/*starts the program*/

	/* public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASSIGNMENT_APP_PASSENGERS2 window = new ASSIGNMENT_APP_PASSENGERS2();
					window.frame.setVisible(true);
				} catch (Exception Passengers2) {
					Passengers2.printStackTrace();
				}
			}
		});
	}*/
	
	//if uncommented application would start from this page not the main page
	
	/**
	 * Create the application.
	 */
	
	public GUI_PassengersPage2() {  

		System.out.println("Passengers Page 2");
		System.out.println();

		randomNumber();
		initialize();

	}

	/**
	 * Initialise the contents of the frame.
	 */
	
	private static String randomNumber() {

		Random rnd = new Random();
		int ticketNumber =rnd.nextInt(99999999);
		return String.format("%08d", ticketNumber);

	}

	
	
	public static boolean isValidName(String name) {
		String Regex = "[A-Z][a-z]*";

		Pattern pat = Pattern.compile(Regex);
		if (name == null) {
			return false;
		} else {
			return pat.matcher(name).matches();
		}
	}
	
	
	public static boolean isValidDoB(String DoB) {
		String Regex = "^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}$";

		Pattern pat = Pattern.compile(Regex);
		if (DoB == null) {
			return false;
		} else {
			return pat.matcher(DoB).matches();
		}
	}
	
	public static boolean isValidTNumber(String TNumber) {
		String Regex = "^\\+\\d{1,3}+\\d{10}$";

		Pattern pat = Pattern.compile(Regex);
		if (TNumber == null) {
			return false;
		} else {
			return pat.matcher(TNumber).matches();
		}
	}
	
	
	public static boolean isValidEMail(String eMail) {
		String Regex = "^[\\w!#$%&’*+/=?`{|}~^-]+(?:\\.[\\w!#$%&’*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";

		Pattern pat = Pattern.compile(Regex);
		if (eMail == null) {
			return false;
		} else {
			return pat.matcher(eMail).matches();
		}
	}
	
	public static boolean isValidNumber(String number) {
		String Regex = "[0-9]*";

		Pattern pat = Pattern.compile(Regex);
		if (number == null) {
			return false;
		} else {
			return pat.matcher(number).matches();
		}
	}

	private void initialize() {
		PassengerCount++;
		System.out.println(PassengerCount);
		System.out.println();

		pc = new Data_Passengers();

		frame = new JFrame();
		frame.setBounds(100, 100, 990, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Passengers");
		frame.getContentPane().setLayout(null);


		//getting data from the Array List

		ArrayList <Data_Flights> AllFlights = Data_CSVReader.getAllFlights();

		//displays the ticket number

		TicketNumberBox = new JTextField();
		TicketNumberBox.setEditable(false);
		TicketNumberBox.setHorizontalAlignment(SwingConstants.CENTER);
		TicketNumberBox.setColumns(10);
		TicketNumberBox.setBounds(475, 485, 280, 35);
		frame.getContentPane().add(TicketNumberBox);

		//generates random 8 digit ticket number

		TicketNumber = randomNumber();
		TicketNumberBox.setText("Your Ticket Number Is: " + TicketNumber);

		// progress bar to show where the user is

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(835, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		//when the task of (initially) unknown length begins:
		progressBar.setIndeterminate(true);
		int newLength = 4;
		//do some work; get length of task...
		progressBar.setMaximum(newLength);
		int newValue = (int) 3.5;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);

		//label displaying to the user to input details

		JLabel Instruction = new JLabel("PLEASE INPUT DETAILS BELOW:");
		Instruction.setForeground(Color.WHITE);
		Instruction.setFont(new Font("Arial", Font.BOLD, 14));
		Instruction.setBounds(25, 185, 244, 35);
		frame.getContentPane().add(Instruction);

		//label displaying to the user to input First name

		JLabel fNameLabel = new JLabel("First Name:");
		fNameLabel.setForeground(Color.WHITE);
		fNameLabel.setFont(new Font("Arial", Font.BOLD, 14));
		fNameLabel.setBounds(25, 245, 140, 35);
		frame.getContentPane().add(fNameLabel);

		//label displaying to the user to input Surname

		JLabel sNameLabel = new JLabel("Surname:");
		sNameLabel.setForeground(Color.WHITE);
		sNameLabel.setFont(new Font("Arial", Font.BOLD, 14));
		sNameLabel.setBounds(25, 305, 140, 35);
		frame.getContentPane().add(sNameLabel);

		//label displaying to the user to input date of birth

		JLabel DoBLabel = new JLabel("Date of Birth:");
		DoBLabel.setForeground(Color.WHITE);
		DoBLabel.setFont(new Font("Arial", Font.BOLD, 14));
		DoBLabel.setBounds(25, 365, 140, 35);
		frame.getContentPane().add(DoBLabel);

		//label displaying to the user to input telephone number

		JLabel tNumberLabel = new JLabel("Telephone Number:");
		tNumberLabel.setForeground(Color.WHITE);
		tNumberLabel.setFont(new Font("Arial", Font.BOLD, 14));
		tNumberLabel.setBounds(25, 425, 140, 35);
		frame.getContentPane().add(tNumberLabel);

		//label displaying to the user to email address

		JLabel emailLabel = new JLabel("Email Address:");
		emailLabel.setForeground(Color.WHITE);
		emailLabel.setFont(new Font("Arial", Font.BOLD, 14));
		emailLabel.setBounds(25, 485, 140, 35);
		frame.getContentPane().add(emailLabel);

		JLabel Instruction2 = new JLabel("Please Input The Number Of Bags You Wish To Take:");
		Instruction2.setForeground(Color.WHITE);
		Instruction2.setFont(new Font("Arial", Font.BOLD, 14));					// label to display instructions for number of bags
		Instruction2.setBounds(525, 185, 419, 35);
		frame.getContentPane().add(Instruction2);


		JLabel BagsLabel = new JLabel("Number of Bags:");
		BagsLabel.setForeground(Color.WHITE);
		BagsLabel.setFont(new Font("Arial", Font.BOLD, 14));		//label for the number of bags 
		BagsLabel.setBounds(525, 245, 140, 35);
		frame.getContentPane().add(BagsLabel);


		JLabel SeatLabel1 = new JLabel("Departure Seat:");
		SeatLabel1.setForeground(Color.WHITE);
		SeatLabel1.setFont(new Font("Arial", Font.BOLD, 14));	
		SeatLabel1.setBounds(525, 305, 140, 35);
		frame.getContentPane().add(SeatLabel1);

		JLabel SeatLabel2 = new JLabel("Return Seat:");
		SeatLabel2.setForeground(Color.WHITE);
		SeatLabel2.setFont(new Font("Arial", Font.BOLD, 14));	
		SeatLabel2.setBounds(525, 365, 140, 35);
		frame.getContentPane().add(SeatLabel2);


		String[] departureSeat = new String[] {"Select Departure Seat"};
		
		String[] departureSeatData = new String[Data_CSVReader.getAllFlights().get(Data_CSVReader.getDepartureFlightID()).getSeatingPlan().getDSeatName().size()];
		for(int i = 0; i < departureSeatData.length; i++) {
			departureSeatData[i] = Data_CSVReader.getAllFlights().get(Data_CSVReader.getDepartureFlightID()).getSeatingPlan().getDSeatName().get(i);
		}

		 String DepartureSeats[] = new String[departureSeat.length + departureSeatData.length];
	        int d;
	        for(d = 0; d < departureSeat.length; d++) {
	            DepartureSeats[d] = departureSeat[d];
	        }
	        for(d = 0; d < departureSeatData.length; d++) {
	            DepartureSeats[departureSeat.length + d] = departureSeatData[d];
	        }
		
	        
		String[] returnSeat = new String[] {"Select Return Seat"};

		String[] returnSeatData = new String[Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getSeatingPlan().getRSeatName().size()];
			for(int i = 0; i < returnSeatData.length; i++) {
				returnSeatData[i] = Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getSeatingPlan().getRSeatName().get(i);
			}	
		
	        String ReturnSeats[] = new String[returnSeat.length + returnSeatData.length];
	        int r;
	        for(r = 0; r < returnSeat.length; r++) {
	            ReturnSeats[r] = returnSeat[r];
	        }
	        for(r = 0; r < returnSeatData.length; r++) {
	            ReturnSeats[returnSeat.length + r] = returnSeatData[r];
	        }
		
		JComboBox DepartureSeatSelection = new JComboBox(DepartureSeats);
		DepartureSeatSelection.setBounds(690, 305, 200, 35);
		frame.getContentPane().add(DepartureSeatSelection);

		JComboBox ReaturnSeatSelection = new JComboBox(ReturnSeats);
		ReaturnSeatSelection.setBounds(690, 365, 200, 35);
		frame.getContentPane().add(ReaturnSeatSelection);
		
		


		JButton EnterBtn = new JButton("Enter");						//enter button
		EnterBtn.addActionListener(new ActionListener() {					 // to make sure the button does something
			public void actionPerformed(ActionEvent e) {
				String getDataFName = fName.getText();
				String getDataSName = sName.getText();
				String getDataDoB = DoB.getText();					//variables for getting passenger data
				String getDataTNumber = tNumber.getText();
				String getDataEMail = eMail.getText();
				String getDataNBags = numberBags.getText();
				String getDataDSeat = (String) DepartureSeatSelection.getSelectedItem();
				String getDataRSeat = (String) ReaturnSeatSelection.getSelectedItem();

				///error text if statement that makes error handling work

				if (getDataFName.isEmpty() == true || getDataFName.isBlank() == true || getDataFName.equals("") == true) {
					JOptionPane.showMessageDialog(frame, "Please enter your First Name!");
				} else if (isValidName(getDataFName) == false || getDataFName.length() <= 2) {
					JOptionPane.showMessageDialog(frame, "First Name must start with capital letter and be at least 3 characters long!");
				} else if (getDataSName.isEmpty() == true || getDataSName.isBlank() == true || getDataSName.equals("") == true) {
					JOptionPane.showMessageDialog(frame, "Please enter your Surname!");
				} else if (isValidName(getDataSName) == false || getDataSName.length() <= 2) {
					JOptionPane.showMessageDialog(frame, "Surname must start with capital letter and be at least 3 characters long!");
				} else if (getDataDoB.isEmpty() == true || getDataDoB.isBlank() == true || getDataDoB.equals("") == true) {
					JOptionPane.showMessageDialog(frame, "Please enter your Date of Birth!");
				} else if (isValidDoB(getDataDoB) == false) {
					JOptionPane.showMessageDialog(frame, "Date of Birth must be formed as \"DD/MM/YYYY\". Please enter your Date of Birth as described!");
				} else if (getDataTNumber.isEmpty() == true || getDataTNumber.isBlank() == true || getDataTNumber.equals("") == true) {
					JOptionPane.showMessageDialog(frame, "Please enter your Telephone Number!"); 
				} else if (isValidTNumber(getDataTNumber) == false) {
					JOptionPane.showMessageDialog(frame, "Telephone Number must be formed as \"+(International Prefix)1234567890\". Please enter your Telephone Number as described!"); 
				} else if (getDataEMail.isEmpty() == true || getDataEMail.isBlank() == true || getDataEMail.equals("") == true) {
					JOptionPane.showMessageDialog(frame, "Please enter your Email Address!");
				} else if (isValidEMail(getDataEMail) == false) {
					JOptionPane.showMessageDialog(frame, "Email Address must be formed as \"youremailadress@emailoperator.com\". Please enter your Email Adress as described!");
				} else if (getDataNBags.isEmpty() == true || getDataNBags.isBlank() == true || getDataNBags.equals("") == true) {
					JOptionPane.showMessageDialog(frame, "Please enter the Number of Bags you would like to take!");
				} else if (isValidNumber(getDataNBags) == false) {
			JOptionPane.showMessageDialog(frame, "Number of Bags must be a positive number!");
				} else if (getDataDSeat.contains("Select Departure Seat") == true) {
					JOptionPane.showMessageDialog(frame, "Please select your Departure Seat!");
				} else if (getDataRSeat.contains("Select Return Seat") == true) {
					JOptionPane.showMessageDialog(frame, "Please select your Return Seat!");
				} else {
					pc.ticketNo.add(TicketNumber);
					pc.fullName.add(getDataFName + " " + getDataSName);
					pc.DoB.add(getDataDoB);
					pc.tNumber.add(getDataTNumber);
					pc.email.add(getDataEMail);
					pc.nBags.add(getDataNBags);
					pc.dSeat.add(getDataDSeat);
					pc.rSeat.add(getDataRSeat);
					pc.PassengerCountData++;
					
					System.out.println("----------");
					System.out.println("Passenger " + pc.getPassengerCountData() + ": " + pc.getFullName().get(PassengerCount - 1) + " " + pc.getTicketNo().get(PassengerCount - 1));
					System.out.println("----------");

					System.out.println("Entered Passenger");
					System.out.println();

					try {
						GUI_PassengersPage1 window = new GUI_PassengersPage1();
						window.frame.setVisible(true);						        //enter button takes the user to the next page
						frame.setVisible(false);
					} catch (Exception Passengers) {
						Passengers.printStackTrace();
					}
				}
			}
		});			
		EnterBtn.setFont(new Font("Arial", Font.BOLD, 15));
		EnterBtn.setBounds(795, 485, 125, 35);					//properties of the enter button 
		frame.getContentPane().add(EnterBtn);

		//first name text field

		fName = new JTextField();
		fName.setHorizontalAlignment(SwingConstants.CENTER);
		fName.setBounds(190, 245, 230, 35);
		frame.getContentPane().add(fName);
		fName.setColumns(10);

		//Surname text field

		sName = new JTextField();
		sName.setHorizontalAlignment(SwingConstants.CENTER);
		sName.setColumns(10);
		sName.setBounds(190, 305, 230, 35);
		frame.getContentPane().add(sName);

		//date of birth text field

		DoB = new JTextField();
		DoB.setHorizontalAlignment(SwingConstants.CENTER);
		DoB.setColumns(10);
		DoB.setBounds(190, 365, 230, 35);
		frame.getContentPane().add(DoB);

		//telephone number text field

		tNumber = new JTextField();
		tNumber.setHorizontalAlignment(SwingConstants.CENTER);
		tNumber.setColumns(10);
		tNumber.setBounds(190, 425, 230, 35);
		frame.getContentPane().add(tNumber);

		//email text field

		eMail = new JTextField();
		eMail.setHorizontalAlignment(SwingConstants.CENTER);
		eMail.setColumns(10);
		eMail.setBounds(190, 485, 230, 35);
		frame.getContentPane().add(eMail);

		//button for Enter Information which includes error handling for first name, surname, date of birth, telephone number
		// , email and the number of bags

		numberBags = new JTextField();
		numberBags.setHorizontalAlignment(SwingConstants.CENTER);
		numberBags.setColumns(10);										//text field for the number of bags
		numberBags.setBounds(690, 246, 230, 35);
		frame.getContentPane().add(numberBags);


		// Blue starts at 142
		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background =  new JLabel(BackgroundImage);
		Background.setBounds(0, 0, 1000, 624);              //background
		Background.setText("OKEY ");
		frame.getContentPane().add(Background);
	}
}


