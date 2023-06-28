import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class DrawTest {


	public static void main ( String[] args)
	{
		Assignment13E panel = new Assignment13E ();
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		// set the frame to exit when it closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add( panel); //add the panel to the frame
		application.setSize(1920,1080); // set the size
		application.setVisible(true); // make the frame visable
	}}

