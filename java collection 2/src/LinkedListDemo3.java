//Integer type Generics
import java.util.LinkedList;
public class LinkedListDemo3 {

	public static void main(String[] args) 
	{
		LinkedList<Integer> l=new LinkedList<Integer>();
		   l.add(04);
		   l.add(03);
		   l.add(1998);
		   l.add(47);
		   l.add(74);
		   System.out.println(l);
		   System.out.println("the elements in the linked list are");
		   for (int i = 0; i < l.size(); i++) 
		   {
			   System.out.println(l.get(i));
		   }
	}

}