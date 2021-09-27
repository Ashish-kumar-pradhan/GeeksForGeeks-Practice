package dp;

public class MinCoin {
	
	 public int MinCoin(int[] nums, int amount)
	    {
	        // Code here
	        int dp[] = new int[amount+1];
		    for(int i = 1; i <= amount ; i++){
		        int min = 1000000;
		        for(int j = 0; j < nums.length ; j++){
		            if(i >= nums[j] && min > dp[i-nums[j]]){
		                min = dp[i-nums[j]];
		            }
		        }
		        dp[i] = 1 + min;
		    }
		    if(dp[amount] > 1000000) return -1;
		    return dp[amount];
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
