//We can add any type of values to LL and we can print one by one also using for loop
import java.util.LinkedList;
public class LinkedListDemo1 
{
    public static void main(String[] args) 
    {
    	LinkedList l=new LinkedList<>();
		l.add(4);
		l.add("Arun");
		l.add(7);
		l.add('T');
		l.add(null);
		l.add("CM");
		l.add(74);
		l.add(47);
		System.out.println("The elements in the linked list are "+l);
		System.out.println("------------------------------------------------------------------------");
		System.out.println("The elements in the linked list are ");
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
	}
}