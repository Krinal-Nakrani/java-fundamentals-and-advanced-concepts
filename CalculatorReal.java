//javac CalculatorReal.java
//java CalculatorReal
import java.util.Scanner;
class CalculatorReal
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);//creating object of scanner
	
		System.out.println("Entre the value of a : ");
		int a=sc.nextInt();
		
		System.out.println("Entre the value of b : ");
		int b=sc.nextInt();
		
		System.out.println("Enter an operator :");
		String ope=sc.next();
		
		//if(ope.equals("add"))//use this...
		//if(ope=="+")don't use it...
		
		if(ope.equals("+"))
		{
			int c=a+b;
			System.out.println("a + b = "+c);
		}
		
		else if(ope.equals("-"))
		{
			int d=a-b;
			System.out.println("a - b = "+d);
		}
		
		else if(ope.equals("*"))
		{
			int e=a*b;
			System.out.println("a * b = "+e);
		}
		
		else if(ope.equals("/"))
		{
			int f=a/b;
			System.out.println("a / b = "+f);
		}
		
		else if(ope.equals("%"))
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