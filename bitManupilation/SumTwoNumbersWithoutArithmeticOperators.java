package bitManupilation;

public class SumTwoNumbersWithoutArithmeticOperators {
	
	int sum(int a , int b)
    {
        //code here
        if(b == 0) return a;
        else return sum(a ^ b, (a & b) << 1);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
