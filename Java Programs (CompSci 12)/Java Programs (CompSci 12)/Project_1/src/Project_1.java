import java.util.*;
class Project_1
{
	public static  void main ( String[]   args)	
	{
		@SuppressWarnings("resource")
		Scanner input = new Scanner (System.in);
		int [] Cardlist={10, 13, 24, 33, 54,75};	
		int [] ThrownCard={0,0,0,0,0};
		int [] Crib={0,0,0,0,0};

		int length=6,num1,num2,num9=1,run=1,run2=0;

		for (int i=0; i<length;i++)
		{
			System.out.print(Cardlist[i]+"	");
		}
		System.out.println();

		System.out.println("Which card would you like to get rid of?");
		num1=input.nextInt();


			int j=0,e=-1;
			for (int i=0; i<length;i++)
			{
				if (i!=num1)
					{
					ThrownCard[j]=Cardlist[i];
					j++;
					Crib[e]=Cardlist[num1];
					}
				else 
				{
					e++;
				}
			}

				
				
			length--;
			System.out.print(length);
			System.out.println();

			for (int k=0; k<length;k++)
			{
				Cardlist[k]=ThrownCard[k];
				System.out.print(Cardlist[k]+"	");
			}
			System.out.println();
			for (int k=0; k<length;k++)
			{
				System.out.print(Crib[k]+"	");
			}
		//		System.out.println();
		//
		//		System.out.println("Which number would you like to get rid of?");
		//		num2=input.nextInt();
		//		
		//		for (int i=0; i<length;i++)
		//		{
		//			if (Cardlist[i]==num2) 
		//			{
		//			ThrownCard[i]=Cardlist[i];
		//		}}
		//		for (int i=0; i<length;i++)
		//		{
		//		System.out.print(Crib[i]+"	");
		//		}
	}}





