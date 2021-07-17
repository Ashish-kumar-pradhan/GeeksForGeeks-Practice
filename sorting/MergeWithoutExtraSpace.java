package sorting;

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
