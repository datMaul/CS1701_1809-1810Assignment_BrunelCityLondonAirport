

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JPanel;

public class GUI_ShopPage {

	JFrame frame;

	/**
	 * Launch the application.
	 */

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASSIGNMENT_APP_SHOP window = new ASSIGNMENT_APP_SHOP();
					window.frame.setVisible(true);
				} catch (Exception Shop) {
					Shop.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GUI_ShopPage() {
		
		System.out.println("Shop Page");
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
		frame.setTitle("Shop");
		frame.getContentPane().setLayout(null);


		// Progress Bar

		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(719, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		//when the task of (initially) unknown length begins:
		progressBar.setIndeterminate(true);
		int newLength = 5;
		//do some work; get length of task...
		progressBar.setMaximum(newLength);
		int newValue = 3;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);



		// Previous Page Button

		JButton PreviousPage = new JButton("BACK");
		PreviousPage.setBounds(0, 110, 117, 29);
		PreviousPage.setName("Back");
		PreviousPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUI_RestaurantPage window = new GUI_RestaurantPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception Restaurant) {
					Restaurant.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(PreviousPage);



		// Product Names

		JLabel MugTextLbl = new JLabel("Travel Mug");
		MugTextLbl.setForeground(Color.WHITE);
		MugTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		MugTextLbl.setBounds(175, 182, 160, 25);
		frame.getContentPane().add(MugTextLbl);



		JLabel BearTextLbl = new JLabel("Brunel Bear");
		BearTextLbl.setForeground(Color.WHITE);
		BearTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		BearTextLbl.setBounds(175, 291, 160, 25);
		frame.getContentPane().add(BearTextLbl);



		JLabel PillowTextLbl = new JLabel("Neck Pillow");
		PillowTextLbl.setForeground(Color.WHITE);
		PillowTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		PillowTextLbl.setBounds(175, 400, 160, 25);
		frame.getContentPane().add(PillowTextLbl);



		JLabel PowerBankTextLbl = new JLabel("Power Bank");
		PowerBankTextLbl.setForeground(Color.WHITE);
		PowerBankTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		PowerBankTextLbl.setBounds(175, 509, 160, 25);
		frame.getContentPane().add(PowerBankTextLbl);



		JLabel TravelBlanketTextLbl = new JLabel("Travel Blanket");
		TravelBlanketTextLbl.setForeground(Color.WHITE);
		TravelBlanketTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		TravelBlanketTextLbl.setBounds(465, 182, 160, 25);
		frame.getContentPane().add(TravelBlanketTextLbl);



		JLabel HeadphonesTextLbl = new JLabel("Headphones");
		HeadphonesTextLbl.setForeground(Color.WHITE);
		HeadphonesTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		HeadphonesTextLbl.setBounds(465, 291, 160, 25);
		frame.getContentPane().add(HeadphonesTextLbl);




		JLabel BluetoothTextLbl = new JLabel("Bluetooth Speaker");
		BluetoothTextLbl.setForeground(Color.WHITE);
		BluetoothTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		BluetoothTextLbl.setBounds(465, 400, 160, 25);
		frame.getContentPane().add(BluetoothTextLbl);



		JLabel WatchTextLbl = new JLabel("Luxury Watch");
		WatchTextLbl.setForeground(Color.WHITE);
		WatchTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		WatchTextLbl.setBounds(465, 509, 160, 24);
		frame.getContentPane().add(WatchTextLbl);



		JLabel JimmyTextLbl = new JLabel("Jimmy Choo");
		JimmyTextLbl.setForeground(Color.WHITE);
		JimmyTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		JimmyTextLbl.setBounds(755, 182, 160, 25);
		frame.getContentPane().add(JimmyTextLbl);



		JLabel HugoTextLbl = new JLabel("Hugo Boss");
		HugoTextLbl.setForeground(Color.WHITE);
		HugoTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		HugoTextLbl.setBounds(755, 291, 160, 25);
		frame.getContentPane().add(HugoTextLbl);



		JLabel RaybanWomanTextLbl = new JLabel("RayBan Women");
		RaybanWomanTextLbl.setForeground(Color.WHITE);
		RaybanWomanTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		RaybanWomanTextLbl.setBounds(755, 400, 160, 25);
		frame.getContentPane().add(RaybanWomanTextLbl);



		JLabel RaybanManTextLbl = new JLabel("RayBan Men");
		RaybanManTextLbl.setForeground(Color.WHITE);
		RaybanManTextLbl.setFont(new Font("PingFang HK", Font.BOLD, 17));
		RaybanManTextLbl.setBounds(755, 509, 160, 25);
		frame.getContentPane().add(RaybanManTextLbl);




		// Product Prices

		JLabel MugPriceLbl = new JLabel("£4.00");
		MugPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		MugPriceLbl.setForeground(Color.WHITE);
		MugPriceLbl.setBounds(175, 207, 160, 25);
		frame.getContentPane().add(MugPriceLbl);



		JLabel BearPriceLbl = new JLabel("£10.00");
		BearPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		BearPriceLbl.setForeground(Color.WHITE);
		BearPriceLbl.setBounds(175, 316, 160, 25);
		frame.getContentPane().add(BearPriceLbl);



		JLabel PillowPriceLbl = new JLabel("£8.00");
		PillowPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		PillowPriceLbl.setForeground(Color.WHITE);
		PillowPriceLbl.setBounds(175, 425, 160, 25);
		frame.getContentPane().add(PillowPriceLbl);



		JLabel PowerBankPriceLbl = new JLabel("£20.00");
		PowerBankPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		PowerBankPriceLbl.setForeground(Color.WHITE);
		PowerBankPriceLbl.setBounds(175, 534, 160, 25);
		frame.getContentPane().add(PowerBankPriceLbl);



		JLabel TravelBlanketPriceLbl = new JLabel("£6.00");
		TravelBlanketPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		TravelBlanketPriceLbl.setForeground(Color.WHITE);
		TravelBlanketPriceLbl.setBounds(465, 207, 160, 25);
		frame.getContentPane().add(TravelBlanketPriceLbl);



		JLabel HeadphonesPriceLbl = new JLabel("£90.00");
		HeadphonesPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		HeadphonesPriceLbl.setForeground(Color.WHITE);
		HeadphonesPriceLbl.setBounds(465, 316, 160, 25);
		frame.getContentPane().add(HeadphonesPriceLbl);



		JLabel BluetoothPriceLbl = new JLabel("£15.00");
		BluetoothPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		BluetoothPriceLbl.setForeground(Color.WHITE);
		BluetoothPriceLbl.setBounds(465, 425, 160, 25);
		frame.getContentPane().add(BluetoothPriceLbl);



		JLabel WatchPriceLbl = new JLabel("£200.00");
		WatchPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		WatchPriceLbl.setForeground(Color.WHITE);
		WatchPriceLbl.setBounds(465, 534, 160, 25);
		frame.getContentPane().add(WatchPriceLbl);



		JLabel JimmyPriceLbl = new JLabel("£35.00");
		JimmyPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		JimmyPriceLbl.setForeground(Color.WHITE);
		JimmyPriceLbl.setBounds(755, 207, 160, 25);
		frame.getContentPane().add(JimmyPriceLbl);



		JLabel HugoPriceLbl = new JLabel("£35.00");
		HugoPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		HugoPriceLbl.setForeground(Color.WHITE);
		HugoPriceLbl.setBounds(755, 316, 160, 25);
		frame.getContentPane().add(HugoPriceLbl);



		JLabel RaybanWomanPriceLbl = new JLabel("£49.00");
		RaybanWomanPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		RaybanWomanPriceLbl.setForeground(Color.WHITE);
		RaybanWomanPriceLbl.setBounds(755, 425, 160, 25);
		frame.getContentPane().add(RaybanWomanPriceLbl);



		JLabel RaybanManPriceLbl = new JLabel("£49.00");
		RaybanManPriceLbl.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		RaybanManPriceLbl.setForeground(Color.WHITE);
		RaybanManPriceLbl.setBounds(755, 534, 160, 25);
		frame.getContentPane().add(RaybanManPriceLbl);




		// Product images

		JLabel mugPic = new JLabel("");
		ImageIcon img = new ImageIcon(this.getClass().getResource("travelmug.png"));
		mugPic.setIcon(img);
		mugPic.setBounds(85,182,75,75);
		frame.getContentPane().add(mugPic);



		JLabel BearPic = new JLabel("");
		ImageIcon img1 = new ImageIcon(this.getClass().getResource("bear.png"));
		BearPic.setIcon(img1);
		BearPic.setBounds(85,291,75,75);
		frame.getContentPane().add(BearPic);



		JLabel PillowPic = new JLabel("");
		ImageIcon img2 = new ImageIcon(this.getClass().getResource("neckpillow.png"));
		PillowPic.setIcon(img2);
		PillowPic.setBounds(85,400,75,75);
		frame.getContentPane().add(PillowPic);



		JLabel PowerBankPic = new JLabel("");
		ImageIcon img3 = new ImageIcon(this.getClass().getResource("powerbank.png"));
		PowerBankPic.setIcon(img3);
		PowerBankPic.setBounds(85,509,75,75);
		frame.getContentPane().add(PowerBankPic);



		JLabel TravelBlanketPic = new JLabel("");
		ImageIcon img4 = new ImageIcon(this.getClass().getResource("travelblanket.png"));
		TravelBlanketPic.setIcon(img4);
		TravelBlanketPic.setBounds(375,182,75,75);
		frame.getContentPane().add(TravelBlanketPic);



		JLabel HeadphonesPic = new JLabel("");
		ImageIcon img5 = new ImageIcon(this.getClass().getResource("headphones.png"));
		HeadphonesPic.setIcon(img5);
		HeadphonesPic.setBounds(375,291,75,75);
		frame.getContentPane().add(HeadphonesPic);



		JLabel BluetoothPic = new JLabel("");
		ImageIcon img6 = new ImageIcon(this.getClass().getResource("speaker.png"));
		BluetoothPic.setIcon(img6);
		BluetoothPic.setBounds(375,400,75,75);
		frame.getContentPane().add(BluetoothPic);



		JLabel WatchPic = new JLabel("");
		ImageIcon img7 = new ImageIcon(this.getClass().getResource("watch.png"));
		WatchPic.setIcon(img7);
		WatchPic.setBounds(375, 509, 75, 75);
		frame.getContentPane().add(WatchPic);



		JLabel JimmyPic = new JLabel("");
		ImageIcon img8 = new ImageIcon(this.getClass().getResource("jimmychoo.png"));
		JimmyPic.setIcon(img8);
		JimmyPic.setBounds(665, 182, 75, 75);
		frame.getContentPane().add(JimmyPic);



		JLabel HugoPic = new JLabel("");
		ImageIcon img9 = new ImageIcon(this.getClass().getResource("hugoboss.png"));
		HugoPic.setIcon(img9);
		HugoPic.setBounds(665, 291, 75, 75);
		frame.getContentPane().add(HugoPic);



		JLabel RaybanWomenPic = new JLabel("");
		ImageIcon img10 = new ImageIcon(this.getClass().getResource("sunglasseswomen.png"));
		RaybanWomenPic.setIcon(img10);
		RaybanWomenPic.setBounds(665, 400, 75, 75);
		frame.getContentPane().add(RaybanWomenPic);



		JLabel RaybanMenPic = new JLabel("");
		ImageIcon img11 = new ImageIcon(this.getClass().getResource("sunglassesmen.png"));
		RaybanMenPic.setIcon(img11);
		RaybanMenPic.setBounds(665, 509, 75, 75);
		frame.getContentPane().add(RaybanMenPic);



		// Gray background for each product picture

		JPanel MugPanel = new JPanel();
		MugPanel.setBackground(Color.LIGHT_GRAY);
		MugPanel.setBounds(85, 182, 75, 75);
		frame.getContentPane().add(MugPanel);
		MugPanel.setLayout(null);



		JPanel BearPanel = new JPanel();
		BearPanel.setBackground(Color.LIGHT_GRAY);
		BearPanel.setBounds(85, 291, 75, 75);
		frame.getContentPane().add(BearPanel);
		BearPanel.setLayout(null);



		JPanel PillowPanel = new JPanel();
		PillowPanel.setBackground(Color.LIGHT_GRAY);
		PillowPanel.setBounds(85, 400, 75, 75);
		frame.getContentPane().add(PillowPanel);
		PillowPanel.setLayout(null);



		JPanel PowerbankPanel = new JPanel();
		PowerbankPanel.setBackground(Color.LIGHT_GRAY);
		PowerbankPanel.setBounds(85, 509, 75, 75);
		frame.getContentPane().add(PowerbankPanel);
		PowerbankPanel.setLayout(null);



		JPanel BlanketPanel = new JPanel();
		BlanketPanel.setBackground(Color.LIGHT_GRAY);
		BlanketPanel.setBounds(375, 182, 75, 75);
		frame.getContentPane().add(BlanketPanel);
		BlanketPanel.setLayout(null);



		JPanel HeadphonesPanel = new JPanel();
		HeadphonesPanel.setBackground(Color.LIGHT_GRAY);
		HeadphonesPanel.setBounds(375, 291, 75, 75);
		frame.getContentPane().add(HeadphonesPanel);
		HeadphonesPanel.setLayout(null);



		JPanel BluetoothPanel = new JPanel();
		BluetoothPanel.setBackground(Color.LIGHT_GRAY);
		BluetoothPanel.setBounds(375, 400, 75, 75);
		frame.getContentPane().add(BluetoothPanel);
		BluetoothPanel.setLayout(null);



		JPanel WatchPanel = new JPanel();
		WatchPanel.setBackground(Color.LIGHT_GRAY);
		WatchPanel.setBounds(375, 509, 75, 75);
		frame.getContentPane().add(WatchPanel);
		WatchPanel.setLayout(null);



		JPanel JimmyPanel = new JPanel();
		JimmyPanel.setBackground(Color.LIGHT_GRAY);
		JimmyPanel.setBounds(665, 182, 75, 75);
		frame.getContentPane().add(JimmyPanel);
		JimmyPanel.setLayout(null);



		JPanel HugoPanel = new JPanel();
		HugoPanel.setBackground(Color.LIGHT_GRAY);
		HugoPanel.setBounds(665, 291, 75, 75);
		frame.getContentPane().add(HugoPanel);
		HugoPanel.setLayout(null);



		JPanel RaybanWomenPanel = new JPanel();
		RaybanWomenPanel.setBackground(Color.LIGHT_GRAY);
		RaybanWomenPanel.setBounds(665, 400, 75, 75);
		frame.getContentPane().add(RaybanWomenPanel);
		RaybanWomenPanel.setLayout(null);



		JPanel RaybanMenPanel = new JPanel();
		RaybanMenPanel.setBackground(Color.LIGHT_GRAY);
		RaybanMenPanel.setBounds(665, 509, 75, 75);
		frame.getContentPane().add(RaybanMenPanel);
		RaybanMenPanel.setLayout(null);

		// Buttons that will allow the user to add products

		JButton btnAddTravelMug = new JButton("ADD");
		btnAddTravelMug.setName("TravelMug"); //Setting a name for the button so I can call it in the ShopGUIController
		btnAddTravelMug.addActionListener(new GUIController_Shop()); //The action of this button (ie clicking) will be sent over to the ShopGUIController where it'll be stored. 
		// From there, I can decide what I want the 'clicking' of the add button to do. Which in this case, it will select that particular product and place it into the users basket. 
	
		btnAddTravelMug.addActionListener(new Action());
		// This is a separate action listner where after clicking the add button, a notifcation will be sent to the user that they've added a product. 
		
		btnAddTravelMug.setBackground(new Color(0, 0, 0));
		btnAddTravelMug.setBounds(170, 232, 100, 25);
		frame.getContentPane().add(btnAddTravelMug);


		JButton btnAddBear = new JButton("ADD");
		btnAddBear.setName("Bear");
		btnAddBear.addActionListener(new GUIController_Shop());
		btnAddBear.addActionListener(new Action());
		btnAddBear.setBackground(new Color(0, 0, 0));
		btnAddBear.setBounds(170, 341, 100, 25);
		frame.getContentPane().add(btnAddBear);


		JButton btnAddPillow = new JButton("ADD");
		btnAddPillow.setName("Pillow");
		btnAddPillow.addActionListener(new Action());
		btnAddPillow.setBackground(new Color(0, 0, 0));
		btnAddPillow.setBounds(170, 450, 100, 25);
		frame.getContentPane().add(btnAddPillow);


		JButton btnAddPowerBank = new JButton("ADD");
		btnAddPowerBank.setName("PowerBank");
		btnAddPowerBank.addActionListener(new Action());
		btnAddPowerBank.setBackground(new Color(0, 0, 0));
		btnAddPowerBank.setBounds(170, 559, 100, 25);
		frame.getContentPane().add(btnAddPowerBank);


		JButton btnAddTravelBlanket = new JButton("ADD");
		btnAddTravelBlanket.setName("TravelBlanket");
		btnAddTravelBlanket.addActionListener(new Action());
		btnAddTravelBlanket.setBackground(new Color(0, 0, 0));
		btnAddTravelBlanket.setBounds(460, 232, 100, 25);
		frame.getContentPane().add(btnAddTravelBlanket);


		JButton btnAddHeadphones = new JButton("ADD");
		btnAddHeadphones.setName("Headphones");
		btnAddHeadphones.addActionListener(new Action());
		btnAddHeadphones.setBackground(new Color(0, 0, 0));
		btnAddHeadphones.setBounds(460, 341, 100, 25);
		frame.getContentPane().add(btnAddHeadphones);


		JButton btnAddBluetooth = new JButton("ADD");
		btnAddBluetooth.setName("Bluetooth");
		btnAddBluetooth.addActionListener(new Action());
		btnAddBluetooth.setBackground(new Color(0, 0, 0));
		btnAddBluetooth.setBounds(460, 450, 100, 25);
		frame.getContentPane().add(btnAddBluetooth);


		JButton btnAddWatch = new JButton("ADD");
		btnAddWatch.setName("Watch");
		btnAddWatch.addActionListener(new Action());
		btnAddWatch.setBackground(new Color(0, 0, 0));
		btnAddWatch.setBounds(460, 559, 100, 25);
		frame.getContentPane().add(btnAddWatch);


		JButton btnAddJimmy = new JButton("ADD");
		btnAddJimmy.setName("Jimmy");
		btnAddJimmy.addActionListener(new Action());
		btnAddJimmy.setBackground(new Color(0, 0, 0));
		btnAddJimmy.setBounds(750, 232, 100, 25);
		frame.getContentPane().add(btnAddJimmy);


		JButton btnAddHugo = new JButton("ADD");
		btnAddHugo.setName("Hugo");
		btnAddHugo.addActionListener(new Action());
		btnAddHugo.setBackground(new Color(0, 0, 0));
		btnAddHugo.setBounds(750, 341, 100, 25);
		frame.getContentPane().add(btnAddHugo);


		JButton btnAddRaybanWoman = new JButton("ADD");
		btnAddRaybanWoman.setName("RaybanWoman");
		btnAddRaybanWoman.addActionListener(new Action());
		btnAddRaybanWoman.setBackground(new Color(0, 0, 0));
		btnAddRaybanWoman.setBounds(750, 450, 100, 25);
		frame.getContentPane().add(btnAddRaybanWoman);


		JButton btnAddRaybanMan = new JButton("ADD");
		btnAddRaybanMan.setName("RaybanMan");
		btnAddRaybanMan.addActionListener(new Action());
		btnAddRaybanMan.setBackground(new Color(0, 0, 0));
		btnAddRaybanMan.setBounds(750, 559, 100, 25);
		frame.getContentPane().add(btnAddRaybanMan);


		// Button for the basket, when clicked it will take user to their basket page
		JButton btnBasket = new JButton("MY BASKET");
		btnBasket.setName("Basket");
		btnBasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					
					System.out.println("Basket");
					System.out.println();
					
					GUI_ShopBasketPage window = new GUI_ShopBasketPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception ShopBasket) {
					ShopBasket.printStackTrace();
				}

			}
		});
		
		btnBasket.setBackground(new Color(102, 255, 0));
		btnBasket.setBounds(865, 150, 120, 40);
		frame.getContentPane().add(btnBasket);


		// Next Page

		JButton NextPage = new JButton("NEXT PAGE");
		NextPage.setBounds(877, 110, 117, 29);
		NextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Next Page");
				System.out.println();
				
				try {
					GUI_FinancePage window = new GUI_FinancePage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception Finance2) {
					Finance2.printStackTrace();
				}
			}
		});
		NextPage.setName("NextPage");
		frame.getContentPane().add(NextPage);


		// Background

		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setBounds(0, 0, 1000, 624);
		Background.setText("");
		frame.getContentPane().add(Background);

	}
}
//		ActionListner class that handles users interaction with the program.
//		In this case a separate frame is displayed to the user to notify them that they've added the product to their basket. 

class Action implements ActionListener{

	public void actionPerformed (ActionEvent e) {
		JFrame frame2 = new JFrame("Notification");
		frame2.setVisible(true);
		frame2.setSize(300,100);
		JLabel labelx = new JLabel("Product has been added to your basket");
		JPanel panelx = new JPanel();
		frame2.add(panelx);
		panelx.add(labelx);
	}

}