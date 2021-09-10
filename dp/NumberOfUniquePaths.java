package dp;

public class NumberOfUniquePaths {
	
	public static int NumberOfPath(int a, int b) 
    {
        //Your code here
        int dp[][] = new int[a+1][b+1];
        for(int i = 1 ; i <= a ; i++){
            for(int j = 1 ; j <= b ; j++){
                 if(i == 1 && j == 1){
                     dp[i][j] = 1;
                 }
                 else {
                     dp[i][j] = dp[i-1][j] + dp[i][j-1];
                 }
            }
        }
        return dp[a][b];
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
