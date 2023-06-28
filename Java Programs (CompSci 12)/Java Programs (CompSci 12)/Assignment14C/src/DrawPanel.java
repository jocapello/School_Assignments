import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DrawPanel
{
	public static void main(String[] args) 
	{
		Assignment14C panel = new Assignment14C();
		JFrame application = new JFrame("Animation");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.getContentPane().add("Center", new Assignment14C());
		
		application.setSize(new Dimension(1000,600)); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}