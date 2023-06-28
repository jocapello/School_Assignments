import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class NewProjectPanel
{
	public static void main(String[] args) 
	{
		NewProjectPanel panel = new NewProjectPanel();
		JFrame application = new JFrame("Animation");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		
		
		application.setSize(new Dimension(2000,1000)); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}