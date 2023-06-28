package FileHandling;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.event.KeyEvent;
import java.io.File; // File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; // handle errors
import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;

public class TwentyEight extends JPanel implements ActionListener, KeyListener, MouseListener
{

	//Timer t = new Timer(5,this);


	//	int Sec=0;
	//    Timer timer = new Timer();
	//    TimerTask task = new TimerTask() {
	//    	public void run() {
	//    		Sec++;
	//    		System.out.println(Sec);
	//    	}
	//    };
	//    public void Start() {
	//    	// 1000 mil secs
	//    	timer.scheduleAtFixedRate(task,1000,1000);
	//    }
	public TwentyEight()//Starts timer
	{
		//	t.start();	
		addMouseListener(this);		
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	static int [][] Board = {{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}};
	static int [][] BoardDisX = {{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}};
	static int [][] BoardDisY = {{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0},
			{0,0,0,0}};
	static int Movex=300,Movey=100,Score=0,Scene=0,DarkMode=0,SettingButton=680,TotalPoints=0,Stop=0,Buy=0,NoMoney=0;
	static int [] CheckUnlock = {0,0,0,0,0,0,0,0,0};
	static String HighScore=" ";
	static String num2="";
	static int C=0;
	static int x=0,y=0,StatI,StatJ;
	static int num1=0,Num=1,Exit=0;
	static String Position [] = {"","","",""};
	static int Colours [] = {0,0,0,0};
	static String Points;
	static int CustomizeButtonsX[]= {730,1630,730,1630,730,1630,730,1630};
	static int CustomizeButtonsY[]= {290,290,490,490,690,690,890,890};
	static String Information [][]= {{"","","",""},{"","","",""},{"","","",""},{"","","",""},
			{"","","",""},{"","","",""},{"","","",""},{"","","",""},{"","","",""},
			{"","","",""},{"","","",""},{"","","",""},{"","","",""}};
	static String Information2 [][]= {{"2"},{"2"},{"2"},{"2"},{"2"},{"2"},{"2"},{"2"},{"2"},{"2"},{"","","","","","","","","","","",""}};

	static int RedArray []=  {0,65,163,231,0,0,159,87,237,249,244,1,102,245,247,243,193,164,80,47,20,38,84,169,250,238,195,166,113,0,0,0,0} ;
	static int GreenArray []={0,60,196,215,239,78,165,75,161,37,220,105,25,0,47,157,117,121,44,34,36,18,42,68,113,204,186,111,60,0,0,0,0,0} ;
	static int BlueArray []= {0,88,188,181,197,100,207,30,142,76,92,203,54,33,87,92,43,185,214,116,44,4,16,43,75,15,11,9,6,0,0,0,0,0} ;
	static String Button= "";
	static int [] Prices = { 1000, 1000, 1200, 1200, 1500, 1500, 1750, 3000};

	public void paintComponent(Graphics g) {

		super.paintComponent(g);
		// draw a black circle on the screen at location (x,y)		
		//			g.setColor(Color.YELLOW);
		//			g.fillOval(x,y,200,200);
		//			
		//			g.setColor(Color.BLACK);
		//			g.fillOval(x+20,y+20,50,50);
		//			g.fillOval(x+100,y+20,50,50);
		//			
		//			g.fillRect (x , y, 200, 20);
		//			g.fillRect (x+30 , y, 140, -100);
		//			
		//			
		//			g.setColor(Color.WHITE);
		//			g.fillOval(x+25,y+25,15,15);
		//			g.fillOval(x+105,y+25,15,15);
		//
		//			g.setColor(new Color(255,0,0));
		//			g.fillOval(x+15,y+110,120,20);

		if (Scene==0) {
			g.setColor(Color.WHITE); // Draw the border of game
			g.fillRect (0 , 0, 7500, 7500);
			Font myFont = new Font("Arial", Font.PLAIN,150);  //Set the font to a bigger size
			g.setFont(myFont);// write text on the screen starting at location (250,30)
			g.setColor(Color.BLACK);
			g.drawString ("Welcome to 2048!",150,200);		
			Font myFont2 = new Font("Arial", Font.PLAIN,80);  //Set the font to a bigger size
			g.setFont(myFont2);// write text on the screen starting at location (250,30)
			g.drawString ("Play - Press space",150,400);		
			g.drawString ("How to play - Press 2",150,500);		
			g.drawString ("Settings - Press 3",150,600);		
			g.drawString ("Customize - Press 4",150,700);		
			g.setColor(Color.BLACK); // Draw+order of game
			g.fillRect (1305 , 455, 400, 400);
			g.setColor(Color.GRAY); // Draw the "background squares"
			int x2=1300,y2=450;
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					g.fillRect (x2+30 , y2+30, 80, 80); // Space all of them
					x2=x2+90;
				}
				x2=1300; // To restart
				y2=y2+90; // On next row
			}

		}

		if (Scene==1) { // The scene that plays the game 

			Num=1;
			ReadSettings();
			Num=0;

			int x=300,y=100;

			if (DarkMode==1) {
				g.fillRect (0 , 0, 7500, 7500);
				g.setColor(Color.BLACK); // Draw the border of game
			}
			else if (DarkMode==0){
				g.setColor(Color.WHITE); // Draw the border of game
			}
			g.fillRect (x , y, 750, 750);
			g.setColor(Color.GRAY); // Draw the "background squares"
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					g.fillRect (x+50 , y+50, 150, 150); // Space all of them
					x=x+170;
				}
				x=300; // To restart
				y=y+170; // On next row
			}

			// Display the Score
			Font TheFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
			g.setFont(TheFont);// write text on the screen starting at location (250,30)
			String TheString = Integer.toString(Score);

			if (DarkMode==0) {
				g.setColor(Color.BLACK);
			}
			else if (DarkMode==1) {
				g.setColor(Color.WHITE);
			}
			g.drawString ("Score - ",1200,200);		
			g.drawString (TheString,1600,200);	
			Points=Integer.toString(Score/15);
			g.drawString ("Points -  " +Points,1200,400);	
			ReadSettings();
			g.drawString ("HighScore -  " ,1200,600);	
			g.drawString ((HighScore),1200,800);	


			// Draw active squares
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					if (Board[i][j]>0) {

						if (Board[i][j]%10==2) {
							Color SetColour = new Color(RedArray[Colours[0]], GreenArray[Colours[0]], BlueArray[Colours[0]]);
							g.setColor(SetColour);
						}
						if (Board[i][j]%10==4) {
							Color SetColour = new Color(RedArray[Colours[1]], GreenArray[Colours[1]], BlueArray[Colours[1]]);
							g.setColor(SetColour);
						}
						if (Board[i][j]%10==6) {
							Color SetColour = new Color(RedArray[Colours[2]], GreenArray[Colours[2]], BlueArray[Colours[2]]);
							g.setColor(SetColour);
						}
						if (Board[i][j]%10==8) {
							Color SetColour = new Color(RedArray[Colours[3]], GreenArray[Colours[3]], BlueArray[Colours[3]]);
							g.setColor(SetColour);
						}
						if(RedArray[Colours[3]]==0 && GreenArray[Colours[3]]==0 && BlueArray[Colours[3]]==0) {
							g.setColor(Color.YELLOW);
						}
						g.fillRect (Movex+BoardDisX[i][j]+50 , Movey+BoardDisY[i][j]+50, 150, 150);
						if (Board[i][j]<10) {

							Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
							g.setFont(myFont);// write text on the screen starting at location (250,30)
							String Mystring = "";
							Mystring=Board[i][j]+" "; // Draw the values for the squares
							if (DarkMode==0) {
								g.setColor(Color.BLACK);
							}
							else if (DarkMode==1) {
								g.setColor(Color.WHITE);
							}
							//		g.setColor(Color.WHITE);
							g.drawString (Mystring,Movex+BoardDisX[i][j]+100,Movey+BoardDisY[i][j]+170);						
						}

						if (Board[i][j]<100 && Board[i][j]>9) { // Adjust the size of the numbers 
							Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
							g.setFont(myFont);// write text on the screen starting at location (250,30)
							String Mystring = "";
							Mystring=Board[i][j]+" "; // Draw the values for the squares
							if (DarkMode==0) {
								g.setColor(Color.BLACK);
							}
							else if (DarkMode==1) {
								g.setColor(Color.WHITE);
							}
							g.drawString (Mystring,Movex+BoardDisX[i][j]+70,Movey+BoardDisY[i][j]+170);						
						}

						if (Board[i][j]<1000  && Board[i][j]>99) { // Adjust the size of the numbers 
							Font myFont = new Font("Arial", Font.PLAIN,90);  //Set the font to a bigger size
							g.setFont(myFont);// write text on the screen starting at location (250,30)
							String Mystring = "";
							Mystring=Board[i][j]+" "; // Draw the values for the squares
							if (DarkMode==0) {
								g.setColor(Color.BLACK);
							}
							else if (DarkMode==1) {
								g.setColor(Color.WHITE);
							}
							g.drawString (Mystring,Movex+BoardDisX[i][j]+50,Movey+BoardDisY[i][j]+170);						
						}
					}
					x=x+170;
				}
				x=300;
				y=y+170;
			}
		}
		// The how to play screen
		if (Scene==2) { 
			g.setColor(Color.WHITE); // Draw the border of game
			g.fillRect (0 , 0, 7500, 7500);
			Font myFont = new Font("Arial", Font.PLAIN,150);  //Set the font to a bigger size
			g.setFont(myFont);// write text on the screen starting at location (250,30)
			g.setColor(Color.BLACK);
			g.drawString ("How to Play",150,200);		
			Font myFont2 = new Font("Arial", Font.PLAIN,70);  //Set the font to a bigger size
			g.setFont(myFont2);// write text on the screen starting at location (250,30)

			// Rules / tips
			g.drawString ("Use your arrow keys to move the tiles. When two tiles ",150,400);
			g.drawString ("with the same number touch, they merge into one! ",150,470);	
			g.drawString ("Reach 2048 or go until you get stuck!",150,540);	
			g.drawString ("Pressing space bar will allow you to restart, while  ",150,610);	
			g.drawString ("pressing 9 brings you back to the main menu",150,680);	

			// Get out of that screen
			Font myFont3 = new Font("Arial", Font.PLAIN,40);  //Set the font to a bigger size
			g.setFont(myFont3);// write text on the screen starting at location (250,30)
			g.drawString ("Press space to play or 9 to return to main menu",920,940);	
		}

		// The settings screen
		if (Scene==3) { 
			g.setColor(Color.WHITE); // Draw the border of game
			g.fillRect (0 , 0, 7500, 7500);
			Font myFont = new Font("Arial", Font.PLAIN,150);  //Set the font to a bigger size
			g.setFont(myFont);// write text on the screen starting at location (250,30)
			g.setColor(Color.BLACK);
			g.drawString ("Settings",150,200);		
			Font myFont2 = new Font("Arial", Font.PLAIN,80);  //Set the font to a bigger size
			g.setFont(myFont2);// write text on the screen starting at location (250,30)
			g.drawString ("DarkMode - ",150,400);	
			// Draw the slider 
			g.setColor(Color.RED); // Draw the border of game
			g.fillRect (600 , 320, 80, 100);
			g.setColor(Color.GREEN); // Draw the border of game
			g.fillRect (680 , 320, 80, 100);
			g.setColor(Color.BLACK); // Draw the border of game
			g.fillRect (SettingButton , 320, 80, 100);
			// Get out of that screen 
			Font myFont3 = new Font("Arial", Font.PLAIN,40);  //Set the font to a bigger size
			g.setFont(myFont3);// write text on the screen starting at location (250,30)
			g.drawString ("Press space to play or 9 to return to main menu",920,940);	

		}

		// Change colours 
		if (Scene==4) {
			int x=150,y=200;
			// Check to see which sets are unlocked
			CheckUnlock[8]=1;
			ReadSettings();

			Font myFont5 = new Font("Arial", Font.PLAIN,60);  //Set the font to a bigger size
			g.setFont(myFont5);// write text on the screen starting at location (250,30)
			g.drawString ("Press 9 to return or space to start game",200,100);	

			if (NoMoney==1) {
				Font myFont4 = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
				g.setFont(myFont4);// write text on the screen starting at location (250,30)
				g.drawString ("You have cannot afford that",200,200);		
			}

			for (int i1=0;i1<8;i1++) {
				if (CheckUnlock[i1]==0) { // Draw a "black out bar" over those that you havnt bought yet
					g.setColor(Color.GRAY); // Draw the border of game
					g.fillRect (CustomizeButtonsX[i1]-510 , CustomizeButtonsY[i1]-20, 400, 100);

					Font myFont3 = new Font("Arial", Font.PLAIN,60);  //Set the font to a bigger size
					g.setFont(myFont3);// write text on the screen starting at location (250,30)
					g.setColor(Color.WHITE); // Draw the border of game
					g.drawString ("1000",350,350);	
					g.drawString ("1000",1250,350);	
					g.drawString ("1200",350,550);	
					g.drawString ("1200",1250,550);	
					g.drawString ("1500",350,750);	
					g.drawString ("1500",1250,750);	
					g.drawString ("1750",350,950);	
					g.drawString ("3000",1250,950);
				}

				else {
					for (int i=1; i<33;i++) {
						Color C = new Color(RedArray[i], GreenArray[i], BlueArray[i]); 
						g.setColor(C);
						g.fillRect (70+x , 70+y, 100, 100);
						x=x+100;
						if (i%4==0) {
							// Draw the slider 
							g.setColor(Color.RED); // Draw the border of game
							g.fillRect (x+120 , y+90, 60, 60);
							g.setColor(Color.GREEN); // Draw the border of game
							g.fillRect (x+180 , y+90, 60, 60);
							x=x+500;
						}
						if (i%8==0) {
							x=150;
							y=y+200;
						}
					}
				}
				// Draw the slider special (bottom right)
				g.setColor(Color.RED); // Draw the border of game
				g.fillRect (x+520 , y+90, 60, 60);
				g.setColor(Color.GREEN); // Draw the border of game
				g.fillRect (x+580 , y+90, 60, 60);
			}



			for (int i=0;i<8;i++) {
				g.setColor(Color.BLACK); // Draw the border of game
				g.fillRect (CustomizeButtonsX[i] , CustomizeButtonsY[i], 60, 60);
			}


			if (num1==1) {
				int i = 0;
				if (Button=="8.1") {
					i=29;
				}
				else {
					i=Integer.parseInt(Button);
				}
				Color C1 = new Color(RedArray[i], GreenArray[i], BlueArray[i]); 
				Color C2 = new Color(RedArray[i+1], GreenArray[i+1], BlueArray[i+1]); 
				Color C3 = new Color(RedArray[i+2], GreenArray[i+2], BlueArray[i+2]); 
				Color C4 = new Color(RedArray[i+3], GreenArray[i+3], BlueArray[i+3]); 
				g.setColor(C1);
				g.fillRect (400 , 100, 100, 100);
				g.setColor(C2);
				g.fillRect (500 , 100, 100, 100);
				g.setColor(C3);
				g.fillRect (600 , 100, 100, 100);
				g.setColor(C4);
				g.fillRect (700 , 100, 100, 100);

			}

			repaint();
		}

		if (Scene==5) {
			ReadSettings();
			g.fillRect (0 , 0, 10000, 10000);
			Font myFont = new Font("Arial", Font.PLAIN,80);  //Set the font to a bigger size
			g.setFont(myFont);// write text on the screen starting at location (250,30)
			g.setColor(Color.BLACK);
			g.drawString ("You have lost",700,200);		
			g.drawString ("Your final score is "+Score+", you have gained "+Points+" points",50,300);

			Font myFont2 = new Font("Arial", Font.PLAIN,80);  //Set the font to a bigger size
			g.setFont(myFont2);// write text on the screen starting at location (250,30)
			g.drawString ("and have "+TotalPoints+" Points in your bank.",50,400);
			g.drawString ("Press space to play again, or 9 to exit ",50,500);
			Stop=1;


			//			else {
			//				g.drawString ("Thank you for playing",50,300);
			//			}
		}



	}

	public static void WriteSettings() {

		//	Write to the file
		try {

			if (Scene!=5) {

				// Change the colours
				FileWriter Option = null;
				// Change the default colour
				if (Button.equals("1") || Button.equals("2") ||  Button.equals("3") || Button.equals("4") || 
						Button.equals("5") ||  Button.equals("6") ||  Button.equals("7")) {
					//	System.out.println("Colour");
					Option = new FileWriter("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\Colour.txt");
					Option.write("Colour = "+Button);
					Option.close();
				}

				// Buy a new colour set
				if (num2.equals("yes")) {
					int Temp=0;

					if (Button.equals("8.1")) 
					{
						Temp=7;
					}
					else {
						Temp=Integer.parseInt(Button);
					}

					if (TotalPoints>=Prices[Temp] && CheckUnlock[Temp]==0) {

						// Take away the cost of colour set
						FileWriter Subtract = new FileWriter("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\Points.txt");
						TotalPoints=TotalPoints-Prices[Temp];
						Subtract.write("Points = "+TotalPoints);
						Subtract.close();

						Temp=Temp-1;
						// Unlock that for the future
						CheckUnlock[Temp]=1;
						System.out.println(Temp);
						Option = new FileWriter("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\Unlocked.txt");
						Option.write("Unlocked = ");
						for (int i=0;i<8;i++) {
							Option.write(CheckUnlock[i]+" ");
						}
						num2="no";
						Option.close();
					}
					else {
						NoMoney=1;
					}
				}

				if (Button.equals("8.1")) {
					Option = new FileWriter("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\CustomColour.txt");
					Option.write("CustomColour = "+RedArray[29]+" "+GreenArray[29]+" "+BlueArray[29]+" "
							+RedArray[30]+" "+GreenArray[30]+" "+BlueArray[30]+" "
							+RedArray[31]+" "+GreenArray[31]+" "+BlueArray[31]+" "
							+RedArray[32]+" "+GreenArray[32]+" "+BlueArray[32]);
					Option.close();
				}

				// "30" is code for darkmode
				if (Button.equals("30")){
					System.out.println(DarkMode+ "ss"+Information[0][2]);
					//System.out.println("DarkMode");
					Option = new FileWriter("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\DarkMode.txt");
					if (Information[0][2].equals("0")) {
						System.out.println(DarkMode+" sss");
						DarkMode=0;
						Option.write("DarkMode = 0"); // Turn darkmode on
					}
					else if (Information[0][2].equals("1")) {
						System.out.println(DarkMode+" ssss");
						DarkMode=1;
						Option.write("DarkMode = 1"); // Turn darkmode off
					}
					System.out.println(DarkMode+" ss");
					//Button="31";
					Option.close();
				}
			}
			if (Scene==5) {
				FileWriter Option = null;
				if (Integer.parseInt(HighScore)<Score) {
					Option = new FileWriter("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\HighScore.txt");
					System.out.println(HighScore+"}}}}}}}}}}}}}}}}}}"+Score);
					Option.write("HighScore = "+Score);
					Option.close();
				}

				Option = new FileWriter("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\Points.txt");
				if (Stop!=1) {
					TotalPoints=TotalPoints+Integer.parseInt(Points);
				}
				Option.write("Points = "+TotalPoints);
				Option.close();
			}

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	public static void ReadSettings() {
		// Read
		try {
			// Turn on darkmode automatically
			if (Num==1) {
				File Option = null;
				//System.out.println("DarkMode");
				Option = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\DarkMode.txt");
				Scanner myReader = new Scanner(Option);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					String [] splited = data.split(" ");	
					if (splited[2].equals("1")) {
						DarkMode=1;
					}
					if (splited[2].equals("0")) {
						DarkMode=0;
					}
				}
				// Finds out the colour at start of game for the custom colour 
				Option = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\CustomColour.txt");
				Scanner ReadScore = new Scanner(Option);
				while (ReadScore.hasNextLine()) {
					String data = ReadScore.nextLine();
					String [] splited = data.split(" ");						
					RedArray[29]=Integer.parseInt(splited[2]);
					GreenArray[29]=Integer.parseInt(splited[3]);
					BlueArray[29]=Integer.parseInt(splited[4]);
					RedArray[30]=Integer.parseInt(splited[5]);
					GreenArray[30]=Integer.parseInt(splited[6]);
					BlueArray[30]=Integer.parseInt(splited[7]);
					RedArray[31]=Integer.parseInt(splited[8]);
					GreenArray[31]=Integer.parseInt(splited[9]);
					BlueArray[31]=Integer.parseInt(splited[10]);
					RedArray[32]=Integer.parseInt(splited[11]);
					GreenArray[32]=Integer.parseInt(splited[12]);
					BlueArray[32]=Integer.parseInt(splited[13]);
				}
				ReadScore.close();
				Option = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\Colour.txt");
				Scanner ReadColour = new Scanner(Option);
				while (ReadColour.hasNextLine()) {
					int temp=0;
					String data = ReadColour.nextLine();
					String [] splited = data.split(" ");
					temp=Integer.parseInt(splited[2]);
					for (int i=0;i<4;i++) {
						Colours[i]=temp+i;
					}
				}
				ReadColour.close();
			}


			if (Buy==1) {
				File Option = null;
				System.out.println("Points");
				Option = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\Points.txt");
				Scanner myReader = new Scanner(Option);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					String [] splited = data.split(" ");	
					TotalPoints=Integer.parseInt(splited[2]);
					if (Stop!=1) {
						WriteSettings();
					}
				}
			}

			if (num2.equals("yes") && Button.equals("1") || Button.equals("2") ||  Button.equals("3") || Button.equals("4") || 
					Button.equals("5") || Button.equals("6") ||  Button.equals("7") ||  Button.equals("8.1")) {
				WriteSettings();
			}

			if (CheckUnlock[8]==1) {
				File Option = null;

				Option = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\Unlocked.txt");
				Scanner ReadScore = new Scanner(Option);
				while (ReadScore.hasNextLine()) {
					String data = ReadScore.nextLine();
					String [] splited = data.split(" ");
					for (int i=0;i<8;i++) {
						if (splited[i].equals("1") || splited[i].equals("0")) {
							CheckUnlock[i-2]=Integer.parseInt(splited[i]);

						}
						if (splited[9].equals("1")) {
							CheckUnlock[7]=1;
						}

					}

					//					System.out.println(splited[2]);
					//					if (Integer.parseInt(HighScore)<Score) {
					//						HighScore=Integer.toString(Score);
					//						WriteSettings();
					//					}
				}
				//ReadScore.close();
			}
			if (Scene!=5) {
				File Option = null;
				Option = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\HighScore.txt");
				Scanner ReadScore = new Scanner(Option);
				while (ReadScore.hasNextLine()) {
					String data = ReadScore.nextLine();
					String [] splited = data.split(" ");	
					HighScore=splited[2];
					if (Integer.parseInt(HighScore)<Score) {
						HighScore=Integer.toString(Score);
						WriteSettings();
					}
				}
				ReadScore.close();

				if (Button.equals("1") || Button.equals("2") ||  Button.equals("3") || Button.equals("4") || 
						Button.equals("5") ||  Button.equals("6") ||  Button.equals("7")) {
					//System.out.println("Colour");
					Option = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\Colour.txt");
					WriteSettings();

				}
				if (Button.equals("8.1")) {
					if (Button=="8.1" && Exit==1) {
						System.out.println("In custome");
						Colours[0]=29;
						Colours[1]=30;
						Colours[2]=31;
						Colours[3]=32;

						String Colours [] = {"","","",""};
						JOptionPane.showMessageDialog(null,"Enter the RGB values of your colours seperated by space - Ex 100,200,150 ");
						Colours[0]=JOptionPane.showInputDialog("What is the RGB value of your first colour?");
						Colours[1]=JOptionPane.showInputDialog("What is the RGB value of your second colour?");
						Colours[2]=JOptionPane.showInputDialog("What is the RGB value of your third colour?");
						Colours[3]=JOptionPane.showInputDialog("What is the RGB value of your fourth colour?");
						String [] CustomColours1 = Colours[0].split(",");
						String [] CustomColours2 = Colours[1].split(",");
						String [] CustomColours3 = Colours[2].split(",");
						String [] CustomColours4 = Colours[3].split(",");

						// Store the custom colours 
						for (int i1=0;i1<3;i1++) {
							Information2[10][i1]=CustomColours1[i1];
							Information2[10][i1+3]=CustomColours2[i1];
							Information2[10][i1+6]=CustomColours3[i1];
							Information2[10][i1+9]=CustomColours4[i1];
						}

						RedArray[29]=Integer.parseInt(CustomColours1[0]);
						GreenArray[29]=Integer.parseInt(CustomColours1[1]);
						BlueArray[29]=Integer.parseInt(CustomColours1[2]);
						RedArray[30]=Integer.parseInt(CustomColours2[0]);
						GreenArray[30]=Integer.parseInt(CustomColours2[1]);
						BlueArray[30]=Integer.parseInt(CustomColours2[2]);
						RedArray[31]=Integer.parseInt(CustomColours3[0]);
						GreenArray[31]=Integer.parseInt(CustomColours3[1]);
						BlueArray[31]=Integer.parseInt(CustomColours3[2]);
						RedArray[32]=Integer.parseInt(CustomColours4[0]);
						GreenArray[32]=Integer.parseInt(CustomColours4[1]);
						BlueArray[32]=Integer.parseInt(CustomColours4[2]);
						//System.out.println(Colours[0]+" "+Colours[1]+" "+Colours[2]+" "+Colours[3]);
						Exit=1;
					}
					Option = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\CustomColour.txt");
					WriteSettings();
				}

				if (Button.equals("30")){
					File Option2 = null;
					System.out.println("DarkMode1");
					Option2 = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\DarkMode.txt");

					Scanner Reader = new Scanner(Option2);
					if (Button.equals("30")) { // Not sure why, but the reader must be closed after end of this loop
						while (Reader.hasNextLine()) {

							String data = Reader.nextLine();
							String [] splited = data.split(" ");
							for (int j=0;j<3;j++) {
								Information[0][j]=splited[j]; // Get all of the original info
							}

							// This will track the change of the dark mode 
							if (Num==1 && splited[2].equals("0")) {
								System.out.println("Darkmode");
								Information[0][2]="1";
								Num=0;
								WriteSettings();
							}
							else if (Num==1 && splited[2].equals("1")) {
								System.out.println("Lightmode");
								Information[0][2]="0";
								Num=0;
								WriteSettings();
							}
//							if (splited[1].equals(Button)) {
//								Position[1]=splited[1];
//								num1=1;
//							}
						}
						Reader.close();
					}
				}

			}

			if (Scene==5) {
				File Option = null;
				System.out.println("Points");
				Option = new File("C:\\Users\\jocap\\Desktop\\Computer science 12 Almost done\\2048\\Points.txt");
				Scanner myReader = new Scanner(Option);
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					String [] splited = data.split(" ");	
					TotalPoints=Integer.parseInt(splited[2]);
					if (Stop!=1) {
						WriteSettings();
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}

	public static void PlayGame() {
		SetUp(Board);
	}
	static int Count=0,Count2=0;
	public static void SetUp(int [][] Board) {
		int Lose=0;
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if (Board[i][j]==Board[i+1][j]) {
					Lose=Lose+1;
				}
				if (Board[i][j]==Board[i][j+1]) {
					Lose=Lose+1;
				}
				if (Board[i][j]==0) {
					Lose++;
				}
			}
		}
		if (Lose==0) {
			Scene=5;
		}
		Count++;
		int numX=(int)(Math.random( )* 4);
		int numY=(int)(Math.random( )* 4); 
		//int numY=0,numX=0;
		int Val=(int)(Math.random( )* 2);

		if (Board[numX][numY]>0) {
			Count2++;
			//		System.out.println(Count2);
			SetUp(Board);
		}
		Count++;

		BoardDisX[numX][numY]=(170*(numY));
		BoardDisY[numX][numY]=(170*(numX));

		if (Val==1 && Board[numX][numY]==0) {
			Board[numX][numY]=2;
		}
		if (Val==0 && Board[numX][numY]==0) {
			Board[numX][numY]=4;
		}

	}


	public void actionPerformed(ActionEvent e) {
		// refreshes the screen every time an action is performed
		repaint(); //performs any code in paint
	}
	@Override
	public void keyPressed(KeyEvent e) 
	{
		int code = e.getKeyCode();

		switch(code)
		{
		case KeyEvent.VK_DOWN:
			if (Scene!=5) {
				for (int i=3;i>=0;i--) {
					for (int j=3;j>=0;j--) {

						if (i+1<4) {
							if(BoardDisY[i][j]<=340 && Board[i][j]!=0 && Board[i+1][j]==0) {
								if (i+3<4) {
									if (Board[i+3][j]==0 && Board[i+2][j]==0 && Board[i+1][j]==0) {
										BoardDisY[i+3][j]=BoardDisY[i][j]+510;
										BoardDisY[i][j]=0;
										Board[i+3][j]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i+3][j]=BoardDisX[i][j];
										BoardDisX[i][j]=0;
										i=3;
										j=3;
									}
								}
								if (i+2<4) {
									if (Board[i+2][j]==0 && Board[i+1][j]==0) {
										BoardDisY[i+2][j]=BoardDisY[i][j]+340;
										BoardDisY[i][j]=0;
										Board[i+2][j]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i+2][j]=BoardDisX[i][j];
										BoardDisX[i][j]=0;
										i=3;
										j=3;
									}
								}
								if (i+1<4) {
									if (Board[i+1][j]==0) {
										BoardDisY[i+1][j]=BoardDisY[i][j]+170;
										BoardDisY[i][j]=0;
										Board[i+1][j]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i+1][j]=BoardDisX[i][j];
										BoardDisX[i][j]=0;
										i=3;
										j=3;
									}
								}

							}
						}
						if (i-1>=0) { // Code to combine the blocks
							if(Board[i][j]==Board[i-1][j] && Board[i][j]!=0) {
								Score=Score+Board[i-1][j]+Board[i][j];
								Board[i][j]=Board[i][j]+Board[i-1][j];
								Board[i-1][j]=0;
								BoardDisY[i-1][j]=0;
								BoardDisX[i-1][j]=0;
								j=3;
							}}
						else {
							BoardDisY[i][j]=BoardDisY[i][j];
						}

					}				
				}


				repaint();
				PlayGame();
			}
			break;
		case KeyEvent.VK_UP:
			if (Scene!=5) {

				for (int i=0;i<4;i++) {
					for (int j=0;j<4;j++) {

						if (i-1>=0) {
							if(BoardDisY[i][j]>=0 && Board[i][j]!=0 && Board[i-1][j]==0) {
								if (i-3>=0) {
									if (Board[i-3][j]==0 && Board[i-2][j]==0 && Board[i-1][j]==0) {
										BoardDisY[i-3][j]=BoardDisY[i][j]-510;
										BoardDisY[i][j]=0;
										Board[i-3][j]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i-3][j]=BoardDisX[i][j];
										BoardDisX[i][j]=0;
										i=0;
										j=0;
									}
								}
								if (i-2>=0) {
									if (Board[i-2][j]==0 && Board[i-1][j]==0) {
										BoardDisY[i-2][j]=BoardDisY[i][j]-340;
										BoardDisY[i][j]=0;
										Board[i-2][j]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i-2][j]=BoardDisX[i][j];
										BoardDisX[i][j]=0;
										i=0;
										j=0;
									}
								}
								if (i-1>=0) {
									if (Board[i-1][j]==0) {
										BoardDisY[i-1][j]=BoardDisY[i][j]-170;
										BoardDisY[i][j]=0;
										Board[i-1][j]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i-1][j]=BoardDisX[i][j];
										BoardDisX[i][j]=0;
										i=0;
										j=0;
									}
								}
							}
						}
						if (i+1<4) { // Code to combine the blocks
							if(Board[i][j]==Board[i+1][j] && Board[i][j]!=0) {
								Score=Score+Board[i+1][j]+Board[i][j];
								Board[i][j]=Board[i][j]+Board[i+1][j];
								Board[i+1][j]=0;
								BoardDisY[i+1][j]=0;
								BoardDisX[i+1][j]=0;
								j=0;
							}}
						else {
							BoardDisY[i][j]=BoardDisY[i][j];
						}
					}				
				}
			}
			repaint();
			PlayGame();
			break;
		case KeyEvent.VK_RIGHT:
			if (Scene!=5) {

				for (int i=3;i>=0;i--) {
					for (int j=3;j>=0;j--) {

						if (j+1<4) {
							if(BoardDisX[i][j]<=340 && Board[i][j]!=0 && Board[i][j+1]==0) {
								if (j+3<4) {
									if (Board[i][j+3]==0 && Board[i][j+2]==0 && Board[i][j+1]==0) {
										BoardDisY[i][j+3]=BoardDisY[i][j];
										BoardDisY[i][j]=0;
										Board[i][j+3]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i][j+3]=BoardDisX[i][j]+510;
										BoardDisX[i][j]=0;
										i=3;
										j=3;
									}
								}
								if (j+2<4) {
									if (Board[i][j+2]==0 && Board[i][j+1]==0) {
										BoardDisY[i][j+2]=BoardDisY[i][j];
										BoardDisY[i][j]=0;
										Board[i][j+2]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i][j+2]=BoardDisX[i][j]+340;
										BoardDisX[i][j]=0;
										i=3;
										j=3;
									}
								}
								if (j+1<4) {
									if (Board[i][j+1]==0) {
										BoardDisY[i][j+1]=BoardDisY[i][j];
										BoardDisY[i][j]=0;
										Board[i][j+1]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i][j+1]=BoardDisX[i][j]+170;
										BoardDisX[i][j]=0;
										i=3;
										j=3;
									}
								}
							}
						}
						if (j+1<4) { // Code to combine the blocks
							if(Board[i][j]==Board[i][j+1] && Board[i][j]!=0) {
								Score=Score+Board[i][j+1]+Board[i][j];
								Board[i][j]=Board[i][j]+Board[i][j+1];
								Board[i][j+1]=0;
								BoardDisY[i][j+1]=0;
								BoardDisX[i][j+1]=0;
								i=3;
							}}
						else {
							BoardDisX[i][j]=BoardDisX[i][j];
						}
					}				
				}
				repaint();
				PlayGame();
			}
			break;
		case KeyEvent.VK_LEFT:
			if (Scene!=5) {

				for (int i=0;i<4;i++) {
					for (int j=0;j<4;j++) {

						// Move the blocks code
						if (j-1>=0) {
							if(BoardDisX[i][j]>=0 && Board[i][j]!=0 && Board[i][j-1]==0) {
								if(j-3>=0) {
									if (Board[i][j-3]==0 && Board[i][j-2]==0 && Board[i][j-1]==0) {
										BoardDisY[i][j-3]=BoardDisY[i][j];
										BoardDisY[i][j]=0;
										Board[i][j-3]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i][j-3]=BoardDisX[i][j]-510;
										BoardDisX[i][j]=0;
										i=0;
										j=0;
									}
								}
								if(j-2>=0) {
									if (Board[i][j-2]==0 && Board[i][j-1]==0) {
										BoardDisY[i][j-2]=BoardDisY[i][j];
										BoardDisY[i][j]=0;
										Board[i][j-2]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i][j-2]=BoardDisX[i][j]-340;
										BoardDisX[i][j]=0;
										i=0;
										j=0;
									}
								}
								if(j-1>=0) {
									if (Board[i][j-1]==0) {
										BoardDisY[i][j-1]=BoardDisY[i][j];
										BoardDisY[i][j]=0;
										Board[i][j-1]=Board[i][j];
										Board[i][j]=0;
										BoardDisX[i][j-1]=BoardDisX[i][j]-170;
										BoardDisX[i][j]=0;
										i=0;
										j=0;
									}
								}
							}
						}
						if (j+1<4) { // Code to combine the blocks
							if(Board[i][j]==Board[i][j+1] && Board[i][j]!=0) {
								Score=Score+Board[i][j+1]+Board[i][j];
								Board[i][j]=Board[i][j]+Board[i][j+1];
								Board[i][j+1]=0;
								BoardDisY[i][j+1]=0;
								BoardDisX[i][j+1]=0;
								i=0;
							}}
						else {
							BoardDisX[i][j]=BoardDisX[i][j];
						}
					}				
				}
			}

			repaint();
			PlayGame();
			break;
		case KeyEvent.VK_2: // How to Play
			Scene=2;
			repaint();
			break;
		case KeyEvent.VK_3: // Settings
			Scene=3;
			repaint();
			break;
		case KeyEvent.VK_4: // Customize
			Scene=4;
			repaint();
			break;
		case KeyEvent.VK_9: // Takes you back
			Scene=0;
			repaint();
			break;
		case KeyEvent.VK_SPACE: // Play


			Scene=1;
			// Reset all the variables to their original values
			for (int i=0;i<4;i++) {
				for (int j=0;j<4;j++) {
					Board[i][j]=0;
					BoardDisX[i][j]=0;
					BoardDisY[i][j]=0;
				}}

			Movex=300;Movey=100;Score=0;SettingButton=680;TotalPoints=0;Stop=0;;
			for (int i=0;i<13;i++) {
				for (int j=0;j<4;j++) {
					Information [i][j]= " ";
					if (i==0) {
						Position[j]="";
					}
				}}
			for (int j=0;j<10;j++) {
				Information2[j][0]= "2";
			}
			for (int j=0;j<10;j++) {
				Information2[10][j]=" ";
			}
			num1=0;Num=1;Exit=0;Points=" ";


			SetUp(Board);
			ReadSettings();
			repaint();
			break;

		}
	}



	@Override
	public void mouseClicked (MouseEvent e)
	{
		Graphics g = getGraphics();
		x=e.getX(); // get the x and y location of the mouse
		y=e.getY();

		// The switch button for dark mode
		if (Scene==3) {
			if (x>=600 && x<=780 && y>=320 && y<=400)
			{		
				ReadSettings();
				if (SettingButton==680) {
					SettingButton=600;
				}
				else {
					SettingButton=680;
				}
				if (DarkMode==1) {
					DarkMode=0;
				}
				else if (DarkMode==0) {
					DarkMode=1;
				}
				Button="30";
				Num=1;
				ReadSettings();
			}
			repaint();
		}
		// Choose your own colours
		if (Scene==4) {

			// Left side
			// R1C1
			if (x>=670 && x<=780 && y>=290 && y<=350)
			{		

				// This block will make sure only one colour pallet is selected at a time 
				for (int i=0;i<8;i++) {
					if (i!=0) {
						Information2[i][0]="2";
						if (i%2!=0) {
							if (CustomizeButtonsX[i]==1690) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
					if (i!=0) {
						if (i%2==0) {
							if (CustomizeButtonsX[i]==790) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
				}

				if (CustomizeButtonsX[0]==730) {
					CustomizeButtonsX[0]=CustomizeButtonsX[0]-60; // Slide the button 
					Colours[0]=1; // This changes the colour to its new value
					Colours[1]=2;
					Colours[2]=3;
					Colours[3]=4;

				}
				else {
					CustomizeButtonsX[0]=CustomizeButtonsX[0]+60;
				}
				Button="1";
				//ReadSettings(); // Go into the settings
				if (CheckUnlock[0]==0) { // This ensures you wont have to buy it everytime
					num2=JOptionPane.showInputDialog("Would you like to buy the top left colour set?");
					Buy=1;
					System.out.println("i wanna buy 1");
					ReadSettings(); // Go into the settings
				}

			}
			// R2C1
			if (x>=1570 && x<=1690 && y>=290 && y<=350)
			{
				// This block will make sure only one colour pallet is selected at a time 
				for (int i=0;i<8;i++) {
					if (i!=1) {
						Information2[i][0]="2";
						if (i%2!=0) {
							if (CustomizeButtonsX[i]==1690) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
					if (i!=1) {
						if (i%2==0) {
							if (CustomizeButtonsX[i]==790) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
				}
				if (CustomizeButtonsX[1]==1630) {
					CustomizeButtonsX[1]=CustomizeButtonsX[1]-60;
					Colours[0]=5;
					Colours[1]=6;
					Colours[2]=7;
					Colours[3]=8;

				}
				else {
					CustomizeButtonsX[1]=CustomizeButtonsX[1]+60;
				}
				Button="2";
				if (CheckUnlock[1]==0) {
					num2=JOptionPane.showInputDialog("Would you like to buy the top right colour set?");
					Buy=1;
					System.out.println("i wanna buy 2");
					ReadSettings(); // Go into the settings 
				}
			}
			// R1C2
			if (x>=670 && x<=780 && y>=490 && y<=550)
			{
				// This block will make sure only one colour pallet is selected at a time 
				for (int i=0;i<8;i++) {
					if (i!=2) {
						Information2[i][0]="2";
						if (i%2!=0) {
							if (CustomizeButtonsX[i]==1690) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
					if (i!=2) {
						if (i%2==0) {
							if (CustomizeButtonsX[i]==790) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
				}
				if (CustomizeButtonsX[2]==730) {
					CustomizeButtonsX[2]=CustomizeButtonsX[2]-60;
					Colours[0]=9;
					Colours[1]=10;
					Colours[2]=11;
					Colours[3]=12;

				}
				else {
					CustomizeButtonsX[2]=CustomizeButtonsX[2]+60;
				}
				Button="3";
				if (CheckUnlock[2]==0) {

					num2=JOptionPane.showInputDialog("Would you like to buy the second down, left-side colour set?");
					Buy=1;
					System.out.println("i wanna buy 3");
					ReadSettings(); // Go into the settings 
				}
			}
			// R2C2
			if (x>=1570 && x<=1690 && y>=490 && y<=550)
			{
				// This block will make sure only one colour pallet is selected at a time 
				for (int i=0;i<8;i++) {
					if (i!=3) {
						Information2[i][0]="2";
						if (i%2!=0) {
							if (CustomizeButtonsX[i]==1690) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
					if (i!=3) {
						if (i%2==0) {
							if (CustomizeButtonsX[i]==790) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
				}
				if (CustomizeButtonsX[3]==1630) {
					CustomizeButtonsX[3]=CustomizeButtonsX[3]-60;
					Colours[0]=13;
					Colours[1]=14;
					Colours[2]=15;
					Colours[3]=16;

				}
				else {
					CustomizeButtonsX[3]=CustomizeButtonsX[3]+60;
				}
				Button="4";
				if (CheckUnlock[3]==0) {

					num2=JOptionPane.showInputDialog("Would you like to buy the second down, right-side colour set?");
					Buy=1;
					System.out.println("i wanna buy 4");
					ReadSettings(); // Go into the settings 
				}
			}
			// Right side
			// R1C3
			if (x>=670 && x<=780 && y>=690 && y<=750)
			{
				// This block will make sure only one colour pallet is selected at a time 
				for (int i=0;i<8;i++) {
					if (i!=4) {
						Information2[i][0]="2";
						if (i%2!=0) {
							if (CustomizeButtonsX[i]==1690) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
					if (i!=4) {
						if (i%2==0) {
							if (CustomizeButtonsX[i]==790) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
				}
				if (CustomizeButtonsX[4]==730) {
					CustomizeButtonsX[4]=CustomizeButtonsX[4]-60;
					Colours[0]=17;
					Colours[1]=18;
					Colours[2]=19;
					Colours[3]=20;

				}
				else {
					CustomizeButtonsX[4]=CustomizeButtonsX[4]+60;
				}
				Button="5";
				if (CheckUnlock[4]==0) {

					num2=JOptionPane.showInputDialog("Would you like to buy the third down, left-side colour set?");
					Buy=1;
					System.out.println("i wanna buy 5");
					ReadSettings(); // Go into the settings 
				}
			}
			// R2C3
			if (x>=1570 && x<=1690 && y>=690 && y<=750)
			{
				// This block will make sure only one colour pallet is selected at a time 
				for (int i=0;i<8;i++) {
					if (i!=5) {
						Information2[i][0]="2";
						if (i%2!=0) {
							if (CustomizeButtonsX[i]==1690) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
					if (i!=5) {
						if (i%2==0) {
							if (CustomizeButtonsX[i]==790) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
				}
				if (CustomizeButtonsX[5]==1630) {
					CustomizeButtonsX[5]=CustomizeButtonsX[5]-60;
					Colours[0]=21;
					Colours[1]=22;
					Colours[2]=23;
					Colours[3]=24;

				}
				else {
					CustomizeButtonsX[5]=CustomizeButtonsX[5]+60;
				}
				Button="6";
				if (CheckUnlock[5]==0) {

					num2=JOptionPane.showInputDialog("Would you like to buy the third down, right-side colour set?");
					Buy=1;
					System.out.println("i wanna buy 6");
					ReadSettings(); // Go into the settings 
				}
			}
			// R1C4
			if (x>=670 && x<=780 && y>=890 && y<=1050)
			{
				// This block will make sure only one colour pallet is selected at a time 
				for (int i=0;i<8;i++) {
					if (i!=6) {
						Information2[i][0]="2";
						if (i%2!=0) {
							if (CustomizeButtonsX[i]==1690) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
					if (i!=6) {
						if (i%2==0) {
							if (CustomizeButtonsX[i]==790) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
				}
				if (CustomizeButtonsX[6]==730) {
					CustomizeButtonsX[6]=CustomizeButtonsX[6]-60;
					Colours[0]=25;
					Colours[1]=26;
					Colours[2]=27;
					Colours[3]=28;

				}
				else {
					CustomizeButtonsX[6]=CustomizeButtonsX[6]+60;
				}
				Button="7";
				if (CheckUnlock[6]==0) {

					num2=JOptionPane.showInputDialog("Would you like to buy the bottom left colour set?");
					Buy=1;
					System.out.println("i wanna buy 7");
					ReadSettings(); // Go into the settings 
				}
			}



			// Set the information to the colours set by player
			// R2C4
			if (x>=1570 && x<=1690 && y>=890 && y<=1050)
			{
				Exit=1;
				// This block will make sure only one colour pallet is selected at a time 
				for (int i=0;i<8;i++) {
					if (i!=7) {
						Information2[i][0]="2";
						if (i%2!=0) {
							if (CustomizeButtonsX[i]==1690) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
					if (i!=7) {
						if (i%2==0) {
							if (CustomizeButtonsX[i]==790) {
								CustomizeButtonsX[i]=CustomizeButtonsX[i]-60;
							}
						}
					}
				}
				if (CustomizeButtonsX[7]==1630) {
					CustomizeButtonsX[7]=CustomizeButtonsX[7]-60;

				}
				else {
					CustomizeButtonsX[7]=CustomizeButtonsX[7]+60;
				}


				if (CheckUnlock[7]==0) {

					num2=JOptionPane.showInputDialog("Would you like to buy the bottom right colour set?");
					Buy=1;
					System.out.println("i wanna buy 8");
				}
				if (CheckUnlock[7]==1) {
					num3=JOptionPane.showInputDialog("Would you like to change the colours or keep the same? (Type same or change)");
					if (num3.equals("change"));
					{
						Exit=0;
						Button="8.1";
						ReadSettings(); // Go into the settings
					}
					if (num3.equals("same")) {
						Exit=1;
						Button="31";
						Colours[0]=29;
						Colours[1]=30;
						Colours[2]=31;
						Colours[3]=32;

					}
				}
			}
			repaint();

		}
	}
	static String num3;
	@Override
	public void keyReleased(KeyEvent arg0) { }
	@Override
	public void keyTyped(KeyEvent arg0) { }

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}


