import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class FinalPanel
{
	public static void main(String[] args) 
	{
		Graphics panel1 = new Graphics(); // Draw the cards / game
		FinalGame panel2 = new FinalGame(); // Selection class and sends back the crib and hand
		JFrame application = new JFrame("Animation");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel2);
		application.add(panel1);
		
		
		application.setSize(new Dimension(2000,1000)); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}