import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class DrawPanel
{
	public static void main(String[] args) 
	{
		Assignment14B panel = new Assignment14B();
		JFrame application = new JFrame("Animation");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.getContentPane().add("Center", new Assignment14B());
		
		application.setSize(new Dimension(1920,1080)); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}