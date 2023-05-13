import java.awt.*;
import java.awt.event.*;


class MainFrame5 extends Frame
{
	MainFrame5()
	{
		setSize(600,600);
		setTitle("Question 5");
		setLocationRelativeTo(null);
		
		// mouse click event register
		
		this.addMouseListener(new MouseHandler());
		
		
		
		setVisible(true);
	}
}


// handling mouseclick event 
class MouseHandler extends MouseAdapter
{
 
	public void mouseClicked(MouseEvent e)
	{
		System.out.println("Clicked");
	}
} 



public class Question_5
{
	public static void main(String [] args)
	{	
		MainFrame5 f = new MainFrame5();
	}
}
