import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner k = new Scanner(System.in);
		int t =k.nextInt();
		while(t--!=0){
		    int n=k.nextInt();
		    int ans=(n/2)+1;
		    System.out.println(ans);
		}
	}
}