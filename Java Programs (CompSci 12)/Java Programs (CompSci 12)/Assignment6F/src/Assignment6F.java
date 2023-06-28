import java.util.Scanner;
public class Assignment6F
{
	public static void main  (String [] args)
	{
		Scanner input = new Scanner(System.in);
		int i,onecount = 0,twocount = 0,num=1,number=0,n=0;
		
		System.out.println("Type in a number you want to see if it has one more one than two "); 
		n=input.nextInt();
		int num1=1;
		for ( i=1;i<=n;i++)
		{	
			number=i;

			onecount=0; // Reset one and two count because they're taking old values and using them with i 
			twocount=0;

			do
			{
			//System.out.println("num1 "+num1);
			num1=number % 10;   // the remainder when you divide by 10 is the digit on the right   
			//System.out.println("Num1 "+num1);
			number=number/=10;    // divide the i by 10 to get rid of the last digit


			
			if (num1==1)
			{
				onecount=onecount+1;
			}

			else if (num1==2)
			{
				twocount=twocount+1;	
			}					


		}while (number!=0);  // continue until all the digits are printed
			
			if (onecount==twocount+1)	//print if it works
			{
				System.out.println("Your number "+i +" has one more one than two");
			}

											
	}}}