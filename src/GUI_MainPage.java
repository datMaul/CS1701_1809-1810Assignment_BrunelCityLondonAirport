

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class GUI_MainPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Data_CSVReader.LoadCSVFile();
					GUI_MainPage window = new GUI_MainPage();
					window.frame.setVisible(true);
				} catch (Exception MainPage) {
					MainPage.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI_MainPage() {
		
		System.out.println("Brunel City Airport Main Page");
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
		frame.setTitle("WELCOME TO BRUNEL CITY AIRPORT");


		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(835, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		progressBar.setIndeterminate(true);
		int newLength = 4;
		progressBar.setMaximum(newLength);
		int newValue = 0;
		progressBar.setValue(newValue);
		progressBar.setIndeterminate(false);



		JButton BookAFlight = new JButton("Book A Flight");
		BookAFlight.setName("BookAFlight");
		BookAFlight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("Next Page");
					System.out.println();
					
					GUI_BookingPage window = new GUI_BookingPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception BookingPage) {
					BookingPage.printStackTrace();
				}
			}
		});
		BookAFlight.setBounds(375, 238, 250, 120);
		frame.getContentPane().add(BookAFlight);



		JButton CheckIn = new JButton("Check-In");
		CheckIn.setName("CheckIn");
		CheckIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					System.out.println("Next Page");
					System.out.println();
					
					GUI_CheckInPage window = new GUI_CheckInPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception CheckInPage) {
					CheckInPage.printStackTrace();
				}
			}
		});
		CheckIn.setBounds(375, 398, 250, 120);
		frame.getContentPane().add(CheckIn);



		// Blue starts at 142
		ImageIcon image = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(image);
		Background.setBounds(0, 0, 1000, 624);
		frame.getContentPane().add(Background);
	}
}
