package greedy;

public class JumpGame {
	
	static int canReach(int[] A, int N) {
        // code here
        int i = 1 ;
        int v = A[0];
        while(i < N-1){
            v -= 1;
            if(A[i] == 0 && v == 0){
                return 0;
            }
            if(v < A[i]){
                v = A[i];
            }
            i++;
        }
        return 1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
