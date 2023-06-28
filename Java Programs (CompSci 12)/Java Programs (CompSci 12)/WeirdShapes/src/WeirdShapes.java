import java.sql.Array;
import java.util.Scanner;
public class WeirdShapes
{
	private static final int Set = 0;
	// not changing the lives or amount of people 
	// count not working 
	public static Scanner input = new Scanner (System.in);
	private static int Columns=82;
	private static int Rows=24;
	public static  void main ( String[] args)          
	{
		boolean x=false; 
		int run=2, City = 0,i,Count,ShapeC,num=9,num2=9;
		int Rows,Columns;
		String Symbol,RandomPlace = null;

		while(run==2)//Go again
		{
			System.out.println("Type in the kind of symbol you'd like to use");
			Symbol=input.next();//ask for Symbol
			System.out.println("Would you like to start with a special shape?(1==yes, 2==no)");
			ShapeC=input.nextInt();

			if (ShapeC==1) {
				SHAPES(Symbol,City,run,RandomPlace,x,num,num2,Set);
			}
			else {
				RP(City,Symbol,x,run,RandomPlace);
			}
		}
	}
	
	// actual game 
	public static void RP(int City,String Symbol,boolean x,int run,String RandomPlace) {
		int i=0,Set=1;
		Rows = 24;
		Columns=82;
		String[][] map = new String[Rows][Columns];//create main map
		print(map);
		RandomPlace(map, City,Symbol);// after print send to the random generator

		// calls everything else	
		System.out.println("Would you like a random amount of people?");
		RandomPlace=input.next();
		RandomPlace=RandomPlace.toLowerCase();
		x=RandomPlace.startsWith("y");
		if (x==true)
		{
			City=(int )(Math.random( )* 1000  + 1);//choose random people amount
			run=3;
		}
		
		else 
		{
			System.out.println("How many people would you like to begin with?");
			City=input.nextInt();//ask for amount of people
			run=3;
		}

		//get out of the loops and print the map
		print(map);
		// Print statement    
		for (i = 1; i <=City; i++)//print RandomPlace *
		{
			RandomPlace(map, i, Symbol);
		}
		Set=1;
		Math(run,map,Symbol,Set);
	}
	
	// begins the game with the weird shapes
	public static void SHAPES(String Symbol,int City,int run,String RandomPlace,boolean x,int num,int num2,int Set) {

		// int stuff
		int i=0;
		Set=0;
		String[][] map = new String[Rows][Columns];//create main map

		printS(map, map);

		WeirdShapes(map, Symbol,City,run);
		
		printS1(map);
		run=3;
		Math(run,map,Symbol,Set);
	}	
	
	// print the shapes
	public static  void printS1( String[][] map)
	{//print the map
		for (int i = 1;  i < Rows;i++)  
		{
			for (int j = 1;   j< Columns;j++)  
			{
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	// for counting the shapes
	public static  void printS( String[][] map2,String [][]map )
	{//print the map
		int i, j;
		map2=map;
		for ( i = 0;  i < Rows;i++)  
		{
			for ( j = 1;   j< Columns;j++)  
			{
				map2[i][j]=" "; 
			}
		}
	}
	
	// counts the actual game people 
	public static  void print( String[][] map2 )
	{//print the map
		int i, j;
		for ( i = 0;  i < Rows;i++)  
		{
			for ( j = 1;   j< Columns;j++)  
			{
				map2[i][j]=" "; 
			}
		}
	}
	// print for the actual game
	public static  void print1( String[][] map2,String[][] map )
	{//print the map
		int i, j;
		for ( i = 1;  i < Rows;i++)  
		{
			for ( j = 1;   j< Columns;j++)  
			{
				System.out.print(map2[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void check( String[][] map, String Symbol)
	{//check the map to spawn/ remove Symbols
		int i, j, total2=0,Count = 0;
		String[][] map2 = new String[Rows][Columns];//create main map
		
		for ( i = 1;  i < Rows-1;i++)  
		{
			for ( j = 1;   j< Columns-1;j++)  
			{
				if (map[i][j]==" ")
				{
					if (map[i-1][j-1]==Symbol)
						total2=total2+1;
					if (map[i][j-1]==Symbol)
						total2=total2+1;
					if (map[i+1][j-1]==Symbol)
						total2=total2+1;
					if (map[i-1][j]==Symbol)
						total2=total2+1;
					if (map[i+1][j]==Symbol)
						total2=total2+1;
					if (map[i-1][j+1]==Symbol)
						total2=total2+1;
					if (map[i][j+1]==Symbol)
						total2=total2+1;
					if (map[i+1][j+1]==Symbol)
						total2=total2+1;
					if (total2==3)
					{
						map[i][j]=Symbol;
					}
				}
				total2=0;
				{

					Count++;
					if (map[i-1][j-1]==Symbol)
						total2=total2+1;
					if (map[i][j-1]==Symbol)
						total2=total2+1;
					if (map[i+1][j-1]==Symbol)
						total2=total2+1;
					if (map[i-1][j]==Symbol)
						total2=total2+1;
					if (map[i+1][j]==Symbol)
						total2=total2+1;
					if (map[i-1][j+1]==Symbol)
						total2=total2+1;
					if (map[i][j+1]==Symbol)
						total2=total2+1;
					if (map[i+1][j+1]==Symbol)
						total2=total2+1;
					if (total2==3)//if the Symbol has 3 around it birth
					{
						map2[i][j]=Symbol;
					}
					if (total2>3)//if the Symbol more than 3 around it die 
					{
						map2[i][j]=" ";
					}
					if (total2==2)//if the Symbol has 2 around it stay same
					{
						map2[i][j]=map[i][j];
					}
					if (total2<2)//if the Symbol has less than 2 around it die
					{
						map2[i][j]=" ";
					}
				}
				total2=0;
			}
		}
		for ( i = 1;  i < Rows-1;i++)  
		{
			for ( j = 1;   j< Columns-1;j++) 
			{
				map[i][j]=map2[i][j];
		}//end---------------
		}
	}


	public static  void Count( String[][] map, String Symbol )
	{//print the map
		int i, j;
		int Count=0;
		for ( i = 0;  i < Rows-1;i++)  
		{
			for ( j = 1;   j< Columns-1;j++)  
			{
				if (map[i][j]==Symbol)
				{
					int Count2=0;
					Count2++;
					Count=Count+Count2;
				}}}
		System.out.println("The number of people is " +Count);//ask for restart
	}
	
	public static void Math(int run,String [][] map,String Symbol,int Set) {

		// calls everything else
		while (run==3)
		{
			if (Set==1) {
			print1(map, map);
			run=1;
			}
			else {
			run=1;
			}
		}
		while (run==1)
		{
			check(map, Symbol);
			String Response;

			System.out.println();
			System.out.println("Would you like to go to the next generation, to restart, see the count the living and dead, or skip ahead multiple generations?");//ask for restart

			// Decides what happens to their response
			Response=input.next();
			boolean a,b,c,d; 

			Response=Response.toLowerCase();

			a=Response.startsWith("next");
			b=Response.startsWith("restart");
			c=Response.startsWith("count");
			d=Response.startsWith("skip");

			if (a==true)
			{
				run=3;
			}
			if (b==true)
			{
				run=2;
			}
			while (run==3)
			{
				print1(map, map);
				run=1;
			}

			if (c==true)
			{
				Count(map,Symbol);
				run=1;
			}

			if (d==true)
			{
				int Skips,u=1;
				System.out.println("How many generations would you like to skip?");//ask for number of skips
				Skips=input.nextInt();
				for ( u = 1;  u <= Skips;u++)  
				{
					print1(map, map);
					check(map, Symbol);
					System.out.println();
					System.out.println("This is "+u+" gens ahead" );//ask for number of skips
					System.out.println();
				}				
			}
		}
	}
	// randomizer
		public static  void RandomPlace( String[][] map, double City, String Symbol)
		{
			int rr, rc;
			{
				//pick RandomPlace column and row for *
				rr=(int )(Math.random( )* 22  + 1);//choose RandomPlace row
				rc=(int )(Math.random( )* 80  + 1);//choose RandomPlace column
				//put the * in the RandomPlace place on the array
				map[rr][rc]=Symbol;
			}
		}
		// shaperizer
		public static  void WeirdShapes(String[][] map, String Symbol,double City,int run)
		{//spawn RandomPlace Symbols
			int rows, columns,shape;
			{
				System.out.println("Press 1 for a gun, 2 for a line, 3 for a tree,"
						+ " 4 for snake, 5 for a ship, 6 for an Aircraft Carrier, 7 for a ruby,"
						+ " 8 for a barge, 9 for the python, 10 for a longboat, 11 for diagnol, 12 for a loaf,13 for tetris");
				shape=input.nextInt();
				// gun
				if (shape==1) {
					map[4][4]=Symbol;
					map[4][5]=Symbol;
					map[5][4]=Symbol;
					map[4][6]=Symbol;
					map[6][5]=Symbol;}
				// line
				if (shape==2) {
					map[4][4]=Symbol;
					map[4][5]=Symbol;
					map[4][6]=Symbol;}
				// tree
				if (shape==3) {
					map[5][4]=Symbol;
					map[4][5]=Symbol;
					map[5][5]=Symbol;
					map[6][5]=Symbol;
					map[4][6]=Symbol;}
				// snake
				if (shape==4) {
					map[4][4]=Symbol;
					map[5][4]=Symbol;
					map[5][5]=Symbol;
					map[4][6]=Symbol;
					map[4][7]=Symbol;
					map[5][7]=Symbol;}
				// ship
				if (shape==5) {
					map[4][4]=Symbol;
					map[5][4]=Symbol;
					map[4][5]=Symbol;
					map[6][5]=Symbol;
					map[6][6]=Symbol;
					map[5][6]=Symbol;}
				// AircraftCarrier
				if (shape==6) {
					map[4][4]=Symbol;
					map[5][4]=Symbol;
					map[4][5]=Symbol;

					map[6][6]=Symbol;
					map[6][7]=Symbol;
					map[5][7]=Symbol;}
				// ruby
				if (shape==7) {
					map[5][4]=Symbol;
					map[6][3]=Symbol;
					map[6][4]=Symbol;
					map[6][5]=Symbol;
					map[7][3]=Symbol;
					map[7][5]=Symbol;
					map[8][3]=Symbol;
					map[8][4]=Symbol;
					map[8][5]=Symbol;
					map[9][4]=Symbol;}
				// barge
				if (shape==8) {
					map[3][3]=Symbol;
					map[2][4]=Symbol;
					map[4][4]=Symbol;
					map[3][5]=Symbol;
					map[5][5]=Symbol;
					map[4][6]=Symbol;}
				// python
				if (shape==9) {
					map[4][4]=Symbol;
					map[5][4]=Symbol;
					map[5][5]=Symbol;
					map[4][6]=Symbol;

					map[4][8]=Symbol;
					map[3][8]=Symbol;
					map[3][7]=Symbol;}
				// long boat
				if (shape==10) {
					map[4][4]=Symbol;
					map[3][5]=Symbol;
					map[5][5]=Symbol;
					map[4][6]=Symbol;

					map[6][6]=Symbol;
					map[6][7]=Symbol;
					map[5][7]=Symbol;}
				// diagnal
				if (shape==11) {
					map[4][4]=Symbol;
					map[5][5]=Symbol;
					map[6][6]=Symbol;}
				// loaf
				if (shape==12) {
					map[4][4]=Symbol;
					map[4][5]=Symbol;
					map[4][6]=Symbol;
					map[5][4]=Symbol;
					map[5][6]=Symbol;
					map[6][4]=Symbol;
					map[6][5]=Symbol;
					map[6][6]=Symbol;}
				//tetris
				if (shape==13) {
					map[4][4]=Symbol;
					map[4][5]=Symbol;
					map[4][6]=Symbol;
					map[3][5]=Symbol;}
			}
		}
}//end of full loop