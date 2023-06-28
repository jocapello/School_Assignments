
import java.util.Scanner;
class Hiss
{
	public static void main(String []args) {
		Scanner input = new Scanner (System.in);

		String temp;
		temp=input.nextLine();
		if(temp.indexOf("ss")!=-1)
		{
			System.out.println("hiss");
		}
		else
		{
			System.out.println("no hiss");
		}}}