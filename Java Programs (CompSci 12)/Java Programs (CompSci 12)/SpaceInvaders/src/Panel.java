import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Panel
{
	public static void main(String[] args) 
	{
		
		Space panel = new Space();
		JFrame application = new JFrame("Animation");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.getContentPane().add("Center", new Space());

		application.setSize(new Dimension(2000,1000)); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}
}