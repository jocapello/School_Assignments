import java.util.Scanner;

public class WinLose {
	private static final String[] args = null;
	static int num=3;
	int num1;

	static int [ ][ ] Array={ 
			{1,0,2,2,0},
			{2,1,0,0,2},
			{0,2,1,2,0},
			{0,2,0,1,2},
			{2,0,2,0,1}};
	public void OutCome(int User,int Random) {

		if (Array[User][Random]==0) {
			System.out.println("loss");
			num=0;
		}
		if (Array[User][Random]==1) {
			System.out.println("draw");
			num=1;
		}
		if (Array[User][Random]==2) {
			System.out.println("Win");
			num=2;
		}
	}
	// static inting means it does not start at 0 when method is called
	static int loss=0,win=0,draw=0;

	// communication with the user on what the result of the game was
	public void Result(int num) {
		if (num==0) {
			loss++;
			System.out.println("You lost "+loss+" times, won "+win+" times and drew "+draw+" times");
		}
		if (num==1) {
			draw++;
			System.out.println("You lost "+loss+" times, won "+win+" times and drew "+draw+" times");
		}
		if (num==2) {
			win++;
			System.out.println("You lost "+loss+" times, won "+win+" times and drew "+draw+" times");
		}
	}
	
	public void again() {
		Scanner input=new Scanner(System.in);
		System.out.println("Would you like to play again? (1==yes,2==no)");
		num1=input.nextInt();
	}
}
