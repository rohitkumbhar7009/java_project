class p22
{
	public static void main(String args [])
	{	
		for(int i=0;i<=5;i++)//Row
		{
			for(int j=5;j>=i;j--)//Column
			
			{
				System.out.print(" ");
			}
			  for(int k=1;k<=i;k++)
			  {
				System.out.print("*");
			  }
		
			
			System.out.println();
		}
    }	 
}	

