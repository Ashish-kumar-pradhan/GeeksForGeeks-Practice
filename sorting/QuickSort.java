package sorting;

public class QuickSort {
	
	static void swap(int A[], int x, int y){    
        A[x] = A[x] ^ A[y] ^ (A[y] = A[x]);
    }
    static void quickSort(int arr[], int low, int high)
    {
        if(high <= low) {
        	return;
        }
        int pivotIndex = partition(arr, low ,high);
        quickSort(arr, low , pivotIndex - 1);
        quickSort(arr, pivotIndex + 1 ,high);
    }
    static int partition(int arr[], int low, int high){
    	
        int pivot = arr[low];
        int pivotIndex = low;
        for(int i = low + 1 ; i <= high ; i++) {
        	if(pivot > arr[i]) {
        		pivotIndex++;
        	}
        }
        swap(arr , low , pivotIndex);
        
        int i = low;
        int j = pivotIndex + 1;
         while(i < pivotIndex && j <= high){
            if(arr[i] < arr[pivotIndex] ){
                i++;
            }
            else if(arr[j] >= arr[pivotIndex] ){
                j++;
            }
            
            else{
                swap(arr , i , j);
                i++;
                j++;
            }
         }
        return pivotIndex;
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = { 24 ,18 ,38 ,43 ,14 ,40 ,1 , 54};
		
		quickSort(arr , 0 , 7);
		
		for(int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
