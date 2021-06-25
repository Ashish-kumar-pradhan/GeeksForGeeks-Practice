package recursion;

public class PalindromeString {
	
	int isPlaindrome(String S) {
	       if(S.length() <= 1)return 1;
		   if(S.charAt(0) != S.charAt(S.length()-1))return 0;
		   else return isPlaindrome(S.substring(1 ,S.length()-1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
