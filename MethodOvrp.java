//javac MethodOvrp.java
//java MethodOvrp

class A
{
	int aa;
	void disp(int a)
	{
		aa=a;
		System.out.println("Valu of aa : "+aa);
	}
}

class B extends A
{
	int bb;
	void disp(int b)
	{
		bb=b;
		System.out.println("Value of bb : "+bb);
	}
}

class MethodOvrp
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.disp(20);
	}
}

