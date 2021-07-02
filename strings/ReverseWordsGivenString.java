package strings;

public class ReverseWordsGivenString {
	
	String reverseWords(String S)
    {
		
        String temp = "";
        String ans = "";
        for(int i = S.length() - 1 ; i >= 0 ; i--){
            if(S.charAt(i) == '.'){
                ans = ans + temp + ".";
                temp = "";
            }
            else {
                temp = S.charAt(i) + temp; 
            }
        }
        ans += temp;
        
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
