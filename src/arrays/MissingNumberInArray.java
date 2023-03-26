package arrays;

public class MissingNumberInArray {
	public static void main(String[] args) {
		int[] array= {1,2,3,5};
		int n=5;
		System.out.println(MissingNumber(array,n));
	}
	
	public static int MissingNumber(int array[], int n) {
	       int arrSum=0;
	       int totSum=0;
	       int missNum;
	       for(int i=0;i<n-1;i++){
	           arrSum+=array[i];
	       }
	       for(int i=1;i<=n;i++){
	           totSum+=i;
	       }
	       missNum=totSum-arrSum;
	       return missNum;
	    }
}
