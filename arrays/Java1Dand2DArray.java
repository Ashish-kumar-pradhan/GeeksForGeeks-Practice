package arrays;

import java.util.ArrayList;

public class Java1Dand2DArray {
	
	public static ArrayList<Integer> array(int a[][], int b[], int n)
    {
		
        int max = Integer.MIN_VALUE;
        int sum = 0;
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0 ; i < n ; i ++){
            if(max < b[i]){
                max = b[i];
            }  
            sum += a[i][i];
        }
        arr.add(sum);
        arr.add(max);
        
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
