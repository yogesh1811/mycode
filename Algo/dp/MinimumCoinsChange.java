package Algo.dp;

public class MinimumCoinsChange {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] c = { 1, 2, 5 };
		int v = 11;

		System.out.println(findMinimumCoinsForValue(v, c));

	}

	private static int findMinimumCoinsForValue(int v, int[] c) {

		int[] dp = new int[v + 1];
		// Base case (If given value V is 0)
		dp[0] = 0;

		// Initialize all table values as Infinite
		for (int i = 1; i <= v; i++)
			dp[i] = Integer.MAX_VALUE;

		// Compute minimum coins required for all
		// values from 1 to V
		for (int i = 1; i <= v; i++) {
			// Go through all coins smaller than i
			for (int j = 0; j < c.length; j++) {
				if (c[j] <= i) {
					int sub_res = dp[i - c[j]];
					if (sub_res != Integer.MAX_VALUE && sub_res + 1 < dp[i])
						dp[i] = sub_res + 1;
				}
			}

		}
		return dp[v];
	}

}
