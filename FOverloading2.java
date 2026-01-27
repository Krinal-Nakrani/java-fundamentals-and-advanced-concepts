class A
{
	void add(int a,int b)
	{
		int j=a+b;
		System.out.println(a+" + "+b+" : "+j);
	}
	
	void add(int a,int b,int c)
	{
		int k=a+b+c;
		System.out.println(a+" + "+b+" + "+c+" : "+k);
	}
	
	void add(double a, double b, double c, double d)
	{
		double l=a+b+c+d;
		System.out.println(a+" + "+b+" + "+c+" + "+d+" : "+l);
	}
}

class FOverloading2
{
	public static void main(String args[])
	{
		A obj=new A();
		obj.add(5,5);
		obj.add(5,5,5);
		obj.add(5.2,5.2,5.2,5.2);
	}
}
