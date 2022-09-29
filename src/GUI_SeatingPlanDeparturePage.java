

import java.util.ArrayList;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class GUI_SeatingPlanDeparturePage {

	JFrame frame;
	static Data_SeatingPlan spc;
	static ArrayList<JButton> allSeatsDeparture;
	static ArrayList<JButton> SelectedSeatsDeparture;

	ArrayList <Data_Flights> AllFlights = Data_CSVReader.getAllFlights();

	/**
	 * Launch the application.
	 */

	/* public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_SeatingPlanDeparturePage window = new GUI_SeatingPlanDeparturePage();
					window.frame.setVisible(true);
				} catch (Exception SeatingPlanDeparture) {
					SeatingPlanDeparture.printStackTrace();
				}
			}											
		});
	}*/

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */


	public GUI_SeatingPlanDeparturePage() {

		System.out.println("Seating Plan Departure Page");
		System.out.println();
		
		flightSelection();
//		initializeBoeing();
//		initializeAirbus();
	}


	/**
	 * @wbp.parser.entryPoint
	 */
	private void flightSelection() {

		String flightDurationTime = AllFlights.get(Data_CSVReader.getDepartureFlightID()).getFlightDurationMinutes();
		String givenDuration = "2:00";

		int time1;
		int time2;
		//		String temp[];

		time1 = Integer.parseInt(flightDurationTime.split(":")[0]);
		time2 = Integer.parseInt(givenDuration.split(":")[0]);

		//		temp = flightDurationTime.split(":");
		//		System.out.println(temp[0] + ":" + temp[1]);

		//		System.out.println(time1 + " " + time2);

		if (time1 <= time2) {

			initializeAirbus();
//			initializeAirbusTest();
//			checkSeats();

		} else {

			initializeBoeing();
//			checkSeats();

		}

	}

	/**
	 * @wbp.parser.entryPoint
	 */
	private void initializeAirbusTest() {
		spc = new Data_SeatingPlan();
		allSeatsDeparture = new ArrayList <JButton>();
		SelectedSeatsDeparture = new ArrayList <JButton>();

		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 990, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Seating Plan For Departure Flight");

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(719, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		progressBar.setIndeterminate(true);
		int newLength = 4;
		progressBar.setMaximum(newLength);
		int newValue = (int) 2.5;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);


		JButton PreviousPageSP1 = new JButton("BACK");
		PreviousPageSP1.setBounds(0, 110, 117, 29);
		PreviousPageSP1.setName("PreviousPageSP1");
		PreviousPageSP1.addActionListener(new GUIController_SeatingPlanDeparture());
		frame.getContentPane().add(PreviousPageSP1);


		JButton NextPageSP1 = new JButton("NEXT PAGE");
		NextPageSP1.setBounds(877, 110, 117, 29);
		NextPageSP1.setName("NextPageSP1");
		NextPageSP1.addActionListener(new GUIController_SeatingPlanDeparture());
		frame.getContentPane().add(NextPageSP1);


		JLabel lblNewLabel_1 = new JLabel("Choose your departure seat below:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(375, 115, 250, 20);
		frame.getContentPane().add(lblNewLabel_1);



		JLabel lblNewLabel = new JLabel("Economy:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(445, 343, 100, 20);
		frame.getContentPane().add(lblNewLabel);


		JLabel lblBusiness = new JLabel("Business:");
		lblBusiness.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusiness.setForeground(Color.WHITE);
		lblBusiness.setBounds(445, 173, 100, 20);
		frame.getContentPane().add(lblBusiness);


		JButton Button1A = new JButton("1A");
		Button1A.setName("Button");
		Button1A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				SelectedSeatsDeparture.add(Button1A);
				GUI_SeatingPlanDeparturePage.spc.DSeatNameList.add(Button1A.getText());

				System.out.println("----------");
				System.out.println(GUI_SeatingPlanDeparturePage.spc.DSeatNameList);
				System.out.println(SelectedSeatsDeparture);

				Button1A.setEnabled(false);

				JOptionPane.showMessageDialog(frame, " Your Seat Number is " + Button1A.getText());

				Data_CSVReader.getAllFlights().get(Data_CSVReader.getDepartureFlightID()).setSeatingPlan(GUI_SeatingPlanDeparturePage.spc);
				ArrayList<String> departureSPlan = Data_CSVReader.getAllFlights().get(Data_CSVReader.getDepartureFlightID()).getSeatingPlan().getDSeatName();

				for (int i = 0; i < departureSPlan.size(); i++) {

					System.out.println("Got Departure seat: " + departureSPlan.get(i));
				}

				System.out.println("----------");

			}
		});
		Button1A.setBackground(Color.WHITE);
		Button1A.setForeground(Color.BLACK);
		Button1A.setBounds(410, 203, 75, 20);
		frame.getContentPane().add(Button1A);

		JButton Button2A = new JButton("2A");
		allSeatsDeparture.add(Button2A);
		Button2A.setName("Button");
		Button2A.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SelectedSeatsDeparture.add(Button2A);
				GUI_SeatingPlanDeparturePage.spc.DSeatNameList.add(Button2A.getText());

				System.out.println("----------");
				System.out.println(GUI_SeatingPlanDeparturePage.spc.DSeatNameList);
				System.out.println(SelectedSeatsDeparture);

				Button2A.setEnabled(false);

				JOptionPane.showMessageDialog(frame, " Your Seat Number is " + Button2A.getText());

				Data_CSVReader.getAllFlights().get(Data_CSVReader.getDepartureFlightID()).setSeatingPlan(GUI_SeatingPlanDeparturePage.spc);
				ArrayList<String> departureSPlan = Data_CSVReader.getAllFlights().get(Data_CSVReader.getDepartureFlightID()).getSeatingPlan().getDSeatName();

				for (int i = 0; i < departureSPlan.size(); i++) {

					System.out.println("Got Departure seat: " + departureSPlan.get(i));
				}

				System.out.println("----------");

			}
		});
		Button2A.setForeground(Color.BLACK);
		Button2A.setBackground(Color.WHITE);
		Button2A.setBounds(410, 228, 75, 20);
		frame.getContentPane().add(Button2A);

		JButton Button3A = new JButton("3A");
		allSeatsDeparture.add(Button3A);
		Button3A.setName("Button");
		Button3A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button3A.setForeground(Color.BLACK);
		Button3A.setBackground(Color.WHITE);
		Button3A.setBounds(410, 253, 75, 20);
		frame.getContentPane().add(Button3A);

		JButton Button4A = new JButton("4A");
		allSeatsDeparture.add(Button4A);
		Button4A.setName("Button");
		Button4A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button4A.setForeground(Color.BLACK);
		Button4A.setBackground(Color.WHITE);
		Button4A.setBounds(410, 278, 75, 20);
		frame.getContentPane().add(Button4A);

		JButton Button5A = new JButton("5A");
		allSeatsDeparture.add(Button5A);
		Button5A.setName("Button");
		Button5A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button5A.setForeground(Color.BLACK);
		Button5A.setBackground(Color.WHITE);
		Button5A.setBounds(410, 303, 75, 20);
		frame.getContentPane().add(Button5A);

		JButton Button6A = new JButton("6A");
		allSeatsDeparture.add(Button6A);
		Button6A.setName("Button");
		Button6A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6A.setForeground(Color.BLACK);
		Button6A.setBackground(Color.WHITE);
		Button6A.setBounds(250, 373, 75, 20);
		frame.getContentPane().add(Button6A);

		JButton Button7A = new JButton("7A");
		allSeatsDeparture.add(Button7A);
		Button7A.setName("Button");
		Button7A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7A.setForeground(Color.BLACK);
		Button7A.setBackground(Color.WHITE);
		Button7A.setBounds(250, 398, 75, 20);
		frame.getContentPane().add(Button7A);


		JButton Button8A = new JButton("8A");
		allSeatsDeparture.add(Button8A);
		Button8A.setName("Button");
		Button8A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8A.setForeground(Color.BLACK);
		Button8A.setBackground(Color.WHITE);
		Button8A.setBounds(250, 423, 75, 20);
		frame.getContentPane().add(Button8A);

		JButton Button9A = new JButton("9A");
		allSeatsDeparture.add(Button9A);
		Button9A.setName("Button");
		Button9A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9A.setForeground(Color.BLACK);
		Button9A.setBackground(Color.WHITE);
		Button9A.setBounds(250, 448, 75, 20);
		frame.getContentPane().add(Button9A);

		JButton Button10A = new JButton("10A");
		allSeatsDeparture.add(Button10A);
		Button10A.setName("Button");
		Button10A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10A.setForeground(Color.BLACK);
		Button10A.setBackground(Color.WHITE);
		Button10A.setBounds(250, 473, 75, 20);
		frame.getContentPane().add(Button10A);

		JButton Button11A = new JButton("11A");
		allSeatsDeparture.add(Button11A);
		Button11A.setName("Button");
		Button11A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11A.setForeground(Color.BLACK);
		Button11A.setBackground(Color.WHITE);
		Button11A.setBounds(250, 498, 75, 20);
		frame.getContentPane().add(Button11A);

		JButton Button12A = new JButton("12A");
		allSeatsDeparture.add(Button12A);
		Button12A.setName("Button");
		Button12A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12A.setForeground(Color.BLACK);
		Button12A.setBackground(Color.WHITE);
		Button12A.setBounds(250, 523, 75, 20);
		frame.getContentPane().add(Button12A);

		JButton Button13A = new JButton("13A");
		allSeatsDeparture.add(Button13A);
		Button13A.setName("Button");
		Button13A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13A.setForeground(Color.BLACK);
		Button13A.setBackground(Color.WHITE);
		Button13A.setBounds(250, 548, 75, 20);
		frame.getContentPane().add(Button13A);

		JButton Button14A = new JButton("14A");
		allSeatsDeparture.add(Button14A);
		Button14A.setName("Button");
		Button14A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14A.setForeground(Color.BLACK);
		Button14A.setBackground(Color.WHITE);
		Button14A.setBounds(250, 573, 75, 20);
		frame.getContentPane().add(Button14A);

		JButton Button1B = new JButton("1B");
		allSeatsDeparture.add(Button1B);
		Button1B.setName("Button");
		Button1B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button1B.setForeground(Color.BLACK);
		Button1B.setBackground(Color.WHITE);
		Button1B.setBounds(505, 203, 75, 20);
		frame.getContentPane().add(Button1B);

		JButton Button2B = new JButton("2B");
		allSeatsDeparture.add(Button2B);
		Button2B.setName("Button");
		Button2B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button2B.setForeground(Color.BLACK);
		Button2B.setBackground(Color.WHITE);
		Button2B.setBounds(505, 228, 75, 20);
		frame.getContentPane().add(Button2B);

		JButton Button3B = new JButton("3B");
		allSeatsDeparture.add(Button3B);
		Button3B.setName("Button");
		Button3B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button3B.setForeground(Color.BLACK);
		Button3B.setBackground(Color.WHITE);
		Button3B.setBounds(505, 253, 75, 20);
		frame.getContentPane().add(Button3B);

		JButton Button4B = new JButton("4B");
		allSeatsDeparture.add(Button4B);
		Button4B.setName("Button");
		Button4B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button4B.setForeground(Color.BLACK);
		Button4B.setBackground(Color.WHITE);
		Button4B.setBounds(505, 278, 75, 20);
		frame.getContentPane().add(Button4B);

		JButton Button5B = new JButton("5B");
		allSeatsDeparture.add(Button5B);
		Button5B.setName("Button");
		Button5B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button5B.setForeground(Color.BLACK);
		Button5B.setBackground(Color.WHITE);
		Button5B.setBounds(505, 303, 75, 20);
		frame.getContentPane().add(Button5B);

		JButton Button6B = new JButton("6B");
		allSeatsDeparture.add(Button6B);
		Button6B.setName("Button");
		Button6B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6B.setForeground(Color.BLACK);
		Button6B.setBackground(Color.WHITE);
		Button6B.setBounds(330, 373, 75, 20);
		frame.getContentPane().add(Button6B);

		JButton Button7B = new JButton("7B");
		allSeatsDeparture.add(Button7B);
		Button7B.setName("Button");
		Button7B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7B.setForeground(Color.BLACK);
		Button7B.setBackground(Color.WHITE);
		Button7B.setBounds(330, 398, 75, 20);
		frame.getContentPane().add(Button7B);

		JButton Button8B = new JButton("8B");
		allSeatsDeparture.add(Button8B);
		Button8B.setName("Button");
		Button8B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8B.setForeground(Color.BLACK);
		Button8B.setBackground(Color.WHITE);
		Button8B.setBounds(330, 423, 75, 20);
		frame.getContentPane().add(Button8B);

		JButton Button9B = new JButton("9B");
		allSeatsDeparture.add(Button9B);
		Button9B.setName("Button");
		Button9B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9B.setForeground(Color.BLACK);
		Button9B.setBackground(Color.WHITE);
		Button9B.setBounds(330, 448, 75, 20);
		frame.getContentPane().add(Button9B);

		JButton Button10B = new JButton("10B");
		allSeatsDeparture.add(Button10B);
		Button10B.setName("Button");
		Button10B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10B.setForeground(Color.BLACK);
		Button10B.setBackground(Color.WHITE);
		Button10B.setBounds(330, 473, 75, 20);
		frame.getContentPane().add(Button10B);

		JButton Button11B = new JButton("11B");
		allSeatsDeparture.add(Button11B);
		Button11B.setName("Button");
		Button11B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11B.setForeground(Color.BLACK);
		Button11B.setBackground(Color.WHITE);
		Button11B.setBounds(330, 498, 75, 20);
		frame.getContentPane().add(Button11B);

		JButton Button12B = new JButton("12B");
		allSeatsDeparture.add(Button12B);
		Button12B.setName("Button");
		Button12B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12B.setForeground(Color.BLACK);
		Button12B.setBackground(Color.WHITE);
		Button12B.setBounds(330, 523, 75, 20);
		frame.getContentPane().add(Button12B);

		JButton Button13B = new JButton("13B");
		allSeatsDeparture.add(Button13B);
		Button13B.setName("Button");
		Button13B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13B.setForeground(Color.BLACK);
		Button13B.setBackground(Color.WHITE);
		Button13B.setBounds(330, 548, 75, 20);
		frame.getContentPane().add(Button13B);

		JButton Button14B = new JButton("14B");
		allSeatsDeparture.add(Button14B);
		Button14B.setName("Button");
		Button14B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14B.setForeground(Color.BLACK);
		Button14B.setBackground(Color.WHITE);
		Button14B.setBounds(330, 573, 75, 20);
		frame.getContentPane().add(Button14B);

		JButton Button6C = new JButton("6C");
		allSeatsDeparture.add(Button6C);
		Button6C.setName("Button");
		Button6C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6C.setForeground(Color.BLACK);
		Button6C.setBackground(Color.WHITE);
		Button6C.setBounds(410, 373, 75, 20);
		frame.getContentPane().add(Button6C);

		JButton Button7C = new JButton("7C");
		allSeatsDeparture.add(Button7C);
		Button7C.setName("Button");
		Button7C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7C.setForeground(Color.BLACK);
		Button7C.setBackground(Color.WHITE);
		Button7C.setBounds(410, 398, 75, 20);
		frame.getContentPane().add(Button7C);

		JButton Button8C = new JButton("8C");
		allSeatsDeparture.add(Button8C);
		Button8C.setName("Button");
		Button8C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8C.setForeground(Color.BLACK);
		Button8C.setBackground(Color.WHITE);
		Button8C.setBounds(410, 423, 75, 20);
		frame.getContentPane().add(Button8C);

		JButton Button9C = new JButton("9C");
		allSeatsDeparture.add(Button9C);
		Button9C.setName("Button");
		Button9C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9C.setForeground(Color.BLACK);
		Button9C.setBackground(Color.WHITE);
		Button9C.setBounds(410, 448, 75, 20);
		frame.getContentPane().add(Button9C);

		JButton Button10C = new JButton("10C");
		allSeatsDeparture.add(Button10C);
		Button10C.setName("Button");
		Button10C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10C.setForeground(Color.BLACK);
		Button10C.setBackground(Color.WHITE);
		Button10C.setBounds(410, 473, 75, 20);
		frame.getContentPane().add(Button10C);

		JButton Button11C = new JButton("11C");
		allSeatsDeparture.add(Button11C);
		Button11C.setName("Button");
		Button11C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11C.setForeground(Color.BLACK);
		Button11C.setBackground(Color.WHITE);
		Button11C.setBounds(410, 498, 75, 20);
		frame.getContentPane().add(Button11C);

		JButton Button12C = new JButton("12C");
		allSeatsDeparture.add(Button12C);
		Button12C.setName("Button");
		Button12C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12C.setForeground(Color.BLACK);
		Button12C.setBackground(Color.WHITE);
		Button12C.setBounds(410, 523, 75, 20);
		frame.getContentPane().add(Button12C);

		JButton Button13C = new JButton("13C");
		allSeatsDeparture.add(Button13C);
		Button13C.setName("Button");
		Button13C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13C.setForeground(Color.BLACK);
		Button13C.setBackground(Color.WHITE);
		Button13C.setBounds(410, 548, 75, 20);
		frame.getContentPane().add(Button13C);

		JButton Button14C = new JButton("14C");
		allSeatsDeparture.add(Button14C);
		Button14C.setName("Button");
		Button14C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14C.setForeground(Color.BLACK);
		Button14C.setBackground(Color.WHITE);
		Button14C.setBounds(410, 573, 75, 20);
		frame.getContentPane().add(Button14C);

		JButton Button6D = new JButton("6D");
		allSeatsDeparture.add(Button6D);
		Button6D.setName("Button");
		Button6D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6D.setForeground(Color.BLACK);
		Button6D.setBackground(Color.WHITE);
		Button6D.setBounds(505, 373, 75, 20);
		frame.getContentPane().add(Button6D);

		JButton Button7D = new JButton("7D");
		allSeatsDeparture.add(Button7D);
		Button7D.setName("Button");
		Button7D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7D.setForeground(Color.BLACK);
		Button7D.setBackground(Color.WHITE);
		Button7D.setBounds(505, 398, 75, 20);
		frame.getContentPane().add(Button7D);

		JButton Button8D = new JButton("8D");
		allSeatsDeparture.add(Button8D);
		Button8D.setName("Button");
		Button8D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8D.setForeground(Color.BLACK);
		Button8D.setBackground(Color.WHITE);
		Button8D.setBounds(505, 423, 75, 20);
		frame.getContentPane().add(Button8D);

		JButton Button9D = new JButton("9D");
		allSeatsDeparture.add(Button9D);
		Button9D.setName("Button");
		Button9D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9D.setForeground(Color.BLACK);
		Button9D.setBackground(Color.WHITE);
		Button9D.setBounds(505, 448, 75, 20);
		frame.getContentPane().add(Button9D);

		JButton Button10D = new JButton("10D");
		allSeatsDeparture.add(Button10D);
		Button10D.setName("Button");
		Button10D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10D.setForeground(Color.BLACK);
		Button10D.setBackground(Color.WHITE);
		Button10D.setBounds(505, 473, 75, 20);
		frame.getContentPane().add(Button10D);

		JButton Button11D = new JButton("11D");
		allSeatsDeparture.add(Button11D);
		Button11D.setName("Button");
		Button11D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11D.setForeground(Color.BLACK);
		Button11D.setBackground(Color.WHITE);
		Button11D.setBounds(505, 498, 75, 20);
		frame.getContentPane().add(Button11D);

		JButton Button12D = new JButton("12D");
		allSeatsDeparture.add(Button12D);
		Button12D.setName("Button");
		Button12D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12D.setForeground(Color.BLACK);
		Button12D.setBackground(Color.WHITE);
		Button12D.setBounds(505, 523, 75, 20);
		frame.getContentPane().add(Button12D);

		JButton Button13D = new JButton("13D");
		allSeatsDeparture.add(Button13D);
		Button13D.setName("Button");
		Button13D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13D.setForeground(Color.BLACK);
		Button13D.setBackground(Color.WHITE);
		Button13D.setBounds(505, 548, 75, 20);
		frame.getContentPane().add(Button13D);

		JButton Button14D = new JButton("14D");
		allSeatsDeparture.add(Button14D);
		Button14D.setName("Button");
		Button14D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14D.setForeground(Color.BLACK);
		Button14D.setBackground(Color.WHITE);
		Button14D.setBounds(505, 573, 75, 20);
		frame.getContentPane().add(Button14D);

		JButton Button6E = new JButton("6E");
		allSeatsDeparture.add(Button6E);
		Button6E.setName("Button");
		Button6E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6E.setForeground(Color.BLACK);
		Button6E.setBackground(Color.WHITE);
		Button6E.setBounds(585, 373, 75, 20);
		frame.getContentPane().add(Button6E);

		JButton Button7E = new JButton("7E");
		allSeatsDeparture.add(Button7E);
		Button7E.setName("Button");
		Button7E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7E.setForeground(Color.BLACK);
		Button7E.setBackground(Color.WHITE);
		Button7E.setBounds(585, 398, 75, 20);
		frame.getContentPane().add(Button7E);

		JButton Button8E = new JButton("8E");
		allSeatsDeparture.add(Button8E);
		Button8E.setName("Button");
		Button8E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8E.setForeground(Color.BLACK);
		Button8E.setBackground(Color.WHITE);
		Button8E.setBounds(585, 423, 75, 20);
		frame.getContentPane().add(Button8E);

		JButton Button9E = new JButton("9E");
		allSeatsDeparture.add(Button9E);
		Button9E.setName("Button");
		Button9E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9E.setForeground(Color.BLACK);
		Button9E.setBackground(Color.WHITE);
		Button9E.setBounds(585, 448, 75, 20);
		frame.getContentPane().add(Button9E);

		JButton Button10E = new JButton("10E");
		allSeatsDeparture.add(Button10E);
		Button10E.setName("Button");
		Button10E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10E.setForeground(Color.BLACK);
		Button10E.setBackground(Color.WHITE);
		Button10E.setBounds(585, 473, 75, 20);
		frame.getContentPane().add(Button10E);

		JButton Button11E = new JButton("11E");
		allSeatsDeparture.add(Button11E);
		Button11E.setName("Button");
		Button11E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11E.setForeground(Color.BLACK);
		Button11E.setBackground(Color.WHITE);
		Button11E.setBounds(585, 498, 75, 20);
		frame.getContentPane().add(Button11E);

		JButton Button12E = new JButton("12E");
		allSeatsDeparture.add(Button12E);
		Button12E.setName("Button");
		Button12E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12E.setForeground(Color.BLACK);
		Button12E.setBackground(Color.WHITE);
		Button12E.setBounds(585, 523, 75, 20);
		frame.getContentPane().add(Button12E);

		JButton Button13E = new JButton("13E");
		allSeatsDeparture.add(Button13E);
		Button13E.setName("Button");
		Button13E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13E.setForeground(Color.BLACK);
		Button13E.setBackground(Color.WHITE);
		Button13E.setBounds(585, 548, 75, 20);
		frame.getContentPane().add(Button13E);

		JButton Button14E = new JButton("14E");
		allSeatsDeparture.add(Button14E);
		Button14E.setName("Button");
		Button14E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14E.setForeground(Color.BLACK);
		Button14E.setBackground(Color.WHITE);
		Button14E.setBounds(585, 573, 75, 20);
		frame.getContentPane().add(Button14E);

		JButton Button6F = new JButton("6F");
		allSeatsDeparture.add(Button6F);
		Button6F.setName("Button");
		Button6F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6F.setForeground(Color.BLACK);
		Button6F.setBackground(Color.WHITE);
		Button6F.setBounds(665, 373, 75, 20);
		frame.getContentPane().add(Button6F);

		JButton Button7F = new JButton("7F");
		allSeatsDeparture.add(Button7F);
		Button7F.setName("Button");
		Button7F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7F.setForeground(Color.BLACK);
		Button7F.setBackground(Color.WHITE);
		Button7F.setBounds(665, 398, 75, 20);
		frame.getContentPane().add(Button7F);

		JButton Button8F = new JButton("8F");
		allSeatsDeparture.add(Button8F);
		Button8F.setName("Button");
		Button8F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8F.setForeground(Color.BLACK);
		Button8F.setBackground(Color.WHITE);
		Button8F.setBounds(665, 423, 75, 20);
		frame.getContentPane().add(Button8F);

		JButton Button9F = new JButton("9F");
		allSeatsDeparture.add(Button9F);
		Button9F.setName("Button");
		Button9F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9F.setForeground(Color.BLACK);
		Button9F.setBackground(Color.WHITE);
		Button9F.setBounds(665, 448, 75, 20);
		frame.getContentPane().add(Button9F);

		JButton Button10F = new JButton("10F");
		allSeatsDeparture.add(Button10F);
		Button10F.setName("Button");
		Button10F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10F.setForeground(Color.BLACK);
		Button10F.setBackground(Color.WHITE);
		Button10F.setBounds(665, 473, 75, 20);
		frame.getContentPane().add(Button10F);

		JButton Button11F = new JButton("11F");
		allSeatsDeparture.add(Button11F);
		Button11F.setName("Button");
		Button11F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11F.setForeground(Color.BLACK);
		Button11F.setBackground(Color.WHITE);
		Button11F.setBounds(665, 498, 75, 20);
		frame.getContentPane().add(Button11F);

		JButton Button12F = new JButton("12F");
		allSeatsDeparture.add(Button12F);
		Button12F.setName("Button");
		Button12F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12F.setForeground(Color.BLACK);
		Button12F.setBackground(Color.WHITE);
		Button12F.setBounds(665, 523, 75, 20);
		frame.getContentPane().add(Button12F);

		JButton Button13F = new JButton("13F");
		allSeatsDeparture.add(Button13F);
		Button13F.setName("Button");
		Button13F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13F.setForeground(Color.BLACK);
		Button13F.setBackground(Color.WHITE);
		Button13F.setBounds(665, 548, 75, 20);
		frame.getContentPane().add(Button13F);

		JButton Button14F = new JButton("14F");
		allSeatsDeparture.add(Button14F);
		Button14F.setName("Button");
		Button14F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14F.setForeground(Color.BLACK);
		Button14F.setBackground(Color.WHITE);
		Button14F.setBounds(665, 573, 75, 20);
		frame.getContentPane().add(Button14F);
		
		
		JButton ClearButton = new JButton("Clear");
		ClearButton.setName("Clear Button");
		ClearButton.addActionListener(new GUIController_SeatingPlanDeparture());
		ClearButton.setForeground(Color.BLACK);
		ClearButton.setBackground(Color.WHITE);
		ClearButton.setBounds(850, 565, 120, 30);
		frame.getContentPane().add(ClearButton);


		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setBounds(0, 0, 1000, 624);
		frame.getContentPane().add(Background);
		
	}
	

	
	
	
	private void initializeAirbus() {
		spc = new Data_SeatingPlan();
		allSeatsDeparture = new ArrayList <JButton>();

		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 990, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Seating Plan For Departure Flight");

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(719, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		progressBar.setIndeterminate(true);
		int newLength = 4;
		progressBar.setMaximum(newLength);
		int newValue = (int) 2.5;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);


		JButton PreviousPageSP1 = new JButton("BACK");
		PreviousPageSP1.setBounds(0, 110, 117, 29);
		PreviousPageSP1.setName("PreviousPageSP1");
		PreviousPageSP1.addActionListener(new GUIController_SeatingPlanDeparture());
		frame.getContentPane().add(PreviousPageSP1);


		JButton NextPageSP1 = new JButton("NEXT PAGE");
		NextPageSP1.setBounds(877, 110, 117, 29);
		NextPageSP1.setName("NextPageSP1");
		NextPageSP1.addActionListener(new GUIController_SeatingPlanDeparture());
		frame.getContentPane().add(NextPageSP1);


		JLabel lblNewLabel_1 = new JLabel("Choose your departure seat below:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(375, 115, 250, 20);
		frame.getContentPane().add(lblNewLabel_1);



		JLabel lblNewLabel = new JLabel("Economy:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setBounds(445, 343, 100, 20);
		frame.getContentPane().add(lblNewLabel);


		JLabel lblBusiness = new JLabel("Business:");
		lblBusiness.setHorizontalAlignment(SwingConstants.CENTER);
		lblBusiness.setForeground(Color.WHITE);
		lblBusiness.setBounds(445, 173, 100, 20);
		frame.getContentPane().add(lblBusiness);


		JButton Button1A = new JButton("1A");
		allSeatsDeparture.add(Button1A);
		Button1A.setName("Button");
		Button1A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button1A.setBackground(Color.WHITE);
		Button1A.setForeground(Color.BLACK);
		Button1A.setBounds(410, 203, 75, 20);
		frame.getContentPane().add(Button1A);

		JButton Button2A = new JButton("2A");
		allSeatsDeparture.add(Button2A);
		Button2A.setName("Button");
		Button2A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button2A.setForeground(Color.BLACK);
		Button2A.setBackground(Color.WHITE);
		Button2A.setBounds(410, 228, 75, 20);
		frame.getContentPane().add(Button2A);

		JButton Button3A = new JButton("3A");
		allSeatsDeparture.add(Button3A);
		Button3A.setName("Button");
		Button3A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button3A.setForeground(Color.BLACK);
		Button3A.setBackground(Color.WHITE);
		Button3A.setBounds(410, 253, 75, 20);
		frame.getContentPane().add(Button3A);

		JButton Button4A = new JButton("4A");
		allSeatsDeparture.add(Button4A);
		Button4A.setName("Button");
		Button4A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button4A.setForeground(Color.BLACK);
		Button4A.setBackground(Color.WHITE);
		Button4A.setBounds(410, 278, 75, 20);
		frame.getContentPane().add(Button4A);

		JButton Button5A = new JButton("5A");
		allSeatsDeparture.add(Button5A);
		Button5A.setName("Button");
		Button5A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button5A.setForeground(Color.BLACK);
		Button5A.setBackground(Color.WHITE);
		Button5A.setBounds(410, 303, 75, 20);
		frame.getContentPane().add(Button5A);

		JButton Button6A = new JButton("6A");
		allSeatsDeparture.add(Button6A);
		Button6A.setName("Button");
		Button6A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6A.setForeground(Color.BLACK);
		Button6A.setBackground(Color.WHITE);
		Button6A.setBounds(250, 373, 75, 20);
		frame.getContentPane().add(Button6A);

		JButton Button7A = new JButton("7A");
		allSeatsDeparture.add(Button7A);
		Button7A.setName("Button");
		Button7A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7A.setForeground(Color.BLACK);
		Button7A.setBackground(Color.WHITE);
		Button7A.setBounds(250, 398, 75, 20);
		frame.getContentPane().add(Button7A);


		JButton Button8A = new JButton("8A");
		allSeatsDeparture.add(Button8A);
		Button8A.setName("Button");
		Button8A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8A.setForeground(Color.BLACK);
		Button8A.setBackground(Color.WHITE);
		Button8A.setBounds(250, 423, 75, 20);
		frame.getContentPane().add(Button8A);

		JButton Button9A = new JButton("9A");
		allSeatsDeparture.add(Button9A);
		Button9A.setName("Button");
		Button9A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9A.setForeground(Color.BLACK);
		Button9A.setBackground(Color.WHITE);
		Button9A.setBounds(250, 448, 75, 20);
		frame.getContentPane().add(Button9A);

		JButton Button10A = new JButton("10A");
		allSeatsDeparture.add(Button10A);
		Button10A.setName("Button");
		Button10A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10A.setForeground(Color.BLACK);
		Button10A.setBackground(Color.WHITE);
		Button10A.setBounds(250, 473, 75, 20);
		frame.getContentPane().add(Button10A);

		JButton Button11A = new JButton("11A");
		allSeatsDeparture.add(Button11A);
		Button11A.setName("Button");
		Button11A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11A.setForeground(Color.BLACK);
		Button11A.setBackground(Color.WHITE);
		Button11A.setBounds(250, 498, 75, 20);
		frame.getContentPane().add(Button11A);

		JButton Button12A = new JButton("12A");
		allSeatsDeparture.add(Button12A);
		Button12A.setName("Button");
		Button12A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12A.setForeground(Color.BLACK);
		Button12A.setBackground(Color.WHITE);
		Button12A.setBounds(250, 523, 75, 20);
		frame.getContentPane().add(Button12A);

		JButton Button13A = new JButton("13A");
		allSeatsDeparture.add(Button13A);
		Button13A.setName("Button");
		Button13A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13A.setForeground(Color.BLACK);
		Button13A.setBackground(Color.WHITE);
		Button13A.setBounds(250, 548, 75, 20);
		frame.getContentPane().add(Button13A);

		JButton Button14A = new JButton("14A");
		allSeatsDeparture.add(Button14A);
		Button14A.setName("Button");
		Button14A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14A.setForeground(Color.BLACK);
		Button14A.setBackground(Color.WHITE);
		Button14A.setBounds(250, 573, 75, 20);
		frame.getContentPane().add(Button14A);

		JButton Button1B = new JButton("1B");
		allSeatsDeparture.add(Button1B);
		Button1B.setName("Button");
		Button1B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button1B.setForeground(Color.BLACK);
		Button1B.setBackground(Color.WHITE);
		Button1B.setBounds(505, 203, 75, 20);
		frame.getContentPane().add(Button1B);

		JButton Button2B = new JButton("2B");
		allSeatsDeparture.add(Button2B);
		Button2B.setName("Button");
		Button2B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button2B.setForeground(Color.BLACK);
		Button2B.setBackground(Color.WHITE);
		Button2B.setBounds(505, 228, 75, 20);
		frame.getContentPane().add(Button2B);

		JButton Button3B = new JButton("3B");
		allSeatsDeparture.add(Button3B);
		Button3B.setName("Button");
		Button3B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button3B.setForeground(Color.BLACK);
		Button3B.setBackground(Color.WHITE);
		Button3B.setBounds(505, 253, 75, 20);
		frame.getContentPane().add(Button3B);

		JButton Button4B = new JButton("4B");
		allSeatsDeparture.add(Button4B);
		Button4B.setName("Button");
		Button4B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button4B.setForeground(Color.BLACK);
		Button4B.setBackground(Color.WHITE);
		Button4B.setBounds(505, 278, 75, 20);
		frame.getContentPane().add(Button4B);

		JButton Button5B = new JButton("5B");
		allSeatsDeparture.add(Button5B);
		Button5B.setName("Button");
		Button5B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button5B.setForeground(Color.BLACK);
		Button5B.setBackground(Color.WHITE);
		Button5B.setBounds(505, 303, 75, 20);
		frame.getContentPane().add(Button5B);

		JButton Button6B = new JButton("6B");
		allSeatsDeparture.add(Button6B);
		Button6B.setName("Button");
		Button6B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6B.setForeground(Color.BLACK);
		Button6B.setBackground(Color.WHITE);
		Button6B.setBounds(330, 373, 75, 20);
		frame.getContentPane().add(Button6B);

		JButton Button7B = new JButton("7B");
		allSeatsDeparture.add(Button7B);
		Button7B.setName("Button");
		Button7B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7B.setForeground(Color.BLACK);
		Button7B.setBackground(Color.WHITE);
		Button7B.setBounds(330, 398, 75, 20);
		frame.getContentPane().add(Button7B);

		JButton Button8B = new JButton("8B");
		allSeatsDeparture.add(Button8B);
		Button8B.setName("Button");
		Button8B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8B.setForeground(Color.BLACK);
		Button8B.setBackground(Color.WHITE);
		Button8B.setBounds(330, 423, 75, 20);
		frame.getContentPane().add(Button8B);

		JButton Button9B = new JButton("9B");
		allSeatsDeparture.add(Button9B);
		Button9B.setName("Button");
		Button9B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9B.setForeground(Color.BLACK);
		Button9B.setBackground(Color.WHITE);
		Button9B.setBounds(330, 448, 75, 20);
		frame.getContentPane().add(Button9B);

		JButton Button10B = new JButton("10B");
		allSeatsDeparture.add(Button10B);
		Button10B.setName("Button");
		Button10B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10B.setForeground(Color.BLACK);
		Button10B.setBackground(Color.WHITE);
		Button10B.setBounds(330, 473, 75, 20);
		frame.getContentPane().add(Button10B);

		JButton Button11B = new JButton("11B");
		allSeatsDeparture.add(Button11B);
		Button11B.setName("Button");
		Button11B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11B.setForeground(Color.BLACK);
		Button11B.setBackground(Color.WHITE);
		Button11B.setBounds(330, 498, 75, 20);
		frame.getContentPane().add(Button11B);

		JButton Button12B = new JButton("12B");
		allSeatsDeparture.add(Button12B);
		Button12B.setName("Button");
		Button12B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12B.setForeground(Color.BLACK);
		Button12B.setBackground(Color.WHITE);
		Button12B.setBounds(330, 523, 75, 20);
		frame.getContentPane().add(Button12B);

		JButton Button13B = new JButton("13B");
		allSeatsDeparture.add(Button13B);
		Button13B.setName("Button");
		Button13B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13B.setForeground(Color.BLACK);
		Button13B.setBackground(Color.WHITE);
		Button13B.setBounds(330, 548, 75, 20);
		frame.getContentPane().add(Button13B);

		JButton Button14B = new JButton("14B");
		allSeatsDeparture.add(Button14B);
		Button14B.setName("Button");
		Button14B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14B.setForeground(Color.BLACK);
		Button14B.setBackground(Color.WHITE);
		Button14B.setBounds(330, 573, 75, 20);
		frame.getContentPane().add(Button14B);

		JButton Button6C = new JButton("6C");
		allSeatsDeparture.add(Button6C);
		Button6C.setName("Button");
		Button6C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6C.setForeground(Color.BLACK);
		Button6C.setBackground(Color.WHITE);
		Button6C.setBounds(410, 373, 75, 20);
		frame.getContentPane().add(Button6C);

		JButton Button7C = new JButton("7C");
		allSeatsDeparture.add(Button7C);
		Button7C.setName("Button");
		Button7C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7C.setForeground(Color.BLACK);
		Button7C.setBackground(Color.WHITE);
		Button7C.setBounds(410, 398, 75, 20);
		frame.getContentPane().add(Button7C);

		JButton Button8C = new JButton("8C");
		allSeatsDeparture.add(Button8C);
		Button8C.setName("Button");
		Button8C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8C.setForeground(Color.BLACK);
		Button8C.setBackground(Color.WHITE);
		Button8C.setBounds(410, 423, 75, 20);
		frame.getContentPane().add(Button8C);

		JButton Button9C = new JButton("9C");
		allSeatsDeparture.add(Button9C);
		Button9C.setName("Button");
		Button9C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9C.setForeground(Color.BLACK);
		Button9C.setBackground(Color.WHITE);
		Button9C.setBounds(410, 448, 75, 20);
		frame.getContentPane().add(Button9C);

		JButton Button10C = new JButton("10C");
		allSeatsDeparture.add(Button10C);
		Button10C.setName("Button");
		Button10C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10C.setForeground(Color.BLACK);
		Button10C.setBackground(Color.WHITE);
		Button10C.setBounds(410, 473, 75, 20);
		frame.getContentPane().add(Button10C);

		JButton Button11C = new JButton("11C");
		allSeatsDeparture.add(Button11C);
		Button11C.setName("Button");
		Button11C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11C.setForeground(Color.BLACK);
		Button11C.setBackground(Color.WHITE);
		Button11C.setBounds(410, 498, 75, 20);
		frame.getContentPane().add(Button11C);

		JButton Button12C = new JButton("12C");
		allSeatsDeparture.add(Button12C);
		Button12C.setName("Button");
		Button12C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12C.setForeground(Color.BLACK);
		Button12C.setBackground(Color.WHITE);
		Button12C.setBounds(410, 523, 75, 20);
		frame.getContentPane().add(Button12C);

		JButton Button13C = new JButton("13C");
		allSeatsDeparture.add(Button13C);
		Button13C.setName("Button");
		Button13C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13C.setForeground(Color.BLACK);
		Button13C.setBackground(Color.WHITE);
		Button13C.setBounds(410, 548, 75, 20);
		frame.getContentPane().add(Button13C);

		JButton Button14C = new JButton("14C");
		allSeatsDeparture.add(Button14C);
		Button14C.setName("Button");
		Button14C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14C.setForeground(Color.BLACK);
		Button14C.setBackground(Color.WHITE);
		Button14C.setBounds(410, 573, 75, 20);
		frame.getContentPane().add(Button14C);

		JButton Button6D = new JButton("6D");
		allSeatsDeparture.add(Button6D);
		Button6D.setName("Button");
		Button6D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6D.setForeground(Color.BLACK);
		Button6D.setBackground(Color.WHITE);
		Button6D.setBounds(505, 373, 75, 20);
		frame.getContentPane().add(Button6D);

		JButton Button7D = new JButton("7D");
		allSeatsDeparture.add(Button7D);
		Button7D.setName("Button");
		Button7D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7D.setForeground(Color.BLACK);
		Button7D.setBackground(Color.WHITE);
		Button7D.setBounds(505, 398, 75, 20);
		frame.getContentPane().add(Button7D);

		JButton Button8D = new JButton("8D");
		allSeatsDeparture.add(Button8D);
		Button8D.setName("Button");
		Button8D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8D.setForeground(Color.BLACK);
		Button8D.setBackground(Color.WHITE);
		Button8D.setBounds(505, 423, 75, 20);
		frame.getContentPane().add(Button8D);

		JButton Button9D = new JButton("9D");
		allSeatsDeparture.add(Button9D);
		Button9D.setName("Button");
		Button9D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9D.setForeground(Color.BLACK);
		Button9D.setBackground(Color.WHITE);
		Button9D.setBounds(505, 448, 75, 20);
		frame.getContentPane().add(Button9D);

		JButton Button10D = new JButton("10D");
		allSeatsDeparture.add(Button10D);
		Button10D.setName("Button");
		Button10D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10D.setForeground(Color.BLACK);
		Button10D.setBackground(Color.WHITE);
		Button10D.setBounds(505, 473, 75, 20);
		frame.getContentPane().add(Button10D);

		JButton Button11D = new JButton("11D");
		allSeatsDeparture.add(Button11D);
		Button11D.setName("Button");
		Button11D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11D.setForeground(Color.BLACK);
		Button11D.setBackground(Color.WHITE);
		Button11D.setBounds(505, 498, 75, 20);
		frame.getContentPane().add(Button11D);

		JButton Button12D = new JButton("12D");
		allSeatsDeparture.add(Button12D);
		Button12D.setName("Button");
		Button12D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12D.setForeground(Color.BLACK);
		Button12D.setBackground(Color.WHITE);
		Button12D.setBounds(505, 523, 75, 20);
		frame.getContentPane().add(Button12D);

		JButton Button13D = new JButton("13D");
		allSeatsDeparture.add(Button13D);
		Button13D.setName("Button");
		Button13D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13D.setForeground(Color.BLACK);
		Button13D.setBackground(Color.WHITE);
		Button13D.setBounds(505, 548, 75, 20);
		frame.getContentPane().add(Button13D);

		JButton Button14D = new JButton("14D");
		allSeatsDeparture.add(Button14D);
		Button14D.setName("Button");
		Button14D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14D.setForeground(Color.BLACK);
		Button14D.setBackground(Color.WHITE);
		Button14D.setBounds(505, 573, 75, 20);
		frame.getContentPane().add(Button14D);

		JButton Button6E = new JButton("6E");
		allSeatsDeparture.add(Button6E);
		Button6E.setName("Button");
		Button6E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6E.setForeground(Color.BLACK);
		Button6E.setBackground(Color.WHITE);
		Button6E.setBounds(585, 373, 75, 20);
		frame.getContentPane().add(Button6E);

		JButton Button7E = new JButton("7E");
		allSeatsDeparture.add(Button7E);
		Button7E.setName("Button");
		Button7E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7E.setForeground(Color.BLACK);
		Button7E.setBackground(Color.WHITE);
		Button7E.setBounds(585, 398, 75, 20);
		frame.getContentPane().add(Button7E);

		JButton Button8E = new JButton("8E");
		allSeatsDeparture.add(Button8E);
		Button8E.setName("Button");
		Button8E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8E.setForeground(Color.BLACK);
		Button8E.setBackground(Color.WHITE);
		Button8E.setBounds(585, 423, 75, 20);
		frame.getContentPane().add(Button8E);

		JButton Button9E = new JButton("9E");
		allSeatsDeparture.add(Button9E);
		Button9E.setName("Button");
		Button9E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9E.setForeground(Color.BLACK);
		Button9E.setBackground(Color.WHITE);
		Button9E.setBounds(585, 448, 75, 20);
		frame.getContentPane().add(Button9E);

		JButton Button10E = new JButton("10E");
		allSeatsDeparture.add(Button10E);
		Button10E.setName("Button");
		Button10E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10E.setForeground(Color.BLACK);
		Button10E.setBackground(Color.WHITE);
		Button10E.setBounds(585, 473, 75, 20);
		frame.getContentPane().add(Button10E);

		JButton Button11E = new JButton("11E");
		allSeatsDeparture.add(Button11E);
		Button11E.setName("Button");
		Button11E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11E.setForeground(Color.BLACK);
		Button11E.setBackground(Color.WHITE);
		Button11E.setBounds(585, 498, 75, 20);
		frame.getContentPane().add(Button11E);

		JButton Button12E = new JButton("12E");
		allSeatsDeparture.add(Button12E);
		Button12E.setName("Button");
		Button12E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12E.setForeground(Color.BLACK);
		Button12E.setBackground(Color.WHITE);
		Button12E.setBounds(585, 523, 75, 20);
		frame.getContentPane().add(Button12E);

		JButton Button13E = new JButton("13E");
		allSeatsDeparture.add(Button13E);
		Button13E.setName("Button");
		Button13E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13E.setForeground(Color.BLACK);
		Button13E.setBackground(Color.WHITE);
		Button13E.setBounds(585, 548, 75, 20);
		frame.getContentPane().add(Button13E);

		JButton Button14E = new JButton("14E");
		allSeatsDeparture.add(Button14E);
		Button14E.setName("Button");
		Button14E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14E.setForeground(Color.BLACK);
		Button14E.setBackground(Color.WHITE);
		Button14E.setBounds(585, 573, 75, 20);
		frame.getContentPane().add(Button14E);

		JButton Button6F = new JButton("6F");
		allSeatsDeparture.add(Button6F);
		Button6F.setName("Button");
		Button6F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6F.setForeground(Color.BLACK);
		Button6F.setBackground(Color.WHITE);
		Button6F.setBounds(665, 373, 75, 20);
		frame.getContentPane().add(Button6F);

		JButton Button7F = new JButton("7F");
		allSeatsDeparture.add(Button7F);
		Button7F.setName("Button");
		Button7F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7F.setForeground(Color.BLACK);
		Button7F.setBackground(Color.WHITE);
		Button7F.setBounds(665, 398, 75, 20);
		frame.getContentPane().add(Button7F);

		JButton Button8F = new JButton("8F");
		allSeatsDeparture.add(Button8F);
		Button8F.setName("Button");
		Button8F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8F.setForeground(Color.BLACK);
		Button8F.setBackground(Color.WHITE);
		Button8F.setBounds(665, 423, 75, 20);
		frame.getContentPane().add(Button8F);

		JButton Button9F = new JButton("9F");
		allSeatsDeparture.add(Button9F);
		Button9F.setName("Button");
		Button9F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9F.setForeground(Color.BLACK);
		Button9F.setBackground(Color.WHITE);
		Button9F.setBounds(665, 448, 75, 20);
		frame.getContentPane().add(Button9F);

		JButton Button10F = new JButton("10F");
		allSeatsDeparture.add(Button10F);
		Button10F.setName("Button");
		Button10F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10F.setForeground(Color.BLACK);
		Button10F.setBackground(Color.WHITE);
		Button10F.setBounds(665, 473, 75, 20);
		frame.getContentPane().add(Button10F);

		JButton Button11F = new JButton("11F");
		allSeatsDeparture.add(Button11F);
		Button11F.setName("Button");
		Button11F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11F.setForeground(Color.BLACK);
		Button11F.setBackground(Color.WHITE);
		Button11F.setBounds(665, 498, 75, 20);
		frame.getContentPane().add(Button11F);

		JButton Button12F = new JButton("12F");
		allSeatsDeparture.add(Button12F);
		Button12F.setName("Button");
		Button12F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12F.setForeground(Color.BLACK);
		Button12F.setBackground(Color.WHITE);
		Button12F.setBounds(665, 523, 75, 20);
		frame.getContentPane().add(Button12F);

		JButton Button13F = new JButton("13F");
		allSeatsDeparture.add(Button13F);
		Button13F.setName("Button");
		Button13F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13F.setForeground(Color.BLACK);
		Button13F.setBackground(Color.WHITE);
		Button13F.setBounds(665, 548, 75, 20);
		frame.getContentPane().add(Button13F);

		JButton Button14F = new JButton("14F");
		allSeatsDeparture.add(Button14F);
		Button14F.setName("Button");
		Button14F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14F.setForeground(Color.BLACK);
		Button14F.setBackground(Color.WHITE);
		Button14F.setBounds(665, 573, 75, 20);
		frame.getContentPane().add(Button14F);
		
		
		JButton ClearButton = new JButton("Clear");
		ClearButton.setName("Clear Button");
		ClearButton.addActionListener(new GUIController_SeatingPlanDeparture());
		ClearButton.setForeground(Color.BLACK);
		ClearButton.setBackground(Color.WHITE);
		ClearButton.setBounds(850, 565, 120, 30);
		frame.getContentPane().add(ClearButton);


		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setBounds(0, 0, 1000, 624);
		frame.getContentPane().add(Background);
		
	}

	private void initializeBoeing() {
		spc = new Data_SeatingPlan();
		allSeatsDeparture = new ArrayList <JButton>();

		frame = new JFrame();
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 990, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Seating Plan For Departure Flight");


		JButton PreviousPageSP1 = new JButton("BACK");
		PreviousPageSP1.setBounds(0, 110, 117, 29);
		PreviousPageSP1.setName("PreviousPageSP1");
		PreviousPageSP1.addActionListener(new GUIController_SeatingPlanDeparture());
		frame.getContentPane().add(PreviousPageSP1);


		JButton NextPageSP1 = new JButton("NEXT PAGE");
		NextPageSP1.addActionListener(new GUIController_SeatingPlanDeparture());
		NextPageSP1.setName("NextPageSP1");
		NextPageSP1.setBounds(877, 110, 117, 29);
		frame.getContentPane().add(NextPageSP1);


		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(719, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		progressBar.setIndeterminate(true);
		int newLength = 4;
		progressBar.setMaximum(newLength);
		int newValue = 2;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);


		JLabel lblNewLabel_1 = new JLabel("Choose your departure seat below:");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel_1.setBounds(375, 115, 250, 20);
		frame.getContentPane().add(lblNewLabel_1);


		JLabel FirstClass = new JLabel("First Class:");
		FirstClass.setHorizontalAlignment(SwingConstants.CENTER);
		FirstClass.setForeground(Color.WHITE);
		FirstClass.setBounds(182, 218, 100, 20);
		frame.getContentPane().add(FirstClass);


		JLabel Business = new JLabel("Business:");
		Business.setHorizontalAlignment(SwingConstants.CENTER);
		Business.setForeground(Color.WHITE);
		Business.setBounds(182, 398, 100, 20);
		frame.getContentPane().add(Business);

		JLabel Economy = new JLabel("Economy:");
		Economy.setHorizontalAlignment(SwingConstants.CENTER);
		Economy.setForeground(Color.WHITE);
		Economy.setBounds(645, 258, 100, 20);
		frame.getContentPane().add(Economy);

		JButton Button1A = new JButton("1A");
		allSeatsDeparture.add(Button1A);
		Button1A.setName("Button");
		Button1A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button1A.setBackground(Color.BLACK);
		Button1A.setForeground(Color.BLACK);
		Button1A.setBounds(147, 248, 75, 20);
		frame.getContentPane().add(Button1A);

		JButton Button2A = new JButton("2A");
		allSeatsDeparture.add(Button2A);
		Button2A.setName("Button");
		Button2A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button2A.setForeground(Color.BLACK);
		Button2A.setBackground(Color.WHITE);
		Button2A.setBounds(147, 273, 75, 20);
		frame.getContentPane().add(Button2A);

		JButton Button3A = new JButton("3A");
		allSeatsDeparture.add(Button3A);
		Button3A.setName("Button");
		Button3A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button3A.setForeground(Color.BLACK);
		Button3A.setBackground(Color.WHITE);
		Button3A.setBounds(147, 298, 75, 20);
		frame.getContentPane().add(Button3A);

		JButton Button4A = new JButton("4A");
		allSeatsDeparture.add(Button4A);
		Button4A.setName("Button");
		Button4A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button4A.setForeground(Color.BLACK);
		Button4A.setBackground(Color.WHITE);
		Button4A.setBounds(147, 323, 75, 20);
		frame.getContentPane().add(Button4A);

		JButton Button5A = new JButton("5A");
		allSeatsDeparture.add(Button5A);
		Button5A.setName("Button");
		Button5A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button5A.setForeground(Color.BLACK);
		Button5A.setBackground(Color.WHITE);
		Button5A.setBounds(147, 348, 75, 20);
		frame.getContentPane().add(Button5A);

		JButton Button6A = new JButton("6A");
		allSeatsDeparture.add(Button6A);
		Button6A.setName("Button");
		Button6A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6A.setForeground(Color.BLACK);
		Button6A.setBackground(Color.WHITE);
		Button6A.setBounds(60, 428, 75, 20);
		frame.getContentPane().add(Button6A);

		JButton Button7A = new JButton("7A");
		allSeatsDeparture.add(Button7A);
		Button7A.setName("Button");
		Button7A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7A.setForeground(Color.BLACK);
		Button7A.setBackground(Color.WHITE);
		Button7A.setBounds(60, 453, 75, 20);
		frame.getContentPane().add(Button7A);

		JButton Button8A = new JButton("8A");
		allSeatsDeparture.add(Button8A);
		Button8A.setName("Button");
		Button8A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8A.setForeground(Color.BLACK);
		Button8A.setBackground(Color.WHITE);
		Button8A.setBounds(60, 478, 75, 20);
		frame.getContentPane().add(Button8A);

		JButton Button9A = new JButton("9A");
		allSeatsDeparture.add(Button9A);
		Button9A.setName("Button");
		Button9A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9A.setForeground(Color.BLACK);
		Button9A.setBackground(Color.WHITE);
		Button9A.setBounds(60, 503, 75, 20);
		frame.getContentPane().add(Button9A);

		JButton Button10A = new JButton("10A");
		allSeatsDeparture.add(Button10A);
		Button10A.setName("Button");
		Button10A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10A.setForeground(Color.BLACK);
		Button10A.setBackground(Color.WHITE);
		Button10A.setBounds(60, 528, 75, 20);
		frame.getContentPane().add(Button10A);

		JButton Button11A = new JButton("11A");
		allSeatsDeparture.add(Button11A);
		Button11A.setName("Button");
		Button11A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11A.setForeground(Color.BLACK);
		Button11A.setBackground(Color.WHITE);
		Button11A.setBounds(450, 288, 75, 20);
		frame.getContentPane().add(Button11A);

		JButton Button12A = new JButton("12A");
		allSeatsDeparture.add(Button12A);
		Button12A.setName("Button");
		Button12A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12A.setForeground(Color.BLACK);
		Button12A.setBackground(Color.WHITE);
		Button12A.setBounds(450, 313, 75, 20);
		frame.getContentPane().add(Button12A);

		JButton Button13A = new JButton("13A");
		allSeatsDeparture.add(Button13A);
		Button13A.setName("Button");
		Button13A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13A.setForeground(Color.BLACK);
		Button13A.setBackground(Color.WHITE);
		Button13A.setBounds(450, 338, 75, 20);
		frame.getContentPane().add(Button13A);

		JButton Button14A = new JButton("14A");
		allSeatsDeparture.add(Button14A);
		Button14A.setName("Button");
		Button14A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14A.setForeground(Color.BLACK);
		Button14A.setBackground(Color.WHITE);
		Button14A.setBounds(450, 363, 75, 20);
		frame.getContentPane().add(Button14A);

		JButton Button15A = new JButton("15A");
		allSeatsDeparture.add(Button15A);
		Button15A.setName("Button");
		Button15A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button15A.setForeground(Color.BLACK);
		Button15A.setBackground(Color.WHITE);
		Button15A.setBounds(450, 388, 75, 20);
		frame.getContentPane().add(Button15A);

		JButton Button16A = new JButton("16A");
		allSeatsDeparture.add(Button16A);
		Button16A.setName("Button");
		Button16A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button16A.setForeground(Color.BLACK);
		Button16A.setBackground(Color.WHITE);
		Button16A.setBounds(450, 413, 75, 20);
		frame.getContentPane().add(Button16A);

		JButton Button17A = new JButton("17A");
		allSeatsDeparture.add(Button17A);
		Button17A.setName("Button");
		Button17A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button17A.setForeground(Color.BLACK);
		Button17A.setBackground(Color.WHITE);
		Button17A.setBounds(450, 438, 75, 20);
		frame.getContentPane().add(Button17A);

		JButton Button18A = new JButton("18A");
		allSeatsDeparture.add(Button18A);
		Button18A.setName("Button");
		Button18A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button18A.setForeground(Color.BLACK);
		Button18A.setBackground(Color.WHITE);
		Button18A.setBounds(450, 463, 75, 20);
		frame.getContentPane().add(Button18A);

		JButton Button19A = new JButton("19A");
		allSeatsDeparture.add(Button19A);
		Button19A.setName("Button");
		Button19A.addActionListener(new GUIController_SeatingPlanDeparture());
		Button19A.setForeground(Color.BLACK);
		Button19A.setBackground(Color.WHITE);
		Button19A.setBounds(450, 488, 75, 20);
		frame.getContentPane().add(Button19A);

		JButton Button1B = new JButton("1B");
		allSeatsDeparture.add(Button1B);
		Button1B.setName("Button");
		Button1B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button1B.setForeground(Color.BLACK);
		Button1B.setBackground(Color.WHITE);
		Button1B.setBounds(242, 248, 75, 20);
		frame.getContentPane().add(Button1B);

		JButton Button2B = new JButton("2B");
		allSeatsDeparture.add(Button2B);
		Button2B.setName("Button");
		Button2B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button2B.setForeground(Color.BLACK);
		Button2B.setBackground(Color.WHITE);
		Button2B.setBounds(242, 273, 75, 20);
		frame.getContentPane().add(Button2B);

		JButton Button3B = new JButton("3B");
		allSeatsDeparture.add(Button3B);
		Button3B.setName("Button");
		Button3B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button3B.setForeground(Color.BLACK);
		Button3B.setBackground(Color.WHITE);
		Button3B.setBounds(242, 298, 75, 20);
		frame.getContentPane().add(Button3B);

		JButton Button4B = new JButton("4B");
		allSeatsDeparture.add(Button4B);
		Button4B.setName("Button");
		Button4B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button4B.setForeground(Color.BLACK);
		Button4B.setBackground(Color.WHITE);
		Button4B.setBounds(242, 323, 75, 20);
		frame.getContentPane().add(Button4B);

		JButton Button5B = new JButton("5B");
		allSeatsDeparture.add(Button5B);
		Button5B.setName("Button");
		Button5B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button5B.setForeground(Color.BLACK);
		Button5B.setBackground(Color.WHITE);
		Button5B.setBounds(242, 348, 75, 20);
		frame.getContentPane().add(Button5B);

		JButton Button6B = new JButton("6B");
		allSeatsDeparture.add(Button6B);
		Button6B.setName("Button");
		Button6B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6B.setForeground(Color.BLACK);
		Button6B.setBackground(Color.WHITE);
		Button6B.setBounds(155, 428, 75, 20);
		frame.getContentPane().add(Button6B);

		JButton Button7B = new JButton("7B");
		allSeatsDeparture.add(Button7B);
		Button7B.setName("Button");
		Button7B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7B.setForeground(Color.BLACK);
		Button7B.setBackground(Color.WHITE);
		Button7B.setBounds(155, 453, 75, 20);
		frame.getContentPane().add(Button7B);

		JButton Button8B = new JButton("8B");
		allSeatsDeparture.add(Button8B);
		Button8B.setName("Button");
		Button8B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8B.setForeground(Color.BLACK);
		Button8B.setBackground(Color.WHITE);
		Button8B.setBounds(155, 478, 75, 20);
		frame.getContentPane().add(Button8B);

		JButton Button9B = new JButton("9B");
		allSeatsDeparture.add(Button9B);
		Button9B.setName("Button");
		Button9B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9B.setForeground(Color.BLACK);
		Button9B.setBackground(Color.WHITE);
		Button9B.setBounds(155, 503, 75, 20);
		frame.getContentPane().add(Button9B);

		JButton Button10B = new JButton("10B");
		allSeatsDeparture.add(Button10B);
		Button10B.setName("Button");
		Button10B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10B.setForeground(Color.BLACK);
		Button10B.setBackground(Color.WHITE);
		Button10B.setBounds(155, 528, 75, 20);
		frame.getContentPane().add(Button10B);

		JButton Button11B = new JButton("11B");
		allSeatsDeparture.add(Button11B);
		Button11B.setName("Button");
		Button11B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11B.setForeground(Color.BLACK);
		Button11B.setBackground(Color.WHITE);
		Button11B.setBounds(530, 288, 75, 20);
		frame.getContentPane().add(Button11B);

		JButton Button12B = new JButton("12B");
		allSeatsDeparture.add(Button12B);
		Button12B.setName("Button");
		Button12B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12B.setForeground(Color.BLACK);
		Button12B.setBackground(Color.WHITE);
		Button12B.setBounds(530, 313, 75, 20);
		frame.getContentPane().add(Button12B);

		JButton Button13B = new JButton("13B");
		allSeatsDeparture.add(Button13B);
		Button13B.setName("Button");
		Button13B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13B.setForeground(Color.BLACK);
		Button13B.setBackground(Color.WHITE);
		Button13B.setBounds(530, 338, 75, 20);
		frame.getContentPane().add(Button13B);

		JButton Button14B = new JButton("14B");
		allSeatsDeparture.add(Button14B);
		Button14B.setName("Button");
		Button14B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14B.setForeground(Color.BLACK);
		Button14B.setBackground(Color.WHITE);
		Button14B.setBounds(530, 363, 75, 20);
		frame.getContentPane().add(Button14B);

		JButton Button15B = new JButton("15B");
		allSeatsDeparture.add(Button15B);
		Button15B.setName("Button");
		Button15B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button15B.setForeground(Color.BLACK);
		Button15B.setBackground(Color.WHITE);
		Button15B.setBounds(530, 388, 75, 20);
		frame.getContentPane().add(Button15B);

		JButton Button16B = new JButton("16B");
		allSeatsDeparture.add(Button14B);
		Button16B.setName("Button");
		Button16B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button16B.setForeground(Color.BLACK);
		Button16B.setBackground(Color.WHITE);
		Button16B.setBounds(530, 413, 75, 20);
		frame.getContentPane().add(Button16B);

		JButton Button17B = new JButton("17B");
		allSeatsDeparture.add(Button17B);
		Button17B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button17B.setName("Button");
		Button17B.setForeground(Color.BLACK);
		Button17B.setBackground(Color.WHITE);
		Button17B.setBounds(530, 438, 75, 20);
		frame.getContentPane().add(Button17B);

		JButton Button18B = new JButton("18B");
		allSeatsDeparture.add(Button18B);
		Button18B.setName("Button");
		Button18B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button18B.setForeground(Color.BLACK);
		Button18B.setBackground(Color.WHITE);
		Button18B.setBounds(530, 463, 75, 20);
		frame.getContentPane().add(Button18B);

		JButton Button19B = new JButton("19B");
		allSeatsDeparture.add(Button19B);
		Button19B.setName("Button");
		Button19B.addActionListener(new GUIController_SeatingPlanDeparture());
		Button19B.setForeground(Color.BLACK);
		Button19B.setBackground(Color.WHITE);
		Button19B.setBounds(530, 488, 75, 20);
		frame.getContentPane().add(Button19B);

		JButton Button6C = new JButton("6C");
		allSeatsDeparture.add(Button6C);
		Button6C.setName("Button");
		Button6C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6C.setForeground(Color.BLACK);
		Button6C.setBackground(Color.WHITE);
		Button6C.setBounds(235, 428, 75, 20);
		frame.getContentPane().add(Button6C);

		JButton Button7C = new JButton("7C");
		allSeatsDeparture.add(Button7C);
		Button7C.setName("Button");
		Button7C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7C.setForeground(Color.BLACK);
		Button7C.setBackground(Color.WHITE);
		Button7C.setBounds(235, 453, 75, 20);
		frame.getContentPane().add(Button7C);

		JButton Button8C = new JButton("8C");
		allSeatsDeparture.add(Button8C);
		Button8C.setName("Button");
		Button8C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8C.setForeground(Color.BLACK);
		Button8C.setBackground(Color.WHITE);
		Button8C.setBounds(235, 478, 75, 20);
		frame.getContentPane().add(Button8C);

		JButton Button9C = new JButton("9C");
		allSeatsDeparture.add(Button9C);
		Button9C.setName("Button");
		Button9C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9C.setForeground(Color.BLACK);
		Button9C.setBackground(Color.WHITE);
		Button9C.setBounds(235, 503, 75, 20);
		frame.getContentPane().add(Button9C);

		JButton Button10C = new JButton("10C");
		allSeatsDeparture.add(Button10C);
		Button10C.setName("Button");
		Button10C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10C.setForeground(Color.BLACK);
		Button10C.setBackground(Color.WHITE);
		Button10C.setBounds(235, 528, 75, 20);
		frame.getContentPane().add(Button10C);

		JButton Button11C = new JButton("11C");
		allSeatsDeparture.add(Button11C);
		Button11C.setName("Button");
		Button11C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11C.setForeground(Color.BLACK);
		Button11C.setBackground(Color.WHITE);
		Button11C.setBounds(610, 288, 75, 20);
		frame.getContentPane().add(Button11C);

		JButton Button12C = new JButton("12C");
		allSeatsDeparture.add(Button12C);
		Button12C.setName("Button");
		Button12C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12C.setForeground(Color.BLACK);
		Button12C.setBackground(Color.WHITE);
		Button12C.setBounds(610, 313, 75, 20);
		frame.getContentPane().add(Button12C);

		JButton Button13C = new JButton("13C");
		allSeatsDeparture.add(Button13C);
		Button13C.setName("Button");
		Button13C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13C.setForeground(Color.BLACK);
		Button13C.setBackground(Color.WHITE);
		Button13C.setBounds(610, 338, 75, 20);
		frame.getContentPane().add(Button13C);

		JButton Button14C = new JButton("14C");
		allSeatsDeparture.add(Button14C);
		Button14C.setName("Button");
		Button14C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14C.setForeground(Color.BLACK);
		Button14C.setBackground(Color.WHITE);
		Button14C.setBounds(610, 363, 75, 20);
		frame.getContentPane().add(Button14C);

		JButton Button15C = new JButton("15C");
		allSeatsDeparture.add(Button15C);
		Button15C.setName("Button");
		Button15C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button15C.setForeground(Color.BLACK);
		Button15C.setBackground(Color.WHITE);
		Button15C.setBounds(610, 388, 75, 20);
		frame.getContentPane().add(Button15C);

		JButton Button16C = new JButton("16C");
		allSeatsDeparture.add(Button16C);
		Button16C.setName("Button");
		Button16C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button16C.setForeground(Color.BLACK);
		Button16C.setBackground(Color.WHITE);
		Button16C.setBounds(610, 413, 75, 20);
		frame.getContentPane().add(Button16C);

		JButton Button17C = new JButton("17C");
		allSeatsDeparture.add(Button17C);
		Button17C.setName("Button");
		Button17C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button17C.setForeground(Color.BLACK);
		Button17C.setBackground(Color.WHITE);
		Button17C.setBounds(610, 438, 75, 20);
		frame.getContentPane().add(Button17C);

		JButton Button18C = new JButton("18C");
		allSeatsDeparture.add(Button18C);
		Button18C.setName("Button");
		Button18C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button18C.setForeground(Color.BLACK);
		Button18C.setBackground(Color.WHITE);
		Button18C.setBounds(610, 463, 75, 20);
		frame.getContentPane().add(Button18C);

		JButton Button19C = new JButton("19C");
		allSeatsDeparture.add(Button19C);
		Button19C.setName("Button");
		Button19C.addActionListener(new GUIController_SeatingPlanDeparture());
		Button19C.setForeground(Color.BLACK);
		Button19C.setBackground(Color.WHITE);
		Button19C.setBounds(610, 488, 75, 20);
		frame.getContentPane().add(Button19C);

		JButton Button6D = new JButton("6D");
		allSeatsDeparture.add(Button6D);
		Button6D.setName("Button");
		Button6D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button6D.setForeground(Color.BLACK);
		Button6D.setBackground(Color.WHITE);
		Button6D.setBounds(330, 428, 75, 20);
		frame.getContentPane().add(Button6D);

		JButton Button7D = new JButton("7D");
		allSeatsDeparture.add(Button7D);
		Button7D.setName("Button");
		Button7D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button7D.setForeground(Color.BLACK);
		Button7D.setBackground(Color.WHITE);
		Button7D.setBounds(330, 453, 75, 20);
		frame.getContentPane().add(Button7D);

		JButton Button8D = new JButton("8D");
		allSeatsDeparture.add(Button8D);
		Button8D.setName("Button");
		Button8D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button8D.setForeground(Color.BLACK);
		Button8D.setBackground(Color.WHITE);
		Button8D.setBounds(330, 478, 75, 20);
		frame.getContentPane().add(Button8D);

		JButton Button9D = new JButton("9D");
		allSeatsDeparture.add(Button9D);
		Button9D.setName("Button");
		Button9D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button9D.setForeground(Color.BLACK);
		Button9D.setBackground(Color.WHITE);
		Button9D.setBounds(330, 503, 75, 20);
		frame.getContentPane().add(Button9D);

		JButton Button10D = new JButton("10D");
		allSeatsDeparture.add(Button10D);
		Button10D.setName("Button");
		Button10D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button10D.setForeground(Color.BLACK);
		Button10D.setBackground(Color.WHITE);
		Button10D.setBounds(330, 528, 75, 20);
		frame.getContentPane().add(Button10D);

		JButton Button11D = new JButton("11D");
		allSeatsDeparture.add(Button11D);
		Button11D.setName("Button");
		Button11D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11D.setForeground(Color.BLACK);
		Button11D.setBackground(Color.WHITE);
		Button11D.setBounds(705, 288, 75, 20);
		frame.getContentPane().add(Button11D);

		JButton Button12D = new JButton("12D");
		allSeatsDeparture.add(Button12D);
		Button12D.setName("Button");
		Button12D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12D.setForeground(Color.BLACK);
		Button12D.setBackground(Color.WHITE);
		Button12D.setBounds(705, 313, 75, 20);
		frame.getContentPane().add(Button12D);

		JButton Button13D = new JButton("13D");
		allSeatsDeparture.add(Button13D);
		Button13D.setName("Button");
		Button13D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13D.setForeground(Color.BLACK);
		Button13D.setBackground(Color.WHITE);
		Button13D.setBounds(705, 338, 75, 20);
		frame.getContentPane().add(Button13D);

		JButton Button14D = new JButton("14D");
		allSeatsDeparture.add(Button14D);
		Button14D.setName("Button");
		Button14D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14D.setForeground(Color.BLACK);
		Button14D.setBackground(Color.WHITE);
		Button14D.setBounds(705, 363, 75, 20);
		frame.getContentPane().add(Button14D);

		JButton Button15D = new JButton("15D");
		allSeatsDeparture.add(Button15D);
		Button15D.setName("Button");
		Button15D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button15D.setForeground(Color.BLACK);
		Button15D.setBackground(Color.WHITE);
		Button15D.setBounds(705, 388, 75, 20);
		frame.getContentPane().add(Button15D);

		JButton Button16D = new JButton("16D");
		allSeatsDeparture.add(Button16D);
		Button16D.setName("Button");
		Button16D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button16D.setForeground(Color.BLACK);
		Button16D.setBackground(Color.WHITE);
		Button16D.setBounds(705, 413, 75, 20);
		frame.getContentPane().add(Button16D);

		JButton Button17D = new JButton("17D");
		allSeatsDeparture.add(Button17D);
		Button17D.setName("Button");
		Button17D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button17D.setForeground(Color.BLACK);
		Button17D.setBackground(Color.WHITE);
		Button17D.setBounds(705, 438, 75, 20);
		frame.getContentPane().add(Button17D);

		JButton Button18D = new JButton("18D");
		allSeatsDeparture.add(Button18D);
		Button18D.setName("Button");
		Button18D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button18D.setForeground(Color.BLACK);
		Button18D.setBackground(Color.WHITE);
		Button18D.setBounds(705, 463, 75, 20);
		frame.getContentPane().add(Button18D);

		JButton Button19D = new JButton("19D");
		allSeatsDeparture.add(Button19D);
		Button19D.setName("Button");
		Button19D.addActionListener(new GUIController_SeatingPlanDeparture());
		Button19D.setForeground(Color.BLACK);
		Button19D.setBackground(Color.WHITE);
		Button19D.setBounds(705, 488, 75, 20);
		frame.getContentPane().add(Button19D);

		JButton Button11E = new JButton("11E");
		allSeatsDeparture.add(Button11E);
		Button11E.setName("Button");
		Button11E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11E.setForeground(Color.BLACK);
		Button11E.setBackground(Color.WHITE);
		Button11E.setBounds(785, 288, 75, 20);
		frame.getContentPane().add(Button11E);

		JButton Button12E = new JButton("12E");
		allSeatsDeparture.add(Button12E);
		Button12E.setName("Button");
		Button12E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12E.setForeground(Color.BLACK);
		Button12E.setBackground(Color.WHITE);
		Button12E.setBounds(785, 313, 75, 20);
		frame.getContentPane().add(Button12E);

		JButton Button13E = new JButton("13E");
		allSeatsDeparture.add(Button13E);
		Button13E.setName("Button");
		Button13E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13E.setForeground(Color.BLACK);
		Button13E.setBackground(Color.WHITE);
		Button13E.setBounds(785, 338, 75, 20);
		frame.getContentPane().add(Button13E);

		JButton Button14E = new JButton("14E");
		allSeatsDeparture.add(Button14E);
		Button14E.setName("Button");
		Button14E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14E.setForeground(Color.BLACK);
		Button14E.setBackground(Color.WHITE);
		Button14E.setBounds(785, 363, 75, 20);
		frame.getContentPane().add(Button14E);

		JButton Button15E = new JButton("15E");
		allSeatsDeparture.add(Button15E);
		Button15E.setName("Button");
		Button15E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button15E.setForeground(Color.BLACK);
		Button15E.setBackground(Color.WHITE);
		Button15E.setBounds(785, 388, 75, 20);
		frame.getContentPane().add(Button15E);

		JButton Button16E = new JButton("16E");
		allSeatsDeparture.add(Button16E);
		Button16E.setName("Button");
		Button16E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button16E.setForeground(Color.BLACK);
		Button16E.setBackground(Color.WHITE);
		Button16E.setBounds(785, 413, 75, 20);
		frame.getContentPane().add(Button16E);

		JButton Button17E = new JButton("17E");
		allSeatsDeparture.add(Button17E);
		Button17E.setName("Button");
		Button17E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button17E.setForeground(Color.BLACK);
		Button17E.setBackground(Color.WHITE);
		Button17E.setBounds(785, 438, 75, 20);
		frame.getContentPane().add(Button17E);

		JButton Button18E = new JButton("18E");
		allSeatsDeparture.add(Button18E);
		Button18E.setName("Button");
		Button18E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button18E.setForeground(Color.BLACK);
		Button18E.setBackground(Color.WHITE);
		Button18E.setBounds(785, 463, 75, 20);
		frame.getContentPane().add(Button18E);

		JButton Button19E = new JButton("19E");
		allSeatsDeparture.add(Button19E);
		Button19E.setName("Button");
		Button19E.addActionListener(new GUIController_SeatingPlanDeparture());
		Button19E.setForeground(Color.BLACK);
		Button19E.setBackground(Color.WHITE);
		Button19E.setBounds(785, 488, 75, 20);
		frame.getContentPane().add(Button19E);

		JButton Button11F = new JButton("11F");
		allSeatsDeparture.add(Button11F);
		Button11F.setName("Button");
		Button11F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button11F.setForeground(Color.BLACK);
		Button11F.setBackground(Color.WHITE);
		Button11F.setBounds(865, 288, 75, 20);
		frame.getContentPane().add(Button11F);

		JButton Button12F = new JButton("12F");
		allSeatsDeparture.add(Button12F);
		Button12F.setName("Button");
		Button12F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button12F.setForeground(Color.BLACK);
		Button12F.setBackground(Color.WHITE);
		Button12F.setBounds(865, 313, 75, 20);
		frame.getContentPane().add(Button12F);

		JButton Button13F = new JButton("13F");
		allSeatsDeparture.add(Button13F);
		Button13F.setName("Button");
		Button13F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button13F.setForeground(Color.BLACK);
		Button13F.setBackground(Color.WHITE);
		Button13F.setBounds(865, 338, 75, 20);
		frame.getContentPane().add(Button13F);

		JButton Button14F = new JButton("14F");
		allSeatsDeparture.add(Button14F);
		Button14F.setName("Button");
		Button14F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button14F.setForeground(Color.BLACK);
		Button14F.setBackground(Color.WHITE);
		Button14F.setBounds(865, 363, 75, 20);
		frame.getContentPane().add(Button14F);

		JButton Button15F = new JButton("15F");
		allSeatsDeparture.add(Button15F);
		Button15F.setName("Button");
		Button15F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button15F.setForeground(Color.BLACK);
		Button15F.setBackground(Color.WHITE);
		Button15F.setBounds(865, 388, 75, 20);
		frame.getContentPane().add(Button15F);

		JButton Button16F = new JButton("16F");
		allSeatsDeparture.add(Button16F);
		Button16F.setName("Button");
		Button16F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button16F.setForeground(Color.BLACK);
		Button16F.setBackground(Color.WHITE);
		Button16F.setBounds(865, 413, 75, 20);
		frame.getContentPane().add(Button16F);

		JButton Button17F = new JButton("17F");
		allSeatsDeparture.add(Button17F);
		Button17F.setName("Button");
		Button17F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button17F.setForeground(Color.BLACK);
		Button17F.setBackground(Color.WHITE);
		Button17F.setBounds(865, 438, 75, 20);
		frame.getContentPane().add(Button17F);

		JButton Button18F = new JButton("18F");
		allSeatsDeparture.add(Button18F);
		Button18F.setName("Button");
		Button18F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button18F.setForeground(Color.BLACK);
		Button18F.setBackground(Color.WHITE);
		Button18F.setBounds(865, 463, 75, 20);
		frame.getContentPane().add(Button18F);

		JButton Button19F = new JButton("19F");
		allSeatsDeparture.add(Button19F);
		Button19F.setName("Button");
		Button19F.addActionListener(new GUIController_SeatingPlanDeparture());
		Button19F.setForeground(Color.BLACK);
		Button19F.setBackground(Color.WHITE);
		Button19F.setBounds(865, 488, 75, 20);
		frame.getContentPane().add(Button19F);
		

		JButton ClearButton = new JButton("Clear");
		ClearButton.setName("Clear Button");
		ClearButton.addActionListener(new GUIController_SeatingPlanDeparture());
		ClearButton.setForeground(Color.BLACK);
		ClearButton.setBackground(Color.WHITE);
		ClearButton.setBounds(820, 545, 120, 20);
		frame.getContentPane().add(ClearButton);
		

		// Blue starts at 142
		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setBounds(0, 0, 1000, 624);
		frame.getContentPane().add(Background);

	}

	private void checkSeats() {
		
		if (spc == null || spc.DSeatNameList == null || spc.DSeatNameList.isEmpty()) {
			
			System.out.println("----------");
			System.out.println("All seats available");
			System.out.println("----------");
			System.out.println();
			
		} else {
			for (int i = 0; i < SelectedSeatsDeparture.size(); i++) {
				SelectedSeatsDeparture.get(i).setEnabled(false);
			}
			
			/*
			for (int i = 0; i < spc.DSeatNameList.size(); i++) {

				System.out.println("----------");
				System.out.println(spc.DSeatNameList.get(i));
				System.out.println("----------");


				for (int j = 0; j < SelectedSeatsDeparture.size(); j++) {

					System.out.println("----------");
					System.out.println(SelectedSeatsDeparture.get(j).getText() + " " + spc.DSeatNameList.get(i));
					System.out.println("----------");

					if (SelectedSeatsDeparture.get(j).getText().contentEquals(spc.DSeatNameList.get(i))) {
						SelectedSeatsDeparture.get(j).setEnabled(false);
					}
				}
			}
		*/
		}
		
	}

}