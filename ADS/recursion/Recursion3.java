//finite loop
class Recursion3{
     
  static  int display(int n)//4
  {
     if(n==4)
		 return n;
	 else
		 return 2*display(n-1);//3//2//1
  
 
 
 }

  


    public static void main(String args[]){


         System.out.println(display(7));

         }

}