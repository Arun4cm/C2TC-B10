import java.util.*;
public class EnumSetDemo 
{
    public static void main(String[] args) 
    {
		EnumSet<WeekDay> weekDaySet=EnumSet.range(WeekDay.Monday, WeekDay.Friday);
		System.out.println("Iterating EnumSet ");
		for (WeekDay weekDay : weekDaySet) 
		{
			System.out.println("WeekDay: "+weekDay);
		}
		System.out.println("------------------------------------");
		EnumSet<WeekDay> weekEndSet=EnumSet.complementOf(weekDaySet);
		System.out.println("Iterating weekEndSet");
		Iterator<WeekDay> itr=weekEndSet.iterator();
		while (itr.hasNext()) 
		{	
			System.out.println("WeekDay: "+itr.next());
		}
		System.out.println("----------------------------------------------");
		System.out.println("Need to work? "+isWorkingDay(weekDaySet, WeekDay.Monday));
		System.out.println("Need to work? "+isWorkingDay(weekDaySet, WeekDay.Saturday));
		System.out.println("Need to work? "+isWorkingDay(weekDaySet, WeekDay.Wednesday));
	}
    private static boolean isWorkingDay(Set<WeekDay> daysSet , WeekDay day)
    {
    	return daysSet.contains(day);
    }
}