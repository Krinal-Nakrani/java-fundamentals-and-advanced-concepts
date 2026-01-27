class Student{  
 int id;//field or data member or instance variable  
 String name;  
  
 public static void main(String args[])
 {  
  Student s1=new Student();//creating an object of Student
  s1.id=101;  
  s1.name="Sonoo";  
  System.out.println(s1.id);//accessing member through reference variable  
  System.out.println(s1.name);  
 }  
}  