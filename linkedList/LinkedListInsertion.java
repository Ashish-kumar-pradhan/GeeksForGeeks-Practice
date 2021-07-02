package linkedList;

public class LinkedListInsertion {
	
	Node insertAtBeginning(Node head, int x)
    {
        // code here
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
        
        return head ;
    }
    
 
    Node insertAtEnd(Node head, int x)
    {
        // code here
        Node temp = head;
        Node newNode = new Node(x);
        if(temp == null){ 
           head = newNode;
        }
        else{
           while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode; 
        }
        
        return head;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
