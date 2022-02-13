public class OverloadingPolymorphismDemo {
	void addition(int a, int b, int c) 
	{
		System.out.println("Result: "+ (a+b));
	}
	void addition(int a, int b, double c) 
	{}
	void addition(int a, int b, int c,int d) 
	{
		System.out.println("Result: "+ (a+b+c+d));
		
	}
	void addition(int a, int b) 
	 {
		System.out.println("Result: "+ (a+b));
	}
	

	public static void main(String[] args) {
		OverloadingPolymorphismDemo olpd =new OverloadingPolymorphismDemo();
		olpd.addition(2, 5);
		olpd.addition(2, 5, 5, 5);
		olpd.addition(2, 5,5,6);
	}

}
