package dp;

public class SkipTheWork {
	
	public int minAmount(int A[] , int N)
    {
        //code here.
        int dp[] = new int[N+1];
        dp[1] = A[0];
        for(int i = 2 ; i <= N ; i++){
            dp[i] = A[i-1] + Math.min(dp[i-1] , dp[i-2]);
        }
        
        return Math.min(dp[N] , dp[N-1]);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
