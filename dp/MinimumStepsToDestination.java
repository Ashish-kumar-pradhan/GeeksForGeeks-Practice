package dp;

public class MinimumStepsToDestination {
	
	static int minSteps(int D){
        // code here
        int steps = 0;
        int sum = 0;
        while(sum<D) {
            sum+=steps;
            steps++;
        }
        while((sum-D)%2 != 0) {
            sum+=steps;
            steps++;
        }
        return steps-1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
