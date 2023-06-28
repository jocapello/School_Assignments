import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Chem
{	

	// main arrays
	static String[] Equations={"1. Ba3N2 + H2O ? Ba(OH)2 + NH3",
			"2. CaCl2 + Na3PO4 ? Ca3(PO4)2 + NaCl",
			"3. FeS + O2 ? Fe2O3 + SO2",
			"4. PCl5 + H2O ? H3PO4 + HCl",
			"5. As + NaOH ? Na3AsO3 + H2", //5
			"6. Hg(OH)2 + H3PO4 ? Hg3(PO4)2 + H2O",
			"7. HClO4 + P4O10 ? H3PO4 + Cl2O7",
			"8. CO + H2 ? C8H18 + H2O",
			"9. KClO3 + P4 ? P4O10 + KCl",
			"10. SnO2 + H2 ? Sn + H2O", //10
			"11. KOH + H3PO4 ? K3PO4 + H2O",
			"12. KNO3 + H2CO3 ? K2CO3 + HNO3",
			"13. Na3PO4 + HCl ? NaCl + H3PO4",
			"14. TiCl4 + H2O ? TiO2 + HCl",
			"15. C2H6O + O2 ? CO2 + H2O", //15
			"16. Fe + HC2H3O2 ? Fe(C2H3O2)3 + 3 H2",
			"17. NH3 + O2 ? NO + H2O",
	"18. B2Br6 + HNO3 ? B(NO3)3 + HBr"};


	static int []Answers1= {1,3,4,1,2,
							3,12,8,10,1,
							3,2,1,1,1,
							2,4,1};
			static int []Answers2= {6,2,7,4,6,
									2,1,1,3,2,
									1,1,3,2,3,
									6,5,6};
					static int []Answers3= {3,1,2,1,2,
											1,4,7,3,1,
											1,1,3,1,2,
											2,4,2};
							static int []Answers4= {2,6,4,5,3,
													6,6,18,10,2,
													3,2,1,4,3,
													3,6,6};

							private static int count;



	public static void main(String[]args) {
		Scanner input = new Scanner (System.in);
		int num1=1,Cycles=0;
		boolean x = true;
		System.out.println("How many questions would you like to study?");
		Cycles=input.nextInt();

		// runs through a certain amount
		for (int i=0;i<Cycles;i++) {
			System.out.println();

			RandomNum(x);
		}
		//PRINT AN ENTIRE ARRAY
		//System.out.println(Arrays.toString(Answers));
		System.out.println("Would you like to do any more?");

		String YesNo=input.next();

		YesNo=YesNo.toLowerCase();

		x=YesNo.startsWith("y");
		if (x==true)
		{
			main(args);
		}
		else 
		{
			System.out.println("You answered "+count+" many correct out of 18");
			System.out.println("Thank you for studying");
		}
	}
	public static void RandomNum(boolean x) {

		//Random question generator
		int R;
		R=(int )(Math.random( )* 18  );
		while(Answers1[R] == 0) {
			R=(int )(Math.random( )* 18  );
		}
//		for (int i=0;i<18;i++) {
//		if(Answers1[i]==0) {
//			Done();		}}
		
		System.out.println(Equations[R]);
		Check(R);
	}

	public static void Check(int R) {
		Scanner input = new Scanner (System.in);

		System.out.println();
		System.out.println("Enter the number you want to place with the first molecule / element \nfollowed by enter until you have inputed a number for all 4 of them.");

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		int num4 = input.nextInt();

		// Right or wrong checker
		// num == Answers[R]
		if (num1==Answers1[R] && num2==Answers2[R] && num3==Answers3[R] && num4==Answers4[R]) {
			System.out.println("You go girl");
			count++;
		}
		else {
			System.out.println("Not quite");
		}
		Answers1[R] = 0;

	}
}
