class p25
{
	public static void main(String args [])
	{	
		for(int i=1;i<=5;i++)//Row
		{
			for(int j=6-i;j>i;j--)//Column
			
			{
				System.out.print("  ");
			}
			  for(int k=1;k<=i;k++)
			  {
				System.out.print(" * ");
			  }
		
			
			System.out.println();
		}
    }	 
}	
