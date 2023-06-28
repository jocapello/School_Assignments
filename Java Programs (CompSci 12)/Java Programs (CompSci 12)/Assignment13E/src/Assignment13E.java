import java.awt.Color;
import java.util.Random;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Assignment13E extends JPanel {
	
    public void paintComponent (Graphics g){
    	
    	
    	super.paintComponent(g);
        int i;
        int x=600,y=40;
        for (i=0;i<100000;i++){
        	
            int r=(int )(Math.random( )* 3  + 1);
            int Red,Green,Blue;
            
            Red=(int) ((Math.random()*255)+1); // generate random amounts of red, green and blue
            Green=(int) ((Math.random()*255)+1);
            Blue=(int) ((Math.random()*255)+1);
            
            if (r==1){
                x=(x+600)/2;
                y=(y+0)/2;}
            
            if (r==2){
                x=(x+0)/2;
                y=(y+800)/2;}
            
            if (r==3){
                x=(x+1200)/2;
                y=(y+800)/2;} 
            g.setColor(new Color(Red,Green,Blue));
            g.fillOval(x,y,3,3);
        }}}
