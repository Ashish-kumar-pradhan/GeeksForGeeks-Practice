package dp;

public class GoldMineProblem {
	
	static int maxGold(int n, int m, int M[][])
    {
        // code here
        int dp[][] = new int[n+2][m+1];
        
        for(int i = 1 ; i <= m ; i++){
            for(int j = 1 ; j <= n ; j++){
                dp[j][i] = M[j-1][i-1] + Math.max(dp[j][i-1] , Math.max(dp[j-1][i-1] , dp[j+1][i-1]));
            }
        }
        
        int max = 0 ;
        for(int i = 1 ; i <= n ; i++){
            if(dp[i][m] > max) max = dp[i][m];
        }
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
