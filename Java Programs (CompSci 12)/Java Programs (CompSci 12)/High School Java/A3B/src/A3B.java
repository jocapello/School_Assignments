import java.util.Scanner;
class A3B
{
	static int repeat=1;

	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);

		Bank_Machine person = new Bank_Machine();
		person = new Bank_Machine();
		// Start
		person.initializeBank_Machine(null,null,null);

		// pincode 
		person.Pincode();
		// pin code checker
		if (person.num>999) {
			person.ChangeBank_Machine();}
		else {
			person.Pincode();
		}
		change(person);
	}
	public static void change(Bank_Machine person) {
		person.ChangeBank_Machine();
		person.More();
		if ((person.Go)==2) {
			person.displayBank_Machine();
		}
		else {
			change(person);
		}
	}
}


