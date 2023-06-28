import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class CribbagePanel
{
	public static void main(String[] args) 
	{
		Cribbage panel = new Cribbage();
		JFrame application = new JFrame("Animation");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.getContentPane().add("Center", new Cribbage());
		
		application.setSize(new Dimension(1000,600)); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}