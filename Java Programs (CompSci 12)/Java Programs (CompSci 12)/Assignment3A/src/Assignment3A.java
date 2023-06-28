import java.util.*;
class Assignment3A
{
	public static void main (String[]args)
	{

		Scanner input = new Scanner(System.in);
		int num1, num2, sum, product, difference;
		double quotient;
		System.out.println("Type in a number");
		num1=input.nextInt();
		System.out.println("Type in a second number");
		num2=input.nextInt();
		sum = num1+num2;
		product = num1*num2;
		difference = num1-num2;
		quotient =(double) num1/num2;
		System.out.printf("The sum is "+sum+ "\n"+ "The product is "+product+ "\n" +"The difference is "+difference +"\n" +"The quotient is "+quotient);
	}

}
