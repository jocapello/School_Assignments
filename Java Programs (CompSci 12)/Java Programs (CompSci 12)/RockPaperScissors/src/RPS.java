import java.util.Scanner;

public class RPS
{	
    int User;
	public void PlayerChoice ()
	{		
		Scanner input=new Scanner(System.in);
		String choice;
		boolean R,P,S,L,SP;

		System.out.println("Rock, Paper, Scissors, Lizard or Spock?");//ask for City members

		// Determine if they want choice option or not 
		choice=input.next();

		choice=choice.toLowerCase();

		R=choice.startsWith("rock");
		P=choice.startsWith("paper");
		S=choice.startsWith("scissors");
		L=choice.startsWith("lizard");
		SP=choice.startsWith("spock");

		if (R==true) {
			User=0;
		}
		if (P==true) {
			User=1;
		}
		if (S==true) {
			User=2;
		}
		if (L==true) {
			User=3;
		}
		if (SP==true) {
			User=4;
		}}}