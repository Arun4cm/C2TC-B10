import java.util.*;
public class IteratorDemo1 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<Integer> l=new ArrayList<>();
        l.add(15);
		l.add(07);
		l.add(1998);
	    l.add(16);
		l.add(25);
		System.out.println(l);
		
		Iterator<Integer> it=l.iterator();
		while(it.hasNext())
		{
			Integer i=it.next();
			System.out.println(i);
			if(i==7)
			{
				it.remove();
			}
		}
	}

}