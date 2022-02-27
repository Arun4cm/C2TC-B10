import java.util.*;
import java.util.Map.Entry;
public class EnumMapDemo 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        EnumMap<Numbers, String> e=new EnumMap<Numbers, String> (Numbers.class);
        e.put(Numbers.ONE, "1");
        e.put(Numbers.TWO, "2");
        e.put(Numbers.THREE, "3");
        e.put(Numbers.FOUR, "4");
        e.put(Numbers.FIVE, "5");
        e.put(Numbers.SIX, "6");
        
        Set<Entry<Numbers, String>> entry=e.entrySet();
        for (Entry<Numbers, String> entry2 : entry) 
        {
			System.out.println(entry2.getKey()+"\t"+entry2.getValue());
		}
	}

}