package strings;

public class LongestSubstringContaining1 {
	
	public int count(String s)
    {
        //add code here.
        int cM = 0;
        int oM = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '1'){
                cM++;
                if(oM < cM) oM = cM ;
            }
            else {
                cM = 0;
            }
        }
        return oM;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
