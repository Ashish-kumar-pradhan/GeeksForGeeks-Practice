package mathematical;

public class RectanglesInNxNBoard {
	
	static Long rectanglesInChessBoard(Long N) {
        // code he
       long nt = N*(N+1);
       nt = nt/2;
       long nct = nt*nt;
       long nst = nt*(2*N + 1);
       nst = nst/3;
       
       return nct - nst;
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
