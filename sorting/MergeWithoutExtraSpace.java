package sorting;

import java.util.Arrays;

public class MergeWithoutExtraSpace {
	
	static void swap(long arr1[] , long arr2[] , int nI , int mI){
        long temp = arr1[nI];
        arr1[nI] = arr2[mI];
        arr2[mI] = temp;
    }
    public static void merge(long arr1[], long arr2[], int n, int m) 
    {
        // code here 
        int gap = n + m;
        while(gap > 1){
            gap = (gap + 1)/2;
            
            for (int i = 0 ; i + gap < n + m ; i++){
                
                if(i + gap < n){
                    if(arr1[i] > arr1[i + gap]){
                        swap (arr1 , arr1 , i , i + gap);
                    }
                   
                }
                else if(i < n && i + gap >= n){
                     if(arr1[i] > arr2[(i + gap) - n]){
                         swap (arr1 , arr2 , i , i + gap-n);
                    }
                    
                }
                else if(i >= n) {
                    if(arr2[i-n] > arr2[(i + gap)-n]){
                         swap (arr2 , arr2 , i-n , i + gap-n);
                    }
                }
            }
        }
    }
    
    public void merge2(int arr1[], int arr2[], int n, int m) {
        // code here
          for (int i = 0 ; i < Math.min(arr1.length, arr2.length) ; i++) {
			  if(arr1[arr1.length-1 -i] > arr2[i]){
				  int temp = arr1[arr1.length-1 -i];
				  arr1[arr1.length-1 -i] = arr2[i];
				  arr2[i] = temp;
			  }
			  else {
				  break;
			  }
		  }
		  Arrays.sort(arr1);
		  Arrays.sort(arr2);
    }
    
    public static void merge3(long arr1[], long arr2[], int n, int m) // O(N) O(N)
    {
        int l = m + n;
       long ans[] = new long[l];
       
       int i = 0; 
       int j = 0;
       int k = 0;
       
       while(i < n || j < m){
           if(i >= n) ans[k++] = arr2[j++];
           else if(j >= m) ans[k++] = arr1[i++];
           else {
               if(arr1[i] < arr2[j]){
                   ans[k++] = arr1[i++]; 
               }
               else {
                   ans[k++] = arr2[j++]; 
               }
           }
       }
       
       for(int e = 0 ; e < n ; e++){
           arr1[e] = ans[e];
       }
       
       for(int e = n ; e < l ; e++){
           arr2[e-n] = ans[e];
       }
       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long arr1[] = {1 , 3 , 5 , 7};
		long arr2[] = {0 , 2 , 6 , 8 , 9};
		
		merge(arr1, arr2, 4, 5);
		
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println(arr1[i]);
		}
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(arr2[i]);
		}

	}

}
