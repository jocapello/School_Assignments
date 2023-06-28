import java.util.Scanner;
class Assignment8_3
{
	public static  void main ( String[]   args)	
	{
		Scanner input = new Scanner (System.in);

		int [ ][ ] Array={ 
				{0,0,0},
				{0,0,0},
				{0,0,0}};	

		int Turn=1,i=0,j=0,Row,Column,PlayerTurn=1;

		while (Turn==1)
		{
			
			for ( i = 0;  i < 3;i++)   
			{

				for ( j = 0;   j< 3;j++)   
				{
					System.out.print(Array[i][j]+"  ");   

				}
				System.out.println();
			}
			System.out.println("Player one can go");
			if (i==3)
			{
				System.out.println("Pick a row");
		        Row=input.nextInt();
				System.out.println("Pick a column");
		        Column=input.nextInt();
		        Array[Row-1][Column-1]=PlayerTurn;
		        if (PlayerTurn==1)
		        {
		        	PlayerTurn=2;
		        }
		        else
		        {
		        	PlayerTurn=1;
		        }
			}}}}