class P6
{
	public static void main(String args[])
	{
		for(int i=1;i<=5;i++)//Row
		{
			for(int l=4;l>=i;l--)//Column 
			{
				System.out.print("  ");
				
			}
				
				
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			
			for (int j = 0; j <= i; j++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
			
		}
	}
}
