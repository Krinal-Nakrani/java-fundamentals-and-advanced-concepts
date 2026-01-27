class Student
{
	int rollno;//member variable
	String name;
	
	void insertrecord(int n,String s)//member function with parameters
	                                 //insertrecord = function name
	{
		rollno=n;
		name=s;
	}
	
	void displayrecord()//member function
	{
		System.out.println(rollno);
		System.out.println(name);
	}
}

class Test2
{
	public static void main(String args[])
	{
	Student s1=new Student();
	s1.insertrecord(101,"vissicomp");//calling member function
	s1.displayrecord();//calling member function
	}
}

