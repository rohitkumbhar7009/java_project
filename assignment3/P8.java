class P8
{
 public static void main(String args[])
 {
  for (int i=5;i>=1;i--)
  {
    for (int j=i-1;j>=i;j--)
	{
	  System.out.print(" ");
	 }
	 for (int k=0;k<=5-i;k++)
	 {
	   System.out.print((i+k)+" ");
	  }
	  System.out.println();
	}
	
   }
}