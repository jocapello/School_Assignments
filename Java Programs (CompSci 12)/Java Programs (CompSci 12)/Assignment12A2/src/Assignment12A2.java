import java.util.Scanner;
class Assignment12A2
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);
		Athlete person = new Athlete();
		person = new Athlete();
		person.initializeAthlete("Amy","Jones","defense",11,5);
		person.displayAthlete();	
		int Start=1;
		while (Start==1)
		{
			person.ChangeAthlete();
			System.out.print("Would you like to change anything? (1==yes, 2==no)"); 
			Start=input.nextInt();
		}
		person.displayAthlete();	
	}}
