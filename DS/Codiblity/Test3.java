package DS.Codiblity;

public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 1, 1, 3 };
		System.out.println(solution(A, 5));

	}

	public static boolean solution(int[] A, int K) {
		
		 int n = A.length;
	        for (int i = 0; i < n - 1; i++) {
	            if (A[i] + 1 < A[i + 1])
	                return false;
	        }
	        if (A[0] != 1 && A[n - 1] < K)
	            return false;
	        else
	            return true;
		
		/*boolean match = false;
		while (k > 0) {
			if (searchInInputArray(A, A.length, k) != -1) {
				match = true;
			} else {
				match = false;
				break;
			}
			k--;
		}
		return match;*/
	}

	static int searchInInputArray(int arr[], int n, int key) {
		int pivot = findPivot(arr, 0, n - 1);

		if (pivot == -1)
			return binarySearch(arr, 0, n - 1, key);
		if (arr[pivot] == key)
			return pivot;
		if (arr[0] <= key)
			return binarySearch(arr, 0, pivot - 1, key);
		return binarySearch(arr, pivot + 1, n - 1, key);
	}

	static int findPivot(int arr[], int low, int high) {

		if (high < low)
			return -1;
		if (high == low)
			return low;

		int mid = (low + high) / 2;
		if (mid < high && arr[mid] > arr[mid + 1])
			return mid;
		if (mid > low && arr[mid] < arr[mid - 1])
			return (mid - 1);
		if (arr[low] >= arr[mid])
			return findPivot(arr, low, mid - 1);
		return findPivot(arr, mid + 1, high);
	}

	static int binarySearch(int arr[], int low, int high, int key) {
		if (high < low)
			return -1;
		int mid = (low + high) / 2;
		if (key == arr[mid])
			return mid;
		if (key > arr[mid])
			return binarySearch(arr, (mid + 1), high, key);
		return binarySearch(arr, low, (mid - 1), key);
	}
}
