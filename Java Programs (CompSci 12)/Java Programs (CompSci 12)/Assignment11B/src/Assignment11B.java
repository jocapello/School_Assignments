import java.util.Scanner;

public class Assignment11B
{
	public static void main(String[] args) 
	{
		int num1=1;
		while (num1==1)
		{
			Scanner scanner = new Scanner(System.in);
			System.out.print("Original string : ");

			String originalStr = scanner.nextLine();

			String words[] = originalStr.split("\\s");
			String reversedString = "";

			//Reverse each word's position
			for (int i = 0; i < words.length; i++) { 
				if (i == words.length - 1) 
					reversedString = words[i] + reversedString; 
				else
					reversedString = " " + words[i] + reversedString; 
			}  
			// Displaying the string after reverse
			System.out.print("Reversed string : " + reversedString);
			System.out.println();
			System.out.print("Would you like to try again? (1==yes, 2==no) ");
			num1 = scanner.nextInt();
		}}}