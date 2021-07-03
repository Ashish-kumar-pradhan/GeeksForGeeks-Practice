package strings;

import java.util.HashMap;

public class NonRepeatingCharacter {
	
	static char nonrepeatingCharacter(String S)
    {
        
        HashMap<Character , Integer> hp = new HashMap<>();
        for(int i = 0 ; i < S.length() ; i++){
            if(hp.containsKey(S.charAt(i))){
                hp.put(S.charAt(i) , hp.get(S.charAt(i)) + 1);
            }
            else {
                hp.put(S.charAt(i) , 1);
            }
        }
        for(int i = 0 ; i < S.length() ; i++){
            if(hp.get(S.charAt(i)) == 1){
                return S.charAt(i);
            }
        }
        return '$';
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
