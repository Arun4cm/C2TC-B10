public class AccessModifier extends demo{
	int nos;
	float hrs;
	int noc;
	private void displayStudents() {//m1
		System.out.println("Number of Students");
	}
	void displayHours() {//m2
		System.out.println("Number of Hours");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier am = new AccessModifier();
		am.displayStudents();
		AccessModifier a2 = new AccessModifier();
		a2.displayClass();
	}

}
class demo{
	private void displayClass() {//m3
		System.out.println("Number of Class");
	}
	
}
