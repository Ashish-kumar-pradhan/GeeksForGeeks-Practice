package mathematical;

public class MaximumVolumeOfARectangularBox {
	
    static long getVol(int A, int B) {
        
        float l = (float)(A - Math.sqrt(A * A - 24 * B)) / 12;
        float V = (float)(l * (B / 2.0 - l * (A / 4.0 - l)));
        return (long)V;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
