import java.util.Scanner;
public class Assignment5A
{
	public static void main  (String [] args)
	{

		Scanner input = new Scanner(System.in);
		int num1=1,num2;

		while (num1==1)
		{
			System.out.printf("Please type in a number");
			num2=input.nextInt();

			if (num2<=50)
			{
				System.out.printf("Your number is smaller than 50");
				System.out.printf("\n Would you like to continue? (1==Yes, 2==No)");
				num1=input.nextInt();

			}
			if (num2>=+50)
			{
				System.out.printf("Your number is bigger than 50");
				System.out.printf("\n Would you like to continue? (1==Yes, 2==No)");
				num1=input.nextInt();

			}
		}
	}


}
