

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import java.awt.Font;

public class GUI_ShopBasketPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASSIGNMENT_APP_SHOPBASKET window = new ASSIGNMENT_APP_SHOPBASKET();
					window.frame.setVisible(true);
				} catch (Exception ShopBasket) {
					ShopBasket.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GUI_ShopBasketPage() {
		
		System.out.println("Shop Basket");
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
		frame.setTitle("My Basket");
		frame.getContentPane().setLayout(null);

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(835, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		//when the task of (initially) unknown length begins:
		progressBar.setIndeterminate(true);
		int newLength = 5;
		//do some work; get length of task...
		progressBar.setMaximum(newLength);
		int newValue = 3;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);

		// option for user to go back to previous page
		JButton PreviousPage = new JButton("BACK");
		PreviousPage.setBounds(0, 110, 117, 29);
		PreviousPage.setName("Back");
		PreviousPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				System.out.println("Previous Page");
				System.out.println();
				
				try {
					GUI_ShopPage window = new GUI_ShopPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception Shop) {
					Shop.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(PreviousPage);

		//header for page
		JLabel lblNewLabel = new JLabel("My Basket");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 30));
		lblNewLabel.setBounds(432, 170, 150, 28);
		frame.getContentPane().add(lblNewLabel);

		// products selected by user will be displayed in the panel below
		JPanel panel = new JPanel();
		panel.setBounds(244, 234, 522, 259);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		//Button for user to view their basket
		JButton ViewBasketBtn = new JButton("View Basket");
		ViewBasketBtn.addActionListener(new Action1());
		ViewBasketBtn.setBounds(173, 96, 200, 40);
		panel.add(ViewBasketBtn);
		
		//Button will generate a random reference number which will be linked to the users basket array 

		JButton button = new JButton("Generate Basket Reference");	
		
		//When the button is clicked, Action will be called - in this case it will open a new frame to display the user information about their basket reference number
		button.addActionListener(new Action2());
		button.setBounds(412, 525, 200, 40);
		frame.getContentPane().add(button);

		// Background
		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setBounds(0, 0, 1000, 624);
		Background.setText("");
		frame.getContentPane().add(Background);
	}

//	ActionListener is a class that handles events created by the user.
//	ie, what happens when user clicks, enters a key, etc
	
//	NEED TO ADD SECTION / IF BASKET EMPTY, SHOW ERROR MESSAGE 'NO REFERENCE NUMBER AS YOUR BASKET IS EMPTY'
	
	
	class Action1 implements ActionListener{

		public void actionPerformed (ActionEvent e) {

			JFrame frame2 = new JFrame("View Basket");
			frame2.setVisible(true);
			frame2.setSize(500,400);
			JLabel labelx = new JLabel("Your basket includes:");
			JPanel panelx = new JPanel();
			//Output contents of basket array here
			JLabel labely = new JLabel();
			JPanel panely = new JPanel();
			frame2.add(panely);
			panelx.add(labely);
		}

	}
	
//	This class creates a new window that will display the users basket reference number
	static class Action2 implements ActionListener{
		
//		When action is performed, do xyz below
		public void actionPerformed (ActionEvent e) {
			
			//Random number generator that will create the users unique reference number for their basket
			int min = 10000;
			int max = 90000;
			
			int BasketReferenceNo = (int)Math.floor(Math.random()*(max-min+1)+min);
			
			//Pop up notification for the user to let them be aware of their reference number
			JFrame frame2 = new JFrame("Notification");
			frame2.setVisible(true);
			frame2.setSize(400,100);
			JLabel labelx = new JLabel("Your basket reference number is: " + BasketReferenceNo);
			JPanel panelx = new JPanel();
			frame2.getContentPane().add(panelx);
			panelx.add(labelx);
		}
		
	}
}