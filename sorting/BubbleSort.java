package sorting;

public class BubbleSort {
	
	public static void bubbleSort(int arr[], int n)
    {
        
        int i = n;
        while(i > 0){
            for(int j = 1 ; j < i ; j++){
                if(arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
            i--;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
