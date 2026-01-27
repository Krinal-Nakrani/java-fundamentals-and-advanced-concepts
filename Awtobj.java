//AWT by object
//prectice

import java.awt.*;

class Awtobj
{
	Awtobj()
	{
		Frame f=new Frame();
		Button b=new Button("Click Here");
		
		b.setBounds(40,60,90,40);
		
		f.add(b);
		f.setSize(400,400);
		f.setLayout(null);
		f.setVisible(true);
	}
	
	public static void main(String args[])
	{
		Awtobj f=new Awtobj();
	}
}

