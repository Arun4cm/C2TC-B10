import java.util.LinkedList;
public class LinkedListDemo4 
{
    public static void main(String[] args) 
    {
		LinkedList<Integer> l=new LinkedList<Integer>();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		l.add(80);
		System.out.println(l);
		
		l.addFirst(15);//add element at first index
		System.out.println("after adding element at first is "+l);
		
		l.addLast(25);//add element at last index
		System.out.println("after adding element at last is "+l);
		
		System.out.println("the first element is= "+l.getFirst());//returns the first element
		
		System.out.println("the last element is= "+l.getLast());//returns the last element
		
		System.out.println("the removed elemenet is= "+l.remove());//removes first element
		System.out.println("after removing element "+l);
		
		l.removeFirst();//removes first element
		System.out.println("after removing element at first "+l);
		
		l.removeLast();//removes last element
		System.out.println("after removing element at last "+l);
		
		l.add(5, 16);//adds element at specified index
		System.out.println("after adding element at specified index "+l);
		
		System.out.println("the given value is present or not= "+l.contains(50));//it checks
		
		System.out.println("the size of the list= "+l.size());//returns size of the list
		
		l.add(3);//adds element at last
		System.out.println("after adding element at last "+l);
		
		System.out.println("the element at specified index is= "+l.get(4));//returns element at specified index
		
		System.out.println("the added element is= "+l.set(7, 80));//adds the element at specified index and specified value
		
		System.out.println("after adding element at specified index and value are "+l);
		
		System.out.println("the index of specified value is= "+l.lastIndexOf(80));//returns the index of the given value
        
		System.out.println("display the element "+l.peek());//retrieves the first element but does not remove
		
		System.out.println("display the element "+l.peekFirst());//retrieves the first element but does not remove
		
		System.out.println("display the element "+l.peekLast());//retrieves the last element but does not remove
		
		System.out.println("the first element is "+l.element());//retrieves the first element but does not remove
		
		System.out.println(l);
		
		System.out.println("display the element "+l.poll());//retrieves the first element and removes the first element
		
		System.out.println("display the element "+l.pollFirst());//retrieves the first element and removes the first element
		
		System.out.println("display the element "+l.pollLast());//retrieves the last element and removes the last element
		
		System.out.println(l);
		
		System.out.println("the given element is added or not= "+l.offer(89));//insert specified element at last
		System.out.println("After adding element "+l);
		
        System.out.println("the given element is added or not= "+l.offerFirst(5));//inserts specified element at first
		System.out.println("After adding element "+l);
		
		System.out.println("the given element is added or not= "+l.offerLast(2));//inserts specified element at last
		System.out.println("After adding element "+l);
		
	    l.push(1);//Pushes an element onto the stack or inserts first element
	    System.out.println("after adding "+l);
	    
	    l.pop();//pops an element onto the stack or removes first element
	    System.out.println("after deleting "+l);
	    
	    l.removeFirstOccurrence(80);//Removes the first occurrence of the specified element
	    System.out.println("after removing "+l);
	    
	    l.removeLastOccurrence(2);//Removes the last occurrence of the specified element
	    System.out.println("after removing"+l);
	    
	    l.listIterator(4);//Returns a list-iterator of the elements in this list
	    System.out.println(l);
	    
	    System.out.println(l.descendingIterator());
	    
	    System.out.println(l.clone());//Returns a shallow copy of this LinkedList
	    
	    l.toArray();//an array containing all of the elements in this list in proper sequence
	    System.out.println(l);
  	}
}