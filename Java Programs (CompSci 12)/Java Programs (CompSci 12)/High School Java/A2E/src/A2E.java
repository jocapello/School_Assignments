import java.util.Scanner;
import java.util.stream.Stream;

public class A2E{
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Scanner input = new Scanner(System.in);
		int sum=0, sum1=0, sum2=0, sum3=0, sum4=0;
		int sumArray[] = {0,0,0,0,0};
		
		
		System.out.println("Enter the 4 scores");
		String theString=scanner.nextLine();
		int[] intArray = Stream.of(theString.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		for (int i=0; i<4; i++)
		{
			sum=sum+intArray[i];
			sumArray[0]=sum+1;
		}
		
		System.out.println("Enter the 4 scores");
		String theString1=scanner.nextLine();
		int[] intArray1 = Stream.of(theString1.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		for (int i=0; i<4; i++)
		{
			sum1=sum1+intArray1[i];
			sumArray[1]=sum1+1;
		}
		
		System.out.println("Enter the 4 scores");
		String theString2=scanner.nextLine();
		int[] intArray2 = Stream.of(theString2.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		for (int i=0; i<4; i++)
		{
			sum2=sum2+intArray2[i];
			sumArray[2]=sum2+1;
		}
		
		System.out.println("Enter the 4 scores");
		String theString3=scanner.nextLine();
		int[] intArray3 = Stream.of(theString3.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		for (int i=0; i<4; i++)
		{
			sum3=sum3+intArray3[i];
			sumArray[3]=sum3+1;
		}
		
		System.out.println("Enter the 4 scores");
		String theString4=scanner.nextLine();
		int[] intArray4 = Stream.of(theString4.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		for (int i=0; i<4; i++)
		{
			sum4=sum4+intArray4[i];
			sumArray[4]=sum4+1;
		}
		
		
		int temp;
		for (int i=0; i<3; i++) // compare the number in the front of the list with
		{                   // every number after it
			for (int j=i+1; j<4; j++)
			{
				if (sumArray[i]>sumArray[j]) //if the number at the front is 
				{//swap                  // larger, swap the numbers
					temp=sumArray[i];
					sumArray[i]=sumArray[j];
					sumArray[j]=temp;
				}}}
		if (sumArray[1]==sum)
			System.out.println("1 ");
		if (sumArray[1]==sum1)
			System.out.println("2 ");
		if (sumArray[1]==sum2)
			System.out.println("3 ");
		if (sumArray[1]==sum3)
			System.out.println("4 ");
		if (sumArray[1]==sum4)
			System.out.println("5 ");
		System.out.println(sumArray[1]); 
}}