import java.util.Scanner;
class Assignment7_3
{
	public static  void main ( String[]   args)			
	{
		Scanner input = new Scanner (System.in);

		int i=0,r1,r2,die = 0,dieRolls =0,start=1 ;
		int[ ] Results= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		while(start==1)
		{
		System.out.println("Number of die rolls ");
		dieRolls=input.nextInt();
		for ( i = 1;  i <=dieRolls; i++)
		{      //enter the number of rolls, prompt user with results
			//Dice mechanics
			r1=(int )(Math.random( )* 6  + 1); 
			r2=(int )(Math.random( )* 6  + 1);  
			die=r1+r2;
			//input how many rolls
			Results[die]=Results[die]+1;
			//
		}

		System.out.println("Here are the results:");
		for ( i = 2;  i < 12; i++)
		{
			System.out.println(i+"  " +Results[i]);	
		}
		for ( i = 2;  i < 12; i++)
		{
			Results[i]=0;
		}
		System.out.println("Would you like to try again? (1==yes, 2==no)");
		start=input.nextInt();
		}}}