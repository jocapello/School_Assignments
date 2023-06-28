import java.util.Scanner;
class Assignment10A
{
	public static void main (String[] args)
	{
		int [ ] points={9,8,8,8,7};
		int temp,temp2;
		int i,j,i2,j2;
		System.out.println();System.out.println
		("Points in order from lowest to highest");
		//points highest to lowest
		for (i=0; i<4; i++) // compare the number in the front of the list with
		{                   // every number after it                      
			for (j=i+1; j<5; j++)
			{
				if (points[i]<points[j]) //if the number at the front is 
				{//swap                  // larger, swap the numbers
					temp=points[i];
					points[i]=points[j];
					points[j]=temp;
				}//end of if
			}
		}
		
		for (i=0; i<5; i++)
		{
			System.out.printf("%5d",points[i]);
		}
		System.out.println();
		int num1=1;
	//	while (num1==1) {
			CheckMath(points, 0, num1);
			Math(0,points,0,num1);

		//}



	}
	public static void CheckMath(int []points, int position,int num1) {
		if (points[0]==points[1]) {			
			position=1;
		}
			if (points[1]==points[2]) {			
				position=2;
			}
				if (points[2]==points[3]) {			
					position=3;
				}
					if (points[3]==points[4]) {			
						position=4;
					}
					System.out.println("  position "+position);
		if (points[3]!=points[4]) {
			num1=0;
		}
		System.out.println(num1);

		
	}
	public static void Math(int position,int [] points, int temp2, int num1) {
		for (int i=0; i<5; i++)
		{
			System.out.printf("%5d",points[i]);
		}
		temp2=points[position];
		System.out.println();
		System.out.println(temp2);
		System.out.println(points[position]);
		System.out.println();

		for (position=position; position<4; position++)
		{
			points[position]=points[position+1];
		}
		points[4]=temp2;
		for (int i=0; i<5; i++)
		{
			System.out.printf("%5d",points[i]);
		}
	}
}