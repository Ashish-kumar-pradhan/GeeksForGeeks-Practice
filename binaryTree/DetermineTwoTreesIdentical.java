package binaryTree;

public class DetermineTwoTreesIdentical {
	
	boolean isIdentical(Node root1, Node root2)
	{
	    // Code Here
	    if(root1 == null && root2 == null){
	        return true;
	    }
	    if(root1 == null || root2 != null){
	        return false;
	    }
	    
	    if(root1.data != root2.data){
	        return false;
	    }
	    
	    return isIdentical(root1.left , root2.left) && isIdentical(root1.right , root2.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
