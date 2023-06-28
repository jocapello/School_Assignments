import java.util.Scanner;
class Assignment11C
{
	public static void main (String[] args)
	{
		Scanner input = new Scanner (System.in);

		int x=0, i=0,run=1;
		String foo;
		while (run==1) {
        System.out.println("Enter");
        foo=input.next();
        //length of word
        x = foo.length();
        
        foo=foo.toLowerCase();
        for (i=0; i<x; i++)
        {
        	foo=foo.replaceFirst("foo","oof");
        }
        System.out.println(foo);
        System.out.println("Would you like to try again?(1==yes, 2==no)");
        run=input.nextInt();

	}}}
