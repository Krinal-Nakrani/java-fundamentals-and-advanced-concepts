//import java.util.Scanner;
import java.util.Scanner;//incuded file..

class ScannerTest
{
 public static void main(String args[])
 {
   Scanner sc=new Scanner(System.in);//sc=object of class.
   
   System.out.println("Enter your rollno");
   int rollno=sc.nextInt();//input of rolno
   
   System.out.println("Enter your name");
   String name=sc.next();//input of name
   
   System.out.println("Enter your fee");
   double fee=sc.nextDouble();//input of fee
   
   System.out.println("Rollno:"+rollno+" name:"+name+" fee:"+fee);
   
   sc.close();
 }
}