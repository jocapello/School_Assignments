class Assignment2C
{
	public static void main (String[]args)
	{
		double number=127.5192683;
	
		System.out.printf("%-5s %-15f \n" , "Number =", number);
		System.out.printf("%-5s %-15.1f \n" , "First Decimal =", number);
		System.out.printf("%-5s %-15.2f \n" , "Second Decimal =", number);
		System.out.printf("%-5s %-15.3f \n" , "Third Decimal =", number);
		System.out.printf("%-5s %-15.4f \n" , "Fourth Decimal =", number);
		System.out.printf("%-5s %-10000.5f \n" , "Five Decimal =", number);
	
	}
}