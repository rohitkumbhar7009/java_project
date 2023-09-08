class Sorting
{
  
  void bubbleSort(int a1[])
{

   int n=a1.length;
   for(int i=0;i<n;i++)
   {
       for(int j=0;j<n-i-1;j++)
	  {
	  
	    if(a1[j] > a1[j+1])
		{
	  
	      int temp= a1[j];
	      a1[j]=a1[j+1];
	      a1[j+1]=temp;
	   
	  
	    }
	  
	   }
    }
  }

   
   void display(int a1[])
	{
	    int n=a1.length;
		for(int i=0;i<n;i++)
		{
		   System.out.println(a1[i]+" ");
		}
	   
	   
    }

   public static void main(String args[])
   {
	 
	  Sorting s1 = new Sorting();
	  int a1[]={7009,7256,2500,4009};
	  s1.bubbleSort(a1);
	  s1.display(a1);
	  
	 
	 }
}