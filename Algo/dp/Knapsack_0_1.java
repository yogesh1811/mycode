package Algo.dp;

public class Knapsack_0_1 {

	/**
	 * To consider all subsets of items, there can be two cases for every item:
	 * (1) the item is included in the optimal subset, (2) not included in the
	 * optimal set. Therefore, the maximum value that can be obtained from n
	 * items is max of following two values. 1) Maximum value obtained by n-1
	 * items and W weight (excluding nth item). 2) Value of nth item plus
	 * maximum value obtained by n-1 items and W minus weight of the nth item
	 * (including nth item).
	 * 
	 * If weight of nth item is greater than W, then the nth item cannot be
	 * included and case 1 is the only possibility.
	 */
	public static void main(String[] args) {
		int val[] = new int[] { 60, 100, 120 };
		int wt[] = new int[] { 10, 20, 30 };
		int W = 50;
		int n = val.length;
		System.out.println(knapSack(W, wt, val, n));

	}

	// A utility function that returns maximum of two integers
	static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// Returns the maximum value that can be put in a knapsack of capacity W
	static int knapSack(int W, int wt[], int val[], int n) {
		int i, w;
		int K[][] = new int[n + 1][W + 1];

		// Build table K[][] in bottom up manner
		for (i = 0; i <= n; i++) {
			for (w = 0; w <= W; w++) {
				if (i == 0 || w == 0)
					K[i][w] = 0;
				else if (wt[i - 1] <= w)
					K[i][w] = max(val[i - 1] + K[i - 1][w - wt[i - 1]],
							K[i - 1][w]);
				else
					K[i][w] = K[i - 1][w];
			}
		}

		return K[n][W];
	}

}
