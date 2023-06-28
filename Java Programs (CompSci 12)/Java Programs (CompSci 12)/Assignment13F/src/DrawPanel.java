//	import javax.swing.JFrame;
//	import javax.swing.JOptionPane;
//	
//public class DrawPanel {
//		public static void main ( String[] args)
//		{
//
//			Assignment13F panel = new Assignment13F ();
//			// create a new frame to hold the panel
//			JFrame application = new JFrame();
//			// set the frame to exit when it closed
//			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//			application.add( panel); //add the panel to the frame
//			application.setSize(1920,1080); // set the size
//			application.setVisible(true); // make the frame visable
//		}}

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.util.*;
import javax.swing.JFrame;

public class DrawPanel
{
	public static void main(String[]  args)
	{
		Assignment13F panel = new Assignment13F();
		JFrame application = new JFrame("Random Rectangles");  //set title of frame
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.getContentPane().add("Center", new Assignment13F());
		application.pack();
		application.setSize(new Dimension(1920,1080)); // set the size of the frame
		application.setVisible(true); // make the frame visible
	}

}
