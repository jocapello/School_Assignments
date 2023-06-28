import java.util.Scanner;
import java.util.stream.Stream;
class Bijele
{	
	public static void main (String[]args) {
		Scanner input = new Scanner(System.in);
		String King = "1";
		String Queen = "1";
		String Rook = "2";
		String Bishop = "2";
		String Knight = "2";
		String Pawn = "8";
		//int num = 0,King=1,Queen=1,Rook=2,Bishop=2,Knight=2,Pawn=8;
		String value=input.nextLine();

		// Split the line into tokens using stream() and mapping to integer array
		int[] intArray = Stream.of(value.split("\\s+")).mapToInt(Integer::parseInt).toArray();

		String number1=String.valueOf(intArray[0]);
		String number2=String.valueOf(intArray[1]);
		String number3=String.valueOf(intArray[2]);
		String number4=String.valueOf(intArray[3]);
		String number5=String.valueOf(intArray[4]);
		String number6=String.valueOf(intArray[5]);

		int []array= {0,0,0,0,0,0};
		for (int i=0; i<6;i++) {
			int var1 = King.compareTo( number1 );
		
			System.out.println(var1);
			array[0]=var1;
			System.out.println("Array "+array[0]);

			int var2 = Queen.compareTo( number2 );
			array[1]=var2;
			int var3 = Rook.compareTo( number3 );
			array[2]=var3;
			int var4 = Bishop.compareTo( number4 );
			array[3]=var4;
			int var5 = Knight.compareTo( number5 );
			array[4]=var5;
			int var6 = Pawn.compareTo( number6 );
			array[5]=var6;
			
		}
		for (int i=0;i<6;i++) {
		System.out.println(array[i]);}

	}}