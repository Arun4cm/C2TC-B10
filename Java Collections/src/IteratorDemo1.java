import java.util.*;
public class IteratorDemo1 
{
     void Display(List<String> list)
     {
    	 Iterator<String> i=list.iterator();
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
	     
	     IteratorDemo1 id=new IteratorDemo1();
	     id.Display(l);
	 } 
}