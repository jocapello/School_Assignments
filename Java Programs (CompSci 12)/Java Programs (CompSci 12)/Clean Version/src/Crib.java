
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

	// int
	static int CheckNext=0;
	static String CARD1 = null,CARD2=null;
	boolean Catcher=true;
	static int CompPlay=-1,Turn=1;
	static int Points,ComputerPoints,Order=0;
	static int Hand=0,Game=0,InPlay=0;
	static int start;
	static int card1,card2;
	static int chose;
	static int [] Distance= {60,120,180,240,300,360};
	static int [] Played= {0,0,0,0,0,0,0,0,0,0,0,0,0};

	// points in play
	static int PIP=0;
	static int i=0,Menu=1,X=0;
	static int [] CardHand= {0,0,0,0,0,0};
	static int [] CardHandComp= {0,0,0,0,0,0};

	static int [ ] Value2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,
			1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13};
	static int [ ] Value = {1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,
			1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10};

	int Red=(int) ((Math.random()*255)+1); // generate random amounts of red, green and blue
	int Green=(int) ((Math.random()*255)+1);
	int Blue=(int) ((Math.random()*255)+1);

	// track who cant play
	static int [] CantPlay= {0,2};
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

	public void paintComponent(java.awt.Graphics g)
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


		if (Menu==3 || Menu==4) {
			// background
			g.drawImage(Background, 0,0, 2000,1000,this);
			g.setColor(Color.LIGHT_GRAY);
			Font myFont3 = new Font("Arial", Font.PLAIN,60);  //Set the font to a bigger size
			g.setFont(myFont3);// write text on the screen starting at location (250,30)

			//		// the back of the cards
			//		for (int j=0;j<6;j++) //Draw the starting 6
			//		{
			//			g.drawImage(Back, 500+150*j,-50, 250,250,this);
			//		}	
			//		
			//		g.setColor(Color.WHITE);    
			//		Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
			//		g.setFont(myFont);// write text on the screen starting at location (250,30)
			//		g.drawString ("Cribbage",850,500);

			// puts the selected card in play
			if (Game==1) {
				g.drawString ("Total "+PIP,250,600);

				Font myFont5 = new Font("Arial", Font.PLAIN,40);  //Set the font to a bigger size
				g.setFont(myFont5);// write text on the screen starting at location (250,30)
				g.drawString ("Player Points "+AllPoints[0],100,300);
				g.drawString ("Computer Points "+AllPoints[1],100,400);
				
				for (int i=0;i<6;i++) {
					if (CardHand[i]==1) {
						g.drawImage(deck[RandomCards[i]],800+Distance[i],500, 200,200,this);}
					if (CardHandComp[i]!=0) {
						g.drawImage(deck[RandomCompCards[i]],1000+Distance[i],300, 200,200,this);
					}
				}
			}

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
	public void mouseClicked1(MouseEvent e) 
	{	
		int x=e.getX(); // get the x and y location of the mouse
		int y=e.getY();
		System.out.println(x+ " and "+ y);
	}
	public void mouseClicked(MouseEvent e) 
	{	
		int x=e.getX(); // get the x and y location of the mouse
		int y=e.getY();
		boolean YN;
		String RUsure,CN = null;
		int temp[]= {0,0};
		int temp1 = 0, temp2 = 0;
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

		// find out which cards to throw
		if (Menu==3) {
			for (int p=0;p<6;p++)//pick cards loop
			{
				if (x>=400+200*p && x<=400+200*p+200 && y>=700 && y<=900)//find which card is chosen
				{
					chose++; // if they choose 2 cards
					//				System.out.println("The card is card "+chose);// counts the number of selected
					//				System.out.println("The selected card is " +p);// which card 
					RandomCards2[p]=100;
					CardHand[p]=2;
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


					Namer(Value2,RandomCards,p,CN);
					if (CARD1.equals(CARD2) == true) { 
						JOptionPane.showMessageDialog(null,"You cannot choose the same card twice ");
						for (int i=0;i<6;i++) {
							RandomCards2[i]=0;
							CardHand[i]=0;}
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
					Hand=1;
					// replaces all letters with empty spaces
					CARD1 = CARD1.replaceAll("\\D+","");			
					CARD2 = CARD2.replaceAll("\\D+","");	

					for (int p=0;p<6;p++) {
						if (RandomCards2[p]!=100) {
							//System.out.print(Value[RandomCards2[p]]+" ");
						}}		
					RandomSelector();
					RandomSelector();
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
		// for selection during the game
		if (Menu==4) {
			int x1=e.getX(); // get the x and y location of the mouse
			int y1=e.getY();
			for (CheckNext=0;CheckNext<6;CheckNext++)//pick cards loop
			{
				if (x1>=400+200*CheckNext && x1<=400+200*CheckNext+200 && y1>=700 && y1<=900)//find which card is chosen
				{
					if (RandomCards2[CheckNext]==0) {
						RUsure=JOptionPane.showInputDialog("Is the card you would like to play card "+CheckNext);
						YN=RUsure.startsWith("y");
						if (YN==true)
						{	
							CardHand[CheckNext]=1;
							// tell me my cards and comps 
							for (int p=0;p<6;p++) {
								// makes a list of all the cards remaining besides those selected which are 100
								if (RandomCards2[p]==0) {
									RandomCards2[p]=RandomCards[p];
									RandomCards2[CheckNext]=100;
								}
							}
							System.out.println("menu4 "+CheckNext);
							Game=1;
							InPlay=CheckNext;
							for (int i=0;i<13;i++) {
								Played[i]=RandomCards[InPlay];}
							Menu=3;
							System.out.println("menu4 pt2 "+CheckNext);

							PIP=Value[RandomCards[CheckNext]];
							Timer();

							// resets them to be the same
							//RandomCards=RandomCards2;

						}
						else {
							Menu=4;
						}
					}
				}
			}
		}		
	}	
	//	public static void PlayerTurn() {
	//		RandomSelector();
	//		CardHandComp[X]=1;
	//		Timer();
	//	//	PIP=Value[RandomCards[CheckNext]]+Value[RandomCompCards[X]];
	//	}
	public static void RandomSelector() {
		X=(int)(Math.random( )* 6);
		if (RandomCompCards2[X]!=100) {
			RandomCompCards2[X]=100;
		}
		else {
			RandomSelector();
		}
	}
	public static void CompPlayCard() {
		Turn=2;
		if (CantPlay[0]==CantPlay[1]) {
			JOptionPane.showMessageDialog(null,"Next round ");
		}
		int num=1;
		while (num==1) {
			CompPlay=(int)(Math.random( )* 6);
			if (RandomCompCards2[CompPlay]==100) {
				CompPlayCard();
			}
			else {
				if (PIP+Value[RandomCompCards[CompPlay]]>31) {
					// check all arent played and under 32
					if (PIP+Value[RandomCompCards[0]]<=31 && RandomCompCards2[0]!=100) {
						CompPlay=0;
					}
					else if (PIP+Value[RandomCompCards[1]]<=31 && RandomCompCards2[1]!=100) {
						CompPlay=1;
					}
					else if (PIP+Value[RandomCompCards[2]]<=31 && RandomCompCards2[2]!=100) {
						CompPlay=2;
					}
					else if (PIP+Value[RandomCompCards[3]]<=31 && RandomCompCards2[3]!=100) {
						CompPlay=3;
					}
					else if (PIP+Value[RandomCompCards[4]]<=31 && RandomCompCards2[4]!=100) {
						CompPlay=4;
					}
					else if (PIP+Value[RandomCompCards[5]]<=31 && RandomCompCards2[5]!=100) {
						CompPlay=5;
					}
						else {
							System.out.println();
							JOptionPane.showMessageDialog(null,"The computer cannot play ");
							num=2;
							CantPlay[0]=1;
							InPlay();
						}	
				}}

			if (RandomCompCards2[CompPlay]!=100) 
			{
				RandomCompCards2[CompPlay]=100;
				num=0;
			}
			else {
				num=3;
				num=1;
			}
		}
		
		if (PIP+Value[RandomCompCards[CompPlay]]<=31) {

		CardHandComp[CompPlay]=1;
		PIP=PIP+Value[RandomCompCards[CompPlay]];
		if (PIP==31) {
			PointTracker(CheckNext, Turn);
		}
		System.out.println("Compplay "+CheckNext);
		PointTracker(CheckNext, Turn);
		InPlay();
	}
		else {
			PointTracker(CheckNext, Turn);
			InPlay();
		}	
	}
	public static void Namer(int Value2[],int RandomCards[],int p,String CN){
		if (chose==1) {
			// if the number isnt a face card
			card1=Value2[RandomCards[p]];
			if(RandomCards[p]>=0 && RandomCards[p]<14)
			{
				CARD1=CN+"Club";}
			if(RandomCards[p]>=13 && RandomCards[p]<27)
			{
				CARD1=CN+"Diamond";}
			if(RandomCards[p]>=26 && RandomCards[p]<40)
			{
				CARD1=CN+"Heart";}
			if(RandomCards[p]>=39 && RandomCards[p]<53)
			{
				CARD1=CN+"Spade";}
		}
		if (chose==2) {
			card2=Value2[RandomCards[p]];
			if(RandomCards[p]>=0 && RandomCards[p]<14)
			{
				CARD2=CN+"Club";}
			if(RandomCards[p]>=13 && RandomCards[p]<27)
			{
				CARD2=CN+"Diamond";}
			if(RandomCards[p]>=26 && RandomCards[p]<40)
			{
				CARD2=CN+"Heart";}
			if(RandomCards[p]>=39 && RandomCards[p]<53)
			{
				CARD2=CN+"Spade";}
		}
	}
	static Timer t;
	static int k=0;

	public static void Timer() {
		System.out.println("timer 1 "+CheckNext);
		System.out.println("Timer");
		k=0;
		TimerTask timerTask=new TimerTask() {
			@Override
			public void run() {
				test();
			}
		};
		Timer t=new Timer();
		t.schedule(timerTask,1000,1000);
	}
	public static void test() {
		System.out.println("inside timer "+CheckNext);
		k++;
		if (k==5)
		{
			System.out.println("timer  "+CheckNext);
			CompPlayCard();
		}
	}

	// Plays through the hand even if you've reached 31 already
	public static void Between(){
		for (int i=0;i<6;i++) {
			CardHand[i]=0;
		}
		InPlay();
	}	
	public static void InPlay() {
//		for (int i=0;i<6;i++) {
//			if (RandomCompCards2[i]==100) {
//				System.out.println(RandomCompCards[i]);
//			}}
//			System.out.println();
//			System.out.println();
//			System.out.println();
//			for (int i=0;i<6;i++) {
//			if (RandomCards2[i]==100) {
//				System.out.println(RandomCards[i]);
//			}
//		}
		Turn=1;
		String Next=null;
		System.out.println("in play");

		// see if both cant play
		if (CantPlay[0]==CantPlay[1]) {
			JOptionPane.showMessageDialog(null,"Next round ");
		}

		// if they're all 100 do something else
		if (RandomCards2[0]==RandomCards2[1] && RandomCards2[2]==RandomCards2[3] && RandomCards2[4]==RandomCards2[5]) {
			int GG =Integer.parseInt(JOptionPane.showInputDialog("No more"));		
		}

		int CheckNext =Integer.parseInt(JOptionPane.showInputDialog("Which card would you like to play, if you cannot play type -1"));		

		// if they cant play
		if (CheckNext<0) {
			// go through all the cards
			for (int i=0;i<6;i++) {
				// check to see if its been played
				if (CardHand[i]!=1) {
					// check if it is over 
					if (PIP+Value[RandomCards[i]]>31) {
						JOptionPane.showMessageDialog(null,"You're right ");
						CantPlay[1]=1;
						CompPlayCard();
					}
				}
			}
			JOptionPane.showMessageDialog(null,"3You have a card you can play ");
		}


		// incase of an accident	
		if (CheckNext>=6) {
			JOptionPane.showMessageDialog(null,"You cannot select that card ");
			CheckNext=-1;
			InPlay();
		}
		// incase of an accident	
		if (CardHand[CheckNext]>0 ) {
			System.out.println("In here");
			JOptionPane.showMessageDialog(null,"You cannot select that card ");
			CheckNext=-1;
			InPlay();

		}
		if (PIP+Value[RandomCards[CheckNext]]>31) {
			JOptionPane.showMessageDialog(null,"You cannot select that card, you would be over 31 ");
			CheckNext=-1;
			InPlay();
		}
		System.out.println(PIP+Value[RandomCards[CheckNext]]);
		PIP=PIP+Value[RandomCards[CheckNext]];
		RandomCards2[CheckNext]=100;
		CardHand[CheckNext]=1;
		System.out.println("123   "+CheckNext);
		k=0;
		Timer();
		System.out.println("123   "+CheckNext);
	}
	static int [] AllPoints= {0,0};
	public static void PointTracker(int CheckNext,int Turn) {
		System.out.println("123456   "+CheckNext);
		System.out.println("point");
		
		// if everything adds to 31, resets
		if (PIP==31) {
			System.out.println("31");
			if (Turn==1) {
				AllPoints[0]=AllPoints[0]+2;
				System.out.println("Turn"+Turn+AllPoints[0]);

				PIP=0;
			}
			if (Turn==2) {
				AllPoints[1]=AllPoints[1]+2;
				System.out.println("Turn"+Turn+AllPoints[1]);

				PIP=0;
			}
		}
		// for 15 
		if (PIP==15) {
			System.out.println("15");
			if (Turn==1) {
				AllPoints[0]=AllPoints[0]+2;
				System.out.println("Turn"+Turn+AllPoints[0]);

			}
			if (Turn==2) {
				AllPoints[1]=AllPoints[1]+2;
				System.out.println("Turn"+Turn+AllPoints[1]);
			}
		}
		System.out.println("CheckNext   "+CheckNext);
		System.out.println("First "+Value2[RandomCards[CheckNext]]+" second "+Value2[RandomCompCards[CompPlay]]);
		// same value card
		if (Value2[RandomCards[CheckNext]]==Value[RandomCompCards[CompPlay]]) {
			System.out.println("same");
			if (Turn==1) {
				AllPoints[0]=AllPoints[0]+2;
				System.out.println(AllPoints[0]);
			}
			if (Turn==2) {
				AllPoints[1]=AllPoints[1]+2;
				System.out.println(AllPoints[1]);
			}
		}
		
		
		
		// for pairs
		// Value 2 is for face cards
		//		if (Value2[RandomCards[CheckNext]]==Value[RandomCompCards[X]]) {
		//			Points=Points+2;
		//			CheckNext=0;
		//			X=0;
		//			System.out.println("CHECKNEXT");
		//
		//		}
		//		if (Value[RandomCards[CheckNext-1]]==Value[RandomCompCards[X]]) {
		//			Points=Points+2;
		//			System.out.println("CheckNext");
		//
		//			// add for 3 in a row and 4
		//		}
		else {
			System.out.println("else");
			
			//System.out.println("In the tracker + "+PIP+" points for player "+Points+" checknext "+CheckNext);
		}
		// for runs
	}

}
//REPAINT();