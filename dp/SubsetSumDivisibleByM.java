package dp;

public class SubsetSumDivisibleByM {
	
	public int DivisibleByM(int[] arr, int m)
    {
        
        int N = arr.length;
        int[][] dp = new int[N+1][1006];
        
        for(int i=1; i<=N; i++)
        for(int j=1; j<=1005; j++)
        {
            if(arr[i-1] > j) {   
                dp[i][j] = dp[i-1][j];
            }
            else if(arr[i-1]==j){
                dp[i][j] = 1;
            }
            else{
                dp[i][j] = (dp[i-1][j] | dp[i-1][j-arr[i-1]]);
            }
        }        
        
        for(int i = m ; i < 1006 ; i = i + m){
            if(dp[N][i] == 1){
                return 1;
            }
        }
        
        return 0;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
