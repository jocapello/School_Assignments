import java.util.*;
public class Assignment6H
{
	public static void main  (String [] args)
	{
		int number;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		number = input.nextInt();

		for(int i = 2; i< number; i++)
		{
			while(number % i == 0)
			{
				System.out.println( i);
				number = number / i;
			}
		}
		
		if(number >2)
		{
			System.out.println(number);
		}
	}
}