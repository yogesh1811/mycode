package Algo.dp;

public class CoinsChangeAllWaysV1 {

	/**
	 * Find minimum number of coins that make a given value Input: coins[] =
	 * {25, 10, 5}, V = 30 Output: Minimum 2 coins required We can use one coin
	 * of 25 cents and one of 5 cents
	 */
	public static void main(String[] args) {
		int[] c = { 0,1,2 };
		int v = 5;

		System.out.println(findMinimumCoinsForValue(v, c));
	}

	private static int findMinimumCoinsForValue(int total, int[] coins) {
		int[][] dp = new int[coins.length + 1][total + 1];

		for (int i = 0; i < coins.length; i++) {
			int coin = coins[i];
			for (int j = 0; j <= total; j++) {
				// base condition
				if (i == 0 && j == 0) {
					dp[0][0] = 1;
					break;
				} else {
					if (coin > j) {
						dp[i][j] = dp[i - 1][j];
					} else {
						dp[i][j] = dp[i - 1][j] + dp[i][j - i];
					}
				}

			}
		}
		return dp[coins.length-1][total];
	}
}
