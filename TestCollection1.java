import java.util.*;  

class TestCollection1
{  
	public static void main(String args[])
	{  
		//Creating arraylist 
		ArrayList<String> list=new ArrayList<String>();//ArrayList is class of util package  
		
		//Adding object in arraylist  
		list.add("Ravi");  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  
		
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		
		while(itr.hasNext())
		  {  
		   System.out.println(itr.next());  
		  }  
	}  
}  