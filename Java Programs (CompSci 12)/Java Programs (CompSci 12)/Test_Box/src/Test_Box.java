import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Assignment13E extends JPanel 
{ 
int sideStart =400, xStart =50, yStart =410;

		
		public  void tri(int x, int y, int side) {
			tri(xStart, yStart, sideStart);

			int x2 = x + side/2;
			int y2 = y - side;
			int x3 = x + side;
			int y3 = y;}
			public void paintComponent (Graphics g) {

			super.paintComponent(g);
			g.setColor(new Color(0,0,0)); //black
			
			triangle(x , y, x2, y2, x3, y3);
			
			side = side/2;
			
			if (side>10) {
				tri(x,y,side);
				tri(x+side,y,side);
				tri(x+(side/2),y-(side),side);
			}
	
		}}