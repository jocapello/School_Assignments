import java.util.Scanner;
class Assignment9_3
{
	//----------------------------------- main method ----------------------------------------------------

	public static  void main ( String[]   args)
	{
        Scanner input = new Scanner (System.in);
		double x,result = 0, ask;    
		x=get();      
		System.out.println("Conversion options\n"
				+ "1. Inches to Centimeters\n"
				+ "2. feet to Centimeters \n"
				+ "3. Yards to Meters\n"
				+ "4. Miles to Kilometers\n"
				+ "5. Centimeters to Inches\n"
				+ "6. Centimeters to Feet \n"
				+ "7. Meters to Yards\n"
				+ "8. Kilometers to Miles\n"
				+ "enter your choice");
		ask=input.nextDouble();
		if (ask==1)
		{
			result=I2C(x);
			print(x,"Inches",result,"centimeters");
		}
		if (ask==2)
		{
			result=F2C(x);
			print(x,"feet",result,"centimeters");
		}
		if (ask==3)
		{
			result=Y2M(x);
			print(x,"yards",result,"meters");
		}
		if (ask==4)
		{
			result=M2K(x);
			print(x,"miles",result,"kilometers");
		}
		if (ask==5)
		{
			result=C2I(x);
			print(x,"centimeters",result,"inches");
		}
		if (ask==6)
		{
			result=C2F(x);
			print(x,"centimeters",result,"feet");
		}
		if (ask==7)
		{
			result=M2Y(x);
			print(x,"meters",result,"yards");
		}
		if (ask==8)
		{
			result=K2M(x);
			print(x,"kilometers",result,"miles");
		}}
		/** Get a number from the user
		 *  Returns the number to the main method
		 */
		public static  double get( )
		{ Scanner input = new Scanner (System.in);
		double number;
		System.out.println("Type in a number");
		number=input.nextDouble(); 

		return(number);    
		}
		// Inches to Centimeters
		public static  double I2C(double a)
		{
			double sum;
			sum=a*2.54;	
			return(sum);
		}
		// Feet to Centimeteres
		public static  double F2C(double a)
		{
			double quotient;
			quotient=a*30.48;
			return(quotient);  
		}
		//Yards to Meters 
		public static  double 	Y2M(double a )
		{
			double Difference;
			Difference=a/1.094;	
			return(Difference);
		}
		//Miles to Kilometers
		public static  double M2K(double a )
		{
			double Product;
			Product=a*1.609;	
			return(Product);
		}
		//Centimeters to Inches
		public static  double C2I(double a)
		{
			double sum;
			sum=a/2.54;	
			return(sum);
		}
		//Centimeters to Feet
		public static  double C2F(double a)
		{
			double quotient;
			quotient=a/30.48;
			return(quotient);  
		}
		//Meters to yards
		public static  double 	M2Y(double a )
		{
			double Difference;
			Difference=a*1.094;	
			return(Difference);
		}
		//Kilometers to Miles
		public static  double K2M(double a )
		{
			double Product;
			Product=a/1.609;	
			return(Product);
		}
		// Print answers
	    public static  void print( double size, String word1,double newsize, String word2 )
		{
			System.out.printf("\n%f in %s is %f in %s",size,word1,newsize,word2);
		}}