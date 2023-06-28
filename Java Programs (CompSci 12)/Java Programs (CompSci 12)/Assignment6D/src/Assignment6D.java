import java.util.Scanner;
public class Assignment6D
{
    public static void main  (String [] args)
    {
        Scanner input = new Scanner(System.in);
        int digit,num1 = 1;
        int number=0,i;
        for ( i=1; i<=100;i++)
        {
            num1=i;
            number=0;
            do
            {
            	
                digit=num1%10;
                num1=num1/10;
                number=number+digit;
                
            }while(num1>0);
            System.out.println("the sum of the digits of "+i+" is "+number);
        }
       
    }
}
