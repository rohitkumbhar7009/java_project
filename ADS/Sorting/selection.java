class Sorting
{
   void selectionsort(int a1[])
{
	int n = a1.length;
	for(int i=0;i<=n-1;i++)
	{
		int min=i;
		for(int j=i+1;j<n;j++)
		{
			if(a1[j] < a1[min])
				min = j;
		}
		//swapping
				int temp = a1[min];
				a1[min] = a1[i];
				a1[i]=temp;
		
				
			
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
     Sorting p1=new Sorting();
	 int a1[]={25,75,30,40,90,101,180,200};
	 p1.selectionsort(a1);
	 p1.display(a1);
  
  
  
  }






}