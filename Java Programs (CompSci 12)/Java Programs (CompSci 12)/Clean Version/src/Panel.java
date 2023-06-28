
import java.awt.Dimension;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Graphics;
//MouseEvent e
public class Panel
{
	public static void main(String[] args) 
	{
		
		Crib panel = new Crib();
		JFrame application = new JFrame("Animation");
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.getContentPane().add(panel);

		application.setSize(new Dimension(2000,1000)); // set the size of the frame
		application.setVisible(true); // make the frame visible
		
}}