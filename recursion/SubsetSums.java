package recursion;

import java.util.ArrayList;
import java.util.Collections;

public class SubsetSums {
	
	void subSum(ArrayList<Integer> arr, int n , int i , int sum , ArrayList<Integer> ans){
        if(i == n){
            ans.add(sum);
            return;
        }
        subSum(arr , n , i + 1 ,sum ,  ans);
        subSum(arr , n , i + 1 ,sum + arr.get(i) ,  ans);
    }
    
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int n){
        ArrayList<Integer> ans = new ArrayList<>();
        subSum(arr , n , 0 ,0 ,  ans);
        Collections.sort(ans);
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
