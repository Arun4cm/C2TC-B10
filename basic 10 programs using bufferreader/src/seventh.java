import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class seventh {
	    public static void main(String[] args) throws IOException {
	        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));		
	        int originalNumber, remainder, result = 0;
	        System.out.println("Enter any number");
	        int number = Integer.parseInt(sc.readLine());
	        originalNumber = number;

	        while (originalNumber != 0)
	        {
	            remainder = originalNumber % 10;
	            result += Math.pow(remainder, 3);
	            originalNumber /= 10;
	        }

	        if(result == number)
	            System.out.println(number + " is an Armstrong number.");
	        else
	            System.out.println(number + " is not an Armstrong number.");
	    }
}