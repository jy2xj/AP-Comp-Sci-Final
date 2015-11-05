

import javax.swing.JFrame;

public class DriverGoT
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Game of Ten");
      frame.setSize(725,400);
      frame.setLocation(200,100);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setContentPane(new PanelGoT());
      frame.setVisible(true);
		javax.swing.JOptionPane.showMessageDialog(null, "Game Overview: There are two players: one human player and a computer. The player\n is on the defending side, while the computer is on the attacking side. The player must\n choose a number for the computer to guess. The computer must guess a number\n between 1 and 10. If the number is within two of the player's number, the computer\n will receive a point. If it is within one of the player's number, the computer will receive\n two points. The computer will receive three points if it is the same number. Every turn,\n the player receives a point. After the attacking side's guess, whoever has 5 or more\n points first wins. If both sides receive 5 or more points at the same time, then they tie.  ");
  		javax.swing.JOptionPane.showMessageDialog(null, "Rules:\n•	Defending Side goes first\n•	Must choose a number between 1 and 10, inclusive\n•	Neither side can choose a number twice");
		javax.swing.JOptionPane.showMessageDialog(null, "Buttons: Attack (coming soon), Defense (click to start the game), 1-10 (Click to make your choice of number), Restart (restart the game)");
 		javax.swing.JOptionPane.showMessageDialog(null, "Good Luck and Have Fun!");
   }
} 