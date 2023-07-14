
package LinkedListTestExample;
//EXPECTED OUTPUT:
//    ----------------
//    Head: 42
//    Tail: 42
//    Length: 1
//    
//    Linked List:
//    42




public class LinkedList {
//CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE
	
//	Class Variables
	private Node head;
	private Node tail;
	private int length;
	
	
//	========================
//	Node class
	public class Node{		//EVERY NODE MUS HAVE TWO THINGS
		int value;			//THE VALUE THAT IT STORES
		Node next;			//AND THE POINTER TO THE NEXT NODE
	 
		Node(int value) {	//AND ALSO A CONSTUCTOR
			this.value = value;
		}
	}
//	a node class was nested within a linked list class to make the code cleaner
//	========================
	
//	Constructor
	public LinkedList(int value) {			//THE LINKED LIST MUST HAVE A CONSTRUCTOR
		Node nodey = new Node(value);		//WITH AN INSTANTIED NODE
		head = nodey;						//THE HEAD POINTS TO THE NEW NODE
		tail = nodey;						//THE TAIL POINTS TO THE NEW NODE
		length = 1;							//THIS IS MERELY THE LENGTH OF THE LINKED LIST
	}
	
//	THE HEAD AND THE TAIL POINT TO THE SAME NODE BECAUSE THE LINKEDLIST WAS EMPTY
	
	
	public void printList() {				//THIS WILL PRINT THE LINKED LIST
		Node trav = head;					//the reference pointer - THIS WILL POINT TO THE HEAD OF THE LIST
		if (trav == null || length == 0) {
			System.out.println("The list is empty");
		}
		System.out.println("Current list: ");
		while (trav != null) {
			System.out.println(trav.value);	//PRINT OUT THE VALUE AT THAT NODE
			trav = trav.next;				//GOES ON TO THE NEXT NODE
		}
	}

	public void getHead() {					//THIS WILL GET THE DATA OF THE NODE AT THE HEAD, IF THERE IS A HEAD
		if (head == null) {
			System.out.println("head is null");
		}else {
			System.out.println("head: " + head.value);
		}
	
	}
	
	public void getTail() {					///THIS WILL GET THE DATA OF THE NODE AT THE TAIL, IF THERE IS A TAIL
		if (tail == null) {
			System.out.println("tail is null");
		}else {
			System.out.println("tail: " + tail.value);
		}
	}
	
	public void getLength() {
		System.out.println("This list currently has " + length + " values.");
	}
	
	public void append(int value) {		//THIS METHOD WILL ADD A NODE TO THE END OF THE LIST, hence the name APpend
	Node nodey = new Node(value);	//the passed in value will be used to create a new node, if the list is empty
// If there are no nodes in the LinkedList.....
		if (length == 0) {
			head = nodey;						//THE HEAD POINTS TO THE NEW NODE
			tail = nodey;						//THE TAIL POINTS TO THE NEW NODE
		} else {		  //<<<<<<<< If there are nodes in the list...... 
		tail.next = nodey;			//THE TAIL'S NEXT POINTER WILL POINT TO THE NEW NODE
		tail = nodey;				//THE THE TAIL WILL POINT TO THE NEW NODE
		}
		length++;
		System.out.println("Adding " + value + " to the end.");
	}
	
	public void prepend(int value) {	//THIS METHOD WILL ADD A NODE TO THE FRONT OF THE LIST, hence the name PREpend
		Node nodeq = new Node(value);
//		if the list is empty
		if(length == 0) {
			head = nodeq;
			tail = nodeq;
		}else {				//the list has one or more nodes
			nodeq.next = head;
			head = nodeq;
		}
		length ++;
		System.out.println("Adding " + value + " to the front.");
		}

	public void removeFirst() {
//		WHY DOES REMOVE FIRST AND REMOVE LAST DELETE BOTH ELEMENTS WHEN IT GETS DOWN TO 2 ELEMENTS
//		if the list is empty
		if (length == 0) {
			System.out.println("List is null");
		}
		
//		if there is one node in the list
		if (length == 1) {
			head = null;
			tail = null;
			System.out.println("The list is now empty");
			length --;
		}
		
//		if there is more than one node in the list
//		else {
		if (length > 1) {
			Node trav = head;
			head = head.next;		//THIS MAKES THE HEAD POINT TO THE NEXT NODE, which makes that node the new head node
			System.out.println("We have removed the first node and now " + trav.value + " has been removed.");
			trav.next = null;		//THIS MAKES THE FIRST NODE POINT TO NOTHING, thus deleting this node
			length --;
		}
	} 
	
	public void removeLast() {
//		<<<<<<<< If there are no nodes in the LinkedList.....
		if (length == 0) {
			System.out.println("List is null");
		}
		
		if (length == 1){//<<<<<<<< If there is only one node in the list.....
//		head.next = null;
		head = null;
		tail = null;
		System.out.println("We have removed the last node and now this list is empty.");
		length--;
		}
		
		if (length > 1){ //<<<<<<<< If there are multiple nodes in the list.....
			Node trav = head;					//the reference pointer that will point to the head
			while (trav.next.next != null) {	//if the node two places over is not null
				trav = trav.next;				//go to the next node
			}							//at this point, we got to the node that has nothing two places over
			System.out.println("We have removed the last node and now " + trav.next.value + " has been removed.");
 			tail = trav;						//so now the tail points to the current node
 			trav.next = null;					//the node after this current is deleted
			length--;							//this makes the linked list length shorter
			 
		}
	}
	
	public Node get(int index) {
//		pass in an index......done
//		create a traversing loop that ends when the number is reached
		
		Node trav = head;
		if (index >= length) {
			System.out.println("Invalid index");
		}
		
		if (length == 0 ) {
			System.out.println("There is nothing in this list");
		}
		if (length == 1) {
			System.out.println("There is only one node in this list and its value it " + head.value);
		}
		else if (length > 1) {
			for (int i = 0; i < index; i++) {
				trav = trav.next;
			}
//		print the value of that index
		}
		System.out.print("The value at index " + index + " is " + trav.value);
		return trav;
//		return  trav will only get "returned" if from the main method, you run System.out.pringln(linky.get(4));
	}
	
	public boolean set(int index, int value) {
		if(index < 0 || index > length) {
			System.out.println("Index out of bounds or invalid");
			return false;
		} else {
		Node trav = head;				//This is the reference variable
		Node nodey = new Node(value);	//This is the new node that will replace an existing node.
		
//		this means at "INDEX x", make value a become c
//		get to the desired index
		for (int i = 0; i < index-1; i++) {
			trav = trav.next;
		}
		System.out.println("At the index of " + index + ", were gonna replace " + trav.next.value + " with " + nodey.value);
//		change the current value to the value given
		nodey.next = trav.next.next;
		trav.next = nodey;
		length++;
		return true;
		}
		
	}

	public boolean insert(int index, int value) {
		if (index < 0 || index > length) {
			System.out.println("Index out of bounds or invalid");
			return false;
		}
		else {
		Node trav = head;				//This is the reference variable
		Node nodey = new Node(value);	//This is the new node that will replace an existing node.
		
//		this means at "INDEX x", mwe will insert a new value
//		get to the desired index
		for (int i = 0; i < index-1; i++) {
			trav = trav.next;
		}
		nodey.next = trav.next;
		trav.next = nodey;
		
		System.out.println("We have now inserted " + value + " at index " + index);
		length++;
		return true;
		}
	}
	
	public void remove(int index) {
		if(index < 0 || index > length) {
			System.out.println("Index out of bounds or invalid");
		} else {
			Node trav = head;
			for (int i = 0; i < index-1; i++)
				trav = trav.next;
			
//			return trav.next;
		System.out.println("We have now removed " + trav.next.value + " at index " + index);
		trav.next = trav.next.next;
		length--;
//		return trav;
		}
		}
	
	public void reverse() {
		for(int i = length-1;i >= 0;i--) {
//			public Node get(int index);
//			continue from 3:43
		}
	}
	
	}
	
	




