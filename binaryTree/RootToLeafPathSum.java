package binaryTree;

public class RootToLeafPathSum {
	
	boolean hasPathSum(Node root, int S) {
        // Your code here
        if(root == null){
            if(S == 0){
               return true;
            }
            else {
                return false;
            }
        }
        
        boolean lf = hasPathSum(root.left , S - root.data);
        boolean rh = hasPathSum(root.right , S - root.data);
        
        return lf || rh;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
