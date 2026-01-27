class Adder
{
	void add(int a,int b)//member function with 2 parameters...
	{
		System.out.println(a+b);
	}
	
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
}

class TestOverloading2
{
	public static void main(String args[])
	{
		Adder obj=new Adder();
	obj.add(11,11);
	obj.add(13.3,12.6);
	}
}