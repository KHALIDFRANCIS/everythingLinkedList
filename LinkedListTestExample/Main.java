package LinkedListTestExample;

//EXPECTED OUTPUT:
//    ----------------
//    Head: 42
//    Tail: 42
//    Length: 1
//    
//    Linked List:
//    42

public class Main {
	
	public static void main(String[] args) {
		 LinkedList linky = new LinkedList(42);		//THIS WILL CREATE A NEW INSTANCE OF THE LINKED LIST CLASS
//		 LinkedList linky = new LinkedList(45);
		 
		 linky.append(6);
		 linky.append(34);
		 linky.append(56);
		 linky.append(97);
		 linky.append(17);
		 linky.append(8);
		 linky.append(1);
		 linky.append(4);
		 linky.append(2);
		 linky.prepend(24);
		 linky.append(5);
		 linky.append(7);
		 linky.append(3);
		 linky.getHead();							//THIS WILL RUN THE METHODS WITHIN THE LINKED LIST CLASS
		 linky.getTail();
		 linky.printList();
		 System.out.println("\n========== ");
		 
		 linky.removeLast();
		 linky.printList();
		 System.out.println("\n========== ");
		 
		 linky.removeFirst();
		 linky.printList();
		 System.out.println("\n========== ");
		 
		 linky.set(4, 483868989);
//		 
//		 linky.removeLast();
		 linky.printList();
		 System.out.println("\n========== ");
//		 
		 linky.insert(6, 423789);
//		 linky.removeFirst();
		 linky.printList();
		 System.out.println("\n========== ");
		 
		 linky.remove(5);
		 
//		 linky.get(4);
		 
//		 linky.removeLast();
		 linky.printList();
//		 System.out.println("\n========== ");
//		 
//		 linky.removeFirst();
//		 linky.printList();
//		 System.out.println("\n========== ");
//		 
//		 linky.removeLast();
//		 linky.printList();
//		 System.out.println("\n========== ");
//		 
//		 
//		 linky.removeFirst();
//		 linky.printList();
//		 System.out.println("\n========== ");
////		 
//		 linky.removeLast();
//		 linky.printList();
//		 System.out.println("\n========== ");
////		 
//		 linky.removeFirst();
//		 linky.printList();
//		 System.out.println("\n========== ");
//		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 linky.getLength();
//		 linky.printList();
//		 linky.removeLast();
//		 System.out.println("\n========== ");
//		 
//		 linky.getLength();
//		 linky.printList();
//		 linky.removeLast();
//		 System.out.println("\n========== ");
//		 
//		 linky.getLength();
//		 linky.printList();
//		 linky.removeLast();
//		 System.out.println("\n========== ");
//		 
//		 linky.getLength();
//		 linky.printList();
//		 linky.removeLast();
//		 System.out.println("\n========== ");
//		 
//		 linky.getLength();
//		 linky.printList();
//		 linky.removeLast();
//		 System.out.println("\n========== ");
//		 
		 
		 
	
		
	}

}
