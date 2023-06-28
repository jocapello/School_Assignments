import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Assignment13C extends JPanel 
{ 
	private int choice;
	public Assignment13C (int Choice)
	{
	 choice = Choice;
	}
	public void paintComponent (Graphics g) {

		super.paintComponent(g);
		
		
		if (choice==1) {
		//circle
		g.setColor(Color.YELLOW);
		g.fillOval(10,10,200,200);}
		
		if (choice==2) {

		// square
		g.setColor(Color.BLACK);
		g.fillRect (300 , 10, 200, 200);}
		
		if (choice==3) {

		// diamond 
		g.setColor(Color.RED);
		int [] x = { 350, 425, 350, 275 };
		int [] y = { 250, 325, 400, 325 };
		g.fillPolygon( x, y, 4 );}
		
		if (choice==4) {

		// rectangle 
		g.setColor(Color.ORANGE);
		g.fillRect (900 , 10, 200, 400);}
		
		if (choice==5) {

		// triangle
		g.setColor(Color.GREEN);
		g.fillPolygon(new int[] {1200, 1400, 1600}, new int[] {500, 100, 500}, 3);}
	}}
