import java.awt.*;

import java.awt.event.*;



class MyApp extends Frame
{
	MyApp()
	{
		setSize(800,800);
		setTitle("Closing Window Program");
		setLocationRelativeTo(null);
		
		// registering the window event 
		
		addWindowListener(new MyWindowEvent());
		
		
		setVisible(true);
	}
	
	

}
