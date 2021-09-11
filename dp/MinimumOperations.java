package dp;

public class MinimumOperations {
	
	public int minOperation(int n)
    {
        //code here.
        int dp[] = new int[n+1];
        for(int i = 1 ; i <= n ; i++){
            if(i%2==0){
                dp[i] = 1 + Math.min(dp[i-1] , dp[i/2]);
            }
            else {
                dp[i] = 1 + dp[i-1];
            }
        }
        return dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
