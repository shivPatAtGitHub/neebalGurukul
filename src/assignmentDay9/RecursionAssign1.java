package assignmentDay9;

public class RecursionAssign1 {

	static int SumN(int arr[], int n) {
		if (n==0) {
			return 0;
		}
		return arr[n-1] + SumN(arr, n-1);
	}
	
	
	public static void main(String[] args) {
		int a[] = {1, 2, 3, 4, 5};
		int b[] = {0,0,0,0,0};
		int c[] = {10, 20, 30, 40, 50};
		int d[] = {-1, -2, -3, -4, -5};
		int e[] = {3};
		int l = e.length;
		int Sum = SumN(e,l);
		
		System.out.println(Sum);
		
	}

}
