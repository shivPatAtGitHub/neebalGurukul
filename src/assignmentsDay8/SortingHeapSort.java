package assignmentsDay8;

public class SortingHeapSort {

	
	static void Heapify(int a[], int p, int n) {
		int t = a[p];
		int i;
		for(i = 2 * p + 1; i < n ; i = 2 * i + 1) {
			if(i+1 < n && a[i] < a[i+1]) {
				i++;
				if(a[i] > t) {
					a[(i-1)/2] = a[i];
				} else {
					break;
				}
			}	
		}
		a[(i-1)/2] = t;
	}

	public static void main(String[] args) {
		
		int arr[] = {8, 15, 7, 2, 13, 4, 5};
		
		int n = arr.length;
		int i, t;
		
		for(i = (n/2)-1; i>=0; i--) {
			Heapify(arr, i, n);
		}
		
		
		for(i=n-1;i > 0;i--) {
			t = arr[0];
			arr[0] =arr[i];
			arr[i] = t;
			Heapify(arr, 0, i);
		} 
		
		for(int a : arr) {
			System.out.print(" " + a);
		}
			
//	int arr[] = { 6, 43, 5, 433, 7, 88, 1, 2, 9 };
//	int g, j, i, t, n;
//	n = arr.length;
//	for (i = (n / 2) - 1; i >= 0; i--)
//	    HeapSort(arr, i, n);
//
//	for (i = n - 1; i > 0; i--) {
//	    t = arr[0];
//	    arr[0] = arr[i];
//	    arr[i] = t;
//	    HeapSort(arr, 0, i);
//	}
//	for (int a : arr)
//	    System.out.print("\t" + a);
			
		



	

	}

}


