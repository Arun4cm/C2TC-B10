import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class EmployeeMain 
{
    public static void main(String[] args) 
    {
		List<EmployeeDemo> l=new ArrayList<EmployeeDemo>();
		l.add(new EmployeeDemo(001 ,"ARUN",50000.00,"aruncm47@gmail.com"));
		l.add(new EmployeeDemo(002 ,"Prasanna",45000.00,"prasanna@gmail.com"));
		l.add(new EmployeeDemo(003 ,"Suhas",38000.00,"suhas@gmail.com"));
		l.add(new EmployeeDemo(004 ,"ankith",62000.00,"ankith@gmail.com"));
		l.add(new EmployeeDemo(005 ,"nikhil",100000.00,"nikhil@gmail.com"));
		
		Iterator<EmployeeDemo> it=l.iterator();
		while(it.hasNext())
		{
			EmployeeDemo ed=it.next();
			if(ed.getSalary()<=40000.00)
			{
				it.remove();
			}
		}
		
		Iterator<EmployeeDemo> it2=l.iterator();
		while(it2.hasNext())
		{
			EmployeeDemo ed=it2.next();
			System.out.println(ed);
		}
		System.out.println("-------------------------------");
		Iterator<EmployeeDemo> it3=l.iterator();
		it3.forEachRemaining(System.out::print);
	}
}