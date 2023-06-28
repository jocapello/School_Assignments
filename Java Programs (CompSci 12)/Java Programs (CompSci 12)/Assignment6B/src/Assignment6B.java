import java.util.Scanner;

class Assignment6B
{
	public static  void main ( String[]   args)	
	{
		Scanner input = new Scanner (System.in);

		int num1,desicion=0,num2=1,num3;

	while (num2==1) 

		{

			System.out.println("Type in a number "); 
			num1=input.nextInt();
			System.out.println("Type in a number you want to divide the first by "); 
			num3=input.nextInt();

			desicion= num1 % num3;
			//even
			if (desicion==0)
				System.out.println("Even");
//odd			
			if (desicion!=0)
				System.out.println("Odd");
			
			System.out.println("Would you like to continue?"); 
			num2=input.nextInt();
}}}
