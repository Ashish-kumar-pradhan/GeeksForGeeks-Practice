package arrays;

public class DoublingTheValue {
	
	long solve(int n, long A[], long b)
    {
        // Complete this function
        for(int i = 0 ; i < n ; i++){
            if(b == A[i]){
                b *= 2;
            }
        }
        
        return b;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
