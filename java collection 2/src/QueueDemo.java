import java.util.*;
public class QueueDemo {

	public static void main(String[] args) 
	{
        Queue<String> q=new LinkedList<String>();
        q.add("Arun");
        q.add("CM");
        q.add("train");
        q.add("bus");
        q.add("car");
        q.add("airbus");
        System.out.println(q);
        
        System.out.println("Is element added to queue= "+q.add("ecar"));//Inserts the specified element into this queue
        System.out.println("after add queue is "+q);
        
        System.out.println("Is element added to queue= "+q.offer("cycle"));//Inserts the specified element into this queue
        System.out.println("after offer queue is "+q);
        
        System.out.println("the removed element is= "+q.remove());//Retrieves and removes the head of this queue
        System.out.println("after remove queue is "+q);
        
        System.out.println("retrieved and removed element= "+q.poll());//Retrieves and removes the first element
        System.out.println("after poll queue is "+q);
        
        System.out.println("retrival element= "+q.element());//Retrieves first element but does not remove
        System.out.println("after element queue is "+q);
        
        System.out.println("after peek "+q.peek());//Retrieves first element but does not remove
        System.out.println("after peek "+q);
	}

}