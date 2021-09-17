package dp;

public class PathsToReachOrigin {
	
	public static int ways(int n, int m)
    {
        // complete the function
        int dp[][] = new int[n+2][m+2];
        for(int i = n ; i >= 0 ; i--){
            for(int j = m ; j >= 0 ; j--){
                 if(i == n && j == m) {
                     dp[i][j] = 1;
                 }
                 else {
                     dp[i][j] = (dp[i+1][j] + dp[i][j+1])%1000000007;
                 }
            }
        }
        
        return dp[0][0];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
