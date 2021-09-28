package dp;

public class Consecutive1sNotAllowed {
	
	long countStrings(int n) {
        // code here
        
        long dp[][] = new long[2][n+1];
        dp[0][1] = 1;
        dp[1][1] = 1;
        long mod = 1000000007;
        for(int i = 2 ; i <= n ; i++){
            dp[0][i] = dp[1][i-1];
            dp[1][i] = (dp[0][i-1] + dp[1][i-1])%mod;
        }
        
        long ans = (dp[0][n] + dp[1][n])%mod;
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
