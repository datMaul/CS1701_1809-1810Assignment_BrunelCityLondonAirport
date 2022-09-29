

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GUI_FinancePage { //class definition

	
	JFrame frame; //creating frame variable
	private JTable table; 

	public GUI_FinancePage() { //constructor (function)
		
		System.out.println("Finance Page");
		System.out.println();
		
		initialize(); //calling the function 
	}
	
	private void initialize() { //defining a private function, returns nothing 
		Random rand = new Random(); //creates new instance of random class
		Data_Finance flightDetails = new Data_Finance();//creates new instance of FinanceController class
		flightDetails.setdFlightDate("08/03/2022"); //assigning flight departure date
		flightDetails.setdFlightTime1("6:20");
		flightDetails.setdFlightTime2("11:57");
		flightDetails.setdFlightTime3("05:37");
		flightDetails.setdFlightDistance(7021.04);
		flightDetails.setdFlightValue1("179");
		flightDetails.setdFlightValue2("HND");
		flightDetails.setdFlightValue3("Tokyo");
		flightDetails.setdFlightValue4("SYD");
		flightDetails.setdFlightValue5("Sydney");
		flightDetails.setdFlightValue6("TS4977");
		flightDetails.setdFlightValue7("Easyplane");
		flightDetails.setrFlightTime1("27/03/2022");
		flightDetails.setrFlightTime2("18:23");
		flightDetails.setrFlightTime3("03:44");
		flightDetails.setrFlightDistance(11687.85);
		flightDetails.setrFlightValue1("10");
		flightDetails.setrFlightValue2("SYD");
		flightDetails.setrFlightValue3("Sydney");
		flightDetails.setrFlightValue4("HND");
		flightDetails.setrFlightValue5("Tokyo");
		flightDetails.setrFlightValue6("ST4138");
		flightDetails.setrFlightValue7("Eastair");
//		PassengersController passenger1 = new PassengersController();//creates new instance of PassengerController class
//		passenger1.setfName("Aaron"); //assigning first name
//		passenger1.setsName("Samuels");
//		passenger1.setDoB("01/01/1970");
//		passenger1.setticketNo("83746578");
		double passenger1FlightCost = Calc_Finance.flightCost("Economy", flightDetails.getdFlightDistance() + flightDetails.getrFlightDistance()); //calling upon flightCost method to work out ticket cost, and adding the two flight distances together and saying what type of flight it is(Economy)
		double passenger1BagTotal = Calc_Finance.bagTotal(rand.nextInt(6)); // calling upon bagTotal method, while using generated random int
		double passenger1FoodTotal = rand.nextDouble() * 15d; // generating random double between range of 0 - 15
		double passenger1ProductTotal = rand.nextDouble() * 20d;// generating random double between range of 0 - 20
		int passenger1Compensation = Calc_Finance.passengerComp(rand.nextDouble() * 4d);//calling method passengerComp and running that using a randomly generated value to determine the outcome between 0-4
		double passenger1TotalOverallCost = (passenger1FlightCost + passenger1BagTotal + passenger1FoodTotal + passenger1ProductTotal - passenger1Compensation); //adding up values for the total cost
//		PassengersController passenger2 = new PassengersController();
//		passenger2.setfName("Regina");
//		passenger2.setsName("George");
//		passenger2.setDoB("02/02/2002");
//		passenger2.setticketNo("27475839");
		double passenger2FlightCost = Calc_Finance.flightCost("Business", flightDetails.getdFlightDistance() + flightDetails.getrFlightDistance());
		double passenger2BagTotal = Calc_Finance.bagTotal(rand.nextInt(6));
		double passenger2FoodTotal = rand.nextDouble() * 15d;
		double passenger2ProductTotal = rand.nextDouble() * 20d;
		int passenger2Compensation = Calc_Finance.passengerComp(rand.nextDouble() * 4d);
		double passenger2TotalOverallCost = (passenger2FlightCost + passenger2BagTotal + passenger2FoodTotal + passenger2ProductTotal - passenger2Compensation);
//		PassengersController passenger3 = new PassengersController();
//		passenger3.setfName("Cady");
//		passenger3.setsName("Heron");
//		passenger3.setDoB("05/04/1980");
//		passenger3.setticketNo("95738494");
		double passenger3FlightCost = Calc_Finance.flightCost("FirstClass", flightDetails.getdFlightDistance() + flightDetails.getrFlightDistance());
		double passenger3BagTotal = Calc_Finance.bagTotal(rand.nextInt(6));
		double passenger3FoodTotal = rand.nextDouble() * 15d;
		double passenger3ProductTotal = rand.nextDouble() * 20d;
		int passenger3Compensation = Calc_Finance.passengerComp(rand.nextDouble() * 4d);
		double passenger3TotalOverallCost = (passenger3FlightCost + passenger3BagTotal + passenger3FoodTotal + passenger3ProductTotal - passenger3Compensation);

		
		
		frame = new JFrame(); //creates jframe
		frame.setBounds(100, 100, 990, 650); //set frame bounds
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //close on exit
		frame.getContentPane().setLayout(null); //set layout to nothing to start with
		frame.setTitle("Finance"); //title finance


		//determines how much progress the bar has made depending on what part of the system the user is on
		JProgressBar progressBar = new JProgressBar(); //creates progress bar
		progressBar.setBounds(719, 110, 146, 29); //set progress bar bounds
		frame.getContentPane().add(progressBar); //adds progress bar to frame
		progressBar.setIndeterminate(true);
		int newLength = 5;
		progressBar.setMaximum(newLength);
		int newValue = 4;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);



		//sets this frame invisible whilst setting shop window to visible
		JButton PreviousPage = new JButton("BACK"); 
		PreviousPage.setName("Back");
		PreviousPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI_ShopPage window = new GUI_ShopPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception Shop) {
					Shop.printStackTrace();
				}
			}
		});
		PreviousPage.setBounds(0, 110, 117, 29);
		frame.getContentPane().add(PreviousPage);


		//takes user to the last page when pressed, sets finance page frame to invisible while setting the last page frame to visible
		JButton NextPage = new JButton("NEXT PAGE");
		NextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI_LastPage2 window = new GUI_LastPage2();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception LastPage2) {
					LastPage2.printStackTrace();
				}
			}
		});
		NextPage.setName("NextPage");
		NextPage.setBounds(877, 110, 117, 29);
		frame.getContentPane().add(NextPage);
		
		JScrollPane scrollPane = new JScrollPane(); //create new scrollpane
		scrollPane.setBounds(0, 139, 976, 474);
		frame.getContentPane().add(scrollPane); //add scrollpane to frame
		
		table = new JTable();// crerate new jtable
		table.setModel(new DefaultTableModel(
			new Object[][] {//setting new rows
				{
//					passenger1.getfName(), 
//					passenger1.getsName(), 
//					passenger1.getDoB(), 
//					passenger1.getticketNo(), 
					passenger1BagTotal, 
					passenger1FlightCost,
					String.format("%.2f", passenger1FoodTotal),
					String.format("%.2f", passenger1ProductTotal),
					passenger1Compensation,
					String.format("%.2f", passenger1TotalOverallCost)
				},
				{
//					passenger2.getfName(), 
//					passenger2.getsName(), 
//					passenger2.getDoB(), 
//					passenger2.getticketNo(), 
					passenger2BagTotal, 
					passenger2FlightCost,
					String.format("%.2f", passenger2FoodTotal),
					String.format("%.2f", passenger2ProductTotal),
					passenger2Compensation,
					String.format("%.2f", passenger2TotalOverallCost)
				},
				{
//					passenger3.getfName(),//calling method and adding it to the array
//					passenger3.getsName(), 
//					passenger3.getDoB(), 
//					passenger3.getticketNo(), 
					passenger3BagTotal, //adding data to the array that was assigned in the above code
					passenger3FlightCost,
					String.format("%.2f", passenger3FoodTotal),//converting from double value to string with 2 decimal places  
					String.format("%.2f", passenger3ProductTotal),
					passenger3Compensation, //calling variable
					String.format("%.2f", passenger3TotalOverallCost)		
				}
				

			},
			new String[] { // setting the column names
				"First Name", "Surname", "Date Of Birth", "Ticket Number", "Bag Costs", "Ticket Costs", "Food Costs", "Product Costs", "Compensation", "Total"
			}
		));
		scrollPane.setViewportView(table);
		
		

		//using a png file as the background for the finance page
		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setText("OKEY ");
		Background.setBounds(0, 0, 1000, 624);
		frame.getContentPane().add(Background);
		
		
		
	}
}

