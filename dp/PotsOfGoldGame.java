package dp;

public class PotsOfGoldGame {
	
	public static int maxCoins(int arr[],int n)
	{
          //add code here.
        int dp[][] = new int[n][n];
        dp[0][0] = arr[0];
        int sum = arr[0];
        for(int i = 1 ; i < n ; i++){
            sum += arr[i];
            dp[i][i] = arr[i];
            if(arr[i-1] > arr[i]) {
                dp[i-1][i] = arr[i-1];
            }
            else {
                dp[i-1][i] = arr[i];
            }
        }
        for(int i = 2 ; i < n ; i++){
            for(int j = 0 ; i + j < n ; j++){
                int op1 = arr[i+j] + Math.min(dp[j+1][i+j-1] , dp[j][i+j-2]);
                int op2 = arr[j] + Math.min(dp[j+1][i+j-1] , dp[j+2][i+j]);
                dp[j][i+j] = Math.max(op1 , op2);
            }
        }
        
       return dp[0][n-1];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
