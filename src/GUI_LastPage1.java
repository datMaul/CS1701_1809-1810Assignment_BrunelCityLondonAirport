


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import java.awt.Color;

public class GUI_LastPage1 {

	JFrame frame;

	/**
	 * Launch the application.
	 */

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASSIGNMENT_APP_LAST_PAGE1 window = new ASSIGNMENT_APP_LAST_PAGE1();
					window.frame.setVisible(true);
				} catch (Exception LastPage1) {
					LastPage1.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GUI_LastPage1() {
		
		System.out.println("Last Page");
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



		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(835, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		//when the task of (initially) unknown length begins:
		progressBar.setIndeterminate(true);
		int newLength = 4;
		//do some work; get length of task...
		progressBar.setMaximum(newLength);
		int newValue = 4;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);



		JLabel ThanksForYourPurchase = new JLabel("FOR CHECK-IN PLEASE RETURN TO THE MAIN PAGE !!");
		ThanksForYourPurchase.setForeground(Color.WHITE);
		ThanksForYourPurchase.setHorizontalAlignment(SwingConstants.CENTER);
		ThanksForYourPurchase.setBounds(325, 270, 350, 20);
		frame.getContentPane().add(ThanksForYourPurchase);



		JButton PreviousPage = new JButton("BACK");
		PreviousPage.setName("Back");
		PreviousPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Previous Page");
				System.out.println();
				
				try {
					GUI_PassengersPage1 window = new GUI_PassengersPage1();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception Passengers) {
					Passengers.printStackTrace();
				}
			}
		});
		PreviousPage.setBounds(0, 110, 117, 29);
		frame.getContentPane().add(PreviousPage);



		JButton BackToMainPage3 = new JButton("BACK TO MAIN PAGE");
		BackToMainPage3.setName("BackToMainPage3");
		BackToMainPage3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Back To Main Page 1");
				System.out.println();
				
				try {
					GUI_MainPage window = new GUI_MainPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception MainPage) {
					MainPage.printStackTrace();
				}
			}
		});
		BackToMainPage3.setBounds(375, 315, 250, 120);
		frame.getContentPane().add(BackToMainPage3);



		// Blue starts at 142
		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setText("OKEY ");
		Background.setBounds(0, 0, 1000, 624);
		frame.getContentPane().add(Background);
	}
}
