package equals;
public class EqualsDemo1 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        int v1=15;
        int v2=16;
        int v3=15;
        
        if(v1==v2)
        {
        	System.out.println("v1 and v2 are equal");
        }
        else
        {
        	System.out.println("v1 and v2 are not equal");
        }
        System.out.println("----------------------------");
        if(v1==v3)
        {
        	System.out.println("v1 and v3 are equal");
        }
        else
        {
        	System.out.println("v1 and v3 are not equal");
        }
	}

}