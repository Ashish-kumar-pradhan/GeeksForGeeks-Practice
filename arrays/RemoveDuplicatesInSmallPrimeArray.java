package arrays;

import java.util.ArrayList;

public class RemoveDuplicatesInSmallPrimeArray {
	
	ArrayList<Integer> removeDuplicate(int arr[], int n)
    {
        // code here
        int check[] = new int[101];
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i = 0 ; i < n ; i++){
            if(check[arr[i]] != 1){
                ans.add(arr[i]);
                check[arr[i]] = 1;
            }
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
