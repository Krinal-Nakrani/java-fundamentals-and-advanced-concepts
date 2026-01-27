//parameterized constructor

class Student
{
	int id;
	String name;
	
	Student(int i, String n)
	{
		id=i;
		name=n;
	}
	
	void display()
	{
		System.out.println(id+" "+name);
	}
	
	public static void main(String args[])
	{
		Student s1=new Student(11,"Krinal");
		Student s2=new Student(13,"Manali");
		
		s1.display();
		s2.display();
	}
}