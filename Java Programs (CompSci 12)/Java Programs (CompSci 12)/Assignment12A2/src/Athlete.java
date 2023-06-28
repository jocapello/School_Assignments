import java.util.Scanner;
public class Athlete {
	int choice;
	private String name;                  //variables are declared as private, meaning they 
	private String lastname;                  //variables are declared as private, meaning they 
	private String position;                  // can only be accessed in the class
	private int goals;
	private int assists;
	public void initializeAthlete(String n, String l, String p, int g, int a)
	{	
		name=n;                                //This method initializes the variables. Once
		lastname=l;
		position=p;                           // they have been initialized, they can be used
		goals=g;                               // by any method in this class
		assists=a;
	}
	public void ChangeAthlete()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Options are\n"
				+ "1. Change the name\n"
				+ "2. Change the last name\n"
				+ "3. Change the position \n"
				+ "4. Change the number of goals\n"
				+ "5. Change the number of assists\n"
				+ "Enter your choice");
		choice=input.nextInt();
		{
			Scanner s = new Scanner(System.in);
			
			switch(choice) {
			case 1: System.out.print("Enter the players name: "); 
			name = s.nextLine(); 
			break;
			case 2: System.out.print("Enter the players last name: "); 
			lastname = s.nextLine();  
			break;
			case 3: System.out.print("Enter their position: "); 
			position = s.nextLine(); 
			break;
			case 4: System.out.print("Enter their amount of goals: "); 
			goals = s.nextInt(); 
			break;
			case 5:System.out.print("Enter their amount of assists: ");
			assists = s.nextInt();
			break;
			}}}
	public void displayAthlete()
	{// display the data associated with Athlete
		Scanner input = new Scanner (System.in);

		System.out.println(name+" " +lastname+" plays "+position+ " and has scored "+goals+" goals and "+assists+" assists ");
	}}
