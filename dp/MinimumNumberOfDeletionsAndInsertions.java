package dp;

public class MinimumNumberOfDeletionsAndInsertions {
	
	public int minOperations(String str1, String str2) 
	{ 
	    // Your code goes here
	    int n = str1.length();
	    int m = str2.length();
	    int dp[][] = new int[n+1][m+1];
	    for(int i = 1 ; i <= n ; i++ ){
	       for(int j = 1 ; j <= m ; j++ ){
	           if(str1.charAt(i-1) == str2.charAt(j-1)){
	               dp[i][j] = 1 + dp[i-1][j-1];
	           }
	           else{
	               dp[i][j] = Math.max(dp[i][j-1] , dp[i-1][j]);
	           }
	       }
	    }
	    
	    int ans = m + n - 2*dp[n][m];
	    
	    return ans;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
