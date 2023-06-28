import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.event.KeyEvent;

public class Space extends JPanel implements ActionListener, KeyListener
{

	Timer t = new Timer(5,this);
	int x = 500;
	int y = 300;
	static int num1=1,PlayerShoot=0;
	static int [] RocketTracker = {0,0,0,0,0};
	static int [] Invaders = {0,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,2,2,2,2,2,2,2,2,2,2};
	static int [][] Sheild = {{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1},
			{1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1},
			{1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,0,0,0,0},
			{0,0,0,1,1,1,1,0,0,0,1,1,1,1,1,0,0,0,1,1,1,1,0,0,0,1,1,1,1,1,0,0,0,1,1,1,1,0,0,0},
			{0,0,0,1,1,1,1,0,0,0,1,1,1,1,1,0,0,0,1,1,1,1,0,0,0,1,1,1,1,1,0,0,0,1,1,1,1,0,0,0},
			{0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,0,0,0,0,1,1,1,1,1,0,0,0,0,1,1,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,1,1,1,1,1,0,0,0,0,0,0,0,0,0,0},
			{1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,0,0,0,0,0,0,0,0,1},
			{1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1,1,1,1,1,1,1,1,0,0,0,0,0,0,1,1},
			{1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1,1,1,1,1,1,1,1,1,0,0,0,0,1,1,1}};
	static int [][] Aliens = {{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
			{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
			{2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},
			{3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3},};
	private BufferedImage Ship = null;
	private BufferedImage Star = null;
	private BufferedImage Explosion = null;
	private BufferedImage Rocket = null;
	private BufferedImage BackGnd = null;                                                                                                    
	private BufferedImage Invader1 = null;                                                                                                    
	private BufferedImage Invader2 = null;                                                                                                    
	private BufferedImage Invader3 = null;                                                                                                    

	int Red=(int) ((Math.random()*255)+1); // generate random amounts of red, green and blue
	int Green=(int) ((Math.random()*255)+1);
	int Blue=(int) ((Math.random()*255)+1);
	int Scene=1;
	public Space()//Starts timer
	{
		t.start();	
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try   // load the images 
		{
			Ship=ImageIO.read(new File("Spaceinvader.png"));   			
			Star=ImageIO.read(new File("star.png"));    
			BackGnd=ImageIO.read(new File("X.png")); 
			Invader1=ImageIO.read(new File("images.png")); 
			Invader2=ImageIO.read(new File("images2.png")); 
			Invader3=ImageIO.read(new File("images3.png")); 
			Rocket=ImageIO.read(new File("Rocket.png")); 
			Explosion=ImageIO.read(new File("Explosion.png")); 

		}
		catch(IOException e)  		//catching if the image was not there
		{
			System.out.println("could not find image");
			g.drawString("Could not find images",100,100);
		}

		if (Scene==1) {
			g.setColor(Color.WHITE);      
			g.fillOval(-500,-500,3000,3000);

		}
		// Draw the sheild, background and ship 
		if (Scene==3) {
			g.drawImage(BackGnd, 0,0, 2000,1000,this);
			g.drawImage(Ship, x,900, 45,45,this);
			for (int i=0;i<40;i++) { // columns
				for (int j=0;j<20;j++) { // rows
					if (Sheild[j][i]==0) {
						g.setColor(Color.GREEN);
						g.fillRect(200+(i*40),400+(j*20),10,20);
					}
				}
			}
			MoveInvaders();
			// Draw the invaders
			for (int i=0;i<20;i++) { // columns
				for (int j=0;j<6;j++) { // rows
					if (Aliens[j][i]==1) {
						g.drawImage(Invader1, (i*60)+InvaderX,(j*30)+InvaderY, 30,30,this);
					}
					else if (Aliens[j][i]==2) {
						g.drawImage(Invader2, (i*60)+InvaderX,(j*30)+InvaderY, 30,30,this);
					}
					else if (Aliens[j][i]==3) {
						g.drawImage(Invader3, (i*60)+InvaderX,(j*30)+InvaderY, 30,30,this);
					}
				}
			}	
			InvaderShoot();
			g.setColor(Color.RED);
			g.fillRect(BulletX, BulletY,10,20);
			// How the player shoots
			if (PlayerShoot==1) {
				for (int i=0;i<5;i++) { // columns
					if (RocketTracker[i]!=0)
				g.drawImage(Rocket, RocketX,RocketY, 35,30,this);
				}
			}


		}
	}
	static int RocketY = 900,RocketX = 0;
	public void Shoot() {
		RocketY=RocketY+15;
	}
	static Random random = new Random();
	static int BulletY = 50;
	static int BulletX = 500;
	static int RI,RJ,RS,MaxX,MaxY;
	public void InvaderShoot() {
		
		RS = (int)(Math.random() * 50 + 1); // randomly shoots
		int RI = (int)(Math.random() * 20 + 1); // randomly selects i
		BulletY=BulletY+15;
		if (BulletY>900) {
			BulletX = (int)(Math.random() * MaxX + 1); // randomly selects i
			BulletY = (int)(Math.random() * MaxY + 1); // randomly selects i

			BulletY=50;
			BulletX=500;
		}
		if (PlayerShoot==1) {
			RocketY=RocketY-15;
		}
	}
	static int InvaderX=400,InvaderY=20;
	public static void MoveInvaders() {
		if (num1==1) {
			InvaderX=InvaderX-3;
			if (InvaderX<0) {
				num1=2;
				InvaderY=InvaderY+30;
				MoveInvaders();
			}
		}
		if (num1==2) {	
			InvaderX=InvaderX+3;
			if (InvaderX>1000) {
				num1=1;
				InvaderY=InvaderY+30;
				MoveInvaders();
			}
		}

	}


	public void actionPerformed(ActionEvent e) {

		// refreshes the screen every time an action is performed
		repaint(); //performs any code in paint
	}

	@Override
	public void keyPressed(KeyEvent e) {

		int code = e.getKeyCode();
		switch(code)
		{
		case KeyEvent.VK_0:
			Scene=3; // play
			break;
		case KeyEvent.VK_9:
			Scene=2; // Rules
			break;

		case KeyEvent.VK_RIGHT:
			if (x>=1850) {
				x=x;
			}
			else {
				x=x+40;	 //change x location right	
			}
			break;
		case KeyEvent.VK_LEFT:
			if (x<=0) {
				x=x;
			}
			else {
				x=x-40;   //change x location left
			}
			break;
		case KeyEvent.VK_SPACE:
			
			if (RocketY<0) {
				PlayerShoot=0;
				RocketY=900;
			}
			RocketX=x;
			PlayerShoot=1;
			break;

		}

		repaint();
	}
	@Override
	public void keyReleased(KeyEvent arg0) { }
	@Override
	public void keyTyped(KeyEvent arg0) { }

}
