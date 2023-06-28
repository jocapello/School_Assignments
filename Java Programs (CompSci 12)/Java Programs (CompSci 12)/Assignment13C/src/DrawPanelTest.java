import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class DrawPanelTest{

	public static void main ( String[] args)
	{

		String num1,num2;
		int x;
		
		num1=JOptionPane.showInputDialog("Enter the first number\n"
				+ "1. Circle\n"
				+ "2. Square\n"
				+ "3. Diamond \n"
				+ "4. Rectangle \n"
				+ "5. Triangle \n"
				+ "Enter your choice");
		x = Integer.parseInt(num1.trim());

		Assignment13C panel = new Assignment13C (x);
		// create a new frame to hold the panel
		JFrame application = new JFrame();
		// set the frame to exit when it closed
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add( panel); //add the panel to the frame
		application.setSize(1920,1080); // set the size
		application.setVisible(true); // make the frame visable
	}}

