package interfacedemo;

public class home {
	public static void main(String args[]) {
		
		bank hdfc = new hdfc();
		bank icici = new icici();		
		
		System.out.println("Interest rate of HDFC Bank:" +hdfc.getrateofinterest());
		System.out.println("Interest rate of ICICI Bank:" +icici.getrateofinterest());

	}
}
