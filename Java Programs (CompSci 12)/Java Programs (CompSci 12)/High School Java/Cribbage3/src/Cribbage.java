import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

@SuppressWarnings("serial")
public class Cribbage extends JPanel implements MouseListener
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
	private	BufferedImage Twod = null;
	private BufferedImage Twoh = null;
	private	BufferedImage Twos = null;
	private BufferedImage Threec = null;
	private	BufferedImage Threed = null;
	private BufferedImage Threeh = null;
	private	BufferedImage Threes = null;
	private BufferedImage Fourc = null;
	private	BufferedImage Fourd = null;
	private BufferedImage Fourh = null;
	private	BufferedImage Fours = null;
	private BufferedImage Fivec = null;
	private	BufferedImage Fived = null;
	private BufferedImage Fiveh = null;
	private	BufferedImage Fives = null;
	private BufferedImage Sixc = null;
	private	BufferedImage Sixd = null;
	private BufferedImage Sixh = null;
	private	BufferedImage Sixs = null;
	private BufferedImage Sevenc = null;
	private	BufferedImage Sevend = null;
	private BufferedImage Sevenh = null;
	private	BufferedImage Sevens = null;
	private BufferedImage Eightc = null;
	private	BufferedImage Eightd = null;
	private BufferedImage Eighth = null;
	private	BufferedImage Eights = null;
	private BufferedImage Ninec = null;
	private	BufferedImage Nined = null;
	private BufferedImage Nineh = null;
	private	BufferedImage Nines = null;
	private BufferedImage Tenc = null;
	private	BufferedImage Tend = null;
	private BufferedImage Tenh = null;
	private	BufferedImage Tens = null;
	private BufferedImage Elevenc = null;
	private	BufferedImage Elevend = null;
	private BufferedImage Elevenh = null;
	private	BufferedImage Elevens = null;
	private BufferedImage Twelvec = null;
	private	BufferedImage Twelved = null;
	private BufferedImage Twelveh = null;
	private	BufferedImage Twelves = null;
	private BufferedImage Thirteenc = null;
	private	BufferedImage Thirteend = null;
	private BufferedImage Thirteenh = null;
	private	BufferedImage Thirteens = null;
	private BufferedImage Onec = null;
	private	BufferedImage Oned = null;
	private BufferedImage Oneh = null;
	private	BufferedImage Ones = null;

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

			Twoc=ImageIO.read(new File("2C.png"));

		
			Twod=ImageIO.read(new File("2D.png"));
			Twoh=ImageIO.read(new File("2H.png"));
			Twos=ImageIO.read(new File("2S.png"));
			Threec=ImageIO.read(new File("3C.png"));
			Threed=ImageIO.read(new File("3D.png"));
			Threeh=ImageIO.read(new File("3H.png"));
			Threes=ImageIO.read(new File("3S.png"));
			Fourc=ImageIO.read(new File("4C.png"));
			Fourd=ImageIO.read(new File("4D.png"));
			Fourh=ImageIO.read(new File("4H.png"));
			Fours=ImageIO.read(new File("4S.png"));
			Fivec=ImageIO.read(new File("5C.png"));
			Fived=ImageIO.read(new File("5D.png"));
			Fiveh=ImageIO.read(new File("5H.png"));
			Fives=ImageIO.read(new File("5S.png"));
			Sixc=ImageIO.read(new File("6C.png"));
			Sixd=ImageIO.read(new File("6D.png"));
			Sixh=ImageIO.read(new File("6H.png"));
			Sixs=ImageIO.read(new File("6S.png"));
			Sevenc=ImageIO.read(new File("7C.png"));
			Sevend=ImageIO.read(new File("7D.png"));
			Sevenh=ImageIO.read(new File("7H.png"));
			Sevens=ImageIO.read(new File("7S.png"));
			Eightc=ImageIO.read(new File("8C.png"));
			Eightd=ImageIO.read(new File("8D.png"));
			Eighth=ImageIO.read(new File("8H.png"));
			Eights=ImageIO.read(new File("8S.png"));
			Ninec=ImageIO.read(new File("9C.png"));
			Nined=ImageIO.read(new File("9D.png"));
			Nineh=ImageIO.read(new File("9H.png"));
			Nines=ImageIO.read(new File("9S.png"));
			Tenc=ImageIO.read(new File("10C.png"));
			Tend=ImageIO.read(new File("10D.png"));
			Tenh=ImageIO.read(new File("10H.png"));
			Tens=ImageIO.read(new File("10S.png"));
			Elevenc=ImageIO.read(new File("JC.png"));
			Elevend=ImageIO.read(new File("JD.png"));
			Elevenh=ImageIO.read(new File("JH.png"));
			Elevens=ImageIO.read(new File("JS.png"));
			Twelvec=ImageIO.read(new File("QC.png"));
			Twelved=ImageIO.read(new File("QD.png"));
			Twelveh=ImageIO.read(new File("QH.png"));
			Twelves=ImageIO.read(new File("QS.png"));
			Thirteenc=ImageIO.read(new File("KC.png"));
			Thirteend=ImageIO.read(new File("KD.png"));
			Thirteenh=ImageIO.read(new File("KH.png"));
			Thirteens=ImageIO.read(new File("KS.png"));
			Onec=ImageIO.read(new File("AC.png"));
			Oned=ImageIO.read(new File("AD.png"));
			Oneh=ImageIO.read(new File("AH.png"));
			Ones=ImageIO.read(new File("AS.png"));
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
				Random=(int)(Math.random( )* 52  + 1);//choose RandomPlace Random
				
				int x=200,y=800;
				int Random1=1;			
				
				if (Random1==1)
				{
					g.drawImage(Twoc, 100,200, 90,90,this);
				}
				if (Random1==2)
				{
					g.drawImage(Twod, x+100,y, 90,90,this);
				}
				if (Random1==3)
				{
					g.drawImage(Twoh, x+100,y, 90,90,this);
				}
				if (Random1==4)
				{
					g.drawImage(Threec, x+100,y, 90,90,this);
				}
				if (Random1==5)
				{
					g.drawImage(Threed, x+100,y, 90,90,this);
				}
				if (Random1==6)
				{
					g.drawImage(Threeh, x+100,y, 90,90,this);
				}
				if (Random1==7)
				{
					g.drawImage(Threes, x+100,y, 90,90,this);
				}
				if (Random1==8)
				{
					g.drawImage(Fourc, x+100,y, 90,90,this);
				}
				if (Random1==9)
				{
					g.drawImage(Fourd, x+100,y, 90,90,this);
				}
				if (Random1==10)
				{
					g.drawImage(Fourh, x+100,y, 90,90,this);
				}
				if (Random1==11)
				{
					g.drawImage(Fours, x+100,y, 90,90,this);
				}
				if (Random1==12)
				{
					g.drawImage(Fivec, x+100,y, 90,90,this);
				}
				if (Random1==13)
				{
					g.drawImage(Fived, x+100,y, 90,90,this);
				}
				if (Random1==14)
				{
					g.drawImage(Fiveh, x+100,y, 90,90,this);
				}
				if (Random1==15)
				{
					g.drawImage(Fives, x+100,y, 90,90,this);
				}
				if (Random1==16)
				{
					g.drawImage(Sixc, x+100,y, 90,90,this);
				}
				if (Random1==17)
				{
					g.drawImage(Sixd, x+100,y, 90,90,this);
				}
				if (Random1==18)
				{
					g.drawImage(Sixh, x+100,y, 90,90,this);
				}
				if (Random1==19)
				{
					g.drawImage(Sixs, x+100,y, 90,90,this);
				}
				if (Random1==20)
				{
					g.drawImage(Sevenc, x+100,y, 90,90,this);
				}
				if (Random1==21)
				{
					g.drawImage(Sevend, x+100,y, 90,90,this);
				}
				if (Random1==22)
				{
					g.drawImage(Sevenh, x+100,y, 90,90,this);
				}
				if (Random1==23)
				{
					g.drawImage(Sevens, x+100,y, 90,90,this);
				}
				if (Random1==24)
				{
					g.drawImage(Eightc, x+100,y, 90,90,this);
				}
				if (Random1==25)
				{
					g.drawImage(Eightd, x+100,y, 90,90,this);
				}
				if (Random1==26)
				{
					g.drawImage(Eighth, x+100,y, 90,90,this);
				}
				if (Random1==27)
				{
					g.drawImage(Eights, x+100,y, 90,90,this);
				}
				if (Random1==28)
				{
					g.drawImage(Ninec, x+100,y, 90,90,this);
				}
				if (Random1==29)
				{
					g.drawImage(Nined, x+100,y, 90,90,this);
				}
				if (Random1==30)
				{
					g.drawImage(Nineh, x+100,y, 90,90,this);
				}
				if (Random1==31)
				{
					g.drawImage(Nines, x+100,y, 90,90,this);
				}
				if (Random1==32)
				{
					g.drawImage(Tenc, x+100,y, 90,90,this);
				}
				if (Random1==33)
				{
					g.drawImage(Tend, x+100,y, 90,90,this);
				}
				if (Random1==34)
				{
					g.drawImage(Tenh, x+100,y, 90,90,this);
				}
				if (Random1==35)
				{
					g.drawImage(Tens, x+100,y, 90,90,this);
				}
				if (Random1==36)
				{
					g.drawImage(Elevenc, x+100,y, 90,90,this);
				}
				if (Random1==37)
				{
					g.drawImage(Elevend, x+100,y, 90,90,this);
				}
				if (Random1==38)
				{
					g.drawImage(Elevenh, x+100,y, 90,90,this);
				}
				if (Random1==39)
				{
					g.drawImage(Elevens, x+100,y, 90,90,this);
				}
				if (Random1==40)
				{
					g.drawImage(Twelvec, x+100,y, 90,90,this);
				}
				if (Random1==41)
				{
					g.drawImage(Twelved, x+100,y, 90,90,this);
				}
				if (Random1==42)
				{
					g.drawImage(Twelveh, x+100,y, 90,90,this);
				}
				if (Random1==43)
				{
					g.drawImage(Twelves, x+100,y, 90,90,this);
				}
				if (Random1==44)
				{
					g.drawImage(Thirteenc, x+100,y, 90,90,this);
				}
				if (Random1==45)
				{
					g.drawImage(Thirteend, x+100,y, 90,90,this);
				}
				if (Random1==46)
				{
					g.drawImage(Thirteenh, x+100,y, 90,90,this);
				}
				if (Random1==47)
				{
					g.drawImage(Thirteens, x+100,y, 90,90,this);
				}
				if (Random1==48)
				{
					g.drawImage(Onec, x+100,y, 90,90,this);
				}
				if (Random1==49)
				{
					g.drawImage(Oned, x+100,y, 90,90,this);
				}
				if (Random1==50)
				{
					g.drawImage(Oneh, x+100,y, 90,90,this);
				}
				if (Random1==51)
				{
					g.drawImage(Ones, x+100,y, 90,90,this);
				}
				if (Random1==52)
				{
					g.drawImage(Ones, x+100,y, 90,90,this);
				}
				

				
				
				
				
				System.out.println("Random " +Random);

//				System.out.println("The cards " +CompCards[i]);
				CompCards[i]=Random;
				System.out.println("new" +CompCards[i]);
			}
			
			Scanner input = null;
			  int sum,NUM1,NUM2;
	          String num1,num2;
	          
		    num1=JOptionPane.showInputDialog("Would you like to play again? (1==yes, 2==no)");
		    start = Integer.parseInt(num1.trim());
		    if (start==2)
		    {
		   JOptionPane.showMessageDialog(null,"Thank you for playing ");
		    }



		}}

		}
		 
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