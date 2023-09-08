//finite loop
class Recursion5{
   // 0 1 1 2 3 5 8 13.....fibonacci  
  static  int fibonacci(int n)
  {
    if(n<=1)
		return 1;
	//fib(n)=fib(n-1)+fib(n-2);
	else
		return fibonacci(n-1)+ fibonacci(n-2);
 
 }

  


    public static void main(String args[]){


         System.out.println("Enter series fo 10 numbers:");
            for (int i=0;i<=100;i++){
			System.out.println(fibonacci(i)+ " ");	
			}
         }


}