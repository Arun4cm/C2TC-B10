import java.io.*;
public class secound_one {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));		
        System.out.println("Enter 1st numbers:");
        int num1 = Integer.parseInt(br.readLine());
        System.out.println("Enter 2nd numbers:");
        int num2 = Integer.parseInt(br.readLine());
	    int sum = num1 + num2;

	    System.out.println("Sum of these numbers: "+sum);
	   }
}