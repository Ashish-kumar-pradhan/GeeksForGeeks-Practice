package sorting;

public class MergeSort {
	
	 void merge(int arr[], int l, int m, int r)
	    {
	         int i = l;
	         int j = m + 1;
	         int temp[] = new int[r - l + 1];
	         int k = 0;
	         while(i <= m || j <= r){
	             if(i > m) temp[k++] = arr[j++];
	             else if(j > r) temp[k++] = arr[i++];
	             else if(arr[j] < arr[i]) temp[k++] = arr[j++];
	             else temp[k++] = arr[i++];
	         }
	         
	         int f = 0;
	         for(int e = l ; e <= r ; e++){
	             arr[e] = temp[f++];
	         }
	    }
	    void mergeSort(int arr[], int l, int r)
	    {
	        if(r == l) return;
	        
	        int m = (l + r)/2;
	        mergeSort(arr , l , m);
	        mergeSort(arr , m + 1 , r);
	        
	        merge(arr , l , m , r);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
