

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GUIController_SeatingPlanReturn implements ActionListener{


	@Override
	public void actionPerformed(ActionEvent event) {

		JButton button = (JButton) event.getSource();

		JPanel parent = (JPanel) button.getParent();

		Component[] comp = parent.getComponents();

		String name = button.getName();

		String seatName = button.getText();

		JFrame main = (JFrame) SwingUtilities.getRoot(button);



		switch (name) {
		case "PreviousPageSP2":

			System.out.println("Previous Page");
			goToPreviousPageSP2(main);



			break;

		case "NextPageSP2":

			System.out.println("Next Page");
			goToNextPageSP2(main);


			break;

		case "Button":

			System.out.println("Button Selected");
			seatingButton(button, seatName, main);

			break;

		case "Clear Button":

			System.out.println("Clear Button");
			System.out.println();

			clearButton (button, main);			

			break;

		default:			

			System.out.println("==========");
			System.out.println(name + " gives Error");
			System.out.println("==========");

		}

	}


	private void goToPreviousPageSP2(JFrame frame) {
		// TODO Auto-generated method stub

		try {
			GUI_SeatingPlanDeparturePage window = new GUI_SeatingPlanDeparturePage();
			window.frame.setVisible(true);
			frame.setVisible(false);
		} catch (Exception SeatingPlanDeparture) {
			SeatingPlanDeparture.printStackTrace();
		}
	}


	private void goToNextPageSP2(JFrame frame) {
		// TODO Auto-generated method stub

		if (GUI_SeatingPlanReturnPage.spc.RSeatNameList.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "Seat/s must be selected for continuing to the next page!");
		} else {
			try {
				GUI_PassengersPage1 window = new GUI_PassengersPage1();
				window.frame.setVisible(true);
				frame.setVisible(false);
			} catch (Exception Passengers) {
				Passengers.printStackTrace();
			}
		}
	}


	private void seatingButton(JButton button, String seatName, JFrame frame) {
		// TODO Auto-generated method stub

		GUI_SeatingPlanReturnPage.spc.RSeatNameList.add(seatName);

		System.out.println("----------");
		System.out.println(GUI_SeatingPlanReturnPage.spc.RSeatNameList);
		

		button.setEnabled(false);

		JOptionPane.showMessageDialog(frame, " Your Seat Number is " + seatName);

		Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).setSeatingPlan(GUI_SeatingPlanReturnPage.spc);
		ArrayList<String> returnSPlan = Data_CSVReader.getAllFlights().get(Data_CSVReader.getReturnFlightID()).getSeatingPlan().getRSeatName();

		for (int i = 0; i < returnSPlan.size(); i++) {

			
			System.out.println("Got Return seat: " + returnSPlan.get(i));

		}

		System.out.println("----------");
		
	}
	
private void clearButton(JButton button, JFrame frame) {	
		
		if (GUI_SeatingPlanReturnPage.spc.RSeatNameList.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "There are not any seats selected!");
		} else if (GUI_SeatingPlanReturnPage.spc.RSeatNameList.isEmpty() == false) {
			
			for (int i = 0; i < GUI_SeatingPlanReturnPage.allSeatsReturn.size(); i++) {
				GUI_SeatingPlanReturnPage.allSeatsReturn.get(i).setEnabled(true);
			}
			
			GUI_SeatingPlanReturnPage.spc.RSeatNameList.clear();
			System.out.println(GUI_SeatingPlanReturnPage.spc.RSeatNameList);
			JOptionPane.showMessageDialog(frame, "Your selections are cleared!");
		}

	}

}
