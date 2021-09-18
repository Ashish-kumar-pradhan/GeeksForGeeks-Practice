package dp;

public class StringSubsequence {
	
	int countWays(String S1, String S2) { 
        // code here 
        int n = S1.length();
        int m = S2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0 ; i <= n ; i++){
            dp[i][0] = 1;
        }
        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(S1.charAt(i-1) == S2.charAt(j-1)) {
                    dp[i][j] = dp[i-1][j] + dp[i-1][j-1];
                }
                else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        
        return dp[n][m];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
