import java.util.*;
public class ArrayListDemo1 
{
     public static void main(String[] args) 
     {
	     ArrayList a=new ArrayList();	
	     a.add("ARUN");
		 a.add("CM");
		 a.add("BOOK");
		 a.add("PEN");
		 a.add("Chair");
		 System.out.println(a);
		 
		 System.out.println(a.size());
		 
		 System.out.println(a.isEmpty());
		 
		 System.out.println(a.contains("ARUN"));
		 
		 System.out.println(a.indexOf("PEN"));
		 
		 System.out.println(a.lastIndexOf("CM"));
		 
		 System.out.println(a.get(4));
		 
		 System.out.println(a.set(1, "JAMES"));
		 System.out.println(a);
		 
		 System.out.println(a.remove(4));
		 System.out.println(a);
	 }
}