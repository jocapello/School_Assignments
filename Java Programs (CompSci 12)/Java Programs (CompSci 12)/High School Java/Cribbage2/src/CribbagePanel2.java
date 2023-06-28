import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CribbagePanel2
{
	public static void main(String[] args) 
	{
		Cribbage2 panel = new Cribbage2();
		JFrame application = new JFrame("Animation");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.getContentPane().add("Center", new Cribbage2());
		
		application.setSize(new Dimension(2000,1000)); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}