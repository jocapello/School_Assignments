import java.util.Scanner;
class Assignment11A
{
	public static void main (String[] args)
	{
		int num1=1;
		while (num1==1)
		{
	int num=2;
	String temp;
	Scanner s1 = new Scanner(System.in);
	String People[] = new String[2];
	System.out.println("Enter two names");
	{
		System.out.println();
		for (int i = 0; i < num; i++) 
		{
			People[i] = s1.nextLine();
			People[i]=People[i].toLowerCase();
		}
		
		
		for (int i = 0; i < num; i++) 
		{

			for (int j = i + 1; j < num; j++) 
			{
				// orders it lexicographically (Alphabetical order of thier letters in numbers or lexical order
				if (People[i].compareTo(People[j])>0) 
				{
					temp = People[i];
					People[i] = People[j];
					People[j] = temp;
				}
			}
		}
		System.out.print("People in Sorted Order:");
		for (int i = 0; i < num - 1; i++) 
		{
			System.out.print(People[i]+" ");
		}
		Scanner input = new Scanner (System.in);

		System.out.print(People[num - 1]);
		System.out.println();
		System.out.println("Would you like to try another two names? (1==yes, 2==no)");
		num1 = input.nextInt();
		

	}}}}