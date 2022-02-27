import java.util.*;
public class EnumerationDemo1 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Vector<Integer> v1=new Vector<>();
        v1.add(15);
        v1.add(8);
        v1.add(25);
        v1.add(16);
        System.out.println(v1);
        System.out.println("---------------------------------");
        
        Enumeration<Integer> elements=v1.elements();
        while(elements.hasMoreElements())
        {
        	Integer i=elements.nextElement();
        	System.out.println(i); 
        }
     }
}