class Simple
{
	int rollno;
	String name;
	
	void insertrecord(int n, String s)
	{
		rollno=n;
		name=s;
	}
	void displayrecord()
	{
		System.out.println(rollno);
		System.out.println(name);
	}
}
class Test3
{
	public static void main(String args[])
	{
		Simple s1=new Simple();
		s1.insertrecord(101,"vissicomp");
		s1.displayrecord();
	}
}