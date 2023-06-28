import java.util.Scanner;
class Assignment7_2
{
	public static  void main ( String[]   args)			
	{
		Scanner input = new Scanner (System.in);
		
		
		String[] Planet={"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};
		int [ ]  Moons = {0, 0, 1, 2, 16, 18, 15, 8, 1};
		int [ ]  Distance = {58, 108, 150, 228, 778, 1427, 2869, 4498, 5900};
		int repeat=1,choice=0;
		while (repeat==1)
		{
			System.out.println("(Mercury==0)(Venus==1)(Earth==2)(Mars==3)(Jupiter==4)(Saturn==5)(Uranus==6)(Neptune==7)(Pluto==8)");
			choice = input.nextInt();
			System.out.println("It's plant " +Planet[choice]);
			System.out.println("It has " +Moons[choice]+ " Moons");
			System.out.println("The distance is " +Distance[choice]);
			System.out.println("Would you like to input a new set of numbers? (1==yes, 2==no)");
			repeat = input.nextInt();		
		}
	}}