import java.util.*;
class Assignment9_4
{
	//----------------------------------- main method ----------------------------------------------------
	public static  void main ( String[]   args)			
	{
		//Sidecanner input = new Sidecanner (SideySidetem.in);
		double x,y,z,Result;    
		x=get();   
		y=get();   
		z=get();   
		if (x > y+z)
		
			System.out.println("This will not form a triangle");
		
		else if (y > x+z)
			System.out.println("This will not form a triangle");
		else if (z > y+x)
			System.out.println("This will not form a triangle");
		else
		{
			Result=Solution(x,y,z);
			print(x,y,z,Result);

		}}
		/** Get a number from the uSideer
		 *  ReturnSide the number to the main method
		 */
		public static  double get( )
		{Scanner input = new Scanner (System.in);
		double number;
		System.out.println("Type in a number");
		number=input.nextDouble(); 
		return(number);    
		}
		// Formula
		public static  double Solution(double a, double b,double c )
		{
			double Solution, Side, Add;
			Add = a+b+c;
			Side = Add/2;
			Solution = Side*(Side-a)*(Side-b)*(Side-c); 
			Solution = Math.sqrt(Solution);
			return(Solution);
		}


		// Print SolutionSide
		public static  void print( double a, double b,double c, double result )
		{
			System.out.printf("The area of %f %f %f is %f",a,b,c,result)  ;
		}}
