public class AccessModifier{
	int nos;
	float hrs;
	int noc;
	private void displayStudents() {//m1
		System.out.println("Number of Students");
	}
	void displayHours() {//m2
		System.out.println("Number of Hours");
	}
	void displayClass() {//m3
		System.out.println("Number of Class");
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessModifier am = new AccessModifier();
		am.displayStudents();
	}

}
