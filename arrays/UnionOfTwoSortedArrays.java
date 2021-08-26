package arrays;

import java.util.ArrayList;

public class UnionOfTwoSortedArrays {
	
	public static ArrayList<Integer> findUnion(int arr1[], int arr2[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int i = 0;
        int j = 0;
        while(i < n || j < m){
            int s = ans.size();
            int v = 0;
            if(i >= n){
                v = arr2[j++];
            }
            else if(j >= m){
                v = arr1[i++];
            }
            else if(arr1[i] == arr2[j]){
                v = arr1[i++];
                j++;
            }
            else if(arr1[i] < arr2[j]){
                v = arr1[i++];
            }
            else if(arr1[i] > arr2[j]){
                v = arr2[j++];
            }
            
            if(s == 0 || ans.get(s-1) != v){
                ans.add(v);
            }
        }
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
