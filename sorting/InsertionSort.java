package sorting;

public class InsertionSort {
	
	 static void insert(int arr[],int i)
	  {
	       // Your code here
	       int pos = i;
	       int elem = arr[i];
	       for(int j = 0 ; j < i ; j++){
	           if(elem < arr[j]) {
	               pos = j;
	               break;
	           }
	       }
	       for(int k = i ; k > pos ; k--){
	           arr[k] = arr[k-1];
	       }
	       
	       arr[pos] = elem;
	  }
	  //Function to sort the array using insertion sort algorithm.
	  public void insertionSort(int arr[], int n)
	  {
	      //code here
	      
	      for(int i = 1 ; i < n ; i++){
	          insert(arr , i);
	      }
	      
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
