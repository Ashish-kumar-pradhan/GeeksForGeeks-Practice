package arrays;

import java.util.ArrayList;

public class SumOfUpperAndLowerTriangles {
	
	static ArrayList<Integer> sumTriangles(int matrix[][], int n)
    {
        // code here
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int a = 0;
        int b = 0;
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j <= i ; j++){
                b += matrix[i][j];
                a += matrix[n-1-i][n-1-j];
            }
        }
        ans.add(a);
        ans.add(b);
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
