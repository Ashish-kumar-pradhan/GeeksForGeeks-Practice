package linkedList;

public class CompareTwoLinkedLists {
	
	int compare(Node node1, Node node2)
    {
      //Your code here
      Node temp1 = node1;
      Node temp2 = node2;
      while(temp1.next != null || temp2.next != null){
          if(temp1.next == null){
              return -1;
          }
          if(temp2.next == null){
              return 1;
          }
          
          if(temp1.data < temp2.data){
              return -1;
          }
          
          if(temp1.data > temp2.data){
              return 1;
          }
          
          temp1 = temp1.next;
          temp2 = temp2.next;
      }
      
      return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
