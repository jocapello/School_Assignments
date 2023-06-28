import java.util.Scanner;
import java.util.stream.Stream;

public class SumKindOfProblem {
	public static void main (String[]args) {
		 @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in); 
			int N=input.nextInt();
			input.nextLine();
			
			for (int i=0; i<N;i++) {
				
				String value2=input.nextLine();
				int[] Cord1 = Stream.of(value2.split("\\s+")).mapToInt(Integer::parseInt).toArray();

				int S1 = 0,S2 = 0,S3 = 0;
				
				// Sum of first N positive ints
				for (int j=0; j<Cord1[1]+1;j++) {
					S1 += j;
				}
				// Sum of first N positive ints
				for (int k=1; k<2*Cord1[1]+1;k+=2) {
					if (k % 2 != 0) {
						S2 += k;
					}
				}
				// Sum of first N positive ints
				for (int l=0; l<2*Cord1[1]+1;l+=2) {
					if (l % 2 == 0) {
						S3 += l;
					}
				}
				System.out.println((i+1) + " " + S1 + " " + S2 + " " + S3);
			}
		}
	}


