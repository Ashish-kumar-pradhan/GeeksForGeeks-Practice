package strings;

import java.util.HashMap;

public class MaximumOccuringCharacter {
	
	public static char getMaxOccuringChar(String line)
    {
        // Your code here
        HashMap<Character,Integer> hp = new HashMap<>(); 
        for(int i = 0 ; i < line.length() ; i++){
            if(hp.containsKey(line.charAt(i))){
                hp.put(line.charAt(i) , 1 + hp.get(line.charAt(i)));
            }
            else {
                hp.put(line.charAt(i) , 1);
            }
        }
        int max = 0;
        char mC = line.charAt(0);
        for(int i = 0 ; i < line.length() ; i++){
            
            if(hp.get(line.charAt(i)) > max){
                max = hp.get(line.charAt(i));
                mC = line.charAt(i);
            }
            else if (hp.get(line.charAt(i)) == max && mC > line.charAt(i)){
                mC = line.charAt(i);
            }
            //System.out.println(line.charAt(i) + " " + hp.get(line.charAt(i)) + " " + max + " " + mC);
        }
        return mC;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
