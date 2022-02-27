package strings;
public class StringsDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        String s="Hello";
        System.out.println("string s = "+s);
        System.out.println("length of string s = "+s.length());
        
        System.out.println("-----------------------------------------");
        
        String s1=new String("Peoples");
        System.out.println("string s1 = "+s1);
        System.out.println("length of string s1 = "+s1.length());
        s.concat(s1);
        System.out.println("concating s & s1: "+s);
        
        System.out.println("-----------------------------------------");
        
        String s2=s.concat(s1);
        System.out.println("concating s & s1: "+s2);
        
        System.out.println("-----------------------------------------");
        
        String s3="Hello";
        System.out.println("string s3 = "+s3);
        
        System.out.println("-----------------------------------------");
        
        String s4="HELLO";
        System.out.println("string s4 = "+s4);
        
        System.out.println("-----------------------------------------");
        
        if(s==s3)
        {
        	System.out.println("s & s3 are equal");
        }
        else
        {
        	System.out.println("s & s3 are not equal");
        }
        
        System.out.println("------------------------------------");
        
        if(s3==s4)
        {
        	System.out.println("s3 & s4 are equal");
        }
        else
        {
        	System.out.println("s3 & s4 are not equal");
        }
        
        System.out.println("------------------------------------");
        
        System.out.println("s1 & s2 are equal "+s.equals(s2));
        System.out.println("s & s3 are equal "+s.equals(s3));
        System.out.println("s3 & s4 are equal "+s.equals(s4));
	}

}