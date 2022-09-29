

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

// The events from using the buttons from the design section of the shop are stored here.

public class GUIController_Shop implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent event) {
		
		
		//Creating basket array that will store each product
		ArrayList<String> basket = new ArrayList<String>();
				
		
		JButton b = (JButton)event.getSource();
		
		String name = b.getName();
		
		//Using switch statement, each case with its specific code will be called once the specified button has been clicked on.
		switch (name) {
		
		//If the button 'Travel Mug' is clicked on, add that product to the basket array and print out to console confirming the action.
		case "TravelMug":			
			basket.add("Travel Mug");
			
			System.out.println("----------");
			System.out.println("Travel Mug has been added"); //Had to add this System.out as it the line under would appear on the console / some sort of error or problem?
			System.out.println(basket);
			System.out.println("----------");
			
			break;
		
		case "Bear":
			basket.add("Brunel Bear");
			
			System.out.println("----------");
			System.out.println("Brunel Bear has been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		case "Pillow":
			basket.add("Neck Pillow");
			
			System.out.println("----------");
			System.out.println("Neck Pillow has been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		case "PowerBank":
			basket.add("PowerBank");
			
			System.out.println("----------");
			System.out.println("PowerBank has been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		case "TravelBlanket":
			basket.add("Travel Blanket");
			
			System.out.println("----------");
			System.out.println("Travel Blanket has been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		case "Headphones":
			basket.add("Headphones");
			
			System.out.println("----------");
			System.out.println("Headphones have been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		case "Bluetooth":
			basket.add("Bluetooth Speaker");
			
			System.out.println("----------");
			System.out.println("Bluetooth speaker has been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		case "Watch":
			basket.add("Luxury Watch");
			
			System.out.println("----------");
			System.out.println("Luxury watch has been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		case "Jimmy":
			basket.add("Jimmy Choo");
			
			System.out.println("----------");
			System.out.println("Jimmy Choo has been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		case "Hugo":
			basket.add("Hugo Boss");
			
			System.out.println("----------");
			System.out.println("Hugo Boss has been added");
			System.out.println(basket);
			System.out.println("----------");
			break;
			
		case "RaybanWoman":
			basket.add("Rayban Woman sunglasses");
			
			System.out.println("----------");
			System.out.println("Rayban Woman sunglasses have been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		case "RaybanMan":
			basket.add("Rayban Man sunglasses");
			
			System.out.println("----------");
			System.out.println("Rayban Man sunglasses have been added");
			System.out.println(basket);
			System.out.println("----------");
			
			break;		
			
		case "Basket":
			
			System.out.println("----------");
			System.out.println("Your basket includes: ");
			System.out.println(basket);
			System.out.println("----------");
			
			break;
			
		
		// When there is no case match (buttons) it will display error to console
		default:
			
			System.out.println("==========");
			System.out.println(name + " gives Error");
			System.out.println("==========");

		}
		
	
		
	}

}
