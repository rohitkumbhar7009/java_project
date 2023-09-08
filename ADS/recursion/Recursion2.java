//finite loop
class Recursion2{
     static int i=0;
  static  void display(){
  ++i;//limit base condion
  if (i<=9) 
  {
 
 System.out.println("Hii Everyone!!!");
  display();
  
 }

  }


    public static void main(String args[]){


          display();





}

}