import java.util.Scanner;
class Assignment11E{

	public static Scanner input = new Scanner (System.in);
	public static void main (String[] args){
		
		int counter=0,run=1, x=0, i=0;
		char Test1=0,Test2=0;
		String String;

		while (run==1){

			counter=1;

			System.out.println("Enter the number");
			String = input.nextLine();
			x=String.indexOf('e',3);
			// x = 8

	        String=String.toLowerCase();
			
//			for (i=0; i<x-1; i++) {
//				Test1=String.charAt(i);
//				Test2=String.charAt(i+1);
//
//				if (Test1!=Test2){
//					counter++;}}

			System.out.println("This number contains " +x+ " runs");
			System.out.println("Would you like to try another two names? (1==yes, 2==no)");
			run=input.nextInt();}

		input.close();}}