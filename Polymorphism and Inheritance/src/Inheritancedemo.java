
class x{
	String name = "Arun";
}

public class Inheritancedemo extends x {
	String Lname = "CM";

	public static void main(String[] args) {
		Inheritancedemo id = new Inheritancedemo();
		System.out.println("Student name is:" +id.name + id.Lname);
	}

}
