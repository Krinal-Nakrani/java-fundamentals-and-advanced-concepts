import java.util.Scanner;

class Calculator
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);//creating object of scanner
	
		System.out.println("Entre the value of a : ");
		int a=sc.nextInt();
		
		System.out.println("Entre the value of b : ");
		int b=sc.nextInt();
		
		System.out.println("Enter a operator (+,-,*,/,%) :");
		String operator=sc.next();
		
		if(operator=="+")
		{
			int c=a+b;
			System.out.println("a + b = "+c);
		}
		
		else if(operator=="-")
		{
			int d=a-b;
			System.out.println("a - b = "+d);
		}
		
		else if(operator=="*")
		{
			int e=a*b;
			System.out.println("a * b = "+e);
		}
		
		else if(operator=="/")
		{
			int f=a/b;
			System.out.println("a / b = "+f);
		}
		
		else if(operator=="%")
		{
			int g=a%b;
			System.out.println("a % b = "+g);
		}
		else
		{
			System.out.println("Enter valide operator");
		}
	}
}