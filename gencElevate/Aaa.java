package gencElevate;

public class Aaa {

	public boolean cp(int a , int b){
		int n = (int)Math.min(Math.pow(a, 0.5), Math.pow(b, 0.5));
		for(int i = 2 ; i < n ; i++) {
			if(a % i == 0 && b % i == 0) {
				return false;
			}
		}
		return true;
	}
	public int find(int[] input1 , int input2) {
		
	    int n = input1.length;
		for(int i = 0 ; i < n - 1; i++) {
			if(cp(input1[i] , input1[i+1]) && input1[i] > input1[i+1] ) {
				return input1[i];
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
