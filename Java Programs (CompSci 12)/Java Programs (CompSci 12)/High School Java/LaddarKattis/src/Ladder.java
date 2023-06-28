import java.util.Scanner;
import java.util.stream.Stream;

public class Ladder{

	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);


		String value=input.nextLine();

		int[] intArray = Stream.of(value.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int Height=intArray[0];
		int Angle=intArray[1];
		int Answer=(int)(Math.ceil(Height/Math.sin(Math.toRadians(Angle))));
		System.out.println(Answer);
	}
}