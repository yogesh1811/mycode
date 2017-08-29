package Algo.dp;

public class NumberOfPathsInMxNMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// int arr[][] = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };

		int arr[][] = { { 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1, 1, 1 },
				{ 1, 1, 1, 1 } };
		System.out.println("No Of Path (Recursion):- " +count(arr,0,0));
		System.out.println("No Of Path:- " + countNumberOfPaths(arr));
	}

	private static int countNumberOfPaths(int[][] arr) {
		int dp[][] = new int[arr.length][arr.length];

		// base case: if we have one cell then there is only one way
		dp[0][0] = 1;

		// no of paths to reach in any cell in first row = 1
		for (int i = 0; i < dp.length; i++) {
			dp[0][i] = 1;
		}

		// no of paths to reach in any cell in first col = 1
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}

		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp.length; j++) {
				dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
			}
		}

		return dp[arr.length - 1][arr.length - 1];
	}

	public static int count(int[][] arrA, int row, int col) {
		// base case
		// check if last row OR column is reached since after that only one path
		// is possible to reach to the bottom right corner.
		if (row == arrA.length - 1 || col == arrA.length - 1) {
			return 1;
		}
		return count(arrA, row + 1, col) + count(arrA, row, col + 1);
	}

}
