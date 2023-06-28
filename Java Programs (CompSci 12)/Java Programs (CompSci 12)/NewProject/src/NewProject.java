import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

public class NewProject extends JPanel 
{
	public void paintComponent (Graphics g) {

	super.paintComponent(g);
	{
		//circle
		g.setColor(Color.YELLOW);
		g.fillOval(10,10,2000,2000);
	g.setColor(Color.WHITE);   // set up the tic tac toe grid        
	Font myFont = new Font("Arial", Font.PLAIN,100);  //Set the font to a bigger size
	g.setFont(myFont);// write text on the screen starting at location (250,30)
	g.drawString ("Cribbage",850,500);
	int r1,r2,r3,r4,r5,r6;
	r1=(int)(Math.random( )* 52  + 1);//choose RandomPlace Random
	r2=(int)(Math.random( )* 52  + 1);//choose RandomPlace Random
	r3=(int)(Math.random( )* 52  + 1);//choose RandomPlace Random
	r4=(int)(Math.random( )* 52  + 1);//choose RandomPlace Random
	r5=(int)(Math.random( )* 52  + 1);//choose RandomPlace Random
	r6=(int)(Math.random( )* 52  + 1);//choose RandomPlace Random
	int [] cardList = {r1,r2,r3,r4,r5,r6};

	}}}