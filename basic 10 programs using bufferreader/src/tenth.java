import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class tenth {
   public static void main(String args[]) throws IOException{
      System.out.println("Enter a character :");
      BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));		
      char ch = sc.readLine().charAt(0);
      if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'y'){
         System.out.println("Given character is an vowel");
      }else{
         System.out.println("Given character is a consonant");
      }
   }
}