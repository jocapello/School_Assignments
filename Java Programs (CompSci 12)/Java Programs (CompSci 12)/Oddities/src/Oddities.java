import java.util.Scanner;

class Oddities
{	
	public static void main (String[]args)
	{		
		Scanner scanner=new Scanner(System.in);
		int Number;
		Number=scanner.nextInt();

		int [] Array= new int [Number];

		for (int i=0;i<Number;i++) {
			Array[i]=scanner.nextInt();
		}
		for (int i=0;i<Number;i++) {
			if (Array[i] % 2 ==0) {
				System.out.println(Array[i]+" Is even");}
				else {
					System.out.println(Array[i]+" Is odd");}
			}}}