import java.util.Scanner;

class Abracadabra
{	
	public static void main (String[]args)
	{		
		Scanner scanner=new Scanner(System.in);
		int Number;

		Number=scanner.nextInt();
		for (int i=1;i<=Number;i++) {
			System.out.println(i+" Abracadabra");
		}

	}}