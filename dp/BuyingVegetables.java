package dp;

public class BuyingVegetables {
	
	static int minCost(int N, int cost[][]) {
        // code here
        int dp[][] = new int[N+1][3];
        for(int i = 1 ; i <= N ; i++){
            dp[i][0] = cost[i-1][0] + Math.min(dp[i-1][1] , dp[i-1][2]);
            dp[i][1] = cost[i-1][1] + Math.min(dp[i-1][0] , dp[i-1][2]);
            dp[i][2] = cost[i-1][2] + Math.min(dp[i-1][0] , dp[i-1][1]);
        }
        
        return Math.min(dp[N][0] , Math.min(dp[N][1] , dp[N][2]));
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
