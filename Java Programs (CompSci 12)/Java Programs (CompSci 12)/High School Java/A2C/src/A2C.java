import java.util.Scanner;

class A2C
{	
	public static void main (String[]args)
	{		
		Scanner scanner=new Scanner(System.in);
		int Number;

		
		Number=scanner.nextInt();
		while (Number!=0) {
		for (int i=11;i<=1000000;i++) {
				if (Sum(i*Number)==Sum(Number)) {
					System.out.println(i);
					break;
				}
				}
			Number=scanner.nextInt();
		}}
	public static int Sum(int num) {
		int sum = 0;

		while (num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}}