

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;									//imports to make sure variables are working
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.JTable;
import javax.swing.JScrollPane;

public class GUI_PassengersPage1 {				 ///name of the class

	JFrame frame;
	public static int PassengerCount = 0;
	public static JScrollPane PassengerInfoScrollPane;
	public static JTable PassengerInfo;
	static Data_Passengers pc;


	/**
	 * Launch the application.
	 */

	/* public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASSIGNMENT_APP_PASSENGERS window = new ASSIGNMENT_APP_PASSENGERS();
					window.frame.setVisible(true);
				} catch (Exception Passengers) {
					Passengers.printStackTrace();
				}
			}											///page would start on this page instead of main page if uncommented
		});
	}*/

	/**
	 * Create the application.
	 */
	public GUI_PassengersPage1() {

		System.out.println("Passengers Page 1");
		System.out.println();

		initialize();

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 990, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Passengers");
		frame.getContentPane().setLayout(null);

		ArrayList <Data_Flights> AllFlights = Data_CSVReader.getAllFlights();
		pc = new Data_Passengers();

		JProgressBar progressBar = new JProgressBar();			//progress bar
		progressBar.setBounds(719, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		//when the task of (initially) unknown length begins:
		progressBar.setIndeterminate(true);
		int newLength = 4;
		//do some work; get length of task...
		progressBar.setMaximum(newLength);
		int newValue = 3;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);



		JButton PreviousPage = new JButton("BACK"); 	///back button
		PreviousPage.setBounds(0, 110, 117, 29);
		PreviousPage.setName("Back");
		PreviousPage.addActionListener(new ActionListener() { 		//to make the button work
			public void actionPerformed(ActionEvent e) {

				System.out.println("Previous Page");
				System.out.println();

				try {
					GUI_SeatingPlanReturnPage window = new GUI_SeatingPlanReturnPage();		///last page
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception SeatingPlanArrival) {
					SeatingPlanArrival.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(PreviousPage);


		JButton NextPage = new JButton("NEXT PAGE");     
		NextPage.setBounds(877, 110, 117, 30);
		NextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Next Page");
				System.out.println();

				try {				
					GUI_LastPage1 window = new GUI_LastPage1();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception LastPage1) {
					LastPage1.printStackTrace();
				}
			}
		});
		NextPage.setName("NextPage");
		frame.getContentPane().add(NextPage);

		/*
		String[] columnNames = {"Ticket Number",
				"Full Name",
				"eMail",
				"Date of Birth",
				"Number of Bags",
				"Departure Seat",
		"Return Seat"};


		Object[][] data = {
				{
					pc.getTicketNo(),
					pc.getFullName(),
					pc.getEmail(),
					pc.getDoB(),
					pc.getNBags(),
					pc.getDSeat(),
					pc.getRSeat()
				},
		};

		PassengerInfo = new JTable(data, columnNames);
		PassengerInfo.setCellSelectionEnabled(true);
		PassengerInfo.setColumnSelectionAllowed(true);
		PassengerInfo.setEnabled(false);
		PassengerInfo.setBounds(50, 280, 900, 300);
		frame.getContentPane().add(PassengerInfo);

		 */


		JScrollPane PassengerInfoScrollPane = new JScrollPane();
		PassengerInfoScrollPane.setBounds(25, 280, 950, 300);
		frame.getContentPane().add(PassengerInfoScrollPane);

		PassengerInfo = new JTable();
		PassengerInfo.setEnabled(false);
		PassengerInfo.setRowSelectionAllowed(false);
		PassengerInfo.setModel(new DefaultTableModel(
				new Object[][] {
				},
				new String[] {
						"Ticket Number", "Full Name", "eMail", "Telephone Number", "Date of Birth", "Number of Bags", "Departure Seat", "Return Seat"
				}
				) {
			boolean[] columnEditables = new boolean[] {
					false, false, false, false, false, false, false, false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		PassengerInfo.getColumnModel().getColumn(0).setPreferredWidth(90);
		PassengerInfo.getColumnModel().getColumn(1).setPreferredWidth(130);
		PassengerInfo.getColumnModel().getColumn(2).setPreferredWidth(230);
		PassengerInfo.getColumnModel().getColumn(3).setPreferredWidth(130);
		PassengerInfo.getColumnModel().getColumn(4).setPreferredWidth(90);
		PassengerInfo.getColumnModel().getColumn(5).setPreferredWidth(100);
		PassengerInfo.getColumnModel().getColumn(6).setPreferredWidth(90);
		PassengerInfo.getColumnModel().getColumn(7).setPreferredWidth(90);
		
		PassengerInfo.getColumnModel().getColumn(0).setResizable(false);
		PassengerInfo.getColumnModel().getColumn(1).setResizable(false);
		PassengerInfo.getColumnModel().getColumn(2).setResizable(false);
		PassengerInfo.getColumnModel().getColumn(3).setResizable(false);
		PassengerInfo.getColumnModel().getColumn(4).setResizable(false);
		PassengerInfo.getColumnModel().getColumn(5).setResizable(false);
		PassengerInfo.getColumnModel().getColumn(6).setResizable(false);
		PassengerInfo.getColumnModel().getColumn(7).setResizable(false);
		
		PassengerInfoScrollPane.setViewportView(PassengerInfo);

		
			if (PassengerCount > 0) {
				for (int i = 0; i < pc.getTicketNo().size(); i++) {
					DefaultTableModel model = (DefaultTableModel) PassengerInfo.getModel();
					model.addRow(new Object [] { pc.getTicketNo().get(i), pc.getFullName().get(i),
					pc.getEmail().get(i), pc.getTNumber().get(i), pc.getDoB().get(i), pc.getNBags().get(i),
					pc.getDSeat().get(i), pc.getRSeat().get(i)});		
			}	
			}
		
		
		
		JButton addPassenger = new JButton("ADD PASSENGER");		
		addPassenger.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					System.out.println("Add Passenger");
					System.out.println();

					PassengerCount++;

					System.out.println(PassengerCount);
					System.out.println();

					try {
						GUI_PassengersPage2 window = new GUI_PassengersPage2();
						window.frame.setVisible(true);
						frame.setVisible(false);
					} catch (Exception Passengers2) {
						Passengers2.printStackTrace();
					}
			}	
		});
		addPassenger.setBounds(430, 215, 140, 45);
		frame.getContentPane().add(addPassenger);


		JLabel lblNewLabel = new JLabel("Please create your passenger:");			//label displaying "please create your passenger"
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(395, 185, 210, 20);
		frame.getContentPane().add(lblNewLabel);


		// Blue starts at 142
		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background =  new JLabel(BackgroundImage);
		Background.setBounds(0, 0, 1000, 624);    						
		frame.getContentPane().add(Background);
	}
}
