class Sorting
{
  void insertionsort(int a1[])	
{
	int n = a1.length;
	for(int i=1;i<n;i++)
	{
		int k = a1[i];
		int j = i-1;
		
		while(j>=0 && a1[j]>k)
		{
			a1[j+1]=a1[j];
			j=j-1;
			
			
		}
		a1[j+1]=k;
	}
}

 void display(int a1[])
 {
		int n = a1.length;
		for(int i=0;i<n;i++)
		{
			System.out.print(a1[i]+" ");
		}
	}
	
  public static void main(String args[])
  {
     Sorting r1=new Sorting();
	 int a1[]={999,409,307,228,152,201,0};
	 r1.insertionsort(a1);
	 r1.display(a1);
  
  
  }
  






}