class LL{
	Node head; //head create
	private int size; //new variable
	 LL(){
		 
		 this.size =0;
	 }
	class Node{
		String data;
		Node next;
		
		Node(String data){
			
			this.data = data;
			this.next = null;
			size++;
			
			
			
		}
		
	}
	//add First,Last
	public void addFirst(String data){
		Node newNode=new Node(data);
		if(head==null){
	    head=newNode;
			return;
			
			
		}
		newNode.next =head;
		head=newNode;
	}
	public void addLast(String data){
		Node newNode=new Node(data);
		if(head==null){
			
			head=newNode;
			return;
		}
		Node currNode=head; //new node create and head value assign
		while(currNode.next != null){
			currNode = currNode.next;
		}
		currNode.next = newNode; //last add new node
	}
	//print
	public void printList(){
		if(head==null){
			System.out.println("List is empty");
			return;
			
		}
		Node currNode=head; 
		while(currNode != null){
			System.out.print(currNode.data+" ->");
			currNode = currNode.next;
		}
		System.out.println("Null");
		
	}
	//delete first
	public void deleteFirst(){
		if (head==null){
			System.out.println("The list is emoty");
			return;
			
		}
		 size--;
		 head=head.next;
		
		
		
	}
	//delete Last
	public void deleteLast(){
		if (head==null){
			System.out.println("The list is empty");
			return;
		}
		size--;
		if(head.next==null){
			
			head=null;
			return;
		}
		Node secondLast =head;
		Node lastNode =head.next; //head.next=null ->lastNode=null
		while(lastNode.next != null){ 
			lastNode=lastNode.next;
			secondLast =secondLast.next;
		}
		secondLast.next=null;
	}
	public int size(){
		
		return size;
	}
	public static void main(String args[]){
		
		LL list=new LL();
		list.addFirst("Stop");
		list.addFirst("can");
		list.printList();
		 
		 list.addLast("Us");
		 list.printList();
		 
		 list.addFirst("Body");
		 list.addFirst("No");
		 list.printList();
		 
		list.deleteFirst();
		list.printList();
		
		list.deleteLast();
		list.printList();
		
		System.out.println(list.size());
		list.addFirst("NO");
		System.out.println(list.size());
	}
	
	
	
}