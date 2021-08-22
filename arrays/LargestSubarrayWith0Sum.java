package arrays;

import java.util.HashMap;

public class LargestSubarrayWith0Sum {
	
	int maxLen(int arr[], int n)
    {
        // Your code here
        int sum[] = new int[n + 1];
        HashMap<Integer , Integer> hp = new HashMap<>();
        sum[0] = 0;
        
        for(int i = 1 ; i <= n ; i ++){
            sum[i] = sum[i-1] + arr[i-1];
        }
       
        int max = 0;
        for(int i = 0 ; i <= n ; i ++){
            if(hp.containsKey(sum[i])){
                if(i - hp.get(sum[i]) > max){
                    max = i - hp.get(sum[i]); 
                }
            }
            else {
                hp.put(sum[i] , i);
            }
        }
        
        return max;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
