package DS.Arrays;

public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 3, 45, 33, 4, 50, 45 };
		printArray(arr);
		/*
		 * rotated Array With Temp Arr
		 */

		/*
		 * System.out.println("\nouput =>rotatedArrayWithTempArr");
		 * printArray(rotatedArrayWithTempArr(arr, 2));
		 */

		/*
		 * left Rotate Whole Arr 1 step at time
		 */

		/*
		 * System.out.println("\nouput =>leftRotateWholeArr");
		 * printArray(leftRotateWholeArr(arr, 2));
		 */

		/*
		 * left Rotate Whole Arr - with CGD use -- Juggling Algo
		 */
		/*
		 * System.out.println("\nouput =>leftRotateWithGCD");
		 * printArray(leftRotateWithGCD(arr, 2));
		 */

		/*
		 * Rotate array with Reversal theorem.
		 */
		System.out.println("\nouput =>Rotate array with Reversal theorem.");
		printArray(rotateWithReversalTheorem(arr, 2));

	}

	// rotate(arr[], d, n)
	// reverse(arr[], 1, d) ;
	// reverse(arr[], d + 1, n);
	// reverse(arr[], l, n);

	/**
	 * 
	 * Time complexity: O(n)
	 * 
	 * @param arr
	 * @param i
	 * @return
	 */
	private static int[] rotateWithReversalTheorem(int[] arr, int d) {
		int n = arr.length-1;
		reversArray(arr, 0, n-d);
		printArray(arr);
		reversArray(arr, n-d+1 , n);
		printArray(arr);
		reversArray(arr, 0, n);
		printArray(arr);
		return arr;
	}

	private static void reversArray(int[] arr, int start, int end) {
		for (int i = start, j = end; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}

	/**
	 * 
	 * Time complexity: O(n) Auxiliary Space: O(1)
	 * 
	 * @param arr
	 * @param d
	 * @return
	 */
	private static int[] leftRotateWithGCD(int[] arr, int d) {
		int i, j, k, temp, n = arr.length - 1;
		for (i = 0; i < gcd(d, n); i++) {
			/* move i-th values of blocks */
			temp = arr[i];
			j = i;
			while (1 != 0) {
				k = j + d;
				if (k >= n)
					k = k - n;
				if (k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			arr[j] = temp;
		}
		return arr;
	}

	/**
	 * Time complexity: O(n*d) Auxiliary Space: O(1)
	 * 
	 * @param arr
	 * @param d
	 * @return
	 */
	private static int[] leftRotateWholeArr(int[] arr, int d) {

		for (int i = 0; i < d; i++) {
			int temp = arr[0];
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
			arr[arr.length - 1] = temp;
		}
		return arr;
	}

	// 1) Store d elements in a temp array
	// temp[] = [1, 2]
	// 2) Shift rest of the arr[]
	// arr[] = [3, 4, 5, 6, 7, 6, 7]
	// 3) Store back the d elements
	// arr[] = [3, 4, 5, 6, 7, 1, 2]

	//
	//
	/**
	 * 
	 * Time complexity O(n) Auxiliary Space: O(d)
	 * 
	 * @param arr
	 * @param d
	 * @return
	 */
	private static int[] rotatedArrayWithTempArr(int[] arr, int d) {
		int[] temp = new int[d];
		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		for (int i = 0; i < d; i++) {
			for (int j = 1; j < arr.length; j++) {
				arr[j - 1] = arr[j];
			}
		}
		for (int i = temp.length - 1, j = arr.length - 1; i >= 0; i--, j--) {
			arr[j] = temp[i];
		}
		return arr;
	}

	/* Fuction to get gcd of a and b */
	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		else
			return gcd(b, a % b);
	}

	private static void printArray(int[] arr) {
		System.out.print("\n");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
