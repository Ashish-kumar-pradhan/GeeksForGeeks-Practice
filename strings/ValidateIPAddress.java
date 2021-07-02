package strings;

public class ValidateIPAddress {
	
	public boolean isValid(String s) {
		
        if(s.length() < 7){
            return false;
        }
        String temp = "";
        int dot = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '.'){
                dot++;
                if(temp.length() < 1 || temp.length() > 3){
                    return false;
                }
                else{
                    if(temp.length() > 1 && temp.charAt(0) == '0'){
                        return false;
                    }
                    int t = Integer.valueOf(temp);
                    if(t < 256 && t >= 0){
                        temp = "";
                    }
                    else{
                        return false;
                    }
                }
            }
            else if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                temp += s.charAt(i);
            }
            else{
                return false;
            }
           
        }
        
         if(temp.length() > 1 && temp.charAt(0) == '0'){
                        return false;
         }
        
        if(dot != 3){
            return false;
        }
        
        return true;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
