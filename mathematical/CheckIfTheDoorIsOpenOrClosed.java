package mathematical;

public class CheckIfTheDoorIsOpenOrClosed {
	
	static int[] checkDoorStatusFast(int N) {
        // code here
        int arr[] = new int[N];
        int place = 1;
        int in = 1; 
        while(place <= N){
            arr[place-1] = 1;
            in += 2;
            place += in;
        }
        return arr;
    }
	
	static int[] checkDoorStatus(int N) {
        // code here
        int arr[] = new int[N];
        for(int i = 1 ; i <= N ; i++){
            int sr = (int)Math.pow(i , 0.5);
            int sq = sr*sr;
            if(i == sq){
                arr[i-1] = 1;
            }
        }
        return arr;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
