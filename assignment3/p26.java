class p26
{
   public static void main(String args[])
   {
         for(int i=1;i<=10;i++) //row
		{
			for(int j=1;j<=i;j++)  //coloum        
			{
				System.out.print(" ");
			}
			for(int k=9;k>=i;k--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
    }
}