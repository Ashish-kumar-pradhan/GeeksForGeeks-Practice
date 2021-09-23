package dp;

public class CountWaysToNthStair {
	
	Long countWays(int m)
    {
        // your code here
        long dp[] = new long[m+1];
        dp[0] = 1;
        for(int i = 1 ; i <= m ; i++){
            dp[i] = dp[i-1];
        }
        for(int i = 2 ; i <= m ; i++){
            dp[i] += dp[i-2];
        }
        
        return dp[m];
    }    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
