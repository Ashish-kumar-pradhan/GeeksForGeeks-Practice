package searching;

import java.util.ArrayList;

public class LeadersInArray {
	
	static ArrayList<Integer> leaders(int arr[], int n){
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        int max = -1;
        for(int i = n - 1 ; i >= 0 ; i--){
            if(arr[i] >= max){
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        for(int i = 0 ; i < ans.size()/2 ; i++){
            int temp = ans.get(i);
            ans.set(i , ans.get(ans.size() - 1 -i));
            ans.set(ans.size() - 1 -i , temp) ;
        }
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
