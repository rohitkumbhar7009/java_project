import java.util.*;
class bin{
public static void main(String args[])
	{
		System.out.println("Enter the num: ");
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		String b="";
		
		while(d>0) //13 1101
		{
			int r=d%2;
			b=b+r;
			d=d/2;
			//System.out.println("bin is "+);
		}
for(int i=b.length();i>=1;i--){
	System.out.print(b.charAt(i));
}
}


}
