//javac MethodOvrdisp2.java
//java MethodOvrdisp2

class A
{
	int c;
	
	void getValue(int a,int b)
	{
		 c=a+b;
	}
	
	void disp()
	{
		System.out.println("Value of c : "+c);
	}
}

class MethodOvrdisp2
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.getValue(20,30);
		obj.disp();
		
	}
}
