import java.util.Scanner;
class Project_1
{
	
		static Scanner input = new Scanner (System.in);

		public static  void main ( String[]args)
		{
			String str = "*"+"0";

			char[] charArray = new char [22][80];

			int i=0,j=0,Start=1;
			
			System.out.println(str);

			str.getChars(0, 30, charArray, 0);
			
			while (Start==1)
			{

				for ( i = 0;  i < 22;i++)   
				{

					for ( j = 0;   j< 80;j++)   
					{
						System.out.print(charArray[i][j]+"  ");   

					}
					System.out.println();
				}
				System.out.println("would you like to continue?");
				Start=input.nextInt();
			}}}