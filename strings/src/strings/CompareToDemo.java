package strings;
public class CompareToDemo 
{
	public static void main(String[] args)
	{
		String s1="a";
		String s2="b";
		System.out.println("Result= "+s1.compareTo(s2));
		
		String s3="s";
		String s4="s";
		System.out.println("Result= "+s3.compareTo(s4));
		
		String s5="k";
		String s6="j";
		System.out.println("Result= "+s5.compareTo(s6));
    }

}