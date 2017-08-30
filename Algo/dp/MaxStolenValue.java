package hackerrank.algorithms.dp;

public class MaxStolenValue {

	public static void main(String[] args) {
		int[] arr = { 6, 1, 2, 7 };

		System.out.println(findMaxStolenValue(arr));

	}

	private static int findMaxStolenValue(int[] arr) {
		int[] dp = new int[arr.length];

		if (arr.length == 0) {
			return 0;
		}
		int value1 = arr[0];
		if (arr.length == 1) {
			return value1;
		}
		int value2 = Math.max(arr[0], arr[1]);
		if (arr.length == 2) {
			return value2;
		}
		int value = 0;
		for (int i = 2; i < dp.length; i++) {
			value = Math.max(arr[i] + value1, value2);
			value1 = value2;
			value2 = value;
		}

		return value;
	}

}
