import java.util.Scanner;
class Assignment3B
{
	public static void main (String[]args)
	{
		@SuppressWarnings("resourse")
		Scanner input = new Scanner(System.in);
		
			double num1,square,cube,FourthPower;
			System.out.println("Type in a number");
			num1=input.nextDouble();
			square = Math.pow(num1, 2.0);
			cube = Math.pow(num1, 3.0);
			FourthPower = Math.pow(num1, 4.0);
			System.out.printf("The square is  " + square +"\n");
			System.out.printf("The cube is  " + cube+ "\n");
			System.out.printf("The Fourth Power is  "+FourthPower +"\n");
		
	}
}