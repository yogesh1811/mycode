package DS.Arrays;

public class LagestSumContSubArray_KadanesAlgo {

	/**
	 * Largest Sum Contiguous Subarray - Kadane’s Algorithm:
	 * 
	 * solution 1 - check for all sub arrays - O(n^2)
	 * 
	 * solution 2 - using Kadane’s algorithm.
	 * 
	 * A. cur_max = glob_max = a[0]
	 * 
	 * B. loop i=1 -> n cur_max = Math.max(a[i], a[i] + cur_max) glob_max =
	 * Math.max(cur_max,glob_max)
	 * 
	 * C. return glob_max
	 */
	public static void main(String[] args) {
		int[] arr = { -2, -3, 4, -1, -2, 1, 5, -3 };

		/*
		 * For all value -Ve
		 */
		int[] a = { -2, -3, -1, -2, -3 };

		int[] ab = { 1, 3, 45, 33, 4 };

		System.out.println("MaxSum->" + maxSumSubArr(arr));

		System.out.println("MaxSumAll_Neg->" + maxSumSubArr_AllNeg(a));

	}

	private static int maxSumSubArr(int[] arr) {
		int globMax = 0, crrMax = 0;

		for (int i = 0; i < arr.length; i++) {
			crrMax = arr[i] + crrMax;
			globMax = Math.max(globMax, crrMax);
			if (crrMax < 0)
				crrMax = 0;
		}
		return globMax;
	}

	private static int maxSumSubArr_AllNeg(int[] a) {
		int globMax = a[0], crrMax = a[0];

		for (int i = 0; i < a.length; i++) {
			crrMax = Math.max(a[i], a[i] + crrMax);
			globMax = Math.max(globMax, crrMax);
		}
		return globMax;
	}

}
