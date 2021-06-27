package bitManupilation;

import java.util.ArrayList;
import java.util.Collections;

public class PrintNBitBinaryNumbersHavingMore1sthan0s {
	
	void bitbinary(int i,int n,String s,int ones,int zeros , ArrayList<String> ans){
        if(i==n){
            ans.add(s);
            return;
        }
        bitbinary(i+1,n,s+"1",ones+1,zeros , ans);
        if(ones>zeros){
        bitbinary(i+1,n,s+"0",ones,zeros+1 , ans);
        }
    }
    ArrayList<String> NBitBinary(int N) {
        ArrayList<String> ans = new ArrayList<String>();
        bitbinary(0,N,"",0,0 , ans);
        Collections.sort(ans);
        Collections.reverse(ans);
        return ans;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
