import java.util.*;
import java.util.Collection;
public class IteratorDemo2 
{
	void Display(List<String> list)
    {
   	 Iterator<String> i=list.listIterator();
   	 System.out.println("the elements are ");
   	 while(i.hasNext())
   	 {
   		 System.out.println(i.next());
   	 }
    }
	public static void main(String[] args) 
	{
		List<String> l=new LinkedList<String>();
	     l.add("AK47");
	     l.add("KGF");
	     l.add("Kabza");
	     l.add("thevillain");
	     System.out.println(l);
	     
	     IteratorDemo2 id=new IteratorDemo2();
	     
	     l.sort(null);
	     id.Display(l);
	     System.out.println("------------------------------");
	     Collections.reverse(l);
	     id.Display(l);
	}
}