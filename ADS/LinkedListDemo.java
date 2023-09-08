import java.util.*;
import java.util.ListIterator; 

class LinkedListDemo{
	public static void main(String[] args){
		
		LinkedList <String> L1 = new LinkedList<String>();
		L1.add("Helo");
		L1.add("Hello");
		L1.addFirst("Hi");
		L1.addLast("GoodBye");
		System.out.println(L1);
		ListIterator L1_Iter = L1.listIterator(1);
		while(L1_Iter.hasNext()){ 

           System.out.print(L1_Iter.next()); 

        }
		System.out.println(" ");
		Iterator i = L1.descendingIterator();
		while (i.hasNext()){
			System.out.print(i.next());
		}
		L1.add(1," .. .. ");
		L1.peekFirst();
		L1.peekLast();
		L1.remove(0);
		L1.removeFirst();
		L1.removeLast();
		//L1.swap(element1, element2);
		LinkedList <String> L2 = new LinkedList<String>();
		L2.add(".. .. ..");
		L2.add(",. .. .,");
		LinkedList <String> L3 = new LinkedList<String>();
		L3.addAll(L1);
		L3.addAll(L2);
		System.out.println(L3);
		System.out.println(L3.contains("Hello"));
		System.out.println(L3.isEmpty());
		L3.set(2,"HH");
		System.out.println(L3);
	}
}


  
