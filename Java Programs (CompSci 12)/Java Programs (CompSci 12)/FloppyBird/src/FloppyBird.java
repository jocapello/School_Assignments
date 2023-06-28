import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;

import java.awt.event.*;
import java.io.*;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

public class FloppyBird extends JPanel implements ActionListener, KeyListener, MouseListener
{
	Timer t = new Timer(5,this);

	//creating the image variables
	private BufferedImage Background = null;
	private BufferedImage Gameover = null;
	private BufferedImage Character = null;	
	private BufferedImage Menu = null;
	private BufferedImage Char1 = null;
	private BufferedImage Char2 = null;
	private BufferedImage Char3 = null;



	// int 
	boolean Catcher=true;

	// R1A+R1B 
	int yA = 650,yB= 550,yC= 150,yD=245,yE=345;
	int x = 1470,y = 750,y1 = -70,x2 = 100,y2 = 200;
	// R2A+R2B
	int	Ya = 650,Yb= 550,Yc= 150,Yd=245,Ye=345;	
	int X2 = 2270,Y = 750,Y2 = -70,X3 = 100,Y3 = 200;
	// R3A+R3B
	int	Ya1 = 650,Yb1= 550,Yc1= 150,Yd1=245,Ye1=345;	
	int X21 = 3070,Y1 = 750,Y21 = -70,X31 = 100,Y31 = 200;

	double Controls,Start;
	int xVel=0;
	int yVel=0;
	int Xmove=100,Ymove=500;
	int code;
	double 
	HitDetDown1,HitDetDown2,HitDetDown3,
	HitDetUp1sa,HitDetUp1ma,HitDetUp1la,
	HitDetUp1sb,HitDetUp1mb,HitDetUp1lb,
	HitDetUp2sa,HitDetUp2ma,HitDetUp2la,
	HitDetUp2sb,HitDetUp2mb,HitDetUp2lb,
	HitDetUp3sa,HitDetUp3ma,HitDetUp3la,
	HitDetUp3sb,HitDetUp3mb,HitDetUp3lb;


	public int R1A,R1B,R2A,R2B,R3A,R3B;
	int lives=3;
	int num1=1;
	int scene=1;

	public void mousePressed(MouseEvent e) {   }
	public void mouseReleased(MouseEvent e) {  }
	public void mouseEntered(MouseEvent e) {    }
	public void mouseExited(MouseEvent e) {   }
	public FloppyBird()//Starts timer
	{
		addMouseListener((MouseListener) this);
		t.start();	
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);

		R1A=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		R1B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random

		// lowering the chance of getting the same size pipe
		if (R1A==R1B)
		{
			R1B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		}
		if (R1A==R1B)
		{
			R1B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		}
		if (R1A==R1B)
		{
			R1B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		}
		R2A=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		R2B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random

		// lowering the chance of getting the same size pipe
		if (R2A==R2B)
		{
			R2B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		}
		if (R2A==R2B)
		{
			R2B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		}
		if (R2A==R2B)
		{
			R2B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		}

		R3A=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		R3B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random

		// lowering the chance of getting the same size pipe
		if (R3A==R3B)
		{
			R3B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		}
		if (R3A==R3B)
		{
			R3B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		}
		if (R3A==R3B)
		{
			R3B=(int)(Math.random( )* 3  + 1);//choose RandomPlace Random
		}

	}	
	public void paintComponent(Graphics g)
	{

		super.paintComponent(g);

		try   // load the images 
		{
//			int NUM2;
//			String Pic;
//		    Pic=JOptionPane.showInputDialog("What picture would you like to use?");
//			Character=ImageIO.read(new File(Pic));
			
			//background
			Background=ImageIO.read(new File("1.png"));
			Gameover=ImageIO.read(new File("2.png"));
			
		//	Menu=ImageIO.read(new File("4.png"));
			
			Char1=ImageIO.read(new File("Char1.jpg"));
			Char2=ImageIO.read(new File("Char2.jpg"));
			Char3=ImageIO.read(new File("Char3.jpg"));

		}
		catch(IOException e)  		//catching if the image was not there
		{
			System.out.println("could not find image");
			g.drawString("Could not find images",100,100);
		}
		
		Catcher=false;

		

		
		if (scene==1) { //loading screen
			Font myFont = new Font("Arial", Font.PLAIN,50);  //Set the font to a bigger size
			g.setFont(myFont);

			g.setColor(Color.BLUE);
			g.fillOval(-500,-500,3000,3000);
			g.setColor(Color.RED);
			g.fillRect (1000 ,500, 300, 100);
			g.fillRect (500 , 500, 300, 100);
			g.setColor(Color.BLACK);
			g.drawString ("Start",590,575);
			g.drawString ("How to play ",1020,550);
			g.drawString (" + controls ",1020,600);

		}
		Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
		g.setFont(myFont);
		if (scene==2)
		{
			x=x-1;
			X2=X2-1;
			X21=X21-1;
			g.drawImage(Background, 0,0, 1920,1080,this);


			g.setColor(new Color(0,0,0));
			g.drawString ("You have " +lives +" Lives",75,100);
			// pipes
			// small
			Color PipeGreen = new Color (0, 200, 0);  //creates your new color
			Color DarkPipe = new Color (0, 110, 0);  //creates your new color

//			// bird
//			g.setColor(Color.YELLOW);
//			g.fillOval(Xmove,Ymove,200,200);
//
//			g.setColor(Color.BLACK);
//			g.fillOval(Xmove+20,Ymove+20,50,50);
//			g.fillOval(Xmove+100,Ymove+20,50,50);
//
//			g.fillRect (Xmove , Ymove, 200, 20);
//			g.fillRect (Xmove+30 , Ymove, 140, -100);
//
//
//			g.setColor(Color.WHITE);
//			g.fillOval(Xmove+25,Ymove+25,15,15);
//			g.fillOval(Xmove+105,Ymove+25,15,15);
//
//			g.setColor(new Color(255,0,0));
//			g.fillOval(Xmove+15,Ymove+110,120,20);
			g.drawImage(Char1, x,y, 125, 125,this);


			if (R1A==1) {
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (x+30 , y, 140, 300);// Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-30,y-10,260,90);// Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-20,y,240,70);// Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("small",x,y);
			}

			if (R1B==1) {
				//upside down
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (x+30 , y1-20, 140, 300); // Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-30,yC-10,260,90); // Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-20,yC,240,70); // Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Small",x,y1+200);
			}
			if (R1A==2) {
				// Medium
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (x+30 , yA+10, 140, 390);// Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-30,yA,260,90);// Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-20,yA+10,240,70);// Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Medium",x,yA);
			}

			if (R1B==2) {
				//upside down
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (x+30 , y1+30, 140, 390); // Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-30,yD+25,260,90); // Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-20,yD+35,240,70); // Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Medium",x,y1+200);
			}

			if (R1A==3) {
				// Large
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (x+30 , yB, 140, 500);// Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-30,yB,260,90);// Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-20,yB+10,240,70);// Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Large",x,yB);
			}
			g.drawString ("x "+x,400,200+200);

			if (R1B==3) {
				//upside down
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (x+30 , y1+30, 140, 500); // Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-30,yE+25,260,90); // Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(x-20,yE+35,240,70); // Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Large",x,y1+200);


			}}
		if (x<=1300)
		{
			Color PipeGreen = new Color (0, 200, 0);  //creates your new color
			Color DarkPipe = new Color (0, 110, 0);  //creates your new color

			if (R2A==1) {
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X2+30 , Y, 140, 300);// Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-30,Y-10,260,90);// Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-20,Y,240,70);// Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("small",X2,Y);
			}

			if (R2B==1) {
				//upside down
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X2+30 , Y2-20, 140, 300); // Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-30,Yc-10,260,90); // Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-20,Yc,240,70); // Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Small",X2,Y2+200);
			}
			if (R2A==2) {
				// Medium
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X2+30 , Ya+10, 140, 390);// Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-30,Ya,260,90);// Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-20,Ya+10,240,70);// Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Medium",X2,Ya);
			}

			if (R2B==2) {
				//upside down
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X2+30 , Y2+30, 140, 390); // Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-30,Yd+25,260,90); // Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-20,Yd+35,240,70); // Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Medium",X2,Y2+200);
			}

			if (R2A==3) {
				// Large
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X2+30 , Yb, 140, 500);// Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-30,Yb,260,90);// Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-20,Yb+10,240,70);// Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Large",X2,Yb);
			}
			g.drawString ("X "+X2,400,400+200);

			if (R2B==3) {
				//upside down
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X2+30 , Y2+30, 140, 500); // Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-30,Ye+25,260,90); // Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X2-20,Ye+35,240,70); // Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Large",X2,Y2+200);
			}}
		if (X2<=1300)
		{
			Color PipeGreen = new Color (0, 200, 0);  //creates your new color
			Color DarkPipe = new Color (0, 110, 0);  //creates your new color

			if (R3A==1) {
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X21+30 , Y1, 140, 300);// Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-30,Y1-10,260,90);// Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-20,Y1,240,70);// Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("small",X21,Y1);
			}
			if (R3B==1) {
				//upside down
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X21+30 , Y21-20, 140, 300); // Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-30,Yc1-10,260,90); // Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-20,Yc1,240,70); // Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Small",X21,Y21+200);
			}
			if (R3A==2) {
				// Medium
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X21+30 , Ya1+10, 140, 390);// Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-30,Ya1,260,90);// Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-20,Ya1+10,240,70);// Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Medium",X21,Ya1);
			}

			if (R3B==2) {
				//upside down
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X21+30 , Y21+30, 140, 390); // Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-30,Yd1+25,260,90); // Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-20,Yd1+35,240,70); // Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Medium",X21,Y21+200);
			}

			if (R3A==3) {
				// Large
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X21+30 , Yb1, 140, 500);// Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-30,Yb1,260,90);// Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-20,Yb1+10,240,70);// Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Large",X21,Yb1);
			}
			g.drawString ("X "+X2,400,600+200);

			if (R3B==3) {
				//upside down
				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect (X21+30 , Y21+30, 140, 500); // Base

				g.setColor(DarkPipe);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-30,Ye1+25,260,90); // Shadow

				g.setColor(PipeGreen);  //accesses your new color  (NO dot operator)	
				g.fillRect(X21-20,Ye1+35,240,70); // Opening
				g.setFont(myFont);
				g.setColor(new Color(0,0,0));
				g.drawString ("Large",X21,Y21+200);
			}}
		if (scene==3)
		{
			g.drawImage(Gameover, 0,0, 1920,1080,this);
		}
	}

	public void actionPerformed(ActionEvent e) {
//		if (R1A==1) {
//			HitDetDown1 = Math.sqrt( Math.pow(x-Xmove, 2.0)+Math.pow(y-Ymove, 2.0));}
//		if (R1A==2) {
//				HitDetDown2 = Math.sqrt( Math.pow(X2-Xmove, 2.0)+Math.pow(Y-Ymove, 2.0));}
//			if (R1A==3) {
//				HitDetDown3 = Math.sqrt( Math.pow(X21-Xmove, 2.0)+Math.pow(Y1-Ymove, 2.0));}
			//						// R1A+R1B 
			//						int yA = 650,yB= 550,yC= 150,yD=245,yE=345;
			//						int x = 1470,y = 750,y1 = -70,x2 = 100,y2 = 200;
			//						// R2A+R2B
			//						int	Ya = 650,Yb= 550,Yc= 150,Yd=245,Ye=345;	
			//						int X2 = 2270,Y = 750,Y2 = -70,X3 = 100,Y3 = 200;
			//						// R3A+R3B
			//						int	Ya1 = 650,Yb1= 550,Yc1= 150,Yd1=245,Ye1=345;	
			//						int X21 = 3070,Y1 = 750,Y21 = -70,X31 = 100,Y31 = 200;
			//	int Xmove=100,Ymove=500;

			// small pipes
			if (R1B==1 || R2B==1 || R3B==1)
			{
				HitDetUp1sa = Math.sqrt( Math.pow(x-Xmove, 2.0)+Math.pow(yC-Ymove, 2.0));
				HitDetUp1sb = Math.sqrt( Math.pow(x-Xmove, 2.0)+Math.pow(y1-Ymove, 2.0));

				HitDetUp2sa = Math.sqrt( Math.pow(X2-Xmove, 2.0)+Math.pow(Yc-Ymove, 2.0));
				HitDetUp2sb = Math.sqrt( Math.pow(X2-Xmove, 2.0)+Math.pow(Y2-Ymove, 2.0));

				HitDetUp3sa = Math.sqrt( Math.pow(X21-Xmove, 2.0)+Math.pow(Yc1-Ymove, 2.0));
				HitDetUp3sb = Math.sqrt( Math.pow(X21-Xmove, 2.0)+Math.pow(Y21-Ymove, 2.0));

			}

			// med pipes
			if (R1B==2 || R2B==2 || R3B==2)
			{
				HitDetUp1ma = Math.sqrt( Math.pow(x-Xmove, 2.0)+Math.pow(y1-Ymove, 2.0));
				HitDetUp1mb = Math.sqrt( Math.pow(x-Xmove, 2.0)+Math.pow(yD-Ymove, 2.0));

				HitDetUp2ma = Math.sqrt( Math.pow(X2-Xmove, 2.0)+Math.pow(Yc-Ymove, 2.0));
				HitDetUp2mb = Math.sqrt( Math.pow(X2-Xmove, 2.0)+Math.pow(Yd-Ymove, 2.0));

				HitDetUp3ma = Math.sqrt( Math.pow(X21-Xmove, 2.0)+Math.pow(Yc1-Ymove, 2.0));
				HitDetUp3mb = Math.sqrt( Math.pow(X21-Xmove, 2.0)+Math.pow(Yd1-Ymove, 2.0));

			}
			// large pipes
			if (R1B==3 || R2B==3 || R3B==3)
			{
				HitDetUp1la = Math.sqrt( Math.pow(x-Xmove, 2.0)+Math.pow(y1-Ymove, 2.0));
				HitDetUp1lb = Math.sqrt( Math.pow(x-Xmove, 2.0)+Math.pow(yE-Ymove, 2.0));

				HitDetUp2la = Math.sqrt( Math.pow(X2-Xmove, 2.0)+Math.pow(Yc-Ymove, 2.0));
				HitDetUp2lb = Math.sqrt( Math.pow(X2-Xmove, 2.0)+Math.pow(Ye-Ymove, 2.0));

				HitDetUp3la = Math.sqrt( Math.pow(X21-Xmove, 2.0)+Math.pow(Ye1-Ymove, 2.0));
				HitDetUp3lb = Math.sqrt( Math.pow(X21-Xmove, 2.0)+Math.pow(Ye1-Ymove, 2.0));

			}




			// refreshes the screen every time an action is performed
			if (Ymove>=900)
			{
				Ymove=900;
			}
			if (Ymove<=50)
			{
				Ymove=50;
			}

			// lower pipes
			if (HitDetDown1<=200) {
				hit();}	
			//		if (HitDetDown2>=200) {
			//				hit();}if (HitDetDown3>=200) {
			//					hit();}

			// upper pipes
			//		if (HitDetUp1sa<=200) {
			//			hit();}if (HitDetUp1sb<=200) {
			//				hit();}if (HitDetUp2sa<=200) {
			//					hit();}if (HitDetUp2sb<=200) {
			//						hit();}if (HitDetUp3sa<=200) {
			//							hit();}if (HitDetUp3sb<=200) {
			//								hit();}if (HitDetUp1ma<=200) {
			//									hit();}if (HitDetUp1sb<=200) {
			//										hit();}if (HitDetUp2ma<=200) {
			//											hit();}if (HitDetUp2mb<=200) {
			//												hit();}if (HitDetUp3ma<=200) {
			//													hit();}if (HitDetUp3mb<=200) {
			//														hit();}if (HitDetUp1la<=200) {
			//															hit();}if (HitDetUp1lb<=200) {
			//																hit();}if (HitDetUp2la<=200) {
			//																	hit();}if (HitDetUp2lb<=200) {
			//																		hit();}if (HitDetUp3la<=200) {
			//																			hit();}if (HitDetUp3lb<=200) {
			//																				hit();}


			repaint(); //performs any code in paint

	}
	public void hit() {
		lives=lives-1;
		num1=2;
		if (lives<=0)
		{
			scene=1;
		}
	}
	@Override

	public void keyPressed(KeyEvent e) 
	{
		int code = e.getKeyCode();
		switch(code)
		{
		case KeyEvent.VK_DOWN:
			Ymove=Ymove+40; //change y location down
			break;
		case KeyEvent.VK_UP:
			Ymove=Ymove-40;  //change y location up
			break;
		case KeyEvent.VK_RIGHT:
			Xmove=Xmove+40;	 //change x location right		
			break;
		case KeyEvent.VK_LEFT:
			Xmove=Xmove-40;   //change x location left
			break;
		case KeyEvent.VK_SPACE:
			Xmove=0;
			break;
		}
	}
  	 public void mouseClicked(MouseEvent e) 
	    {	
	    	int x=e.getX(); // get the x and y location of the mouse
	    	int y=e.getY();
    		System.out.println("x "+x);
    		double hit,hit2;
			hit = Math.sqrt( Math.pow(500-x, 2.0)+Math.pow(500-y, 2.0));
    		System.out.println("Hit " +hit);
			hit2 = Math.sqrt( Math.pow(1000-x, 2.0)+Math.pow(500-y, 2.0));

	    	if (hit<=300) {
	    		System.out.println("Start");
	    	}
	    	if (hit2<=300) {
	    		System.out.println("Controls");
	    	}


	    }
	@Override
	public void keyReleased(KeyEvent arg0) {}
	@Override
	public void keyTyped(KeyEvent arg0) {}

}