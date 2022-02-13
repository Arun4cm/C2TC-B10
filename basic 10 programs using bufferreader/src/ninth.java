import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ninth {
	    public static void main(String[] args) throws NumberFormatException, IOException {
	        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));	
	        System.out.println("Enter number for its tables");
	        int num = Integer.parseInt(sc.readLine());
	        int i = 1;
	        while(i <= 10)
	        {
	            System.out.printf("%d * %d = %d \n", num, i, num * i);
	            i++;
	        }
	    }
	}