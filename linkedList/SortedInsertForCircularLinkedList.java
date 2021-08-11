package linkedList;

public class SortedInsertForCircularLinkedList {
	
	public static Node sortedInsert(Node head,int data)
    {
       //add code here.
       
       Node newNode = new Node(data);
       Node temp = head;
       if(newNode.data < head.data){
           while(temp.next != head){
               temp = temp.next;
           }
           newNode.next = head;
           temp.next = newNode;
           head = newNode;
       }
       else {
           while(temp.next != head && temp.next.data < newNode.data){
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
