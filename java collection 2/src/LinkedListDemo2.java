//using Generics type we add only particular datatype objects. 
//In this we use string type Generics and If we give any other data type it will give error
import java.util.LinkedList;
public class LinkedListDemo2 
{
   public static void main(String[] args) 
   {
	   LinkedList<String> l=new LinkedList<>();
	   l.add("ARUN");
	   l.add("CM");
	   l.add("prasanna");
	   l.add("suhas");
	   l.add("T");
	   System.out.println(l);
	   System.out.println("the elements in the linked list are");
	   for (int i = 0; i < l.size(); i++) 
	   {
		   System.out.println(l.get(i));
	   }
   }
}