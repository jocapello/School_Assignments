import java.util.Scanner;

class Assignment6A
{
	public static  void main ( String[]   args)	
	{
		Scanner input = new Scanner (System.in);

		int num1,desicion=0,num2=1;

		while (num2==1) 

		{

			System.out.println("Type in a number that you want to see if it's odd or even"); 
			num1=input.nextInt();

			desicion=num1%2;
//even
			if (desicion==0)
				System.out.println("Even");
//odd			
			if (desicion==1)
				System.out.println("Odd");
			
			System.out.println("Would you like to continue?"); 
			num2=input.nextInt();
}}}

