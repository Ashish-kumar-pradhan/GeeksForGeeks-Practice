package arrays;

public class MinimumDistanceBetweenTwoNumbers {
	
	int minDist(int a[], int n, int x, int y) {
        // code here
        int xi = 0;
        int yi = 0;
        int min = Integer.MAX_VALUE;
        
        while(xi < n && yi < n){
            while(xi < n && a[xi] != x){
                xi++;
            }
            
            while(yi < n && a[yi] != y){
                yi++;
            }
            
            if(xi < n && yi < n && a[xi] == x && a[yi] == y){
                if(min > Math.abs(xi-yi)){
                    min = Math.abs(xi-yi);
                }
                
            }
            
            if(xi < yi){
                xi++;
            }
            else {
                yi++;
            }
        }
        
        if(min == Integer.MAX_VALUE){
            return -1;
        }
        return min;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
