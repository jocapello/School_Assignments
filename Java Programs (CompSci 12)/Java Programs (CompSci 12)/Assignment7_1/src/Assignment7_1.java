import java.util.*;
class Assignment7_1
{
	public static  void main ( String[]   args)			
	{
		Scanner input = new Scanner (System.in);
		int num1=1,num2,i;
		double mean = 0;
		
		while (num1==1)
		{
			System.out.println("Type in how many numbers up to ten you would like to input");
			num2 = input.nextInt();
			int[ ] NUMBERS= new int[num2];
			for ( i = 0;  i < num2; i++)
			{      //enter the NUMBERS, prompt user with number #
				System.out.println("Number # " + (i+1) + ":");	
				NUMBERS[i]=input.nextInt();
				mean=mean+NUMBERS[i];
			}			
			System.out.println("The mean is "+mean/num2 );
			System.out.println("Here are the NUMBERS: " );
			for ( i = 0;  i < num2; i++)
			{
				System.out.println(NUMBERS[i]+"  ");	
			}
			System.out.println("Would you like to input a new set of numbers? (1==yes, 2==no)");
			mean=0;
			num1 = input.nextInt();		
		}}}

