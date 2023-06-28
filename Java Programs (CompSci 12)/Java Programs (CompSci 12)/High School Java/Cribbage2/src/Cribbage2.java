import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class Cribbage2 extends JPanel implements MouseListener
{ 
	public static  void Computer ( String[]   args)	{

		int [ ]  Value = {2, 2, 2, 2, 3, 3, 3, 3,4, 4, 4, 4, 5, 5, 5, 5,6, 6, 6, 6, 7, 7, 7, 7,
				8, 8, 8, 8, 9, 9, 9, 9,10, 10, 10, 10, 11, 11, 11,11,12, 12, 12, 12, 1, 1, 1, 1};
		int [ ]  Numbered = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
				27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};


	}	
	//creating the image variables
	private BufferedImage Background = null;
	// cards
	private BufferedImage Twoc = null;


	public Cribbage2()
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
			
			Background=ImageIO.read(new File("EZ.png"));

//			Twoc=ImageIO.read(new File("2C.png"));

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
	
	
	
		String[] student={"Card1 ", "Card2 ", "Card3 ", "Card4 ", "Card5", "Card6 "};
		int [] CompCards={0, 0, 0, 0, 0, 0};	
		{
		int start=1,i=0,j=0,Random=0,PlayerTurn=1;

		while (PlayerTurn==1)
		{


			for ( i = 0;  i < 6;i++)   
			{
//				Random=(int)(Math.random( )* 52  + 1);//choose RandomPlace Random
				
				int x=200,y=800;
				int Random1=1;			
				
				if (Random1==1)
				{
					g.drawImage(Twoc, 100,200, 90,90,this);
				}

			}}}}
		 
	public void mouseClicked(MouseEvent e) 
	{	
		Graphics g = getGraphics();
		int x=e.getX(); // get the x and y location of the mouse
		int y=e.getY();
		//Check the square that has been clicked
		if (x<=1000)
		{
			g.drawImage(Twoc, x,y, 90,90,this);
		}

		if (x>=1000) {
			g.drawImage(Twoc, x,y, 90,90,this);
		}

	}
	

	}//end