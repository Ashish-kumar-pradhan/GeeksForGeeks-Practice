package linkedList;

public class SegregateEvenAndOddNodesLinkedList {
	
	Node divide(int N, Node head){
        
        Node temp = head;
        Node he = null;
        Node pre = null;
        while(temp != null){
            if(temp.data % 2 == 0){
                Node newNode = new Node(temp.data);
                if(pre == null){
                    he = newNode;
                }
                else {
                    pre.next = newNode;
                }
                
                pre = newNode;
            }
            
            temp = temp.next;
            
        }
        
        temp = head;
        
        while(temp != null){
            if(temp.data % 2 != 0){
                Node newNode = new Node(temp.data);
                if(pre == null){
                    he = newNode;
                }
                else {
                    pre.next = newNode;
                }
                
                pre = newNode;
            }
            
            temp = temp.next;
            
        }
        
        return he;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
