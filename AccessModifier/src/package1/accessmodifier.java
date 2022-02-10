
package package1;
import package2.accessmodifier3;
public class accessmodifier extends accessmodifier3{
	private int id = 4;
	public static void main(String args[]) {
		accessmodifier2 a = new accessmodifier2();//default
		accessmodifier3 b = new accessmodifier3();//public
		accessmodifier c = new accessmodifier();//private
		accessmodifier v = new accessmodifier();//protected

		System.out.println(a.name);
		System.out.println(a.city);	
		System.out.println(b.name);
		System.out.println(v.city);	
		System.out.println(c.id);	

	}
}
