import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class Assignment14C extends JPanel implements MouseListener
{
    //creating the image variables
	private BufferedImage imgX = null;
	private	BufferedImage imgO = null;
	
	public Assignment14C()
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
    				imgX=ImageIO.read(new File("download.png"));
    				imgO=ImageIO.read(new File("Dog-PNG-File.png"));
    			}
    			catch(IOException e)  		//catching if the image was not there
    			{
    				System.out.println("could not find image");
    				g.drawString("Could not find images",100,100);
    			}
    			g.setColor(Color.WHITE);        
    			g.fillRect(400, 100, 300, 300);
    			g.setColor(Color.BLACK);	// draw the rectangle
     		Font myFont = new Font("Arial", Font.PLAIN,30);  //Set the font to a bigger size
    			g.setFont(myFont);// write text on the screen starting at location (250,30)
    			g.drawString ("Left side is good, right side is bad",250,30);
    		}
   	 public void mouseClicked(MouseEvent e) 
	    {	
	    	Graphics g = getGraphics();
	    	int x=e.getX(); // get the x and y location of the mouse
		int y=e.getY();
		//Check the square that has been clicked
		if (x<=500)
		{
		g.drawImage(imgO, x,y, 90,90,this);
		}
		
		if (x>=500) {
		g.drawImage(imgX, x,y, 90,90,this);
		}
				
	    }
}

