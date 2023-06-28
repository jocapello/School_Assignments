import java.util.*;
class Assignment9_1
{
//----------------------------------- main method ----------------------------------------------------
	
	public static  void main ( String[]   args)
	
  {
    //Scanner input = new Scanner (System.in);
    double x,y,result;    
    x=get();   
    y=get();   
    result=add(x,y);
    print(x,y,result,"sum");
    result=divide(x,y);
    print(x,y,result,"quotient");
    result=Subtract(x,y);
    print(x,y,result,"Difference");
    result=Multiply(x,y);
    print(x,y,result,"Product");
  }
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
// Add two numbers
  public static  double add(double a, double b )
  {
    double sum;
    sum=a+b;	
    return(sum);
   }
// Divide two numbers
  public static  double divide(double a, double b )
  {
    double quotient;
    quotient=a/b;
    return(quotient);  
   }
//Subtract two numbers
 public static  double 	Subtract(double a, double b )
 {
   double Difference;
   Difference=a-b;	
   return(Difference);
  }
//Multiply two numbers
public static  double Multiply(double a, double b )
{
  double Product;
  Product=a*b;	
  return(Product);
 }
// Print answers
 public static  void print(double a, double b, double answer, String word )
  {
    System.out.println("The "+word+" of "+a+" and "+b+" is "+answer);	    
   }

}
