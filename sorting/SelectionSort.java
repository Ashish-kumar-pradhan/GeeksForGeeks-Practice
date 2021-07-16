package sorting;

public class SelectionSort {
	
	int select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        for(int j = i ; j < arr.length ; j++){
            if(min > arr[j]){
                min = arr[j];
                minIndex = j;
            }
        }
        return minIndex;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i = 0 ; i < n - 1 ; i++){
	        int minIndex = select(arr , i);
	        int temp = arr[minIndex];
	        arr[minIndex] = arr[i];
	        arr[i] = temp;
	    }
	    
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
