package strings;

public class CheckIfStringsAreRotationsOfEachOtherOrNot {
	
	public static boolean areRotations(String s1, String s2 )
    {
        // Your code here
        int n1 = s1.length();
        int n2 = s2.length();
        if(n1 != n2) return false;
        for(int i = 0 ; i < s1.length() ; i++){
            
            if(s1.charAt(i) == s2.charAt(0)){
                if(s1.substring(i).equals(s2.substring(0 , n1-i)) && s1.substring(0 , i).equals(s2.substring( n1-i))){
                    return true;
                }
            }
        }
        return false;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
