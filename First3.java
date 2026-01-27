//AWT by Association/object

import java.awt.*;  

class First3
{  
	First3()
	{  
		Frame f=new Frame();  
		Button b=new Button("click me");  
		
		b.setBounds(30,50,80,30);  
		
		f.add(b);  
		f.setSize(300,300);  
		f.setLayout(null);  
		f.setVisible(true);  
	}  
	public static void main(String args[])
	{  
		First3 f=new First3();  
	}
}