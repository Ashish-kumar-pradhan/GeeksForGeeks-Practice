package dp;

public class WaysToWriteNSum {
	
	int countWays(int n)
    {
    
         // your code here
         int[] dp = new int[n+1];
         dp[0] = 1;
         for(int i = 1 ; i <= n ; i++){
             for(int j = i ; j <= n ; j++){
                 dp[j] = (dp[j] + dp[j-i])%1000000007;
             }
         }
         
         return dp[n] - 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
