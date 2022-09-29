

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class GUIController_SeatingPlanDeparture implements ActionListener{


	@Override
	public void actionPerformed(ActionEvent event) {

		JButton button = (JButton) event.getSource();

		JPanel parent = (JPanel) button.getParent();

		Component[] comp = parent.getComponents();

		String name = button.getName();

		String seatName = button.getText();

		JFrame main = (JFrame) SwingUtilities.getRoot(button);


		switch (name) {
		case "PreviousPageSP1":

			System.out.println("Perivious Page");
			System.out.println();

			goToPreviousPageSP1(main);

			break;

		case "NextPageSP1":

			System.out.println("Next Page");
			System.out.println();

			goToNextPageSP1(main);

			break;

		case "Button":

			System.out.println("Button Selected");
			System.out.println();

			seatingButton(comp, button, seatName, main);

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


	private void goToPreviousPageSP1(JFrame frame) {
		// TODO Auto-generated method stub

		try {
			GUI_BookingPage window = new GUI_BookingPage();
			window.frame.setVisible(true);
			frame.setVisible(false);
		} catch (Exception BookingPage) {
			BookingPage.printStackTrace();
		}
	}


	private void goToNextPageSP1(JFrame frame) {
		// TODO Auto-generated method stub
		
		if (GUI_SeatingPlanDeparturePage.spc.DSeatNameList.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "Seat/s must be selected for continuing to the next page!");
		} else {
			try {
				GUI_SeatingPlanReturnPage window = new GUI_SeatingPlanReturnPage();
				window.frame.setVisible(true);
				frame.setVisible(false);
			} catch (Exception SeatingPlanArrival) {
				SeatingPlanArrival.printStackTrace();
			}
		}

	}


	private void seatingButton(Component[] comp, JButton button, String seatName, JFrame frame) {
		// TODO Auto-generated method stub

		GUI_SeatingPlanDeparturePage.spc.DSeatNameList.add(seatName);

		System.out.println("----------");
		System.out.println(GUI_SeatingPlanDeparturePage.spc.DSeatNameList);

		button.setEnabled(false);

		JOptionPane.showMessageDialog(frame, " Your Seat Number is " + seatName);

		Data_CSVReader.getAllFlights().get(Data_CSVReader.getDepartureFlightID()).setSeatingPlan(GUI_SeatingPlanDeparturePage.spc);
		ArrayList<String> departureSPlan = Data_CSVReader.getAllFlights().get(Data_CSVReader.getDepartureFlightID()).getSeatingPlan().getDSeatName();

		for (int i = 0; i < departureSPlan.size(); i++) {

			System.out.println("Got Departure seat: " + departureSPlan.get(i));
		}

		System.out.println("----------");

	}

	private void clearButton(JButton button, JFrame frame) {	


		if (GUI_SeatingPlanDeparturePage.spc.DSeatNameList.isEmpty()) {
			JOptionPane.showMessageDialog(frame, "There are not any seats selected!");
		} else if (GUI_SeatingPlanDeparturePage.spc.DSeatNameList.isEmpty() == false) {

			for (int i = 0; i < GUI_SeatingPlanDeparturePage.SelectedSeatsDeparture.size(); i++) {
				GUI_SeatingPlanDeparturePage.SelectedSeatsDeparture.get(i).setEnabled(true);
			}

			GUI_SeatingPlanDeparturePage.spc.DSeatNameList.clear();
			System.out.println(GUI_SeatingPlanDeparturePage.spc.DSeatNameList);
			JOptionPane.showMessageDialog(frame, "Your selections are cleared!");
		}

	}

}
