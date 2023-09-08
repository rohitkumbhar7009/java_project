class p215
{
  public static void main(String args[])
  {
   for (int i=1;i<=5;i++)
   {
     for (int j=1;j<=i;j++)
	 {
	    System.out.print("*");
	
	   if  (i==3)
	   {
	    System.out.print(" ");
		j++;
		}
		else if
		(i==4)
		{
		System.out.print("  ");
		j+=2;
		}
      }
	  System.out.println();
    }
  }
}
   