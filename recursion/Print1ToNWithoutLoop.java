package recursion;

public class Print1ToNWithoutLoop {
	
	public void printNos(int N)
    {
        //Your code here
        if(N == 0){
            return ;
        }
        printNos(N-1);
        System.out.print(N + " ");
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
