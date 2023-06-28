import java.util.Scanner;
class Assignment4B
{
	public static void main (String[]args)
	{

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int num1=1,i,total=0;

		for (i=1; i<=50;i++)
		{

			total=total+num1;
			num1=num1+1;

		}
		System.out.println(total);
	}
}