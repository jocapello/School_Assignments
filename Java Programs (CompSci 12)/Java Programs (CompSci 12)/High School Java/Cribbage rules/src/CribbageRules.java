import java.util.Scanner;
public class CribbageRules
{
	public static Scanner input = new Scanner (System.in);
	public static  void main ( String[] args)          
	{
		int start=1;

		while (start==1)
		{
			boolean x; 
			int run=2, City,Count,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12;
			int throw1,throw2;
			String RandomPlace;
			r1=(int)(Math.random( )* 4  + 1);//choose RandomPlace Random
			r2=(int)(Math.random( )* 4  + 1);//choose RandomPlace Random
			r3=(int)(Math.random( )* 4  + 1);//choose RandomPlace Random
			r4=(int)(Math.random( )* 4  + 1);//choose RandomPlace Random
			r5=(int)(Math.random( )* 4  + 1);//choose RandomPlace Random
			r6=(int)(Math.random( )* 4  + 1);//choose RandomPlace Random
			r7=(int)(Math.random( )* 13  + 1);//choose RandomPlace Random
			r8=(int)(Math.random( )* 13  + 1);//choose RandomPlace Random
			r9=(int)(Math.random( )* 13  + 1);//choose RandomPlace Random
			r10=(int)(Math.random( )* 13  + 1);//choose RandomPlace Random
			r11=(int)(Math.random( )* 13  + 1);//choose RandomPlace Random
			r12=(int)(Math.random( )* 13  + 1);//choose RandomPlace Random

			String[] Card={"Card1 ", "Card2 ", "Card3 ", "Card4 ", "Card5", "Card6 "};
			int [] CompType={r1, r2, r3, r4, r5, r6};	
			int [] CompNum={r7, r8, r9, r10, r11, r12};	

			System.out.println("Player one, your cards are");
			for (int i=0; i<6;i++) 
			{
				System.out.print(Card[i]+"       ");
			}
			System.out.println();
			for (int k=0; k<6;k++) 
			{
				System.out.print(CompNum[k]);
				RandomCards(Card,CompType,CompNum, k);
			}		

	

			System.out.println();
			System.out.println("Pick a card you want to throw");
			throw1=input.nextInt();
			System.out.println("And the second");
			throw2=input.nextInt();


			int R,R2;
			System.out.println("The card you flipped is");
			R=(int)(Math.random( )* 4  + 1);//choose RandomPlace Random
			R2=(int)(Math.random( )* 13  + 1);//choose RandomPlace Random
			for (int k=0; k<1;k++) 
			{
			RandomCards(Card,CompType,CompNum, k);
			}
			start=2;
		}}
	public static  double RandomCards( String [] Card,int[]CompType,int[]CompNum,int i)
	{
	
			if (CompType[i]==1)
			{
				System.out.print(" Diamond "+"    ");
			}
			else if (CompType[i]==2)
			{
				System.out.print(" Club "+"    ");
			}
			else if (CompType[i]==3)
			{					
				System.out.print(" Hearts "+"    ");
			}
			else if (CompType[i]==4)
			{
				System.out.print(" Spades "+"    ");
			}
		
		return 0;}
	}