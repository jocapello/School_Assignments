import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;
public class Speedlimit
{
	public static void main  (String [] args)
	{
		Scanner input = new Scanner(System.in);
		int sum=0,total=0,go,a,b,c,i=1;

//		go=input.nextInt();
//		if (go>0) {
		while(i>0) {
			String numbers=input.nextLine();
			int[] intArray2 = Stream.of(numbers.split("\\s+")).mapToInt(Integer::parseInt).toArray();
			a=intArray2[0];
			b=intArray2[1];
			sum=a*b;
			System.out.println(sum);	
			i++;
	}}}


