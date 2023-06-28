import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import FileHandling.TwentyEight;
public class DrawPanel {

		public static void main(String[] args) 
		{
			TwentyEight panel = new TwentyEight();
			JFrame application = new JFrame("Animation");
			application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			application.getContentPane().add("Center", new TwentyEight());

			application.setSize(new Dimension(1920,1080)); // set the size of the frame
			application.setVisible(true); // make the frame visible
		}
	}



