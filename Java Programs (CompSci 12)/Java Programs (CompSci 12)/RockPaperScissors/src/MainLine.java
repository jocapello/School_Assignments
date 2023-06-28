import java.util.Scanner;

public class MainLine {
	public static void main(String [] args) {
		int Losses=0,Wins=0,Draws=0;
		int num=1;
		
			while (num==1) {
			// computer choice
			Computer playerCPU = new Computer();
			playerCPU.random();

			// player choice
			RPS player = new RPS();
			player.PlayerChoice();

			// boring math
			WinLose Math = new WinLose();
			Math.OutCome(player.User,playerCPU.Random);

			// counter of wins,losses,draws
			Math.Result(Math.num);

			// play again
			Math.again();
			
			if (Math.num1!=1) {
				num=2;
				System.out.println("Thank you for playing");
			}
			else {
				num=1;
			}
		}}
	}

