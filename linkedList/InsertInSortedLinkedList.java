package linkedList;

public class InsertInSortedLinkedList {
	
	Node sortedInsert(Node head, int key) {
        // Add your code here.
        Node newNode = new Node(key);
        if(head.data > key){
            newNode.next = head;
            head = newNode;
        }
        else {
            Node temp = head;
            while(temp.next != null && temp.next.data < key){
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
