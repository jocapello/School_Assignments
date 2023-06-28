import java.util.Scanner;
class Assignment11E2{

	static final int MAX_CHAR = 256; 

	public static void main (String[] args){

		Scanner input = new Scanner (System.in);{
			String Letters,Temp,TempLetters = null;
			String Letters1[] = new String[1];
			int num=2;
			System.out.println("Type in your sentance"); 
			Letters = input.nextLine();

			{ 
				// Create an array of size 256 i.e. ASCII_SIZE 
				int Count[] = new int[MAX_CHAR]; 

				int length = Letters.length(); 

				for (int i = 0; i < length; i++) 
					Count[Letters.charAt(i)]++;

				char Characters[] = new char[Letters.length()]; 
				for (int i = 0; i < length; i++) {
					Characters[i] = Letters.charAt(i); 
					int Finder=0;
					for (int j = 0; j <= i; j++) {

						if	 (Letters.charAt(i) == Characters[j])
							Finder++;}
				
					if (Finder == 1)  
						System.out.println("Number of Occurrence of " + 
								Letters.charAt(i) + " is:" + Count[Letters.charAt(i)]);
				}}}}}