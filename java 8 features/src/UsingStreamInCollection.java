//program without using stream and using stream to filter data and collect list and display
import java.util.*;
import java.util.stream.Collectors;
class Employee
{
	int id;
	String name;
	float salary;
	
	public Employee( int id, String name, float salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
}
public class UsingStreamInCollection 
{
	
	public static void main(String[] args) 
	{
		List<Employee> le= new ArrayList<Employee>();
		le.add(new Employee(100,"nick",35000f));
		le.add(new Employee(101,"Bill",40000f));
		le.add(new Employee(102,"John",32000f));
		le.add(new Employee(103,"Smith",42000f));
		
		//without using stream
		/*List<Float> employeeSalaryList= new ArrayList<Float>();
		for(Employee employee: le)
		{  
            
            // filtering data of list  
           if(employee.salary >35000)
           {  
             employeeSalaryList.add(employee.salary);    // adding price to a productPriceList  
           } 
		}*/
            
		//using stream
		List<Float> employeeSalaryList= le.stream()
				.filter(s -> s.salary > 35000f) //filtering data
				.map(s ->s.salary)		//mapping data
				.collect(Collectors.toList());	//collecting as list
		System.out.println("employee salary: "+employeeSalaryList);
		
	}

}
