package matrix;

public class PredictTheColumn {
	
	int columnWithMaxZeros(int arr[][], int N)
    {
        // code here 
        for(int i = 1 ; i < N ; i++){
            for(int j = 0 ; j < N ; j++){
                arr[i][j] += arr[i-1][j]; 
            }
        }
        
        int min = Integer.MAX_VALUE;
        int minI = -1;
        for(int i = 0 ; i < N ; i++){
             if(min > arr[N-1][i]){
                 min = arr[N-1][i];
                 minI = i;
             }
        }
        return minI;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
