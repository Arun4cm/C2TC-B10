package strings;
public class StringsDemo1 
{
    public static void main(String[] args) 
    {
		String s1="java";
		String s2="Programming";
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		System.out.println("-----------------------------------------");
		System.out.println("concating s1 & s2= "+s1.concat(s2));
		System.out.println("s1 & s2 are equal= "+s1.equals(s2));
		System.out.println("-----------------------------------------");
		if(s1==s2)
		{
			System.out.println("s1 & s2 are equal");
		}
		else
		{
			System.out.println("s1 & s2 are not equal");
		}
	}
}