package linkedList;

public class DeleteKeysInALinkedList {
	
	public static Node deleteAllOccurances(Node head, int x)
    {
        // Your code here
        while(head != null && head.data == x){
            head = head.next;
        }
        
        Node temp = head;
        while(temp != null){
            Node pre = temp;
            temp = temp.next;
            while(temp != null && temp.data == x){
                temp = temp.next;
            }
            pre.next = temp;
        }
        
        return head;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
