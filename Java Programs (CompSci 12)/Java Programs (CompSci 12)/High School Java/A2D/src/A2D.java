import java.util.Scanner;

class A2D
{	
	public static void main (String[]args)
	{		
		Scanner input = new Scanner (System.in);
		int Array[] = {20,30,40,50,60,70,80,90,100,110,120};
		double Array2[] = {20,30,40,50,60,70,80,90,100,110,120};
		double Array3[] = {20,30,40,50,60,70,80,90,100,110,120};

		double temp,Row;

		for(int i=0;i<=10;i++) {
			System.out.println("What is the consumption at "+Array[i] );
			Row=input.nextDouble();
			Array2[i]=Row;
			Array3[i]=Row;
		}
		//Array2 highest to lowest
		for (int i=0; i<10; i++) // compare the number in the front of the list with
		{                   // every number after it                      
			for (int j=i+1; j<11; j++)
			{
				if (Array2[i]>Array2[j]) //if the number at the front is 
				{//swap                  // larger, swap the numbers
					temp=Array2[i];
					Array2[i]=Array2[j];
					Array2[j]=temp;
				}}}
		for(int i=0;i<=10;i++) { 
			if (Array2[0]==Array3[i]) {
				System.out.println(Array[i]);		
			}}}}