abstract class abstractdemo {  
        void arun() {
		System.out.println("Happy");}
        abstract void cm();
}  
class human extends abstractdemo{
	void cm() {
		System.out.println("Being");
	}
	public static void main(String args[]){  
	human obj = new human();  
    obj.arun();
    obj.cm();
}  
}  