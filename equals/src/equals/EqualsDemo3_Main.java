package equals;
public class EqualsDemo3_Main 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		EqualsDemo3 e1=new EqualsDemo3("ARUN", 1);
		EqualsDemo3 e2=new EqualsDemo3("CM", 2);
		EqualsDemo3 e3=new EqualsDemo3("ARUN", 1);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println("--------------------");
		System.out.println("e1 and e2 are equals= "+e1.equals(e2));
		System.out.println("e1 and e3 are equals= "+e1.equals(e3));
	}
}