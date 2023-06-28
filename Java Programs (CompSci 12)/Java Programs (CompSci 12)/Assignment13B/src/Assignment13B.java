import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Assignment13B
	{
	  public static void main ( String[] args)
	  {
		  int sum,NUM1,NUM2;
          String num1,num2;
          
	    num1=JOptionPane.showInputDialog("Enter the first number");
	    NUM1 = Integer.parseInt(num1.trim());
	    num2=JOptionPane.showInputDialog("Enter the second number");
	    NUM2 = Integer.parseInt(num2.trim());
	    sum=NUM1+NUM2;
	   JOptionPane.showMessageDialog(null,"The sum is "+ sum);
	  }}
	
