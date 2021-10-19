package arrays;

import java.util.HashMap;

public class LargestSubarrayOf0sAnd1s {
	
	int maxLen(int[] arr, int N)
    {
        // Your code here
        HashMap<Integer,Integer> hp = new HashMap<>();
        hp.put(0 , -1 );
        int max = 0;
        int sum = 0;
        for(int i = 0 ; i < N ; i++){
            if(arr[i] == 1){
                sum += 1;
            }
            else {
                sum -= 1;
            }
            if(hp.containsKey(sum)){
                int dif = i - hp.get(sum);
                if(max < dif){
                    max = dif;
                }
            }
            else {
                hp.put(sum , i);
            }
        }
        
        return max;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
