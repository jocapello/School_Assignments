import java.util.Scanner;
class Assignment11D{

	private static final String[] args = null;
	public static Scanner input = new Scanner (System.in);
	public static void main (String[] args){
		int counter=0,run=1, x=0, i=0;
		char Test1=0,Test2=0;
		String String = null;

		counter=1;
		System.out.println("Enter the word");
		String = input.next();
		
		Code(counter,run,x,i,Test1,Test2,String);

		input.close();
	}
	public static void Code(int counter,int run,int x,int i,int Test1,int Test2,String String) {

		x = String.length();

		for (i=0; i<x-1; i++) {
			Test1=String.charAt(i);
			Test2=String.charAt(i+1);

			if (Test1!=Test2){
				counter++;}}

		System.out.println("This number contains " +counter+ " runs");
		System.out.println("Would you like to try again? (1==yes, 2==no)");
		run=input.nextInt();

		if (run==1) {
			main(args);
		}
	}
}
