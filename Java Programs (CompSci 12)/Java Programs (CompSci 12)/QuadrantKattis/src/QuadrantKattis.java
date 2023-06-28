import java.util.Scanner;
class QuadrantKattis
{	
	public static void main (String[]args) {
		Scanner in = new Scanner(System.in);
		int numbers = Integer.parseInt(in.nextLine());
		int num = 0;
		String[] value = in.nextLine().split(" ");
		for (int i=0; i<=numbers;i++) {
			if (Integer.parseInt(value[i])<0) 
				num++;
		}
			System.out.println(num);
	}}