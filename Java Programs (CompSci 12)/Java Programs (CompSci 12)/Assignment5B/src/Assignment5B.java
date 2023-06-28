import java.util.*;

class Assignment5B
{
    public static  void main ( String[]   args)	
    {
       Scanner input = new Scanner (System.in);	
        int  number,number2,num3,add,multiply;
        System.out.println("Enter two numbers");  
        number=input.nextInt();
        number2=input.nextInt();
        System.out.println("Would you like to Add or Multiply? (1==Add, 2==Multiply)");
        num3=input.nextInt();
         switch  (num3)
          {
                  case 1 :
                	  add = number + number2;
                	  System.out.printf("The solution is " + add);
                               break;
                             
                  case 2 :
                	  multiply = number * number2;
                	  System.out.printf("The solution is " + multiply);
                                break;
   
                 default:
                                 System.out.println("What?");
                                 System.out.println("What are you thinking.");
                             break;
             } // end of switch statement
         }
}
