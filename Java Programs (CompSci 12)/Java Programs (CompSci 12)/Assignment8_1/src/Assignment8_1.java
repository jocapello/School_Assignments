import java.util.*;
class Assignment8_1
{
	public static  void main ( String[]   args)	
	{
		Scanner input = new Scanner (System.in);
		String[] student={"Aaron ", " Barry ", " Carmon ", "David ", " Ethan"};
		int [ ][ ] TermMarks={ 
				{93, 97, 93, 87, 85},
				{66, 62, 57, 52, 45},
				{74, 75, 78, 76, 77},
				{87, 89, 75, 97, 93},
				{85, 67, 83, 84, 80}  };	

		int start=1,i=0,j=0,Input,Row=0,Column=0,respo;

		while (start==1)
		{
			for ( i = 0;  i < 5;i++)   
			{
				System.out.print(student[i]+" ");
			}
			System.out.println();
			for ( i = 0;  i < 5;i++)   
			{
				for ( j = 0;   j< 5;j++)   
				{
					System.out.print(TermMarks[i][j]+"      ");   
				}
				System.out.println();

			}
			System.out.println("Would you like to change any data? Type in the childs corresponding number");
			Row=input.nextInt();
			System.out.println("Would you like to change any data? Type in the period");
			Column=input.nextInt();
			System.out.println("What is their new mark?");
			TermMarks[Column-1][Row-1]=input.nextInt();
			System.out.println("The new mark is " +TermMarks[Column-1][Row-1]);

			System.out.println("Would you like to change any more data? 1==yes, 2==no ");
			start=input.nextInt();
		}
		if (start!=0)
		{


			for ( i = 0;  i < 5;i++)   
			{
				System.out.print(student[i]+" ");
			}
			System.out.println();
			for ( i = 0;  i < 5;i++)   
			{
				for ( j = 0;   j< 5;j++)   
				{
					System.out.print(TermMarks[i][j]+"      ");   
				}
				System.out.println();

			}
		}}}



