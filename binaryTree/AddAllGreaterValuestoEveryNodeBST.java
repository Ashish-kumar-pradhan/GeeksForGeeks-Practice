package binaryTree;

public class AddAllGreaterValuestoEveryNodeBST {
	
	int p;
    void mod(Node root){
        if(root == null){
            return;
        }
        
        mod(root.right);
        root.data = root.data + p;
        p = root.data;
        mod(root.left);
    }
    public Node modify(Node root)
    {
        mod(root);
        return root;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
