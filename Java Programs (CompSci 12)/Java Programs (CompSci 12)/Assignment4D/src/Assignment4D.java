import java.util.Scanner;
public class Assignment4D
{
	public static void main  (String [] args)
	{

		Scanner input = new Scanner(System.in);
		double num1=0,cube,i, root;
		
		System.out.printf(" Number			   Square	 Cube");

		
		for ( i=0; i<=10;i++)
		{
			cube = Math.pow(num1, 3.0);
			root= Math.sqrt(num1);
			System.out.printf("\n %-25s %-13s %-15.5f \n",i ,cube,root);
			num1=num1+1;
		}
	}
}