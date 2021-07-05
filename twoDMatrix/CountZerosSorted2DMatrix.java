package twoDMatrix;

public class CountZerosSorted2DMatrix {
	
	 int countZeros(int A[][], int N){
	        // Your code here
	        int i = 0;
	        int j = N - 1;
	        int ans = 0;
	        while(i < N){
	            while(j >= 0 && A[i][j] == 1){
	                j--;
	            }
	            ans = ans + j + 1;
	            i++;
	        }    
	        return ans;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
