import java.util.Scanner;
class Assignment8_5 
{

	public static void main(String[] args)
	{
		int Rowamount,num=1,num2,i,j;
		Scanner in = new Scanner(System.in);

		// Choose the amount of rows
		System.out.print("Input number of rows: ");
		Rowamount = in.nextInt();
		// Goes until == with i 
		for(i=0;i<Rowamount;i++)
		{
			for(num2=1;num2<=Rowamount-i;num2++)
				System.out.print(" ");
			for(j=0;j<=i;j++)
			{
				// || is the or boolean
				if (j==0||i==0)
					num=1;
				else
					// The number == number multipled by the i(first loop), -
					//minus j(second loop) plus the one then all divided by the second loop again
					num =num*(i-j+1)/j;
				System.out.print(" "+num);
			}
			System.out.print("\n");
		}
	}
}
