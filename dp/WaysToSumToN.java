package dp;

public class WaysToSumToN {
	
	public int countWays(int arr[], int m, int N) 
    { 
       //code here.
       int dp[] = new int[N+1];
       dp[0] = 1;
       for(int i = 1 ; i <= N ; i++){
           int sum = 0;
           for(int j = 0 ; j < m ; j++){
                if(i >= arr[j]){
                    sum = (sum + dp[i-arr[j]])%1000000007;
                }
           }
           dp[i] = sum;
       }
       return dp[N];
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
