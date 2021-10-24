package linkedList;

public class DoublyLLInsertionatGivenPosition {
	
	void addNode(Node head_ref, int pos, int data)
	{
		// Your code here
		Node temp = head_ref;
		Node newNode = new Node(data);
		int i = 0;
		while(i != pos){
		    temp = temp.next;
		    i++;
		}
		
		if(temp.next != null){
		    Node old = temp.next;
		    newNode.next = old;
		    old.prev = newNode;
		}
		
		temp.next = newNode;
		newNode.prev = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
