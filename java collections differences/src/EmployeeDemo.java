public class EmployeeDemo 
{
    private Integer id;
    private String name;
    private Double salary;
    private String email;
    
	public EmployeeDemo(Integer id, String name, Double i, String email) 
	{
		super();
		this.id = id;
		this.name = name;
		this.salary = i;
		this.email = email;
	}
	
	public Integer getId() 
	{
		return id;
	}
	public void setId(Integer id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) 
	{
		this.salary = salary;
	}
	public String getEmail() 
	{
		return email;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}
    
    @Override
    public String toString() 
    {
    	 return ("id= " + id + "name= " + name + "salary= " + salary +"email= " + email);
    }
}