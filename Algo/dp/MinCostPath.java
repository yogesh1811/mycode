package Algo.dp;

public class MinCostPath {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] A = { { 1, 7, 9, 2 }, { 8, 6, 3, 2 }, { 1, 6, 7, 8 },
				{ 2, 9, 8, 2 } };
		System.out.println("Minimum Cost Path " + find(A));
	}

	private static int find(int[][] arr) {
		int[][] dp = new int[arr.length][arr.length];

		dp[0][0] = arr[0][0];
		// fill the first row
		for (int i = 1; i < arr.length; i++) {
			dp[0][i] = arr[0][i] + dp[0][i - 1];
		}

		// fill the first column
		for (int i = 1; i < arr.length; i++) {
			dp[i][0] = arr[i][0] + dp[i - 1][0];
		}

		// path will be either from top or left, choose which ever is minimum
		for (int i = 1; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				dp[i][j] = arr[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
			}
		}
		return dp[arr.length - 1][arr.length - 1];
	}

}
