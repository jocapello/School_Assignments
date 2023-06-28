import java.util.Scanner;

class A2A
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner (System.in);
		int num1=1;
		double Vanilla,Chocolate,Cookie;

		String [] Flavors={ "Single Vanilla","Double Vanilla","Single Chocolate","Double Chocolate","Single Cookie dough","Double Cookie dough","Vanilla and Chocolate","Vanilla and Cookie dough"};
		int []  Count = {0, 0, 0, 0, 0, 0, 0, 0};

		while (num1==1) {
		for (int i=0;i<=7;i++) {
		System.out.println("How many scoops of "+Flavors[i] );
		Count[i] = input.nextInt();	

		}
		Vanilla= (Math.ceil((Count[0]+Count[1]*2+Count[7]+Count[6])*1.05*31)/96);
		Chocolate=(Math.ceil((Count[2]+Count[3]*2+Count[6])*1.05*31)/96);
		Cookie=(Math.ceil((Count[4]+Count[5]*2+Count[7])*1.05*31)/96);
		
		System.out.println(Math.ceil(Vanilla));
		System.out.println(Math.ceil(Chocolate));
		System.out.println(Math.ceil(Cookie));
		
		System.out.println("Would you like to try again?(1==yes, 2==no)");
		num1 = input.nextInt();	
	}}
	
}