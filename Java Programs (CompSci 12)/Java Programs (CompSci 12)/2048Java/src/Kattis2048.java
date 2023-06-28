import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Kattis2048 {
	public static void main (String[]args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); 


		String lin1=input.nextLine();
		int[] r1 = Stream.of(lin1.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		String lin2=input.nextLine();
		int[] r2 = Stream.of(lin2.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		String lin3=input.nextLine();
		int[] r3 = Stream.of(lin3.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		String lin4=input.nextLine();
		int[] r4 = Stream.of(lin4.split("\\s+")).mapToInt(Integer::parseInt).toArray();

		String move = input.nextLine();

		if (move.contains("0")) {
			for (int i=0; i<3; i++) {
				if (r1[i+1] == r1[i]) {
					r1[i] = r1[i+1];
				}
			}
		}
		if (move.contains("1")) {

		}
		if (move.contains("2")) {

		}
		if (move.contains("3")) {

		}
		int grid[][] = {r1,r2,r3,r4};
		System.out.println(Arrays.toString(grid));
	}
}

