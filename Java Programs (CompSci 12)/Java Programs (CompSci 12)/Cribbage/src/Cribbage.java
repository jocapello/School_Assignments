import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class Cribbage extends JPanel implements MouseListener
{ 
	public static  void Computer ( String[]   args)	{

		
		int Card1, Card2, Card3, Card4, Card5, Card6;
		Card1=(int )(Math.random( )* 52  + 1);//choose RandomPlace row

		
		Card2=(int )(Math.random( )* 52  + 1);//choose RandomPlace column
		Card3=(int )(Math.random( )* 52  + 1);//choose RandomPlace row
		Card4=(int )(Math.random( )* 52  + 1);//choose RandomPlace column
		Card5=(int )(Math.random( )* 52  + 1);//choose RandomPlace row
		Card6=(int )(Math.random( )* 52  + 1);//choose RandomPlace column
	}	
	//creating the image variables
	private BufferedImage Background = null;
	// cards
	private BufferedImage Twoc = null;


	public Cribbage()
	{
		addMouseListener((MouseListener) this);

	}
	public void mousePressed(MouseEvent e) {   }
	public void mouseReleased(MouseEvent e) {  }
	public void mouseEntered(MouseEvent e) {    }
	public void mouseExited(MouseEvent e) {   }
	public void paintComponent(Graphics g)

	{
		super.paintComponent(g);			
		try   // load the images 
		{
			Background=ImageIO.read(new File("back.jfif"));
			int min=1, max=52;



		}
		catch(IOException e)  		//catching if the image was not there
		{
			
			System.out.println("could not find image");
			g.drawString("Could not find images",100,100);
		}
		g.drawImage(Background, 0,0, 2000,1000,this);
		//    			g.setColor(Color.WHITE);   // set up the tic tac toe grid        
		//    			g.fillRect(400, 100, 300, 300);
		g.setColor(Color.BLACK);	// draw the rectangle
		Font myFont = new Font("Arial", Font.PLAIN,30);  //Set the font to a bigger size
		g.setFont(myFont);// write text on the screen starting at location (250,30)
		g.drawString ("Cribbage",800,60);
	}
	public void mouseClicked(MouseEvent e) 
	{	
		Graphics g = getGraphics();
		int x=e.getX(); // get the x and y location of the mouse
		int y=e.getY();
		//Check the square that has been clicked
		int min=1,max=52;

		Random rand = new Random();
		int randomNum = rand.nextInt((max - min) + 1) + min;
        f = new JFrame("label"); 

        ImageIcon i = new ImageIcon("image ("+randomNum+").png"); 

		if (x<=1000)
		{
			 l = new JLabel(i); 

			 f.show(); 
			 }

		if (x>=1000) {
			g.drawImage(MyImage, x,y, 90,90,this);
		}

	}
}//end