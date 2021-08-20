package arrays;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
	
	static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int curSum = arr[0];
        int l = 0;
        int f = 0;
        while(f < n && l < n){
            if(curSum == s){
                ans.add(l+1);
                ans.add(f+1);
                break;
            }
            if(l == f && curSum > s){
                l++;
                f++;
                if(f < n) curSum = arr[f];
            }
            else if(curSum < s){
               f++;
               if(f < n) curSum += arr[f];
            }
            else if(curSum > s){
                l++;
                curSum -= arr[l - 1];
            }
        }
        if(ans.size() == 0){
            ans.add(-1);
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
