//finite loop
class Recursion4{
     
  static  int fact(int n)
  {
    if(n<=1)
		return 1;
	else
		return n*fact(n-1);
 
 }

  


    public static void main(String args[]){


         System.out.println(fact(7));//5040

         }

}
/*7!=7*6!
    =7*6*5!
	=7*6*5*4!
	=7*6*5*4*3!
	=7*6*5*4*3*2!
	=7*6*5*4*3*2*1!
	=7*6*5*4*3*2*1*0!
	=7*6*5*4*3*2*1*1 */