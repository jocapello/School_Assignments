package src;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;


import javax.imageio.ImageIO;
import javax.swing.*;

public class Graphics extends JPanel implements MouseListener
{
	// For nicer code
	// make a function that generates the pictures only when called
	// more classes

	// For functional code
	// create functional turns 
	// play out Drawn 
	// Turn over crib 
	// add math
	// finally create winning scenarios and brag about how good i am at coding 

	//creating the image variables
	private static BufferedImage Background = null;
	private static BufferedImage Back = null;
	private static BufferedImage Logo = null;
	private static BufferedImage Rules = null;

	// cards
	private BufferedImage [] deck= new BufferedImage [52];

	// int
	static String CARD1 = null,CARD2=null;
	boolean Catcher=true;
	static int FlippedCard=0;
	static int Points,ComputerPoints;
	static int Drawn=0,InPlay=0;
	static int start;
	static int card1,card2;
	static int chose;
	static int [] Distance= {60,120,180,240,300,360};
	static int RunThrough = 0;
	static int DrawBack = 0;
	static int [] Crib = {0,0,0,0};
	static int PIP=0; // points in play
	static int num2;
	static int[] CardsPlayed = {0,0,0,0,0,0,0,0,0};
	static int CardsThatWerePlayed=0;
	static int i=0,Scene=1,j1=0,X=0;
	static int [] CardDrawn= {0,0,0,0,0,0};
	static int [] CardDrawnComp= {0,0,0,0,0,0};
	static int [ ] Value2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,
			1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,0,0};
	static int [ ] Value = {1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,
			1,2,3,4,5,6,7,8,9,10,10,10,10,1,2,3,4,5,6,7,8,9,10,10,10,10,0,0};

	int Red=(int) ((Math.random()*255)+1); // generate random amounts of red, green and blue
	int Green=(int) ((Math.random()*255)+1);
	int Blue=(int) ((Math.random()*255)+1);

	static int Turn=1;

	// for displaying the ones played after you finish a round 
	static int [] CardBacks = {0,0,0,0,0,0,0,0,0,0,0,0};

	static int [] Hand1= {0,0,0,0,0};
	static int [] Hand2= {0,0,0,0,0};

	// 6th num is for a 0 point turn, 7th num is for no move
	// track the originals 
	static int [] RandomCards={10,11,12,20,21,22,52,0};
	static int [] RandomCompCards={0,13,26,40,39,1,52,0};

	// track the changes
	static int [] RandomCards2={0,0,0,0,0,0,52,0};
	static int [] RandomCompCards2={0,0,0,0,0,0,52,0};

	static int r;
	static int [ ]  Numbered = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
			27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
	static int [ ]  Numbered2 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,
			27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};

	static CountClass CountPoints = new CountClass();

	public Graphics()
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


		if (Scene==1) {
			//Scene screen

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

		// Scene 1
		///////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		// Scene 2

		if (Scene==2) {
			// Rules page
			g.drawImage(Rules, 0,0, 2000,1000,this);

			g.setColor(Color.RED);
			g.fillOval(920,900,120,150);
			g.setColor(Color.BLACK);
			Font myFont = new Font("Arial", Font.PLAIN,20);  //Set the font to a bigger size
			g.setFont(myFont);// write text on the screen starting at location (250,30)
			g.drawString ("Click here to ",925,960);
			g.drawString ("go back to the Scene",890,980);

			g.drawString ("Player Points "+Points,100,100);
			g.drawString ("Computer Points "+ComputerPoints,100,200);}	

		// Scene 2
		///////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		// Scene 3-4


		if (Scene==3 || Scene==4) {
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
			g.drawString ("Total "+PIP,75,600);

			Font myFont5 = new Font("Arial", Font.PLAIN,40);  //Set the font to a bigger size
			g.setFont(myFont5);// write text on the screen starting at location (250,30)
			g.drawString ("Player Points "+Points,75,300);
			g.drawString ("Computer Points "+ComputerPoints,75,400);


			if (Drawn==1) {

				g.drawImage(deck[FlippedCard], 400,400, 200,200,this);
				for (int i=0;i<6;i++) //Draw the number of cards
				{
					// Draw cards after there thrown
					if (RandomCards2[i]!=100) {
						g.drawImage(deck[RandomCards[i]], 400+200*i,700, 200,200,this);
						repaint();
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
						repaint();
					}
				}

				// draw after a "round"
				if (DrawBack==1) {
					for (int i=0; i<6; i++) {
						if (CardBacks[i]==100)
						{
							g.drawImage(Back, 1000+Distance[i],300, 200,200,this);
						}	
						if (CardBacks[6+i]==100)
						{
							g.drawImage(Back, 800+Distance[i],500, 200,200,this);
							repaint();
						}
					}
				}
				// draw after a "round"
				for (int i=0;i<6;i++) {
					if (CardDrawn[i]!=0 && CardBacks[i]!=100) {
						g.drawImage(deck[RandomCards[i]],800+Distance[i],500, 200,200,this);
					}
					repaint();
					if (CardDrawnComp[i]!=0 && CardBacks[6+i]!=100) {
						g.drawImage(deck[RandomCompCards[i]],1000+Distance[i],300, 200,200,this);
					}
				}
				repaint();

			}
			if (Drawn==0) {

				RandomCards();

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
		}
		// Drawing the crib
		if (Drawn==3) {
			g.drawImage(Background, 0,0, 2000,1000,this);
			// crib
			for (int i=0;i<4;i++) {
				g.drawImage(deck[FlippedCard], 1200,300, 200,200,this);
				g.drawImage(deck[Crib[i]], 100+200*i,50, 200,200,this);
				g.drawString ("Crib",500,300);
			}
			// player
			for (int i=0;i<4;i++) {
				g.drawImage(deck[Hand1[i]], 100+200*i,300, 200,200,this);
				g.drawString ("Player Hand",500,500);
			}
			// comp
			for (int i=0;i<4;i++) {
				g.drawImage(deck[Hand2[i]], 100+200*i,550, 200,200,this);
				g.drawString ("Comp Hand",500,800);
			}

			repaint();
		}

		repaint();			        
	}


	public static void RandomCards() {
		int s;
		s=(int)(Math.random( )* 50  + 1);

		if (Numbered2[s]!=100) {
			FlippedCard=Numbered2[s];
			Numbered2[s]=100;
		}
		// players Drawn
		for (int i=0;i<6;i++) {
			r=(int)(Math.random( )* 50  + 1);
			if (Numbered2[r]!=100) {
				RandomCards[i]=Numbered2[r];
				Numbered2[r]=100;
			}
		}
		//				// computers Drawn
		for (int i=0;i<6;i++) {
			r=(int)(Math.random( )* 50  + 1);
			if (Numbered2[r]!=100) {
				RandomCompCards[i]=Numbered2[r];
				Numbered2[r]=100;
			}
		}
	}
	public void mouseClicked(MouseEvent e) 
	{	
		int x=e.getX(); // get the x and y location of the mouse
		int y=e.getY();
		String RUsure = null,CN = null;
		// the opening Scene 
		while (Scene==1) {
			// play
			if (x>=900 && x<=1100 && y>=400 && y<=480)
			{
				Scene=3;
			}
			// how to play
			if (x>=750 && x<=1300 && y>=500 && y<=620)
			{
				Scene=2;
			}
			//quit button
			if (x>=900 && x<=100 && y>=950 && y<=1100)
			{

			}
		}

		// Scene 1
		///////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		// Scene 2

		// quit button for other features?
		if (Scene==2) 
		{
			if (x>=850 && x<=1000 && y>=900 && y<=1200)
			{
				Scene=1;
			}
		}

		// Scene 2
		///////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		// Scene 3

		// find out which cards to throw
		if (Scene==3) {
			for (int p=0;p<6;p++)//pick cards loop
			{
				if (x>=400+200*p && x<=400+200*p+200 && y>=700 && y<=900)//find which card is chosen
				{
					chose++; // if they choose 2 cards
					if (chose==1) {
						Crib[2]=RandomCards[p];
					}
					if (chose==2) {
						Crib[3]=RandomCards[p];
					}
					RandomCards2[p]=100;

					Namer(Value2,RandomCards,p,CN);
					if (CARD1.equals(CARD2) == true) { 
						JOptionPane.showMessageDialog(null,"You cannot choose the same card twice ");
						chose=0;
						Crib[2]=0;
						Crib[3]=0;
					} 
				}
			}
			if (chose==2) {
				boolean YN;

				RUsure=JOptionPane.showInputDialog("Are the cards you would like to throw are "+CARD1+" and "+CARD2);
				RUsure=RUsure.toLowerCase();

				YN=RUsure.startsWith("y");
				if (YN==true)
				{	
					int d=0;
					for (int j=0; j<6;j++) {
						if (RandomCards2[j]!=100 && d<4) {
							Hand1[d]=Value2[RandomCards[j]];
							d++;
						}}
					int i=0;
					for (int j=0; j<6;j++) {
						if (RandomCompCards2[j]!=100 && i<4) {
							Hand2[i]=Value2[RandomCompCards[j]];
							i++;
						}}

					Drawn=1;
					// replaces all letters with empty spaces
					CARD1 = CARD1.replaceAll("\\D+","");			
					CARD2 = CARD2.replaceAll("\\D+","");			
					//				System.out.println(CARD1+" and "+CARD2);

					RandomSelector();
					RandomCompCards2[X]=100;
					Crib[0]=RandomCompCards[X];
					RandomSelector();
					Crib[1]=RandomCompCards[X];

					if (RandomCompCards2[X]==100)
					{
						int num=1;
						while (num==1) {
							for (int i1=0; i1<6;i1++) {
								if (RandomCompCards2[i1]!=100) {
									RandomCompCards2[i1]=100;
									num=2;
								}
							}
						}
					}
					RandomCompCards2[X]=100;
					Scene=4;
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

		// Scene 3
		///////////////////////////////////////////////////////////////
		///////////////////////////////////////////////////////////////
		// Scene 4

		// puts the remaining cards into a hand for counting later



		// for selection during the game
		if (Scene==4) {
			Boolean YN;
			int x1=e.getX(); // get the x and y location of the mouse
			int y1=e.getY();

			//JOptionPane.showMessageDialog(null,"Select a card to play ");

			for (int j1=0;j1<6;j1++)//pick cards loop
			{
				if (x1>=400+200*j1 && x1<=400+200*j1+200 && y1>=700 && y1<=900)//find which card is chosen
				{
					OverPoints();
					if (Below31==true) {
						if (PIP+Value[RandomCards[j1]]>31) {
							JOptionPane.showMessageDialog(null,"The card you have selected would put you over 31 ");
							Scene=4;
						}
						else {
							if (RandomCards2[j1]!=100) {
								RUsure=JOptionPane.showInputDialog("Is the card you would like to play card "+j1);
								YN=RUsure.startsWith("y");
								if (YN==true)
								{	
									CardsPlayed[CardsThatWerePlayed]=Value2[RandomCards[j1]];
									CardsThatWerePlayed++;
									CardDrawn[j1]=1;
									RandomCards2[j1]=100;		
									InPlay=j1;
									RunThrough++;

									if (RunThrough>=101) {
										RunThrough=100;
									}
									PlayerTurn();

								}
							}
							else {
								Scene=4;
							}
						}
					}

					else {
						RandomCards[7]=53;
						System.out.println("Player no play");

						if (Below31==true) {
							System.out.println("Can play"+Below31);
						}
						else {
							if ((Below31==false && CompBelow31==false)) {
								System.out.println("Comp no play in p");
								DisplayBackCard();
								DrawBack=1;
								System.out.println("Points1");
								Points=Points+1;
								PIP=0;
							}}

						PlayerTurn();
					}}




				//		}
			}
		}		
	}
	public static void Count(int X) {
		for (int i=0; i<8;i++) {
			System.out.println("Cards that were played "+CardsPlayed[i]);
		}

		System.out.println("Player "+Points);
		System.out.println("Computer "+ComputerPoints);

		int DisplayCrib,DisplayPlayer,DisplayComp;
		CountPoints.CountCrib(Value,Crib,FlippedCard,RandomCompCards2,RandomCards2,Value2,RandomCompCards,RandomCards);
		System.out.println("Crib "+Points);

		Turn++;
		int Result;
		Result=Turn%2;
		if (Result==0) { // IF points are even give to player
			Points=Points+X;
		}
		if (Result==1) { // else give to comp
			ComputerPoints=ComputerPoints+X;
		}
		num2=1;
		CountPoints.CountHand(Value,Crib,FlippedCard,RandomCompCards2,RandomCards2,Value2,RandomCompCards,RandomCards,Hand1,Hand2,num2);
		Points=Points+X;


		num2=2;
		CountPoints.CountHand(Value,Crib,FlippedCard,RandomCompCards2,RandomCards2,Value2,RandomCompCards,RandomCards,Hand1,Hand2,num2);
		ComputerPoints=ComputerPoints+X;

		JOptionPane.showMessageDialog(null,"In the crib, there were " +Points+" Points, in the players hand, "
				+ "there were points. And the computer had "+ ComputerPoints+" points in there hand");
		Drawn=0;
		RandomCards();
		chose=0;
		CardsThatWerePlayed=0;
		Scene=3;
		//		static int [] RandomCards={10,11,12,20,21,22,52,0};
		//		static int [] RandomCompCards={0,13,26,40,39,1,52,0};
		for (int i=0;i<6;i++) {
			RandomCards2[i]=0;
			RandomCompCards2[i]=0;
		}
		for (int i=0;i<52;i++) {
			Numbered2[i]=Numbered[i];
		}
	}



	static boolean Below31 = true;
	static boolean CompBelow31 = true;

	public static void DisplayBackCard() {
		for (int i1=0;i1<6;i1++) {
			if (RandomCards2[i1]==100) {
				if (Crib[2]!=Value[RandomCards[i1]] || Crib[3]!=Value[RandomCards[i1]]) {
					CardBacks[0+i1]=100;
				}
			}
			if (RandomCompCards2[i1]==100) {
				if (Crib[0]!=Value[RandomCompCards[i1]] || Crib[1]!=Value[RandomCompCards[i1]]) {
					CardBacks[6+i1]=100;
				}
			}
		}
	}

	// checks to see if a player can play
	public static void OverPoints() {
		if (PIP+Value[RandomCards[0]]<=31 && RandomCards2[0]!=100 || PIP+Value[RandomCards[1]]<=31 && RandomCards2[1]!=100 || 
				PIP+Value[RandomCards[2]]<=31 && RandomCards2[2]!=100 || PIP+Value[RandomCards[3]]<=31 && RandomCards2[3]!=100 ||
				PIP+Value[RandomCards[4]]<=31 && RandomCards2[4]!=100 || PIP+Value[RandomCards[5]]<=31 && RandomCards2[5]!=100) {
			Below31=true;
		}
		else Below31=false;

		if (PIP+Value[RandomCompCards[0]]<=31 && RandomCompCards2[0]!=100 || PIP+Value[RandomCompCards[1]]<=31 && RandomCompCards2[1]!=100 || 
				PIP+Value[RandomCompCards[2]]<=31 && RandomCompCards2[2]!=100 || PIP+Value[RandomCompCards[3]]<=31 && RandomCompCards2[3]!=100 ||
				PIP+Value[RandomCompCards[4]]<=31 && RandomCompCards2[4]!=100 || PIP+Value[RandomCompCards[5]]<=31 && RandomCompCards2[5]!=100) {
			CompBelow31=true;
		}
		else CompBelow31=false;
	}


	public static void PlayerTurn() {
		Crib();
		// makes the computer go again if player cant
		if (Below31==false && CompBelow31==true) {
			System.out.println("YES");
			if (CompBelow31==true) {
				System.out.println("YES2");
				InPlay=6;		// Like a pass turn
				RunThrough++;	// Assures comp gets points
				RandomSelector();
				OverPoints();
				RandomCompCards2[X]=100;	// So it's not displayed
				PointTracker(0);
				if (X<6) {
					CardDrawnComp[X]=1;	//	Display the cards comp has played
				}
			}
		}

		RunThrough=100;		// Assures player gets points
		PointTracker(0);

		InPlay=6;		// Like a pass turn
		RunThrough++;	// Assures comp gets points
		RandomSelector();
		OverPoints();
		RandomCompCards2[X]=100;	// So it's not displayed
		CardsPlayed[CardsThatWerePlayed]=Value2[RandomCompCards[X]];
		CardsThatWerePlayed++;
		PointTracker(0);
		Crib();
		if (X<6) {
			CardDrawnComp[X]=1;	//	Display the cards comp has played
		}

		else {
			Scene=4;	// For next turn
		}
	}

	public static void RandomSelector() {

		//		System.out.println("RandomSel");
		X=(int)(Math.random( )* 6);

		if (PIP+Value[RandomCompCards[X]]>31 || RandomCompCards2[X]==100) 
		{
			// all cards which havent been played check if they can 
			if (PIP+Value[RandomCompCards[0]]<=31 && RandomCompCards2[0]!=100 || PIP+Value[RandomCompCards[1]]<=31 && RandomCompCards2[1]!=100 || 
					PIP+Value[RandomCompCards[2]]<=31 && RandomCompCards2[2]!=100 || PIP+Value[RandomCompCards[3]]<=31 && RandomCompCards2[3]!=100 ||
					PIP+Value[RandomCompCards[4]]<=31 && RandomCompCards2[4]!=100 || PIP+Value[RandomCompCards[5]]<=31 && RandomCompCards2[5]!=100) {
				RandomSelector();
			}
			else {
				ComputerGo();
			}

			if (RandomCompCards2[0]==100 && RandomCompCards2[1]==100 && RandomCompCards2[2]==100
					&& RandomCompCards2[3]==100 && RandomCompCards2[4]==100 && RandomCompCards2[5]==100) {
				System.out.println("All 100");
				ComputerGo();	
			}

		}
	}
	public static void Namer(int Value2[],int RandomCards[],int p,String CN){

		// if face card
		if (Value2[RandomCards[p]]==11) {
			CN="Jack of ";}
		if (Value2[RandomCards[p]]==12) {
			CN="Queen of ";}
		if (Value2[RandomCards[p]]==13) {
			CN="King of ";}

		// if it does not
		if (Value2[RandomCards[p]]<11) {
			CN=Value2[RandomCards[p]]+" ";
		}

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

	public static void PointTracker(int CheckNext) {
		//		System.out.println("In points");

		// After play plays
		if (RunThrough==100) {
			PIP=PIP+Value[RandomCards[InPlay]];
			// if everything adds to 31, resets
			if (PIP==31) {

				Points=Points+2;
				System.out.println("31 P");
				for (int i=0;i<6;i++) {
					if (RandomCompCards[i]==100) {
						CardBacks[i]=1;
					}
					if (RandomCards[i]==100) {
						CardBacks[i+6]=1;
					}
				}
				DisplayBackCard();
				DrawBack=1;
				PIP=0;
			}
			// for 15 
			if (PIP==15) {
				Points=Points+2;
				System.out.println("PP 15");
			}

			// pair
			if ((CardsPlayed[0]==CardsPlayed[1]) && CardsPlayed[1]!=0 || (CardsPlayed[1]==CardsPlayed[2]) && CardsPlayed[2]!=0
					|| (CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0 || (CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0
					|| (CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0 || (CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0
					|| (CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
				Points=Points+2;
			}
			// 3 in a row
			if ((CardsPlayed[0]==CardsPlayed[1] && CardsPlayed[1]==CardsPlayed[2]) && CardsPlayed[2]!=0
					|| (CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0
					|| (CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0
					|| (CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0
					|| (CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0
					|| (CardsPlayed[5]==CardsPlayed[6] && CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
				Points=Points+6;
			}
			// 4 in a row
			if ((CardsPlayed[0]==CardsPlayed[1] && CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0 ||
					(CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0 ||
					(CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0 ||
					(CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0 ||
					(CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6] && CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
				Points=Points+12;
			}

			int temp;

			for (int i=0; i<7; i++) // compare the number in the front of the list with
			{                   // every number after it                      
				for (int j2=i+1; j2<8; j2++)
				{
					if (CardsPlayed[i]<CardsPlayed[j2]) //if the number at the front is 
					{//swap                  // larger, swap the numbers
						temp=CardsPlayed[i];
						CardsPlayed[i]=CardsPlayed[j2];
						CardsPlayed[j2]=temp;
					}//end of if
				}}
			for (int i=0;i<8;i++) {
				System.out.println("Played "+CardsPlayed[i]);
			}
			// run of 5
			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1
					&& Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+5;}
			else {
				// run of 4
				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {Points=Points+4;}
				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
				if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+4;}
			}
			// run of 3
			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1) {Points=Points+3;}
			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {Points=Points+3;}
			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}
			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}
			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}
			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[3]]-1) {Points=Points+3;}
			if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}
			if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {Points=Points+3;}
			if (Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {Points=Points+3;}



		}
		else {
			if (X!=7) 
			{
				PIP=PIP+Value[RandomCompCards[X]];
			}

			// if everything adds to 31, resets
			if (PIP==31) {

				ComputerPoints=ComputerPoints+2;
				System.out.println("31 P");
				DisplayBackCard();
				DrawBack=1;
				PIP=0;
			}
			// for 15 
			if (PIP==15) {

				ComputerPoints=ComputerPoints+2;
				System.out.println("PP 15");

			}

			// pair
			if ((CardsPlayed[0]==CardsPlayed[1]) && CardsPlayed[1]!=0 || (CardsPlayed[1]==CardsPlayed[2]) && CardsPlayed[2]!=0
					|| (CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0 || (CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0
					|| (CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0 || (CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0
					|| (CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
				ComputerPoints=ComputerPoints+2;
			}
			// 3 in a row
			if ((CardsPlayed[0]==CardsPlayed[1] && CardsPlayed[1]==CardsPlayed[2]) && CardsPlayed[2]!=0
					|| (CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0
					|| (CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0
					|| (CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0
					|| (CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0
					|| (CardsPlayed[5]==CardsPlayed[6] && CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
				ComputerPoints=ComputerPoints+6;
			}
			// 4 in a row
			if ((CardsPlayed[0]==CardsPlayed[1] && CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3]) && CardsPlayed[3]!=0 ||
					(CardsPlayed[1]==CardsPlayed[2] && CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4]) && CardsPlayed[4]!=0 ||
					(CardsPlayed[2]==CardsPlayed[3] && CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5]) && CardsPlayed[5]!=0 ||
					(CardsPlayed[3]==CardsPlayed[4] && CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6]) && CardsPlayed[6]!=0 ||
					(CardsPlayed[4]==CardsPlayed[5] && CardsPlayed[5]==CardsPlayed[6] && CardsPlayed[6]==CardsPlayed[7]) && CardsPlayed[7]!=0) {
				ComputerPoints=ComputerPoints+12;
			}

			int temp;

			for (int i=0; i<7; i++) // compare the number in the front of the list with
			{                   // every number after it                      
				for (int j2=i+1; j2<8; j2++)
				{
					if (CardsPlayed[i]<CardsPlayed[j2]) //if the number at the front is 
					{//swap                  // larger, swap the numbers
						temp=CardsPlayed[i];
						CardsPlayed[i]=CardsPlayed[j2];
						CardsPlayed[j2]=temp;
					}//end of if
				}}
			for (int i=0;i<8;i++) {
				System.out.println(CardsPlayed[i]);
			}
			// runs means it will only count a run for the highest ammount possible instead of all 
			int Runs=0;
			// run of 5
			if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1
					&& Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {ComputerPoints=ComputerPoints+5;}
			else { Runs++; }

			if (Runs==1) {
				// run of 4
				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {ComputerPoints=ComputerPoints+4;}
				if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {ComputerPoints=ComputerPoints+4;}
			}
			else { Runs++;}

			if (Runs==3) {
				// run of 3
				if (Value2[CardsPlayed[0]]==Value2[CardsPlayed[1]]-1 && Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1) {ComputerPoints=ComputerPoints+3;}
				if (Value2[CardsPlayed[1]]==Value2[CardsPlayed[2]]-1 && Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1) {ComputerPoints=ComputerPoints+3;}
				if (Value2[CardsPlayed[2]]==Value2[CardsPlayed[3]]-1 && Value2[CardsPlayed[3]]==Value2[CardsPlayed[4]]-1) {ComputerPoints=ComputerPoints+3;}
			}
		}
	}




	public static void Crib() {
		if (RandomCompCards2[0]==100 && RandomCompCards2[1]==100 && RandomCompCards2[2]==100 &&
				RandomCompCards2[3]==100 && RandomCompCards2[4]==100 && RandomCompCards2[5]==100 &&
				RandomCards2[0]==100 && RandomCards2[1]==100 && RandomCards2[2]==100 &&
				RandomCards2[3]==100 && RandomCards2[4]==100 && RandomCards2[5]==100) {
			Drawn=3;
			Count(DrawBack);

		}
	}
	static int OnlyOnce=0;
	public static void ComputerGo() {
		int num=0,Cancel=6,Check=0,i=0;	
		System.out.println("In comp go");

		// all cards which havent been played check if they can 
		if ((RandomCompCards2[0]==100 || PIP+Value[RandomCompCards[0]]>31) && (RandomCompCards2[1]==100 || PIP+Value[RandomCompCards[1]]>31)
				&&  (RandomCompCards2[2]==100 || PIP+Value[RandomCompCards[2]]>31) && (RandomCompCards2[3]==100 || PIP+Value[RandomCompCards[3]]>31)
				&&  (RandomCompCards2[4]==100 || PIP+Value[RandomCompCards[4]]>31) &&  (RandomCompCards2[5]==100 || PIP+Value[RandomCompCards[5]]>31)) {

			X=7;
			RandomCompCards[X]=53;
			System.out.println("1No play");


			//			if (OnlyOnce==0)	{
			if (PIP+Value[RandomCompCards[0]]<=31 && RandomCompCards2[0]!=100 || PIP+Value[RandomCompCards[1]]<=31 && RandomCompCards2[1]!=100 || 
					PIP+Value[RandomCompCards[2]]<=31 && RandomCompCards2[2]!=100 || PIP+Value[RandomCompCards[3]]<=31 && RandomCompCards2[3]!=100 ||
					PIP+Value[RandomCompCards[4]]<=31 && RandomCompCards2[4]!=100 || PIP+Value[RandomCompCards[5]]<=31 && RandomCompCards2[5]!=100) {
				num=0;
			}
			else {
				num=1;
			}
			if (num==1) {

				System.out.println("Player no play comp");
				DisplayBackCard();
				DrawBack=1;
				ComputerPoints=ComputerPoints+1;
				Points=Points-1;
				PIP=0;
				num=0;
				OnlyOnce=1;
			}
			//			// if all the comps cards are played 
			//			// check before player turn
			//			if (RandomCompCards2[0]==100 && RandomCompCards2[1]==100 && RandomCompCards2[2]==100
			//					&& RandomCompCards2[3]==100 && RandomCompCards2[4]==100 && RandomCompCards2[5]==100) {	
			//				if (RandomCards2[0]!=100 || RandomCards2[1]!=100 || RandomCards2[2]!=100
			//						|| RandomCards2[3]!=100 || RandomCards2[4]!=100 ||RandomCards2[5]!=100) {
			//					System.out.println();
			//					OverPoints();
			//					Scene=4;
			//				}
			//			}
			//			}
		}	
	}

}
