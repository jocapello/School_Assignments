import java.util.Scanner;
class Assignment10B
{
	public static void main (String[] args)
	{
		String[] Players={"Henrik Zetterberg","Sidney Crosby","Marian Hossa",
				"Pavel Datsyuk","Evgeni Malkin","Mike Ribeiro","Daniel Briere","Johan Franzen","R.J. Umberger","Brenden Morrow", "Ryan Malone"};
		String[] Team={"DET","PIT","PIT","DET","PIT","DAL","PHI","DET","PHI","DAL","PIT"};
		int [ ]  Points = {21, 21, 19, 19, 19, 17, 16, 15, 15,15,15};
		int [ ]  Goals = {11, 4, 9, 9, 9 , 3 , 9, 12, 10, 9 , 6};
		int temp,temp2;
		String temp3;
		int i,j,i2,j2,num=11,i3,j3;
		int choice,g = 0,p=0;
		System.out.println("Would you like to sort by points,goals or alphabetically?(1==goals, 2==points, 3==alphabet)");
		Scanner input = new Scanner (System.in);
		choice=input.nextInt();
		
		if (choice==1) {
			System.out.println("Lowest to highest or vice versa?(1==Low-High, 2=High-Low)");
			p=input.nextInt();
		}
		if (choice==2) {
			System.out.println("Lowest to highest or vice versa?(1==Low-High, 2=High-Low)");
			g=input.nextInt();
		}
		else {
			choice=3;
		}
		
		if (p==1) {
		System.out.println();System.out.println
		("Points in order from lowest to highest");
		//Points highest to lowest
		for (i=0; i<7; i++) // compare the number in the front of the list with
		{                   // every number after it                      
			for (j=i+1; j<8; j++)
			{
				if (Points[i]>Points[j]) //if the number at the front is 
				{//swap                  // larger, swap the numbers
					temp=Points[i];
					Points[i]=Points[j];
					Points[j]=temp;
				}//end of if
			}
		}}
		for (i=0; i<8; i++)
		{
			System.out.printf("%5d",Points[i]);
			System.out.print("-"+Players[i]+"-"+Team[i]);
		}
		System.out.println();
		
		
		if (p==2) {
		System.out.println();System.out.println
		("Points in order from highest to lowest");
		//Points highest to lowest
		for (i2=0; i2<7; i2++) // compare the number in the front of the list with
		{                   // every number after it                      
			for (j2=i2+1; j2<8; j2++)
			{
				if (Points[i2]<Points[j2]) //if the number at the front is 
				{//swap                  // larger, swap the numbers
					temp2=Points[i2];
					Points[i2]=Points[j2];
					Points[j2]=temp2;
				}//end of i2f
			}
		}}
		for (i2=0; i2<8; i2++)
		{
			System.out.printf("%5d",Points[i2]);
			System.out.print("-"+Players[i2]+"-"+Team[i2]);
		}
		System.out.println();



		
		if (g==1) {
		System.out.println();System.out.println
		("Goals in order from lowest to highest");
		//Goals highest to lowest
		for (i=0; i<7; i++) // compare the number in the front of the list with
		{                   // every number after it                      
			for (j=i+1; j<8; j++)
			{
				if (Goals[i]>Goals[j]) //if the number at the front is 
				{//swap                  // larger, swap the numbers
					temp=Goals[i];
					Goals[i]=Goals[j];
					Goals[j]=temp;
				}//end of if
			}
		}
		for (i=0; i<8; i++)
		{
			System.out.printf("%5d",Points[i]);
			System.out.print("-"+Players[i]+"-"+Team[i]);
		}}
		System.out.println();
		
		
		
		if (g==2) {
		System.out.println();System.out.println
		("Goals in order from highest to lowest");
		//Goals highest to lowest
		for (i2=0; i2<7; i2++) // compare the number i2n the front of the li2st wi2th
		{                   // every number after i2t                      
			for (j2=i2+1; j2<8; j2++)
			{
				if (Goals[i2]<Goals[j2]) //i2f the number at the front i2s 
				{//swap                  // larger, swap the numbers
					temp2=Goals[i2];
					Goals[i2]=Goals[j2];
					Goals[j2]=temp2;
				}//end of i2f
			}
		}
		for (i2=0; i2<8; i2++)
		{
			System.out.printf("%5d",Points[i2]);
			System.out.print("-"+Players[i2]+"-"+Team[i2]);
		}
		System.out.println();
		}
		
		if (choice==3) {
		System.out.println();
        for (int i31 = 0; i31 < num; i31++) 
        {
            for (int j31 = i31 + 1; j31 < num; j31++) 
            {
            	// orders it lexicographically (Alphabetical order of thier letters in numbers or lexical order
                if (Players[i31].compareTo(Players[j31])>0) 
                {
                    temp3 = Players[i31];
                    Players[i31] = Players[j31];
                    Players[j31] = temp3;
                }
            }
        }
        System.out.println("Players in alphabetical Sorted Order:");
        System.out.println("Player	        Team  G  P");

        for (int i31 = 0; i31 <= num - 1; i31++) 
        {
            System.out.print(Players[i31] + ", ");
            System.out.print(Team[i31] + ", ");
            System.out.print(Goals[i31] + ", ");
            System.out.print(Points[i31] + ", ");

            System.out.println();

        }}
	}}

