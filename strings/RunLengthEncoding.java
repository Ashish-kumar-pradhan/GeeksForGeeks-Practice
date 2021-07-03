package strings;

public class RunLengthEncoding {
	
	String encode(String str)
	{
          int i = 0;
          int l = 0;
          String ans = "";
          char x = str.charAt(0);
          while(i < str.length()){
              if(x == str.charAt(i)){
                  i++;
                  l++;
              }
              else{
                  ans = ans + x + l;
                  l = 0;
                  x = str.charAt(i);
              }
          }
          ans = ans + x + l;
          return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
