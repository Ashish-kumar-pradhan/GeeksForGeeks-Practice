package dp;

public class CountNumberOfHops {
	
	static long countWays(int n)
    {
        // add your code here
        long dp[] = new long[n + 1];
        if(n <= 2){
            return n;
        }
        
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for(int i = 4 ; i <= n ; i++){
            dp[i] = (dp[i-1] + dp[i-2] + dp[i-3])%1000000007;
        }
        
        return dp[n];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
