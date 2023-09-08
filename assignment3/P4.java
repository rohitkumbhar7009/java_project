
class P4
{
	public static void main(String args [])
	{	
	    int a=65;
	  
		for(int i=1;i<=5;i++)//Row
		{
			for(int j=1;j<=i;j++)//Column
			{
				System.out.print((char)(a+i)+" ");
				
			}
			System.out.println();
		}
		
	}
}

       