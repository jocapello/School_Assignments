import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
public class Assignment14B extends JPanel implements ActionListener, KeyListener
{
	Timer t = new Timer(5,this);
	int x = 500;
	int y = 500;
	int x2 = 100;
	int y2 = 200;
	int xVel=0;
	int yVel=0;
	int code;
	double HitDet;

	public Assignment14B()//Starts timer
	{
		t.start();	
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.setColor(Color.LIGHT_GRAY);
		g.fillOval(-800,-300,3500,3500);
		
		// draw a black circle on the screen at location (x,y)		
		g.setColor(Color.YELLOW);
		g.fillOval(x,y,200,200);
		
		g.setColor(Color.BLACK);
		g.fillOval(x+20,y+20,50,50);
		g.fillOval(x+100,y+20,50,50);
		
		g.fillRect (x , y, 200, 20);
		
		g.fillRect (x+30 , y-100, 140, 100);
		
		
		g.setColor(Color.WHITE);
		g.fillOval(x+25,y+25,15,15);
		g.fillOval(x+105,y+25,15,15);

		g.setColor(new Color(255,0,0));
		g.fillOval(x+15,y+110,120,20);
		
		// draw a black circle on the screen at location (x,y)
		g.setColor(Color.black);
		g.fillOval(x2,y2,60,60);
		

	}
	public void actionPerformed(ActionEvent e) {
		HitDet = Math.sqrt( Math.pow(x2-x, 2.0)+Math.pow(y2-y, 2.0));
		// refreshes the screen every time an action is performed
		x=x+xVel;     // move the circle to the left or the right
		y=y+yVel;    // move the circle up or down
		if (x>=1920)
		{
			x=1850;
		}
		if (x<=0)
		{
			x=50;
		}
		if (y>=1000)
		{
			y=950;
		}
		if (y<=0)
		{
			y=50;
		}
		
		x2=x2+10;
		if (x2>=1900)
		{
		x2=100;	
		}
		
		Graphics g = getGraphics();
		int r,gn,b;
		r=(int) ((Math.random()*255)+1); // generate random amounts of red, green and blue
		gn=(int) ((Math.random()*255)+1);
		b=(int) ((Math.random()*255)+1);
		if (HitDet<=200) {
			Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
			g.setFont(myFont);
			g.setColor(new Color(r,gn,b));
			g.drawString ("HIT",100,800);
			
		}
		
		repaint(); //performs any code in paint

	}

	@Override
	public void keyPressed(KeyEvent e) 
	{
		int code = e.getKeyCode();
		switch(code)
		{
		case KeyEvent.VK_DOWN:
			xVel=0; // do not move left or right
			yVel=5; //change y location down

			break;
		case KeyEvent.VK_UP:
			xVel=0; // do not move left or right
			yVel=-5; //change y location up

			break;
		case KeyEvent.VK_RIGHT:
			xVel=5; // change x location right
			yVel=0; //do not move up or down
		
			break;
		case KeyEvent.VK_LEFT:
			xVel=-5; // change x location left
			yVel=0; //do not move up or down

			break;
		case KeyEvent.VK_SPACE:
			// add code for other events
			break;
			
		}
	}
	@Override
	public void keyReleased(KeyEvent arg0) {}
	@Override
	public void keyTyped(KeyEvent arg0) {}
}
