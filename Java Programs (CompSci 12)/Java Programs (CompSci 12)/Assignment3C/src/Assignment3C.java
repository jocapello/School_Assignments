import java.util.Scanner;
class Assignment3C	
{
	public static void main (String[]args)
	{
		@SuppressWarnings("resourse")
		Scanner input = new Scanner(System.in);
		
			int num1,num2,num3,num4,num5;
			double average,sum;
			System.out.println("Type in a number");
			num1=input.nextInt();
			System.out.println("Type in a second number");
			num2=input.nextInt();
			System.out.println("Type in a third number");
			num3=input.nextInt();
			System.out.println("Type in a fourth number");
			num4=input.nextInt();
			System.out.println("Type in a fifth number");
			num5=input.nextInt();
			
			sum = num1 + num2 + num3 + num4 + num5;
			average = sum /5;
			
			System.out.println("Your average is " +average);
		
	}
	}