package recursion;

public class TowerOfHanoi {
	
	long moves = 0;
    public void num(int n, int from, int to, int aux){
        if(n == 0){
            return;
        }
        num(n-1, from, aux , to);
        System.out.println("move disk "+n+" from rod "+from+" to rod "+ to);
        moves = moves + 1;
        num(n-1, aux , to, from);
    }

    public long toh(int N, int from, int to, int aux) {
        // Your code here
        num(N, from, to, aux);
        return moves;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
