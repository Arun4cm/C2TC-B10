import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class fourth
{
   public static void main(String args[]) throws IOException
   {		
	int temp;
	boolean isPrime=true;
    BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));		
	System.out.println("Enter any number:");
	int num = Integer.parseInt(scan.readLine());
	for(int i=2;i<=num/2;i++)
	{
           temp=num%i;
	   if(temp==0)
	   {
	      isPrime=false;
	      break;
	   }
	}
	if(isPrime)
	   System.out.println(num + " is a Prime Number");
	else
	   System.out.println(num + " is not a Prime Number");
   }
}