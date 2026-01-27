//AWT by inheritance
//prectice

import java.awt.*;

class Awtint extends Frame
{
	Awtint()
	{
		Button b=new Button("Click me");
		
		b.setBounds(40,50,80,40);
		add(b);
		
		setSize(200,200);
		setLayout(null);
		setVisible(true);
	}
	public static void main(String args[])
	{
		Awtint f=new Awtint();
	}
}