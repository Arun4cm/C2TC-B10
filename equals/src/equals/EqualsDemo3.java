package equals;
public class EqualsDemo3 
{
	private String name;
	private int id;
	
	public EqualsDemo3(String name, int id) 
	{
		super();
		this.name = name;
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
    public int getId() 
	{
		return id;
	}
    public void setId(int id) 
	{
		this.id = id;
	}
    
    @Override
    public boolean equals(Object obj) 
    {
    	// TODO Auto-generated method stub
    	EqualsDemo3 e=(EqualsDemo3)obj;
    	return this.name.equals(e.name) &&
    			this.id==e.id;
    }
    
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return "name= "+name + " id= " +id;
    }
}