//default constructor

class A
{
	A(int a , int b)
	{
        int c=a+b;
		System.out.println("a+b = "+c);
	}
}

class Para
{
    public static void main(String args[])
	{
	    A b=new A(2,7);
	}
}