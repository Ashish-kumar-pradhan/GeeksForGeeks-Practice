package binaryTree;

public class CountLeavesInBinaryTree {
	
	int countLeaves(Node node) 
    {
         // Your code 
         if(node == null){
             return 0;
         }
         if(node.left == null && node.right == null){
             return 1;
         }
         
         return countLeaves(node.left) + countLeaves(node.right);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
