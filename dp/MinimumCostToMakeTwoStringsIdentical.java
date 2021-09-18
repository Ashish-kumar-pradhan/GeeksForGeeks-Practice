package dp;

public class MinimumCostToMakeTwoStringsIdentical {
	
	public int findMinCost(String X, String Y, int costX, int costY)
	{
		// Your code goes here
		int n = X.length();
	    int m = Y.length();
	    int dp[][] = new int[n+1][m+1];
	    for(int i = 1 ; i <= n ; i++ ){
	       for(int j = 1 ; j <= m ; j++ ){
	           if(X.charAt(i-1) == Y.charAt(j-1)){
	               dp[i][j] = 1 + dp[i-1][j-1];
	           }
	           else{
	               dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
	           }
	       }
	    }
	    
	    int cX = (n - dp[n][m])*costX;
	    int cY = (m - dp[n][m])*costY;
	    int ans = cX + cY;
	    
	    return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
