package dp;

public class NumberOfCoins {
	
	public int minCoins(int coins[], int M, int V) 
	{ 
	    // Your code goes here 
	    int dp[] = new int[V+1];
	    for(int i = 1; i <= V ; i++){
	        int min = 1000000;
	        for(int j = 0; j < M ; j++){
	            if(i >= coins[j] && min > dp[i-coins[j]]){
	                min = dp[i-coins[j]];
	            }
	        }
	        dp[i] = 1 + min;
	    }
	    if(dp[V] > 1000000) return -1;
	    return dp[V];
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
