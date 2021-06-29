package linkedList;

public class NodeGivenIndexLL {
	
	public static int getNth(Node node, int ind)
    {
   
       int i = 1;
       Node temp = node;
       while(temp != null){
           if(i == ind){
               return temp.data;
           }
           temp = temp.next;
           i++;
       }
       return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
