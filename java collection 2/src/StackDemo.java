import java.util.*;
public class StackDemo 
{
     public static void main(String[] args) 
     {
		  Stack<Integer> s=new Stack<>();
		  s.add(5);
		  s.add(10);
		  s.add(15);
		  s.add(20);
		  s.add(25);
		  s.add(30);
		  System.out.println("the elements are "+s);
		  
		  System.out.println("the stack after push= "+s.push(6));
		  System.out.println(s);//pushes the element to last index
		  
		  System.out.println("the stack after pop= "+s.pop());
		  System.out.println(s);//pops the element from last index
		  
		  System.out.println("the stack= "+s.peek());//gets the last element but does not remove
		  System.out.println(s);
		  
		  System.out.println("the stack is empty or not= "+s.empty());//checks whether the stack is empty or not 
		  System.out.println(s);
		  
		  System.out.println("the searched element is= "+s.search(15));//search for an element in the stack and get its distance from the top
		  System.out.println(s);
	 }
}