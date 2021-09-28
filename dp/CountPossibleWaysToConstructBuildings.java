package dp;

public class CountPossibleWaysToConstructBuildings {
	
	 public int TotalWays(int N)
	    {
	        // Code here
	        int dp[][] = new int[2][N+1];
	        dp[0][1] = 1;
	        dp[1][1] = 1;
	        int mod = 1000000007;
	        for(int i = 2 ; i <= N ; i++){
	            dp[0][i] = dp[1][i-1];
	            dp[1][i] = (dp[0][i-1] + dp[1][i-1])%mod;
	        }
	        
	        long ans = (long)(dp[0][N] + dp[1][N])%mod;
	        long result = (ans*ans)%mod;
	        return (int)result;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
