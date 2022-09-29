

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;

public class GUI_LastPage2 {

	JFrame frame;

	/**
	 * Launch the application.
	 */

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASSIGNMENT_APP_LAST_PAGE2 window = new ASSIGNMENT_APP_LAST_PAGE2();
					window.frame.setVisible(true);
				} catch (Exception LastPage2) {
					LastPage2.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GUI_LastPage2() {

		System.out.println("Last Page 2");
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
		frame.getContentPane().setLayout(null);
		frame.setTitle("Thanks For Your Purchase");

		ArrayList <Data_Flights> AllFlights = Data_CSVReader.getAllFlights();

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(835, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		//when the task of (initially) unknown length begins:
		progressBar.setIndeterminate(true);
		int newLength = 5;
		//do some work; get length of task...
		progressBar.setMaximum(newLength);
		int newValue = 5;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);



		JLabel ThanksForYourPurchase = new JLabel("THANKS FOR YOUR PURCHASE !!");
		ThanksForYourPurchase.setForeground(Color.WHITE);
		ThanksForYourPurchase.setHorizontalAlignment(SwingConstants.CENTER);
		ThanksForYourPurchase.setBounds(375, 270, 250, 20);
		frame.getContentPane().add(ThanksForYourPurchase);



		JButton PreviousPage = new JButton("BACK");
		PreviousPage.setName("Back");
		PreviousPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Previous Page");
				System.out.println();
				
				try {
					GUI_FinancePage window = new GUI_FinancePage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception Finance) {
					Finance.printStackTrace();
				}
			}
		});
		PreviousPage.setBounds(0, 110, 117, 29);
		frame.getContentPane().add(PreviousPage);



		JButton BackToMainPage4 = new JButton("BACK TO MAIN PAGE");
		BackToMainPage4.setName("BackToMainPage4");
		BackToMainPage4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					
					System.out.println("Back To Main Page 2");
					System.out.println();
					
					GUI_MainPage window = new GUI_MainPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception MainPage) {
					MainPage.printStackTrace();
				}

				for (int i = 0; i < AllFlights.size(); i++) {
//					if (AllFlights.get(i).getIsBeingProccessed() == true) {
//						AllFlights.get(i).setIsItCompleted(true);
//					}
				}

			}
		});
		BackToMainPage4.setBounds(375, 315, 250, 120);
		frame.getContentPane().add(BackToMainPage4);



		// Blue starts at 142
		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setText("OKEY ");
		Background.setBounds(0, 0, 1000, 624);
		frame.getContentPane().add(Background);
	}

}
