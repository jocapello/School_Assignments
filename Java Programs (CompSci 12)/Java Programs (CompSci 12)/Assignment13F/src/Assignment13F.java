import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class Assignment13F extends JPanel  implements MouseListener
{ 
		 int x = 0;
		 int y = 0;
		
		public Assignment13F()
		{
			addMouseListener(this);		
		}

		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
							
				// rectangle 
				g.setColor(Color.ORANGE);
				g.fillRect (900 , 50, 200, 800);

			Font myFont = new Font("Arial", Font.PLAIN,30);  //Set the font to a bigger size
			g.setFont(myFont);
			g.drawString ("Place the mouse on the screen and click. A square will appear",10,30);
			// write text on the screen starting at location (10,30)
		}
		@Override
		public void mouseClicked (MouseEvent e)
		{
			Graphics g = getGraphics();
			int r,gn,b;
			r=(int) ((Math.random()*255)+1); // generate random amounts of red, green and blue
			gn=(int) ((Math.random()*255)+1);
			b=(int) ((Math.random()*255)+1);

			x=e.getX(); // get the x and y location of the mouse
			y=e.getY();
			if (x>=900 && x<=1100 && y>=50 && y<=850)
			{
				Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
				g.setFont(myFont);
				g.setColor(new Color(r,gn,b));
				g.drawString ("HIT",100,800);
			}
			
			else 
			{
				Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
				g.setFont(myFont);
				g.setColor(new Color(r,gn,b));
				g.drawString ("Miss",100,300);
			}
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseExited(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mousePressed(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void mouseReleased(MouseEvent arg0) {
			// TODO Auto-generated method stub
			
		}

	}

	
	
	
	
	
	
