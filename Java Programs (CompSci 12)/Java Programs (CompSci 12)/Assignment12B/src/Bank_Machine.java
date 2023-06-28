import java.util.Scanner;
public class Bank_Machine {

	int choice;
	private String Balance;                  //variables are declared as private, meaning they 
	private String Deposit;                  //variables are declared as private, meaning they 
	private String Withdraw;                  // can only be accessed in the class
	double Money,Deposited=0,Withdrew=0;
	int Go=1;
	public void initializeBank_Machine(String n, String l, String p)
	{	
		System.out.println("Welcome to the bank");
		Balance=n;                                //This method initializes the variables. Once
		Deposit=l;
		Withdraw=p;                           // they have been initialized, they can be used

	}
	public void ChangeBank_Machine()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Options are\n"
				+ "1. Check your balance\n"
				+ "2. Deposit Money\n"
				+ "3. Withdraw Money \n"
				+ "4. Exit \n"
				+ "Enter your choice");
		choice=input.nextInt();
		{				
			switch(choice) {

			case 1: 
				Money=(double )(Math.random( )* 10000  + 1)  ;

				System.out.printf("Your balance is:$" + "%.2f", Money);					
				System.out.println();
				System.out.print("Is there anything else we can help you with? (1==yes, 2==no)");
				Go=input.nextInt();

				if (Go!=1) {
					displayBank_Machine();}
				else ChangeBank_Machine();
				break;

			case 2: System.out.print("How much money you would like to deposit? ");
				Deposited=input.nextDouble();
		
				System.out.printf("Your new balance is: "+"%.2f", Money+Deposited-Withdrew);
				System.out.println();
				System.out.print("Is there anything else we can help you with? (1==yes, 2==no)");
				Go=input.nextInt();
		
				if (Go!=1) {
					displayBank_Machine();}
				else ChangeBank_Machine();
				break;

			case 3: System.out.print("How much money would you like to withdraw? ");
				Withdrew=input.nextDouble();
	
				System.out.printf("Your new balance is: "+"%.2f", Money+Deposited-Withdrew);
				System.out.println();
				System.out.print("Is there anything else we can help you with? (1==yes, 2==no)");
				Go=input.nextInt();
	
				if (Go!=1) {
					displayBank_Machine();}
				else ChangeBank_Machine();
				break;

			case 4: displayBank_Machine();
			break;


			}}}
	public void displayBank_Machine()
	{// display the data associated with Bank_Machine
		Scanner input = new Scanner (System.in);

		System.out.println("Thank you for choosing our services");
	}}

