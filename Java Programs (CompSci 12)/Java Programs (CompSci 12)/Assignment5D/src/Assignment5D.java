import java.util.Scanner;

class Assignment5D
{
	public static  void main ( String[]   args)	

	{

		Scanner input = new Scanner (System.in);	
		int  number,number2,repeat = 1,r=0,wins=0,losses=0,draws=0,player=1;
		{

			while (repeat==1) 
			{
				// random number from 1-5
				r=(int )(Math.random( )* 5  + 1)  ;

				System.out.println("Welcome to Rock Paper Scissors Lizard Spock"); 
				System.out.println("Type  1  for Rock  2  for Paper  3  for Scissors  4  for Lizard and  5  for Spock"); 
				player=input.nextInt();

				switch  (r)
				{
				case 1 :
					repeat=1;
					break;
				}
				switch(player)
				{

				//if player picks rock 
				case 1 :
					//rock 
					if (r==1 && player==1)
					{
						System.out.println("The computer picks rock you draw");
						draws=draws+1;
					}
					//paper
					else if (r==2 && player==1)
					{
						System.out.println("The computer picks paper you lose");
						losses=losses+1;
					}
					//scissors
					else if (r==3 && player==1)
					{
						System.out.println("The computer picks scissors you win");
						wins=wins+1;
					}
					//lizard
					else if (r==4 && player==1)
					{
						System.out.println("The computer picks lizard you win");
						wins=wins+1;
					}
					//spock
					else if (r==5 && player==1)
					{
						System.out.println("The computer picks spock you lose");
						losses=losses+1;
					}
					break;


					// if player picks paper
				case 2 :
					//rock 
					if (r==1 && player==2)
					{
						System.out.println("The computer picks rock you win");
						wins=wins+1;
					}
					//paper
					else if (r==2 && player==2)
					{
						System.out.println("The computer picks paper you draw");
						wins=wins+1;
					}
					//scissors
					else if (r==3 && player==2)
					{
						System.out.println("The computer picks scissors you lose");
						wins=wins+1;
					}
					//lizard
					else if (r==4 && player==2)
					{
						System.out.println("The computer picks lizard you win");
						wins=wins+1;
					}
					//spock
					else if (r==5 && player==2)
					{
						System.out.println("The computer picks spock you lose");
						wins=wins+1;
					}
					break;


					// if player picks scissors
				case 3 :
					//rock 
					if (r==1 && player==3)
					{
						System.out.println("The computer picks rock you lose");
						wins=wins+1;
					}
					//paper
					else if (r==2 && player==3)
					{
						System.out.println("The computer picks paper you win");
						wins=wins+1;
					}
					//scissors
					else if (r==3 && player==3)
					{
						System.out.println("The computer picks scissors you draw");
						wins=wins+1;
					}
					//lizard
					else if (r==4 && player==3)
					{
						System.out.println("The computer picks lizard you win");
						wins=wins+1;
					}
					//spock
					else if (r==5 && player==3)
					{
						System.out.println("The computer picks spock you lose");
						wins=wins+1;
					}
					break;


					// if player picks lizard
				case 4 :
					//rock 
					if (r==1 && player==4)
					{
						System.out.println("The computer picks rock you lose");
						wins=wins+1;
					}
					//paper
					else if (r==2 && player==4)
					{
						System.out.println("The computer picks paper you win");
						wins=wins+1;
					}
					//scissors
					else if (r==3 && player==4)
					{
						System.out.println("The computer picks scissors you lose");
						wins=wins+1;
					}
					//lizard
					else if (r==4 && player==4)
					{
						System.out.println("The computer picks lizard you draw");
						wins=wins+1;
					}
					//spock
					else if (r==5 && player==4)
					{
						System.out.println("The computer picks spock you win");
						wins=wins+1;
					}
					break;


					// if player picks spock
				case 5 :
					//rock 
					if (r==1 && player==5)
					{
						System.out.println("The computer picks rock you win");
						wins=wins+1;
					}
					//paper
					else if (r==2 && player==5)
					{
						System.out.println("The computer picks paper you lose");
						wins=wins+1;
					}
					//scissors
					else if (r==3 && player==5)
					{
						System.out.println("The computer picks scissors you win");
						wins=wins+1;
					}
					//lizard
					else if (r==4 && player==5)
					{
						System.out.println("The computer picks lizard you lose");
						wins=wins+1;
					}
					//spock
					else if (r==5 && player==5)
					{
						System.out.println("The computer picks spock you draw");
						wins=wins+1;				
					}
					break;
				}
				System.out.println("Would you like to play again? (1==Yes, 2==No)");
				repeat=input.nextInt();	
				// stop code
				if (repeat==2)
				{
					System.out.println("Your score is " +wins +" wins " + losses + " losses and "+ draws + " draws"); 
				}
			}
		}}}

