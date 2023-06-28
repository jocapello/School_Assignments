import java.util.Scanner;
class a3d
{
	public static void main (String[]args)
	{
		

		Scanner input = new Scanner(System.in);
		int radius;
		double pi,area;

		System.out.println("Type in a number");
		radius = input.nextInt();
		pi = Math.PI;    
		area = radius * radius * pi;

		System.out.println("Your area is" +area);


	}
}