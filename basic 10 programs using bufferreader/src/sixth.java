import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sixth {
		  public static void main(String[] args) throws IOException {
		  BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));		
		  System.out.println("Enter any String");
		  String str = sc.readLine();
		  String reverseStr = "";
		    
		    int strLength = str.length();

		    for (int i = (strLength - 1); i >=0; --i) {
		      reverseStr = reverseStr + str.charAt(i);
		    }

		    if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
		      System.out.println(str + " is a Palindrome String.");
		    }
		    else {
		      System.out.println(str + " is not a Palindrome String.");
		    }
		  }
}