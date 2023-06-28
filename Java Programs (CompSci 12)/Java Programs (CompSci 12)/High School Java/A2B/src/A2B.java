import java.util.Scanner;
import java.util.stream.Stream;

class A2B
{
	public static void main (String[]args)
	{
		int num1;
		//Create Scanner object to read command line input
	    Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner (System.in);
		
	    System.out.println("Do you want to enter in pounds or kgs?(pounds==1,kgs==2)");
	    num1=input.nextInt();
	    System.out.println("Enter 3 weights");
		String theString=scanner.nextLine();
	
		// Split the line into tokens using stream() and mapping to integer array
		int[] intArray = Stream.of(theString.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		for (double i: intArray) {
			if (num1==2) {
				i=i*2.2;
			}
			if (i<=114.4) {
				System.out.println("FLY WEIGHT "+i);
			}	if (i>114.4 && i<=132) {
				System.out.println("LIGHT WEIGHT "+i);
			}	if (i>132 && i<=187.5) {
				System.out.println("MIDDLE WEIGHT "+i);
			}	if ( i>187.5 && i<=200.2) {
				System.out.println("HEAVY WEIGHT "+i);
			}	if (i>200.3) {
				System.out.println("SUPER HEAVY WEIGHT "+i);
			}}}}