import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
public class eighth {
	   public static void main(String args[]) throws IOException {
		  BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));		
	      System.out.println("Enter a string value: ");
	      String str = sc.readLine();
	      char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
	   }
}