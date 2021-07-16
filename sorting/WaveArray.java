package sorting;

public class WaveArray {
	
	public static void convertToWave(int arr[], int n){
        
        for(int i = 1 ; i < n ; i = i + 2){
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
