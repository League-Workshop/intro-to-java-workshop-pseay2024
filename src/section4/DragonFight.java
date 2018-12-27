package section4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;


public class DragonFight {
	static Random rand = new Random();
	public static void main(String[] args) {
		
		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		int playerHealth = 100;
		int dragonHealth = 100;
		int playerDamage = 0;
		int dragonDamage = 0;

		while(playerHealth>0 && dragonHealth>0) {
		String attackType = JOptionPane.showInputDialog("Would you like to kick or yell to fight the dragon");
		
		if (attackType.equalsIgnoreCase("yell"))
		{
			dragonDamage = rand.nextInt(10 + 1);
			dragonHealth -= dragonDamage;
		}
		else if (attackType.equalsIgnoreCase("kick"))
		{
			dragonDamage = rand.nextInt(25 + 1);
			dragonHealth -= dragonDamage;
		}
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		playerDamage = rand.nextInt(35 + 1);
		// 12. Subtract this number from the player's health
		playerHealth -= playerDamage;
		
		
		// 13. If the user's health is less than or equal to 0
		if (playerHealth <= 0)
		{
			JOptionPane.showMessageDialog(null, "You Lost!");
		} else if (dragonHealth <= 0)
		{
			JOptionPane.showMessageDialog(null, "Dragon Died!");
		}else
		{
			JOptionPane.showMessageDialog(null, "Your Health - " + playerDamage + ": " + playerHealth + "\n" + "Dragon's Health - " + dragonDamage + ": " + dragonHealth);
		}
		}
	}
}
