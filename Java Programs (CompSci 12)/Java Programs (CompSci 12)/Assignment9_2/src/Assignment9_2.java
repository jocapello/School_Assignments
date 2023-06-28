import java.util.*;
class Assignment9_2
{
//----------------------------------- main method ----------------------------------------------------
   public static  void main ( String[]   args)			
  {
    //Scanner input = new Scanner (System.in);
    double x,result;    
    x=get();     
    result=Celsius(x);
    print(x,result,"Celsius");
    result=Fahrenheit(x);
    print(x,result,"Fahrenheit");
  }
/** Get a number from the user
 *  Returns the number to the main method
 */
  public static  double get( )
  { Scanner input = new Scanner (System.in);
    double number;
    System.out.println("Type in the number you want to convert");
    number=input.nextDouble(); 
    return(number);    
   }
// Celsius two numbers
  public static  double Celsius(double a )
  {
    double Celsius;
    Celsius=(a * 9/5) + 32;	
    return(Celsius);
   }
// Fahrenheit two numbers
  public static  double Fahrenheit(double a )
  {
    double Fahrenheit;
    Fahrenheit=(a - 32) * 5/9;
    return(Fahrenheit);  
   }
// Print answers
 public static  void print(double a, double answer, String word )
  {
    System.out.println("The "+word+" of "+a+" and "+" is "+answer);	    
   }

}
