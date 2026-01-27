//javac MethodOvrp2.java
//java MethodOvrp2

class A
{
	
	void disp(int a,int b)
	{
		int c=a+b;
		System.out.println("Valu of a + b: "+c);
	}
}

class B extends A
{
	
	void disp(int x,int y)
	{
		int z=x*y;
		System.out.println("Value of x * y : "+z);
	}
}

class MethodOvrp2
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.disp(20,0);
	}
}
