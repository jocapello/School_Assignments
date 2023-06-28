

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Crib extends JPanel implements MouseListener
{
	// For nicer code
	// make a function that generates the pictures only when called
	// more classes
	
	// For functional code
	// create functional turns 
	// play out hand 
	// Turn over crib 
	// add math
	// finally create winning scenarios and brag about how good i am at coding 
	
	//creating the image variables
	private static final String SelectedCard = null;
	private static final String[] args = null;
	private static BufferedImage Background = null;
	private static BufferedImage Back = null;
	private static BufferedImage Logo = null;
	private static BufferedImage Rules = null;

	// cards
	private BufferedImage [] deck= new BufferedImage [52];

	boolean Catcher=true;
    int Red=(int) ((Math.random()*255)+1); // generate random amounts of red, green and blue
    int Green=(int) ((Math.random()*255)+1);
    int Blue=(int) ((Math.random()*255)+1);
    static String CARD1 = null,CARD2=null;
	static int length=6,Points,ComputerPoints;
	static int Hand=0,Game=0,InPlay=0;
	static int start;
	static int card1,card2;
	static int [] Distance= {60,120,180,240,300,360};
	static int [] Played= {0,0,0,0,0,0,0,0,0,0,0,0,0};

	static // points in play
	int PIP=0;
	static int i=0,Menu=1,j1=0,X=0;
	static int [] CardHand= {0,0,0,0,0,0};
	static int [] CardHandComp= {0,0,0,0,0,0};

	static int [ ] Value2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,
			1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13};
	static int [ ] Value = {1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,
			1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10};

    static int Turn=1;
    		//(int) (Math.random()*2+1);
   
    // track the originals 
    static int [] RandomCards={0,0,0,0,0,0};
	static int [] RandomCompCards={0,0,0,0,0,0};

	// track the changes
	static int [] RandomCards2={0,0,0,0,0,0};
	static int [] RandomCompCards2={0,0,0,0,0,0};
	
	// track the changes for drawing 
	int [] RandomCards3={0,0,0,0,0,0};
	static int [] RandomCompCards3={0,0,0,0,0,0};
	
	static int r;
	static int [ ]  Numbered = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
			27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
	int [ ]  Numbered2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
			27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
	public Crib()
	{
		addMouseListener((MouseListener) this);
	}
	public void mousePressed(MouseEvent e) {   }
	public void mouseReleased(MouseEvent e) {  }
	public void mouseEntered(MouseEvent e) {    }
	public void mouseExited(MouseEvent e) {   }
	
	public void Pictures(java.awt.Graphics g,int Menu)
	{
		super.paintComponent(g);

		if (Catcher==true)
		{
			//generate cards

			try   // load the images 
			{
				//background
				Back=ImageIO.read(new File("back.png"));
				Background=ImageIO.read(new File("1.png"));
				Logo=ImageIO.read(new File("logo.png"));
				Rules=ImageIO.read(new File("Rules.png"));
				// cards

				// Clubs
				deck[0]=ImageIO.read(new File("AC.png"));
				deck[1]=ImageIO.read(new File("2C.png"));
				deck[2]=ImageIO.read(new File("3C.png"));
				deck[3]=ImageIO.read(new File("4C.png"));
				deck[4]=ImageIO.read(new File("5C.png"));
				deck[5]=ImageIO.read(new File("6C.png"));
				deck[6]=ImageIO.read(new File("7C.png"));
				deck[7]=ImageIO.read(new File("8C.png"));
				deck[8]=ImageIO.read(new File("9C.png"));
				deck[9]=ImageIO.read(new File("10C.png"));
				deck[10]=ImageIO.read(new File("JC.png"));
				deck[11]=ImageIO.read(new File("QC.png"));
				deck[12]=ImageIO.read(new File("KC.png"));
				// Diamonds
				deck[13]=ImageIO.read(new File("AD.png"));
				deck[14]=ImageIO.read(new File("2D.png"));
				deck[15]=ImageIO.read(new File("3D.png"));
				deck[16]=ImageIO.read(new File("4D.png"));
				deck[17]=ImageIO.read(new File("5D.png"));
				deck[18]=ImageIO.read(new File("6D.png"));
				deck[19]=ImageIO.read(new File("7D.png"));
				deck[20]=ImageIO.read(new File("8D.png"));
				deck[21]=ImageIO.read(new File("9D.png"));
				deck[22]=ImageIO.read(new File("10D.png"));
				deck[23]=ImageIO.read(new File("JD.png"));
				deck[24]=ImageIO.read(new File("QD.png"));
				deck[25]=ImageIO.read(new File("KD.png"));
				// Hearts				
				deck[26]=ImageIO.read(new File("AH.png"));
				deck[27]=ImageIO.read(new File("2H.png"));
				deck[28]=ImageIO.read(new File("3H.png"));
				deck[29]=ImageIO.read(new File("4H.png"));
				deck[30]=ImageIO.read(new File("5H.png"));
				deck[31]=ImageIO.read(new File("6H.png"));
				deck[32]=ImageIO.read(new File("7H.png"));
				deck[33]=ImageIO.read(new File("8H.png"));
				deck[34]=ImageIO.read(new File("9H.png"));
				deck[35]=ImageIO.read(new File("10H.png"));
				deck[36]=ImageIO.read(new File("JH.png"));
				deck[37]=ImageIO.read(new File("QH.png"));
				deck[38]=ImageIO.read(new File("KH.png"));
				// Spades
				deck[39]=ImageIO.read(new File("AS.png"));
				deck[40]=ImageIO.read(new File("2S.png"));
				deck[41]=ImageIO.read(new File("3S.png"));
				deck[42]=ImageIO.read(new File("4S.png"));
				deck[43]=ImageIO.read(new File("5S.png"));
				deck[44]=ImageIO.read(new File("6S.png"));
				deck[45]=ImageIO.read(new File("7S.png"));
				deck[46]=ImageIO.read(new File("8S.png"));
				deck[47]=ImageIO.read(new File("9S.png"));
				deck[48]=ImageIO.read(new File("10S.png"));
				deck[49]=ImageIO.read(new File("JS.png"));
				deck[50]=ImageIO.read(new File("QS.png"));
				deck[51]=ImageIO.read(new File("KS.png"));
			}
			catch(IOException e)  		//catching if the image was not there
			{
				System.out.println("could not find image");
				g.drawString("Could not find images",100,100);
			}
			Catcher=false;
		}


        if (Menu==1) {
		//menu screen

        g.setColor(new Color(Red,Green,Blue));
        g.fillOval(-500,-500,3000,3000);
        
		g.drawImage(Logo, 1800,20, 100,100,this);
		
    	g.setColor(Color.BLACK);      
		Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
		g.setFont(myFont);// write text on the screen starting at location (250,30)
		g.drawString ("Cribbage",790,100);
		
		g.drawString ("Play",900,450);
		g.drawString ("How to play",750,600);
		g.drawString ("Quit",900,750);}
        
		repaint();
	}
	// Second menu screen
	public void paintComponent1(java.awt.Graphics g,int Menu,int Points, int ComputerPoints) {
		 if (Menu==2) {
				// Rules page
				g.drawImage(Rules, 0,0, 2000,1000,this);
				
				g.setColor(Color.RED);
			    g.fillOval(920,900,120,150);
				g.setColor(Color.BLACK);
				Font myFont = new Font("Arial", Font.PLAIN,20);  //Set the font to a bigger size
				g.setFont(myFont);// write text on the screen starting at location (250,30)
				g.drawString ("Click here to ",925,960);
				g.drawString ("go back to the menu",890,980);
				
				g.drawString ("Player Points "+Points,100,100);
				g.drawString ("Computer Points "+ComputerPoints,100,200);}	
	}
		
	public void DrawCards(java.awt.Graphics g,int Menu,int Points, int ComputerPoints, int Hand, 
			int [] RandomCards2, int [] RandomCards,int [] RandomCompCards2, int [] RandomCompCards,int r,int [] Numbered) {

		
        if (Menu==3 || Menu==4) {
		// background
		g.drawImage(Background, 0,0, 2000,1000,this);
		g.setColor(Color.LIGHT_GRAY);
		Font myFont3 = new Font("Arial", Font.PLAIN,60);  //Set the font to a bigger size
		g.setFont(myFont3);// write text on the screen starting at location (250,30)
		
//		// the back of the cards
//		for (int j=0;j<length;j++) //Draw the starting 6
//		{
//			g.drawImage(Back, 500+150*j,-50, 250,250,this);
//		}	
//		
//		g.setColor(Color.WHITE);    
//		Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
//		g.setFont(myFont);// write text on the screen starting at location (250,30)
//		g.drawString ("Cribbage",850,500);


		
		if (Hand==1) {
			
			for (int i=0;i<6;i++) //Draw the number of cards
			{
				// Draw cards after there thrown
				if (RandomCards2[i]!=100) {
				g.drawImage(deck[RandomCards[i]], 400+200*i,700, 200,200,this);
				}
				Font myFont2 = new Font("Arial", Font.PLAIN,30);  //Set the font to a bigger size
				g.setFont(myFont2);// write text on the screen starting at location (250,30)
				g.drawString ("Card"+i,400+200*i,920);
				repaint();
			}
			for (int i=0;i<6;i++) //Draw the number of cards
			{
				// Draw cards after there thrown
				if (RandomCompCards2[i]!=100) {
				g.drawImage(deck[RandomCompCards[i]], 400+200*i,20, 200,200,this);
				}
			}
		}
	if (Hand==0) {
		// players hand
		for (int i=0;i<6;i++) {
			r=(int)(Math.random( )* 50  + 1);
			if (Numbered[r]!=100) {
				RandomCards[i]=Numbered[r];
				Numbered[r]=100;
			}
		}
		// computers hand
		for (int i=0;i<6;i++) {
			r=(int)(Math.random( )* 50  + 1);
			if (Numbered[r]!=100) {
				RandomCompCards[i]=Numbered[r];
				Numbered[r]=100;
			}
		}
		
		for (int i=0;i<6;i++) //Draw the number of player cards
		{
				g.drawImage(deck[RandomCards[i]], 400+200*i,700, 200,200,this);
				Font myFont2 = new Font("Arial", Font.PLAIN,30);  //Set the font to a bigger size
				g.setFont(myFont2);// write text on the screen starting at location (250,30)
				g.drawString ("Card"+i,400+200*i,920);
				repaint();
		}
		for (int i=0;i<6;i++) //Draw the number comp of cards
		{
				g.drawImage(deck[RandomCompCards[i]],400+200*i,20, 200,200,this);
				Font myFont2 = new Font("Arial", Font.PLAIN,30);  //Set the font to a bigger size
				g.setFont(myFont2);// write text on the screen starting at location (250,30)
				g.drawString ("Card"+i,400+200*i,920);
				repaint();
		}
	}
}}
	
public void ThrownCards(java.awt.Graphics g,int Game,int []RandomCards, int [] CardHand,int PIP, int Points, int ComputerPoints,int [] Distance,
		int [] CardHandComp, int [] RandomCompCards, int Menu) {

// puts the selected card in play
if (Game==1) {
	g.drawString ("Total "+PIP,250,600);

	Font myFont5 = new Font("Arial", Font.PLAIN,40);  //Set the font to a bigger size
	g.setFont(myFont5);// write text on the screen starting at location (250,30)
	g.drawString ("Player Points "+Points,100,300);
	g.drawString ("Computer Points "+ComputerPoints,100,400);
//	if (Turn==1) {
//	g.drawImage(deck[RandomCards[InPlay]],800,500, 200,200,this);}
//	if (Turn==2) {
//	g.drawImage(deck[RandomCompCards[X]],1000,300, 200,200,this);
//	}
//	if (Turn==3) {			
////	g.drawImage(deck[RandomCards[InPlay]],800,500, 200,200,this);
//	g.drawImage(deck[RandomCompCards[X]],1000,300, 200,200,this);
	for (int i=0;i<6;i++) {
		if (CardHand[i]!=0) {
			g.drawImage(deck[RandomCards[i]],800+Distance[i],500, 200,200,this);
			if (CardHandComp[i]!=0) {
			g.drawImage(deck[RandomCompCards[i]],1000+Distance[i],300, 200,200,this);
	}}}}}
	
	static boolean YN;
	static String RUsure;
	static String CN = null;
	int temp[]= {0,0};
	int temp1 = 0, temp2 = 0;
	public void mouseClicked(MouseEvent e,int Menu) 
	{	
		int x=e.getX(); // get the x and y location of the mouse
		int y=e.getY();
	
		// the opening menu 
		while (Menu==1) {
			// play
			if (x>=900 && x<=1100 && y>=400 && y<=480)
			{
				Menu=3;
			}
			// how to play
			if (x>=750 && x<=1300 && y>=500 && y<=620)
			{
				Menu=2;
			}
			//quit button
			if (x>=900 && x<=100 && y>=950 && y<=1100)
			{
				
			}
		}
		// quit button for other features?
		if (Menu==2) 
		{
			if (x>=850 && x<=1000 && y>=900 && y<=1200)
			{
				Menu=1;
			}
		}
		
		}	
	public static void Select(MouseEvent e,int Menu,int j1,int [] RandomCards2, int [] CardHand, int [] RandomCards,
			int Game, int InPlay, int [] Played) {
		if (Menu==4) {
			int CompPlay=0;
			int x1=e.getX(); // get the x and y location of the mouse
			int y1=e.getY();
			for (j1=0;j1<6;j1++)//pick cards loop
			{
				if (x1>=400+200*j1 && x1<=400+200*j1+200 && y1>=700 && y1<=900)//find which card is chosen
				{
					if (RandomCards2[j1]==0) {
						String RUsure = JOptionPane.showInputDialog("Is the card you would like to play card "+j1);
						boolean YN = RUsure.startsWith("y");
						if (YN==true)
						{	
							CardHand[j1]=1;
							// tell me my cards and comps 
							for (int p=0;p<6;p++) {
								// makes a list of all the cards remaining besides those selected which are 100
								if (RandomCards2[p]==0) {
									RandomCards2[p]=RandomCards[p];
									RandomCards2[j1]=100;
								}
							}
							Game=1;
							InPlay=j1;
							for (int i=0;i<13;i++)
							Played[i]=RandomCards[InPlay];
							Menu=3;
								// resets them to be the same
								//RandomCards=RandomCards2;
							WorkMath system = new WorkMath();
							system.PlayerTurn();

							}
						}
						else {
							Menu=4;
						}
					}
				}
			}	
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	public static void Throw(int x,int y,int Menu,int length, int [] RandomCards2, int [] Value2,int []RandomCards, String CARD1, String CARD2, int Hand) {
		if (Menu==3) {
		int chose = 0;

		for (int p=0;p<length;p++)//pick cards loop
		{
			if (x>=400+200*p && x<=400+200*p+200 && y>=700 && y<=900)//find which card is chosen
			{
				chose++; // if they choose 2 cards
//				System.out.println("The card is card "+chose);// counts the number of selected
//				System.out.println("The selected card is " +p);// which card 
				RandomCards2[p]=100;
//				System.out.println("The given number is " +Value[RandomCards[p]]);//the value
			
				// if face card
				if (Value2[RandomCards[p]]==11) {
					CN="Jack of ";}
					if (Value2[RandomCards[p]]==12) {
						CN="Queen of ";}
						if (Value2[RandomCards[p]]==13) {
							CN="King of ";}
		
				// if it does not
				if (Value2[RandomCards[p]]<11) {
					CN=Value2[RandomCards[p]]+" ";}
			
				WorkMath system = new WorkMath();
				system.Namer(Value2,RandomCards,p,CN, p);
				
				if (CARD1.equals(CARD2) == true) { 
					JOptionPane.showMessageDialog(null,"You cannot choose the same card twice ");
		            chose=0;
		        } 
			}
		}
		if (chose==2) {
			RUsure=JOptionPane.showInputDialog("Are the cards you would like to throw are "+CARD1+" and "+CARD2);
			//RUsure1 = Integer.parseInt(RUsure.trim());
			RUsure=RUsure.toLowerCase();
			
			YN=RUsure.startsWith("y");
			if (YN==true)
			{	
				int X=0;
				length=4;
				Hand=1;
				// replaces all letters with empty spaces
				CARD1 = CARD1.replaceAll("\\D+","");			
				CARD2 = CARD2.replaceAll("\\D+","");			
//				System.out.println(CARD1+" and "+CARD2);
				
				for (int p=0;p<6;p++) {
					if (RandomCards2[p]!=100) {
						//System.out.print(Value[RandomCards2[p]]+" ");
						}}		
//				RandomSelector();
//				RandomSelector();
				Menu=4;
		}
			else 
			{
				for (int p=0;p<6;p++) {
				RandomCards2[p] = RandomCards[p];}
				JOptionPane.showMessageDialog(null,"Select the 2 cards you would like to throw ");
				chose=0;
			}
		}
	}
	}
	public void mouseClicked1(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
//REPAINT();