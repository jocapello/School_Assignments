import java.util.Scanner;
public class Assignment6E
{
	public static void main  (String [] args)
	{
		Scanner input = new Scanner(System.in);
		int num2=1,num1 = 1,number=1,onecount = 0,twocount = 0;

		System.out.println("Type in a number you want to see if it has one more one than two "); 
		number=input.nextInt();

		do
		{

			num1=number % 10;   // the remainder when you divide by 10 is the digit on the right    
			number=number/10;    // divide the number by 10 to get rid of the last digit

			if (num1==1)
			{
				onecount=onecount+1;
			}

			else if (num1==2)
			{
				twocount=twocount+1;
			}

			System.out.println(num1);	//print the digit

		}while (number>0);  // continue until all the digits are printed

		if (onecount==twocount+1)	//print if it works
		{
			System.out.println("Your number has one more one than two");
		}
		
		else  // Print if not
		{
		System.out.println("Your number does not have one more one than two");
		}

	}}




