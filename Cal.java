import java.util.Scanner;

class Add
{
	void addition()
	{
		int a=10,b=20;
		System.out.println("a + b :"+a+b);
	}
}

class Sub extends Add
{
	void substraction()
	{
		int c=12,d=10;
		System.out.println("c - d :"+c-d);
	}
}

class Cal
{
	public static void amin(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of e : ");
		int e=sc.nextInt();
		
		System.out.println("Enter the value of f : ");
		int f=sc.nextInt();
		
		System.out.println("e * f : "+e*f);
		
		Sub obj=new Sub();
		obj.substraction();
		obj.addition();
		
	}
}