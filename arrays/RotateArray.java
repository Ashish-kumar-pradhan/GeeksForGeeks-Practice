package arrays;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int n = s.nextInt();
		    int d = s.nextInt();
		    int arr[] = new int[n];
		    for(int i = 0 ; i < n ; i++ ){
		        arr[(i+n-d)%n] = s.nextInt();
		    }
		    for(int i = 0 ; i < n ; i++ ){
		        System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}

	}

}
