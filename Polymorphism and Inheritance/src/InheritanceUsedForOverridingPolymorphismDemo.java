public class InheritanceUsedForOverridingPolymorphismDemo extends A
{
	int a = 2;
	int b = 3;
	int c;
	void sum() 
	{
		c=a+b;
		System.out.println("Result: " + c);
	}
	void multiplication(int a, double b) 
	{
			System.out.println("Parent Result of Multiplication: " +(a*b));
	}
	void display() 
	{
			System.out.println("Hello CHild");
	}
	public static void main(String[] args) 
	{
		InheritanceUsedForOverridingPolymorphismDemo iufopd = new InheritanceUsedForOverridingPolymorphismDemo();
		iufopd.sum();
		iufopd.multiplication(3, 2.5);
		A a = new A();
		a.display();
		a.multiplication(3, 4.0);
		iufopd.display();
	}

}

class A{
	void multiplication(int a, double b) {
		System.out.println("Parent Result of Multiplication: " +(a*b));
	}
	void display() {
		System.out.println("Hello Parent");
	}
	
}
