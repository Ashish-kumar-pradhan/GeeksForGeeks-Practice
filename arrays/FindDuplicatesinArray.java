package arrays;

import java.util.ArrayList;

public class FindDuplicatesinArray {
	
	public static ArrayList<Integer> duplicates(int arr[], int n) {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int count[] = new int[n];
        for(int i : arr){
            count[i]++;
        }
        for(int i = 0 ; i < n ; i++){
            if(count[i] > 1){
                ans.add(i);
            }
        }
        
        if(ans.size() == 0){
            ans.add(-1);
        }
        
        return ans ;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
