public class classThrow1
{
		 static void validate(int age)
		 {
				 if(age<18)
					 throw new ArithmeticException("not valid");
				 else
					 System.out.println("welcome to vote");
		 }
		 public static void main(String args[])
		 {
					try {
						validate(13);
					}
					catch(Exception e) {
						 System.out.println("rest of the code...");

					}
}
}
