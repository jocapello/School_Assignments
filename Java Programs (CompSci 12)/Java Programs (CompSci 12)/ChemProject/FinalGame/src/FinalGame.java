import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Scanner;

import javax.imageio.ImageIO;
import javax.swing.*;

public class FinalGame extends JPanel 
{
	// int 
	boolean Catcher=true;
	static int length=6;
	static int [] cardList = {1,2,3,4,5,6};	
	static int [] Hand={0,0,0,0};

	public void mouseClicked(MouseEvent e) 
	{	
		int selectedCard=-1;
		int x=e.getX(); // get the x and y location of the mouse
		int y=e.getY();
		int num21=0;
		int num1=0;

		for (int p=0;p<length;p++)//pick cards loop
		{
			if (x>=600+150*p && x<=600+150*p+200 && y>=700 && y<=900)//find which card is chosen
			{
				selectedCard=p;//p is the selected card
				num1++; // if they choose 2 cards
				System.out.println("The num21 is "+num1);
			}
		}
		int [] Cardlist={10, 13, 24, 33, 54,75};	
		int [] Hand={0,0,0,0};
		int [] Crib={0,0};

		int length=6,num9=1,run=1,run2=0;


		// Find the crib
		int j=0;
		
		for (int i=0; i<length;i++)
		{
			if (i!=selectedCard)
			{
				Hand[i]=Cardlist[i];
				i++;
				Crib[i]=Cardlist[selectedCard];

				for (int i1=0; i1<4;i1++)
				{
				System.out.println("The hand is "+Hand[i1]);}
			}
			for (int e1=0; e1<1;e1++)
			{
				System.out.println("The crib is "+Crib[e1]);
				System.out.println("The selected card is "+selectedCard);
			}}

	}
	public static  void ThrowFlip(int [] cardList, int length)          
	{System.out.println("In method");
	int Player1=1;
	while (Player1==7)
	{
		Player1=1;
	}
	while (Player1==1)
	{
		boolean x; 
		int sum,NUM1,NUM2;
		String num1,num2;
		int [] Thrown = {1,2};	
		num1=JOptionPane.showInputDialog("Pick a card you want to throw (0-5)");
		NUM1 = Integer.parseInt(num1.trim());

		// Selecting the thrown cards into array
		int i = 0;
		i++;
		if (NUM1==cardList[i])
		{
			Thrown[1]=Thrown[cardList[i]];
			cardList[i]=-5;
		}
		else 
		{
			Player1=7;
		}
		num2=JOptionPane.showInputDialog("And the second (0-5)");
		NUM2 = Integer.parseInt(num2.trim());

		if (NUM1==cardList[i])
		{
			Thrown[2]=Thrown[cardList[i]];
			cardList[i]=-5;
		}
		else 
		{
			Player1=7;
		}

		int [] cardList2 = {1,2,3,4};	
		int l = 0;
		for (l=0;l<=5;l++) {
			if (cardList[l]!=-5)
			{
				cardList2[l]=cardList[l];
			}}	
		for (int p=0;p<length;p++) 
		{
			System.out.println(cardList2[p]);
		}


		length=4;

	}}	
} //end