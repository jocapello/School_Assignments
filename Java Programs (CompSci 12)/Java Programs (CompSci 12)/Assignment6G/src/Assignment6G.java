import java.util.*;
class Assignment6G
{
	public static  void main ( String[]   args)			
	{
		Scanner input = new Scanner (System.in);			
		int  number,  k , done,num1=1;
		k=2;   // start with the first prime number
		done=0;

		while (num1==1)
		{
			System.out.println("Type in a number");	
			number=input.nextInt();
			k=2;   // start with the first prime number
			done=0;
			
			while(k<=number/2 && done==0)  // continue until the numbers are too big 
			{
				if ((number % k) ==0)   // if the number is divisible by the prime number
				{                                         //the number is not prime
					done=1;
				}

				else
					k++;                         // move on to the next number
			}

			if ((done) ==0)
			{
				System.out.println("The number "+number+" is prime.");
			}
			else
			{
				System.out.println("The number "+number+" is not prime.");	
			
			}
			System.out.println("Would you like to try another number? (1==yes, 2==no)");
			num1=input.nextInt();
		}}}
