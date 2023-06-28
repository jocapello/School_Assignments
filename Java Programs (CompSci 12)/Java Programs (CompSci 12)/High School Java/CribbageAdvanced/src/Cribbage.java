import java.util.Arrays;
import java.util.Scanner;
class Cribbage
{
	public static  void main ( String[]   args)			
	{
		Scanner input = new Scanner (System.in);

		int [ ]  Cards = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,
				38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};
		int temp[]= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,
				21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,
				38,39,40,41,42,43,44,45,46,47,48,49,50,51,52};

		
		System.out.println(Arrays.toString(Cards));
		System.out.println(Arrays.toString(Cards));
	}}
		//		int repeat=1,choice=0;
		//		while (repeat==1)
		//		{
		//			System.out.println("(Mercury==0)(Venus==1)(Earth==2)(Mars==3)(Jupiter==4)(Saturn==5)(Uranus==6)(Neptune==7)(Pluto==8)");
		//			choice = input.nextInt()-1;
		//			System.out.println("Would you like to input a new set of numbers? (1==yes, 2==no)");
		//			repeat = input.nextInt();		
		//		}
	}
	public static void Shuffler(int Cards [],int temp[]) {
		int r;
		for (int i=0; i<52;i++) {
			//shuffle the deck
			r=(int)(Math.random()*52);
			Cards[i]=Cards[r];
			Cards[r]=temp[i];	
			if (Cards[i]==Cards[i]) {
				
		
	}}}
}