package section3;

import javax.swing.JOptionPane;

public class MadlibsOfTheAmazon {
	
	public static void main(String[] args) {
		// Put this sentence in a pop up:
		// If you find yourself having to cross a piranha-infested river, here's how to do it...
		JOptionPane.showMessageDialog(null, "If you find yourself having to cross a piranha-infested river, here's how to do it . . .");
		// Get the user to enter an adjective
		String adj = JOptionPane.showInputDialog("enter adj");
		// Get the user to enter a type of liquid
		String liquid = JOptionPane.showInputDialog("enter liquid");
		// Get the user to enter a body part
		String bodypart = JOptionPane.showInputDialog("enter body part");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("enter a verb");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("enter a place");
		// Fit the user's words into this sentence, and save it in a String:
		// 
		// 
		// 
		// 
		// 
		
		// Make a pop-up for the final story. You can use \n to go to the next line
		JOptionPane.showMessageDialog(null, "Piranhas are more " + adj + " during the day, so cross the river at night.\n Piranhas are attracted to fresh " + liquid + " and will most likely take a bite out of your " + bodypart + " if you " + verb + ".\n Whatever you do, if you have an open wound, try to find another way to getback to the " + place + ".\n Good luck!");

	}
}

