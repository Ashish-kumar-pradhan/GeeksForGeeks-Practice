package dp;

public class MinimumNumberDeletionsMakeSortedSequence {
	
	public int minDeletions(int arr[], int n) 
	{ 
	   //code here.
	   int dp[] = new int[n];
	   dp[0] = 1;
	   int oMax = 1;
	   for(int i = 1 ; i < n ; i++){
	       int preMax = 0;
	       for(int j = 0 ; j < i ; j++){
	           if(arr[i] > arr[j]){
	               if(preMax < dp[j]){
	                   preMax = dp[j]; 
	               } 
	           }
	       }
	       dp[i] = 1 + preMax;
	       if(dp[i] > oMax){
	          oMax = dp[i];
	       } 
	   }
	   return n - oMax;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
