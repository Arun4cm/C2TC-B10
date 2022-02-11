interface interfacedemo {
	void a();  
	void b(); 	
}

class A implements interfacedemo{  
public void a(){
	System.out.println("I am a");
	}  
public void b(){
	System.out.println("I am b");
	} 
}  
  
class B extends A{  
	public static void main(String args[]){  
	B a = new B();  
	a.a();  
	a.b();   
}
}  