import java.io.*;
public class demo {
	 public static void main(String[] args) throws IOException {
	        
	        int sum;
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        System.out.println("Enter First Number: ");
	        int a = Integer.parseInt(br.readLine());
	        
	        System.out.println("Enter Second Number: ");
	        int b = Integer.parseInt(br.readLine());
	        
	        
	        sum = a + b;
	        System.out.println("Sum of these numbers: "+sum);
	    }
}