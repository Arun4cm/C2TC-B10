import java.util.*;
public class VectorDemo1 
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
        
        Vector<Integer> v2=new Vector<>();
        v2.add(3);
        v2.add(7);
        v2.add(12);
        v2.add(4);
        System.out.println("v2= "+v2);
        
        v1.add(14);
        System.out.println("v1= "+v1);
        
        v2.add(18);
        System.out.println("v2= "+v2);
        
        v1.add(4, 45);
        System.out.println("v1= "+v1);
        
        v2.add(2, 10);
        System.out.println("v2= "+v2);
        
        v1.addAll(v2);
        System.out.println("v1= "+v1);
        
        System.out.println("v1= "+v1.get(5));
        System.out.println("v1= "+v1);
        
        System.out.println("v1= "+v1.contains(v2));
		System.out.println("v1= "+v1);
              
        System.out.println("v1= "+v1.remove(6));
		System.out.println("v1= "+v1);	
		
		System.out.println("v2= "+v2.removeAll(v2));
		System.out.println("v2= "+v2);
		
		System.out.println("v1= "+v1.size());
		
		System.out.println("v1= "+v1.set(3, 12));
		System.out.println("v1= "+v1);
		}
	}
