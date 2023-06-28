import java.util.Scanner;
class Assignment8_2
{
	public static  void main ( String[]   args)	
	{
		Scanner input = new Scanner (System.in); 
		String[] student={"Student ", " Test #1 ", "    Test #2 ", "    Test #3 ", "    Test #4"};
		int [ ][ ] TermMarks={ 
				{1, 87, 73, 88,92},
				{2, 65, 57, 69,60},
				{3, 52, 57, 62,63}};	
		System.out.println(TermMarks[1][0]);
		int start=1,i=0,j=0,Input,Row=0,Column=0,sum,averageS=0,averageT=0,sum2,sum3,sum4;
		int averageS2 = 0,averageS3 = 0,averageS4,averageT2,averageT3,averageT4;
		while (start==1)
		{
			sum=0;
			sum2=0;
			sum3=0;

			// each mark
			for ( j = 1;   j < 5;j++)   
			{
				sum=sum+TermMarks[0][j]; 
				sum2=sum2+TermMarks[1][j];  
				sum3=sum3+TermMarks[2][j];  

			}
			averageS=sum/4; 
			averageS2=sum2/4; 
			averageS3=sum3/4; 

			System.out.println("Average for student: 1 is "+averageS);
			System.out.println("Average for student: 2 is "+averageS2);
			System.out.println("Average for student: 3 is "+averageS3);

				sum=0;
				sum2=0;
				sum3=0;
				sum4=0;

				for ( i = 0;  i < 3;i++)   
				{
					sum=sum+TermMarks[i][1];
					sum2=sum2+TermMarks[i][2];  
					sum3=sum3+TermMarks[i][3];  
					sum4=sum4+TermMarks[i][4];  

					start=0;
				}
				averageT=sum/3; 
				averageT2=sum2/3; 
				averageT3=sum3/3; 
				averageT4=sum4/3; 

				System.out.println("Average for test: 1 is "+averageT);
				System.out.println("Average for test: 2 is "+averageT2);
				System.out.println("Average for test: 3 is "+averageT3);
				System.out.println("Average for test: 4 is "+averageT4);
		}}}