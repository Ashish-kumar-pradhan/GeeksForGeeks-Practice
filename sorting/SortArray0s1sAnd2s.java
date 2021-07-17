package sorting;

public class SortArray0s1sAnd2s {
	
	static void swap(int[] a , int f , int s){
        int temp = a[f];
        a[f] = a[s];
        a[s] = temp;
    }
    public static void sort012(int a[], int n)
    {
        
        int l = 0;
        int m = 0;
        int h = n-1;
        while(m <= h){
            
            if(a[m] == 0){
                swap(a , l , m);
                l++;
                m++;
            }
            else if(a[m] == 1) {
                m++;
            }
            else {
                swap(a , h , m);
                h--;
            }
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
