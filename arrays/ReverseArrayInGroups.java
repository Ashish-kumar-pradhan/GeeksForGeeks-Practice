package arrays;

import java.util.ArrayList;

public class ReverseArrayInGroups {
	
	void reverse(ArrayList<Integer> arr, int n , int i , int j) {
        int m = (i + j)/2;
        
        for(int k = i ; k <= m ; k++){
            int temp = arr.get(k);
            arr.set(k ,arr.get(j + i - k));
            arr.set(j + i - k , temp);
        }
        
    }
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int i = 0;
        int j = 0 ;
        while(i < n){
            j += k;
            if(j >= n){
                j = n;
            }
            reverse(arr , n , i , j-1);
            i += k;
            
        }
        

    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
