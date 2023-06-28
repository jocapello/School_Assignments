import java.util.Scanner;
public class Assignment4C
{
    public static void main  (String [] args)
    {
 
        Scanner input = new Scanner(System.in);
        double num1=50,i, root;
        for ( i=50; i<=70;i++)
        {
            root= Math.sqrt(num1);
            System.out.printf("%-25s %-13s %-15.5f \n","The Square root of ",num1 ,root);
            num1=num1+1;
        }
    }
}