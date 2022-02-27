import java.util.*;
public class ListIteratorDemo 
{
    public static void main(String[] args) 
    {
		List<EmployeeDemo> l=new ArrayList<>();
		l.add(new EmployeeDemo(001 ,"ARUN",50000.00,"arun@gmail.com"));
		l.add(new EmployeeDemo(002 ,"Prasanna",45000.00,"prasanna@gmail.com"));
		l.add(new EmployeeDemo(003 ,"ankith",38000.00,"ankith@gmail.com"));
		l.add(new EmployeeDemo(004 ,"nikhil",62000.00,"nikhil@gmail.com"));
		l.add(new EmployeeDemo(005 ,"suhas",100000.00,"suhas@gmail.com"));
		
		//iterateListUsingListIterator(l);
		//addElementsInListUsingListIterator(l);
		//deleteElementsInListUsingListIterator(l);
		replaceElementsInListUsingListIterator(l);
	}
    private static void iterateListUsingListIterator(List<EmployeeDemo> l)
    {
    	 ListIterator<EmployeeDemo> li=l.listIterator();
    	 System.out.println("Forward direction");
    	 while(li.hasNext())
    	 {
    		 EmployeeDemo e=li.next();
    		 System.out.println(e);
    	 }
    	 System.out.println("Backward direction");
    	 while (li.hasPrevious()) 
    	 {
			EmployeeDemo e= (EmployeeDemo) li.previous();
			System.out.println(e);
		 }
    }
    
    private static void addElementsInListUsingListIterator(List<EmployeeDemo> l)
    {
    	ListIterator<EmployeeDemo> li=l.listIterator();
   	    while(li.hasNext())
   	    {
   		    EmployeeDemo e=li.next();
   		    if(!e.getName().equalsIgnoreCase("kusuma"))
   		    {
   		    	li.add(new EmployeeDemo(006 ,"Kusuma",20000.00,"kusuma14@gmail.com"));
   		    	break;
   		    }
   	    }
   	    for (EmployeeDemo e : l) 
   	    {
			System.out.println(e);
		}
    }
    
    private static void deleteElementsInListUsingListIterator(List<EmployeeDemo> l)
    {
    	ListIterator<EmployeeDemo> li=l.listIterator();
   	    while(li.hasNext())
   	    {
   		    EmployeeDemo e=li.next();
   		    if(e.getName().equalsIgnoreCase("kusuma"))
   		    {
   		    	li.remove();
   		    }
   	    }
   	    for (EmployeeDemo e : l) 
   	    {
			System.out.println(e);
		}
    }
    
    private static void replaceElementsInListUsingListIterator(List<EmployeeDemo> l)
    {
    	ListIterator<EmployeeDemo> li=l.listIterator();
   	    while(li.hasNext())
   	    {
   		    EmployeeDemo e=li.next();
   		    if(e.getName().equalsIgnoreCase("kusuma"))
   		    {
   		    	e.setName("kusuma Kantha");
   		    	li.set(e);
   		    }
   	    }
   	    for (EmployeeDemo e : l) 
   	    {
			System.out.println(e);
		}
    }
}