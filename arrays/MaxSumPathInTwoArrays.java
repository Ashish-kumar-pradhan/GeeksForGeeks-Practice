package arrays;

public class MaxSumPathInTwoArrays {
	
	int maxPathSum(int ar1[], int ar2[])
    {
        // Your code here
        int n = ar1.length;
        int m = ar2.length;
        int i = 0;
        int j = 0;
        int sum1 = 0;
        int sum2 = 0;
        int ts = 0;
        while(i < n || j < m){
            if(i >= n){
                while (j < m){
                    sum2 += ar2[j++];
                }
            }
            else if(j >= m){
                while (i < n){
                    sum1 += ar1[i++];
                }
            }
            else {
                if(ar2[j] < ar1[i]){
                    sum2 += ar2[j++];
                }
                else if(ar2[j] > ar1[i]){
                    sum1 += ar1[i++];
                }
                else {
                    ts = ts + ar1[i] + Math.max(sum1 , sum2);
                    i++;
                    j++;
                    sum1 = 0;
                    sum2 = 0;
                }
            }
        }
        
        ts = ts + Math.max(sum1 , sum2);
        
        return ts;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
