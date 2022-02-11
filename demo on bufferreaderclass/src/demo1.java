import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class demo1 {
	 public static void main(String[] args) throws IOException {
	        
	        int sum;
	        InputStreamReader isr = new InputStreamReader(System.in);
	        BufferedReader br = new BufferedReader(isr);
	        System.out.println("Enter First Number: ");
	        int a = Integer.parseInt(br.readLine());
	        
	        System.out.println("Enter Second Number: ");
	        int b = Integer.parseInt(br.readLine());
	        
	        
	        sum = a + b;
	        System.out.println("Sum of these numbers: "+sum);
	    }
}