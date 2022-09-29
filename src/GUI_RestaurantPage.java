

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class GUI_RestaurantPage{

	JFrame frame;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	/**
	 * Launch the application.
	 */

	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ASSIGNMENT_APP_RESTAURANT window = new ASSIGNMENT_APP_RESTAURANT();
					window.frame.setVisible(true);
				} catch (Exception Restaurant) {
					Restaurant.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public GUI_RestaurantPage() {
		
		System.out.println("Restaurant Page");
		System.out.println();
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100,  990, 650);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Restaurant");
		



		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(719, 110, 146, 29);
		frame.getContentPane().add(progressBar);
		//when the task of (initially) unknown length begins:
		progressBar.setIndeterminate(true);
		int newLength = 7;
		//do some work; get length of task...
		progressBar.setMaximum(newLength);
		int newValue = 4;
		progressBar.setValue(newValue );
		progressBar.setIndeterminate(false);




		JButton PreviousPage = new JButton("BACK");
		PreviousPage.setName("Back");
		PreviousPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Previous Page");
				System.out.println();
				
				try {
					GUI_CheckInPage window = new GUI_CheckInPage();
					window.frame.setVisible(true);
					frame.setVisible(false);
				} catch (Exception CheckInPage) {
					CheckInPage.printStackTrace();
				}
			}
		});
		PreviousPage.setBounds(0, 110, 117, 29);
		frame.getContentPane().add(PreviousPage);



		


		JButton NextPage = new JButton("NEXT PAGE");
		NextPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Next Page");
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
		NextPage.setName("NextPage");
		NextPage.setBounds(877, 110, 117, 29);
		frame.getContentPane().add(NextPage);



		//Menu names


		JLabel croissantTxtLabel = new JLabel("CROISSANT \r\n\u00A32.00");
		croissantTxtLabel.setBounds(24, 206, 130, 61);
		croissantTxtLabel.setForeground(Color.BLACK);
		croissantTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(croissantTxtLabel);

		JLabel bananaTxtLabel = new JLabel("BANANA \r\n\u00A31.00");
		bananaTxtLabel.setBounds(24, 324, 102, 61);
		bananaTxtLabel.setForeground(Color.BLACK);
		bananaTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(bananaTxtLabel);

		JLabel eggTxtLabel = new JLabel("EGG \r\n\u00A33.00");
		eggTxtLabel.setBounds(24, 435, 102, 61);
		eggTxtLabel.setForeground(Color.BLACK);
		eggTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(eggTxtLabel);

		JLabel cerealTxtLabel = new JLabel("CEREAL \r\n\u00A32.50");
		cerealTxtLabel.setBounds(24, 563, 102, 61);
		cerealTxtLabel.setForeground(Color.BLACK);
		cerealTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(cerealTxtLabel);

		JLabel sandwichTxtLabel = new JLabel("SANDWICH \r\n\u00A31.50");
		sandwichTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		sandwichTxtLabel.setBounds(276, 206, 140, 61);
		sandwichTxtLabel.setForeground(Color.BLACK);
		frame.getContentPane().add(sandwichTxtLabel);

		JLabel steakTxtLabel = new JLabel("STEAK \r\n\u00A35.00");
		steakTxtLabel.setBounds(296, 324, 102, 61);
		steakTxtLabel.setForeground(Color.BLACK);
		steakTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(steakTxtLabel);

		JLabel pastaTxtLabel = new JLabel("PASTA \r\n\u00A33.00");
		pastaTxtLabel.setBounds(296, 435, 102, 61);
		pastaTxtLabel.setForeground(Color.BLACK);
		pastaTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(pastaTxtLabel);

		JLabel riceTxtLabel = new JLabel("RICE \r\n\u00A32.50");
		riceTxtLabel.setBounds(296, 563, 102, 61);
		riceTxtLabel.setForeground(Color.BLACK);
		riceTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(riceTxtLabel);

		JLabel iceCreamTxtLabel = new JLabel("ICE CREAM \r\n\u00A31.00");
		iceCreamTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		iceCreamTxtLabel.setBounds(517, 206, 121, 61);
		iceCreamTxtLabel.setForeground(Color.BLACK);
		frame.getContentPane().add(iceCreamTxtLabel);

		JLabel cakeTxtLabel = new JLabel("CAKE \n\u00A31.50");
		cakeTxtLabel.setBounds(517, 324, 102, 61);
		cakeTxtLabel.setForeground(Color.BLACK);
		cakeTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(cakeTxtLabel);

		JLabel baklavaTxtLabel = new JLabel("BAKLAVA \r\n\u00A31.00");
		baklavaTxtLabel.setBounds(517, 435, 140, 61);
		baklavaTxtLabel.setForeground(Color.BLACK);
		baklavaTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(baklavaTxtLabel);

		JLabel milkshakeTxtLabel = new JLabel("MILKSHAKE \r\n\u00A31.50");
		milkshakeTxtLabel.setBounds(517, 563, 140, 61);
		milkshakeTxtLabel.setForeground(Color.BLACK);
		milkshakeTxtLabel.setFont(new Font("Dialog", Font.BOLD, 12));
		frame.getContentPane().add(milkshakeTxtLabel);



		//menu pictures

		JLabel croissantPicture = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/croissant.png")).getImage();
		croissantPicture.setIcon(new ImageIcon(img));
		croissantPicture.setBounds(24, 150, 85, 61);
		frame.getContentPane().add(croissantPicture);

		JLabel bananaPicture = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/banana.png")).getImage();
		bananaPicture.setIcon(new ImageIcon(img2));
		bananaPicture.setBounds(24, 277, 102, 61);
		frame.getContentPane().add(bananaPicture);

		JLabel eggPicture = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/egg.png")).getImage();
		eggPicture.setIcon(new ImageIcon(img3));
		eggPicture.setBounds(24, 384, 102, 61);
		frame.getContentPane().add(eggPicture);

		JLabel cerealPicture = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/cereal.png")).getImage();
		cerealPicture.setIcon(new ImageIcon(img4));
		cerealPicture.setBounds(24, 506, 102, 61);
		frame.getContentPane().add(cerealPicture);

		JLabel sandwichPicture = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/sandwich.png")).getImage();
		sandwichPicture.setIcon(new ImageIcon(img5));
		sandwichPicture.setBounds(305, 150, 73, 61);
		frame.getContentPane().add(sandwichPicture);

		JLabel steakPicture = new JLabel("");
		Image img6 = new ImageIcon(this.getClass().getResource("/steak.png")).getImage();
		steakPicture.setIcon(new ImageIcon(img6));
		steakPicture.setBounds(293, 277, 85, 61);
		frame.getContentPane().add(steakPicture);

		JLabel pastaPicture = new JLabel("");
		Image img7 = new ImageIcon(this.getClass().getResource("/pasta.png")).getImage();
		pastaPicture.setIcon(new ImageIcon(img7));
		pastaPicture.setBounds(286, 384, 73, 61);
		frame.getContentPane().add(pastaPicture);

		JLabel ricePicture = new JLabel("");
		Image img8 = new ImageIcon(this.getClass().getResource("/rice.png")).getImage();
		ricePicture.setIcon(new ImageIcon(img8));
		ricePicture.setBounds(296, 508, 61, 61);
		frame.getContentPane().add(ricePicture);

		JLabel iceCreamPicture = new JLabel("");
		Image img9 = new ImageIcon(this.getClass().getResource("/ice_cream.png")).getImage();
		iceCreamPicture.setIcon(new ImageIcon(img9));
		iceCreamPicture.setBounds(517, 150, 102, 61);
		frame.getContentPane().add(iceCreamPicture);

		JLabel cakePicture = new JLabel("");
		Image img10 = new ImageIcon(this.getClass().getResource("/cake.png")).getImage();
		cakePicture.setIcon(new ImageIcon(img10));
		cakePicture.setBounds(517, 277, 102, 61);
		frame.getContentPane().add(cakePicture);

		JLabel baklavaPicture = new JLabel("");
		Image img11 = new ImageIcon(this.getClass().getResource("/baklava.png")).getImage();
		baklavaPicture.setIcon(new ImageIcon(img11));
		baklavaPicture.setBounds(517, 384, 102, 61);
		frame.getContentPane().add(baklavaPicture);

		JLabel milkshakePicture = new JLabel("");
		Image img12 = new ImageIcon(this.getClass().getResource("/milkshake.png")).getImage();
		milkshakePicture.setIcon(new ImageIcon(img12));
		milkshakePicture.setBounds(517, 506, 102, 61);
		frame.getContentPane().add(milkshakePicture);
		
		//total cost
		ArrayList<String> alphabet = new ArrayList<String>();
		alphabet.add("abcdefghijklmnopqrstuvwxyz");
		
		
		JLabel lblMenuCost = new JLabel("");
		lblMenuCost.setForeground(Color.WHITE);
		lblMenuCost.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMenuCost.setFont(new Font("Tahoma", Font.PLAIN, 24));
		lblMenuCost.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		lblMenuCost.setBounds(816, 197, 140, 29);
		frame.getContentPane().add(lblMenuCost);
		
		JLabel croissantStockLabel = new JLabel("");
		croissantStockLabel.setForeground(Color.WHITE);
		croissantStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		croissantStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		croissantStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		croissantStockLabel.setBounds(172, 206, 45, 13);
		frame.getContentPane().add(croissantStockLabel);
		
		JLabel bananaStockLabel = new JLabel("");
		bananaStockLabel.setForeground(Color.WHITE);
		bananaStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		bananaStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		bananaStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		bananaStockLabel.setBounds(172, 338, 45, 13);
		frame.getContentPane().add(bananaStockLabel);
		
		JLabel eggStockLabel = new JLabel("");
		eggStockLabel.setForeground(Color.WHITE);
		eggStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		eggStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		eggStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		eggStockLabel.setBounds(172, 435, 45, 13);
		frame.getContentPane().add(eggStockLabel);
		
		JLabel cerealStockLabel = new JLabel("");
		cerealStockLabel.setForeground(Color.WHITE);
		cerealStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		cerealStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cerealStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cerealStockLabel.setBounds(172, 567, 45, 13);
		frame.getContentPane().add(cerealStockLabel);
		
		JLabel sandwichStockLabel = new JLabel("");
		sandwichStockLabel.setForeground(Color.WHITE);
		sandwichStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		sandwichStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sandwichStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		sandwichStockLabel.setBounds(430, 206, 45, 13);
		frame.getContentPane().add(sandwichStockLabel);
		
		JLabel steakStockLabel = new JLabel("");
		steakStockLabel.setForeground(Color.WHITE);
		steakStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		steakStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		steakStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		steakStockLabel.setBounds(430, 325, 45, 13);
		frame.getContentPane().add(steakStockLabel);
		
		JLabel pastaStockLabel = new JLabel("");
		pastaStockLabel.setForeground(Color.WHITE);
		pastaStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		pastaStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		pastaStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pastaStockLabel.setBounds(430, 435, 45, 13);
		frame.getContentPane().add(pastaStockLabel);
		
		JLabel riceStockLabel = new JLabel("");
		riceStockLabel.setForeground(Color.WHITE);
		riceStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		riceStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		riceStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		riceStockLabel.setBounds(389, 567, 45, 13);
		frame.getContentPane().add(riceStockLabel);
		
		JLabel iceCreamStockLabel = new JLabel("");
		iceCreamStockLabel.setForeground(Color.WHITE);
		iceCreamStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		iceCreamStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		iceCreamStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		iceCreamStockLabel.setBounds(629, 206, 45, 13);
		frame.getContentPane().add(iceCreamStockLabel);
		
		JLabel cakeStockLabel = new JLabel("");
		cakeStockLabel.setForeground(Color.WHITE);
		cakeStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		cakeStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cakeStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		cakeStockLabel.setBounds(629, 325, 45, 13);
		frame.getContentPane().add(cakeStockLabel);
		
		JLabel baklavaStockLabel = new JLabel("");
		baklavaStockLabel.setForeground(Color.WHITE);
		baklavaStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		baklavaStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		baklavaStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		baklavaStockLabel.setBounds(629, 432, 45, 13);
		frame.getContentPane().add(baklavaStockLabel);
		
		JLabel milkshakeStockLabel = new JLabel("");
		milkshakeStockLabel.setForeground(Color.WHITE);
		milkshakeStockLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		milkshakeStockLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		milkshakeStockLabel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		milkshakeStockLabel.setBounds(629, 567, 45, 13);
		frame.getContentPane().add(milkshakeStockLabel);
		
		JButton totalButton = new JButton("Total");
		totalButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Restaurant Total");
				System.out.println();
				
				double croissantAmount = Double.parseDouble(textField_13.getText());
				if (croissantAmount > 100 || croissantAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					croissantAmount = 0.0;
					
				}
				double croissantCost;
				double p1 = 2.00;
				croissantCost = (croissantAmount * p1);
				String menuCroissant = String.format("%.2f", croissantCost);
				lblMenuCost.setText(menuCroissant);
				
				
				double bananaAmount = Double.parseDouble(textField_14.getText());
				if (bananaAmount > 100 || bananaAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					bananaAmount = 0.0;
					
				}
				double bananaCost;
				double p2 = 1.00;
				bananaCost = (bananaAmount * p2);
				String menuBanana = String.format("%.2f", bananaCost + croissantCost);
				lblMenuCost.setText(menuBanana);
				
				
				double eggAmount = Double.parseDouble(textField_15.getText());
				if (eggAmount > 100 || eggAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					eggAmount = 0.0;
					
				}
				double eggCost;
				double p3 = 3.00;
				eggCost = (eggAmount*p3);
				String menuEgg = String.format("%.2f", eggCost + bananaCost + croissantCost);
				lblMenuCost.setText(menuEgg);
				
				
				double cerealAmount = Double.parseDouble(textField_16.getText());
				if (cerealAmount > 100 || cerealAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					cerealAmount = 0.0;
					
				}
				double cerealCost;
				double p4 = 2.50;
				cerealCost = (cerealAmount * p4);
				String menuCereal = String.format("%.2f", cerealCost + eggCost + bananaCost + croissantCost);
				lblMenuCost.setText(menuCereal);
				
				
				double sandwichAmount = Double.parseDouble(textField_17.getText());
				if (sandwichAmount > 100 || sandwichAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					sandwichAmount = 0.0;
					
				}
				double sandwichCost;
				double p5 = 1.50;
				sandwichCost = (sandwichAmount * p5);
				String menuSandwich = String.format("%.2f", sandwichCost + cerealCost + eggCost + bananaCost + croissantCost);
				lblMenuCost.setText(menuSandwich);
				
				
				double steakAmount = Double.parseDouble(textField_18.getText());
				if (steakAmount > 100 || steakAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					steakAmount = 0.0;
					
				}
				double steakCost;
				double p6 = 5.00;
				steakCost = (steakAmount * p6);
				String menuSteak = String.format("%.2f", steakCost + sandwichCost + cerealCost + eggCost + bananaCost + croissantCost);
				lblMenuCost.setText(menuSteak);
				
				
				double pastaAmount = Double.parseDouble(textField_19.getText());
				if (pastaAmount > 100 || pastaAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					pastaAmount = 0.0;
					
				}
				double pastaCost;
				double p7 = 3.00;
				pastaCost = (pastaAmount * p7);
				String menuPasta = String.format("%.2f", pastaCost + steakCost + sandwichCost + cerealCost + eggCost + bananaCost + croissantCost);
				lblMenuCost.setText(menuPasta);	
				
				
				double riceAmount = Double.parseDouble(textField_20.getText());
				if (riceAmount > 100 || riceAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					riceAmount = 0.0;
					
				}
				double riceCost;
				double p8 = 2.50;
				riceCost = (riceAmount * p8);
				String menuRice = String.format("%.2f", riceCost + pastaCost + steakCost + sandwichCost + cerealCost + eggCost + bananaCost + croissantCost);
				lblMenuCost.setText(menuRice);
				
				
				double iceCreamAmount = Double.parseDouble(textField_21.getText());
				if (iceCreamAmount > 100 || iceCreamAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					iceCreamAmount = 0.0;
					
				}
				double iceCreamCost;
				double p9 = 1.00;
				iceCreamCost = (iceCreamAmount * p9);
				String menuIceCream = String.format("%.2f", iceCreamCost + riceCost + pastaCost + steakCost + sandwichCost + cerealCost + eggCost + bananaCost + croissantCost);
				lblMenuCost.setText(menuIceCream);
				
				
				double cakeAmount = Double.parseDouble(textField_22.getText());
				if (cakeAmount > 100 || cakeAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					cakeAmount = 0.0;
					
				}
				double cakeCost;
				double p10 = 1.50;
				cakeCost = (cakeAmount * p10);
				String menuCake = String.format("%.2f", cakeCost + iceCreamCost + riceCost + pastaCost + steakCost+ sandwichCost + cerealCost + eggCost + bananaCost + croissantCost);		
				lblMenuCost.setText(menuCake);
				
				
				double baklavaAmount = Double.parseDouble(textField_23.getText());
				if (baklavaAmount > 100 || baklavaAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					baklavaAmount = 0.0;
					
				}
				double baklavaCost;
				double p11 = 1.00;
				baklavaCost = (baklavaAmount * p11);
				String menuBaklava = String.format("%.2f", + baklavaCost + cakeCost + iceCreamCost + riceCost + pastaCost + steakCost + sandwichCost + cerealCost + eggCost + bananaCost + croissantCost);
				lblMenuCost.setText(menuBaklava);
				
				
				double milkshakeAmount = Double.parseDouble(textField_24.getText());
				if (milkshakeAmount > 100 || milkshakeAmount < 0){
					
					JOptionPane.showMessageDialog(frame, "Input is invalid!") ;
					milkshakeAmount = 0.0;
					
				}
				double milkshakeCost;
				double p12 = 1.50;
				milkshakeCost = (milkshakeAmount * p12);
				String menuMilkshake = String.format("%.2f", milkshakeCost + baklavaCost + cakeCost + iceCreamCost + riceCost + pastaCost + steakCost + sandwichCost + cerealCost + eggCost + bananaCost + croissantCost);
				lblMenuCost.setText(menuMilkshake);
				
				
				
				//stock calculation
				double[] stockCount = {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100};
				
 				
				double croissantStockCalc;
				croissantStockCalc = (stockCount[0] - croissantAmount);
				stockCount[0] = croissantStockCalc;
				String stockOfCroissant = String.format("%.1f",croissantStockCalc);
				croissantStockLabel.setText(stockOfCroissant);
				if(stockOfCroissant == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfCroissant = 100 + stockOfCroissant;
				}
				
				
				double bananaStockCalc;
				bananaStockCalc = (stockCount[1] - bananaAmount);
				String stockOfBanana = String.format("%.1f", bananaStockCalc);
				bananaStockLabel.setText(stockOfBanana);
				if(stockOfBanana == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfBanana = 100 + stockOfBanana;
				}
				
				
				double eggStockCalc;
				eggStockCalc = (stockCount[2]  - eggAmount);
				String stockOfEgg = String.format("%.1f", eggStockCalc);
				eggStockLabel.setText(stockOfEgg);
				if(stockOfEgg == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfEgg = 100 + stockOfEgg;
				}
				
				
				double cerealStockCalc;
				cerealStockCalc = (stockCount[3]  - cerealAmount);
				String stockOfCereal = String.format("%.1f", cerealStockCalc);
				cerealStockLabel.setText(stockOfCereal);
				if(stockOfCereal == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfCereal = 100 + stockOfCereal;
				}
				
				
				double sandwichStockCalc;
				sandwichStockCalc = (stockCount[4]  - sandwichAmount);
				String stockOfSandwich = String.format("%.1f", sandwichStockCalc);
				sandwichStockLabel.setText(stockOfSandwich);
				if(stockOfSandwich == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfSandwich = 100 + stockOfSandwich;
				}
				
				
				double steakStockCalc;
				steakStockCalc = (stockCount[5]  - steakAmount);
				String stockOfSteak = String.format("%.1f", steakStockCalc);
				steakStockLabel.setText(stockOfSteak);
				if(stockOfSteak == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfSteak = 100 + stockOfSteak;
				}
				
				
				double pastaStockCalc;
				pastaStockCalc = (stockCount[6]  - pastaAmount);
				String stockOfPasta = String.format("%.1f", pastaStockCalc);
				pastaStockLabel.setText(stockOfPasta);
				if(stockOfPasta == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfPasta = 100 + stockOfPasta;
				}
				
				
				double riceStockCalc;
				riceStockCalc = (stockCount[7]  - riceAmount);
				String stockOfRice = String.format("%.1f", riceStockCalc);
				riceStockLabel.setText(stockOfRice);
				if(stockOfRice == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfRice = 100 + stockOfRice;
				}
				
				
				double iceCreamStockCalc;
				iceCreamStockCalc = (stockCount[8]  - iceCreamAmount);
				String stockOfIceCream = String.format("%.1f", iceCreamStockCalc);
				iceCreamStockLabel.setText(stockOfIceCream);
				if(stockOfIceCream == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfIceCream = 100 + stockOfIceCream;
				}
				
				
				double cakeStockCalc;
				cakeStockCalc = (stockCount[9]  - cakeAmount);
				String stockOfCake = String.format("%.1f", cakeStockCalc);
				cakeStockLabel.setText(stockOfCake);
				if(stockOfCake == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfCake = 100 + stockOfCake;
				}
				
				
				double baklavaStockCalc;
				baklavaStockCalc = (stockCount[10]  - baklavaAmount);
				String stockOfBaklava = String.format("%.1f", baklavaStockCalc);
				baklavaStockLabel.setText(stockOfBaklava);
				if(stockOfBaklava == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfBaklava = 100 + stockOfBaklava;
				}
				
				
				double milkshakeStockCalc;
				milkshakeStockCalc = (stockCount[11] - milkshakeAmount);
				String stockOfMilkshake =String.format("%.1f", milkshakeStockCalc);
				milkshakeStockLabel.setText(stockOfMilkshake);
				if(stockOfMilkshake == "0") {
					try {
						Thread.sleep(180000);
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					stockOfMilkshake = 100 + stockOfMilkshake;
				}
				
			}
			});
		
		totalButton.setBounds(826, 246, 85, 21);
		frame.getContentPane().add(totalButton);
		
		JLabel totalLabel = new JLabel("Total:");
		totalLabel.setBounds(760, 197, 73, 29);
		totalLabel.setFont(new Font("Dialog", Font.BOLD, 18));
		totalLabel.setForeground(Color.BLACK);
		frame.getContentPane().add(totalLabel);
		
		JButton btnBasket = new JButton("Purchase");
		btnBasket.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("Restaurant Basket");
				System.out.println();
				
				String errorText = lblMenuCost.getText();
				if(errorText == "" ) {
					JOptionPane.showMessageDialog(frame, "No items selected");
					
				}else {
					JOptionPane.showMessageDialog(frame, "Items succesfully purchased");
				}
				
			
			}
		});
		btnBasket.setBackground(new Color(102, 255, 0));
		btnBasket.setBounds(816, 528, 120, 40);
		frame.getContentPane().add(btnBasket);
		
		
		textField_13 = new JTextField();
		textField_13.setText("0");
		textField_13.setBounds(121, 170, 96, 26);
		frame.getContentPane().add(textField_13);
		textField_13.setColumns(10);
		
		textField_14 = new JTextField();
		textField_14.setText("0");
		textField_14.setColumns(10);
		textField_14.setBounds(121, 300, 96, 26);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("0");
		textField_15.setColumns(10);
		textField_15.setBounds(121, 399, 96, 26);
		frame.getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setText("0");
		textField_16.setColumns(10);
		textField_16.setBounds(121, 528, 96, 26);
		frame.getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("0");
		textField_17.setColumns(10);
		textField_17.setBounds(379, 170, 96, 26);
		frame.getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setText("0");
		textField_18.setColumns(10);
		textField_18.setBounds(379, 291, 96, 26);
		frame.getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("0");
		textField_19.setColumns(10);
		textField_19.setBounds(379, 402, 96, 26);
		frame.getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setText("0");
		textField_20.setColumns(10);
		textField_20.setBounds(379, 531, 96, 26);
		frame.getContentPane().add(textField_20);
		
		textField_21 = new JTextField();
		textField_21.setText("0");
		textField_21.setColumns(10);
		textField_21.setBounds(583, 170, 96, 26);
		frame.getContentPane().add(textField_21);
		
		textField_22 = new JTextField();
		textField_22.setText("0");
		textField_22.setColumns(10);
		textField_22.setBounds(583, 291, 96, 26);
		frame.getContentPane().add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setText("0");
		textField_23.setColumns(10);
		textField_23.setBounds(583, 399, 96, 26);
		frame.getContentPane().add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setText("0");
		textField_24.setColumns(10);
		textField_24.setBounds(583, 531, 96, 26);
		frame.getContentPane().add(textField_24);
		
		
		
		
		//background

		ImageIcon BackgroundImage = new ImageIcon(this.getClass().getResource("Background.png"));
		JLabel Background = new JLabel(BackgroundImage);
		Background.setBounds(0, 0, 1000, 624);
		Background.setText("");
		frame.getContentPane().add(Background);
		}
}
