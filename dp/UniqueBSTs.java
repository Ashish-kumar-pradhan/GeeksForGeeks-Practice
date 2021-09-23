package dp;

public class UniqueBSTs {
	
	static int numTrees(int N)
    {
        // Your code goes here
        
        long dp[] = new long[N+1];
        dp[0] = 1;
        dp[1] = 1;
        long mod = 1000000007;
        for(int i = 2 ; i <= N ; i++){
            long val = 0;
            for(int j = 0 ; j < i ; j++){
                val = (dp[i - j - 1]*dp[j])%mod;
                dp[i] = (dp[i] + val)%mod;
            }
        }
        
        return (int)dp[N];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
