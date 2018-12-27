package section3;

import javax.swing.JOptionPane;

public class Greeter
{
	public static void main(String[] args)
	{
		JOptionPane.showMessageDialog(null, "Hello!");
		String fullname = JOptionPane.showInputDialog("Type your full name here:");
		if (fullname.length() <= 15)
		{
		String output = "Hello " + fullname + ".";
		JOptionPane.showMessageDialog(null, output);
		}
	}
}
