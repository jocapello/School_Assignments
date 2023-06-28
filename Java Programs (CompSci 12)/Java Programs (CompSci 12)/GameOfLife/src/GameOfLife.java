import java.util.Scanner;
public class GameOfLife
{
	public static Scanner input = new Scanner (System.in);
	public static  void main ( String[] args)          
	{
		boolean x; 
		int run=2, City,i,Count,gen=0;
		String Symbol,RandomPlace;

		while(run==2)//Go again
		{
			System.out.println("Type in the kind of symbol you'd like to use");
			Symbol=input.next();//ask for Symbol
			System.out.println("Would you like to start with a random amount of people?");//ask for City members

			// This is litterally my magnum opus of coding
			// Determine if they want RandomPlace option or not 
			RandomPlace=input.next();

			RandomPlace=RandomPlace.toLowerCase();

			x=RandomPlace.startsWith("y");
			if (x==true)
			{
				City=(int )(Math.random( )* 1000  + 1);//choose RandomPlace row
				run=3;
			}
			else 
			{
				System.out.println("How many people would you like to begin with?");
				City=input.nextInt();//ask for amount of people
				run=3;
			}


			String[][] map = new String[24][82];//create main map
			print(map);
			// Print statement    
			for (i = 1; i <=City; i++)//print RandomPlace *
			{
				RandomPlace(map, i, Symbol);
			}
			options(run,map,Symbol);
			}//end of while loop
		
		}
	public static void options(int run,String [][]map,String Symbol) {
	
	// calls everything else
	while (run==3)
	{
		print1(map, map);
		run=1;
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
			Count(map,Symbol,run);
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
			}				
		}}}
	public static  void RandomPlace( String[][] map, double City, String Symbol)
	{//spawn RandomPlace Symbols
		int rr, rc;
		{
			//pick RandomPlace column and row for *
			rr=(int )(Math.random( )* 22  + 1);//choose RandomPlace row
			rc=(int )(Math.random( )* 80  + 1);//choose RandomPlace column
			//put the * in the RandomPlace place on the array
			map[rr][rc]=Symbol;
		}
	}
	public static  void print( String[][] map2 )
	{//print the map
		int i, j;
		for ( i = 0;  i < 24;i++)  
		{
			for ( j = 1;   j< 82;j++)  
			{
				map2[i][j]=" "; 
			}
		}
	}
	public static  void print1( String[][] map2,String[][] map )
	{//print the map
		int i, j;
		for ( i = 1;  i < 24;i++)  
		{
			for ( j = 1;   j< 82;j++)  
			{
				System.out.print(map2[i][j]);
			}
			System.out.println();
		}
	}
	
	public static  void Count( String[][] map, String Symbol,int run )
	{//print the map
		int i, j;
		int Count=0;
		for ( i = 0;  i < 23;i++)  
		{
			for ( j = 1;   j< 81;j++)  
			{
				if (Symbol==map[i][j])
				{
					int Count2=0;
					Count2++;
					Count=Count+Count2;
				}}}
		System.out.println("The number of people is " +Count);//ask for restart
		options(run,map,Symbol);
	}
	public static void check( String[][] map, String Symbol)
	{//check the map to spawn/ remove Symbols
		int i, j, total2=0,Count = 0;
		String[][] map2 = new String[24][82];//create main map
		for ( i = 1;  i < 23;i++)  
		{
			for ( j = 1;   j< 81;j++)  
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
					if (total2==3)//if the Symbol has 3 around it
					{
						map2[i][j]=Symbol;
					}
					if (total2>3)//if the Symbol more than 3 around it
					{
						map2[i][j]=" ";
					}
					if (total2==2)//if the Symbol has 2 around it
					{
						map2[i][j]=map[i][j];
					}
					if (total2<2)//if the Symbol has less than 2 around it
					{
						map2[i][j]=" ";
					}
				}
				total2=0;
			}
		}
		for ( i = 1;  i < 23;i++)  
		{
			for ( j = 1;   j< 81;j++) 
			{
				map[i][j]=map2[i][j];
		}//end---------------
		}
	}
}//end of full loop