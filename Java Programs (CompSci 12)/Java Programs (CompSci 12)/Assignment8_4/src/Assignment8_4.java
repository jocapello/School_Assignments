import java.util.Scanner;
class Assignment8_4
{
	public static  void main ( String[]   args)	
	{
		Scanner input = new Scanner (System.in);

		int Grades [][] = new int [10][3];

		int Mean = 0,Mean2 = 0,Turn=1,sum=0,sum2=0,i=0,j=0,Row=0,Column,Start=1,Row2=0,GradesNum=0,difference,square,root;
		double Average = 0;


		while (Start==1)
		{
			// determine number of rows
			System.out.println("How many numbers are you inputing?");
			GradesNum=input.nextInt();
			//input the number to fill the array
			for ( i = 0;  i < GradesNum;i++)   
			{
				System.out.println("Enter the number");
				Grades[i][0]=input.nextInt();
				sum=sum+Grades[i][0];
			}
			Mean=sum/GradesNum;
			for ( i = 0;  i < GradesNum;i++)   
			{
				Grades[i][1]=Grades[i][0]-Mean;
				Grades[i][2]=Grades[i][1]*Grades[i][1];
				sum2= sum2+Grades[i][2];
			}
			Mean2 = sum2/GradesNum;
			Average=Math.sqrt(Mean2);
			for ( i = 0;  i < GradesNum;i++)   
			{
				for ( j = 0;   j< 3;j++)  
				{
					System.out.print(Grades[i][j]+"      ");  
				}
				System.out.println();
			}
			System.out.println("	");
			System.out.println(Mean2);
			System.out.println(Average);
			System.out.println("would you like to continue?");
			sum=0;sum2=0;
			Start=input.nextInt();
		}}}