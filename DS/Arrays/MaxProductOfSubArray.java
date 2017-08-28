package DS.Arrays;

import java.util.Arrays;

public class MaxProductOfSubArray {

	/**
	 * Given an array that contains both positive and negative integers, find
	 * the product of the maximum product subarray. Expected Time complexity is
	 * O(n) and only O(1) extra space can be used.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 6, -3, -10, 0, 2 };
		/*
		 * Not working int posA = Integer.MIN_VALUE; int posB =
		 * Integer.MIN_VALUE; int negA = Integer.MIN_VALUE; int negB =
		 * Integer.MIN_VALUE; int max = Integer.MIN_VALUE;
		 * 
		 * // Arrays.sort(arr);
		 * 
		 * for (int i = 0; i < arr.length; i++) {
		 * 
		 * if (arr[i] > posA) { posB = posA; posA = arr[i]; } else if (arr[i] >
		 * posB) { posB = arr[i]; } if (arr[i] < 0 && Math.abs(arr[i]) >
		 * Math.abs(negA)) { negB = negA; negA = arr[i]; }else if(arr[i] < 0 &&
		 * Math.abs(arr[i]) > Math.abs(negB)){ negB =arr[i]; }
		 * 
		 * }
		 * 
		 * max = Math.max(posA * posB, negA*negB);
		 */

		int posMax = arr[0];
		int negMax = arr[0];
		int max = arr[0];

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] < 0) {
				int temp = max;
				posMax = Math.max(arr[i], negMax * arr[i]);
				negMax = Math.min(arr[i], temp * arr[i]);
			} else {
				posMax = Math.max(arr[i], posMax * arr[i]);
				negMax = Math.min(arr[i], negMax * arr[i]);
			}
			max = Math.max(max, posMax);
		}

		System.out.println("max-> " + max);

	}
}
