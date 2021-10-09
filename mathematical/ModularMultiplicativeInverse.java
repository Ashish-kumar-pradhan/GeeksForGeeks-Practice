package mathematical;

public class ModularMultiplicativeInverse {
	
	public int modInverse(int a, int m)
    {
      //Your code here
      for(int i = 1 ; i < m ; i++){
          if((i*a)%m == 1){
              return i;
          }
      }
      return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
