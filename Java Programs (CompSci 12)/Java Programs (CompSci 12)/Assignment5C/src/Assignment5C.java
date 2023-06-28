import java.util.*;
class Assignment5C
{
	public static  void main ( String[]   args)
	{
		Scanner input = new Scanner(System.in);
		int guess=0;
		int r,num1=1,num2;

		// random number from 1-100
		r=(int )(Math.random( )* 100  + 1)  ;

		System.out.println("What is your first guess?");
		num2=input.nextInt();


		while (num1==1)
		{
			if (num2<r)
			{
				System.out.println("The number is bigger than " +num2);
				System.out.println("What is your next guess?");
				guess++;
				
				num2=input.nextInt();

			}
			if (num2>r)
			{
				System.out.println("The number is smaller than " +num2);
				System.out.println("What is your next guess?");
				guess++;

				num2=input.nextInt();

			}
			if (num2==r)
			{
				System.out.println("You guessed the correct number!");
				guess++;
				System.out.println("You guessed "+guess+" times");
				guess=0;
				r=-1;
				// random number from 1-100
				r=(int )(Math.random( )* 100  + 1)  ;
				System.out.println("Would you like to play again? (1==yes, 2==no)");
			
				num1=input.nextInt();
			}
		}

		
	}
}

