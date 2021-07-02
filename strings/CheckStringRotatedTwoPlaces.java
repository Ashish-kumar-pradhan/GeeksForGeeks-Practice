package strings;

public class CheckStringRotatedTwoPlaces {
	
	public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        if(str1.length() != str2.length()){
            return false;
        }
        for(int i = 0 ; i < str1.length() ; i++){
            boolean r = str2.charAt(i) != str1.charAt((i + 2)%str1.length());
            boolean l = str1.charAt(i) != str2.charAt((i + 2)%str1.length());
            if(r && l){
                return false;
                
            }
        }
        
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
