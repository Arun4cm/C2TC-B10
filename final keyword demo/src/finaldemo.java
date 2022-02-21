public class finaldemo extends A {

	void run() {
		System.out.println("Hello");
		a=40;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.run();
		
	}

}
class A{
	final int a=10;
	final void run() {
		System.out.println("Hello");

	}
}
final class B{
	int b=20;
}
