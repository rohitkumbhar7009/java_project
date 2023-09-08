class LinkedList{
     Node head; // head pointer
    static class Node
	
	{
	 int data;
	 Node next;
	//define node
	 Node (int d)
	 {
	   data =d;
	   next=null;
	 
	 }
 }

   void display(){  //function
  
	  Node n = head;
    while (n != null){	 
        System.out.println(n.data);
         n=n.next;
	  }


  
  }



   public static void main(String args[]){
   
   LinkedList l1=new LinkedList ();
    l1.head = new Node(10);
	Node second = new Node(20);  //Node and reference pointer connect
	Node third =new Node(30);
	
	l1.head.next = second;  //Link establish
	second.next=third;
	l1.display();
	
   
   
   
   
   
   
   
   }


}








