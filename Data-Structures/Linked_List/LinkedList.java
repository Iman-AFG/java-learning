public class LinkedList {
    Node first;

    public void insertAtFirst(int data) {
		Node newNode = new Node(data);
		
		newNode.next = first;
		first = newNode;
		
	}
	
	public void insertAtLast(int data) {
		Node newNode = new Node(data);
		if(first == null) {
			newNode.next = first;
			first = newNode;
			return;
		}
		
		Node current = first;
				
		while( current.next != null ) {
			current = current.next;
		}
		
		current.next = newNode;
		
	}

	public void insertAfterKey(int data, int key) {
		Node newNode = new Node(data);
		
		if(first == null) {
			return;
		}
		
		Node current = first;
		
		while(current != null && current.data != key) {
			current = current.next;
		}
		
		if(current != null) {
		  newNode.next = current.next;
		  current.next = newNode;
		}
		
		
	}
   
	public Node deleteAtFirst() {
		if(first == null) return null;
		
		Node temp = first;
		first = first.next;
		
		return temp;
	}
	
	
	
	public Node deleteAtLast() {
		
		if(first == null) return null;
		
		Node current = first;
		Node previous = first;
		while(current.next != null) {
			previous = current;
			current = current.next;	
		}
		 previous.next = null;
		 return current;
	}
	
	
	
	public Node deleteWithKey(int key) {

		if(first == null) return null;

		Node c = first;
		Node p = first;
		
		while(c != null && c.data != key) {
			p =c; 
			c = c.next;
		}

		if(c != null) {
		p.next = c.next;
		return c;
		} else {
			return null;
		}
	}
	
	public void display() {
		Node current = first;
		
		while(current != null) {
			System.out.print(current.data+" ");
			current = current.next;
		}
	}
}
