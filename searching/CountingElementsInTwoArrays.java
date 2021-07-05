package searching;

import java.util.ArrayList;
import java.util.Arrays;

public class CountingElementsInTwoArrays {
	
	static void Help(int arr[] , int i , int j , int[] ind , int k){
        if(i > j){
            return;
        }
        int mid = (i + j)/2;
        if(arr[mid] <= k){
            if(arr[mid+1] > k) {
                ind[0] = mid + 1;
                return;
            }
            else {
                Help(arr , mid + 1 , j , ind , k);
            }
        }
        else if(arr[mid] > 1){
            if(arr[mid-1] <= k) {
                ind[0] = mid;
                return;
            }
            else {
                Help(arr , i , mid - 1 , ind , k);
            }
        }
    }
	public static ArrayList<Integer> countEleLessThanOrEqual(int arr1[], int arr2[], int m, int n)
	{
	   // add your code here
	   
	   Arrays.sort(arr2);
	   
	   ArrayList<Integer> ans = new ArrayList<>();
	   
	   for(int i = 0 ; i < m ; i++){
	       if(arr1[i] < arr2[0]){
	           ans.add(0);
	       }
	       else if(arr1[i] >= arr2[n-1]){
	           ans.add(n);
	       }
	       else {
	           int ind[] = {0};
	           Help(arr2 , 0 , n - 1 , ind , arr1[i]);
	           ans.add(ind[0]);
	       }
	   }
	   return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
