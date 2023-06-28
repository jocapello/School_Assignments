import java.util.Scanner;
import java.util.stream.Stream;

public class DecimalRound {

	public static void main(String[] args) {
		code();
	}
	public static void code() {
		Scanner input = new Scanner(System.in);

		String numbers=input.nextLine();

		int[] intArray = Stream.of(numbers.split("\\s+")).mapToInt(Integer::parseInt).toArray();

		// factors
		int num1=intArray[0]*10;
		int num2=intArray[1];
		// decimal place
		int num3=intArray[2];
		//"make into decimal"
		System.out.print("0.");
		int i=0;

		while (i<num3) {
			i++;
			System.out.print(num1/num2);
			// remainder of num1 is num2
			num1 %= num2;
			// multiplies itself by 10
			num1*=10;
		}
		System.out.println();
		code();
	}
}

