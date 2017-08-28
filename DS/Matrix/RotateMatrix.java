package DS.Matrix;

public class RotateMatrix {

	static int curr = 0;
	static int prev = 0;

	public static void main(String[] args) {
		/*
		 * int R = 3; int C = 3; int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7,
		 * 8, 9 } };
		 */

		/*
		 * int R = 3; int C = 3; int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7,
		 * 8, 9 } };
		 */

		int R = 4;
		int C = 4;
		int arr[][] = {

		{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		printMatrix(R, C, arr);
		System.out.println("---");
		rotedMatrix(arr, R, C);

		printMatrix(R, C, arr);

	}

	private static void rotedMatrix(int[][] arr, int m, int n) {
		int k = 0, l = 0;
		while (k < m && l < n) {
			if (k + 1 == m || l + 1 == n)
				break;
			prev = arr[k + 1][l];
			for (int i = k; i <= n - 1; i++) {
				swap(arr, k, i);
				// System.out.print(arr[k][i]);
			}
			// System.out.println("");
			k++;
			for (int i = k; i <= m - 1; i++) {
				swap(arr, i, n - 1);
				// System.out.print(arr[i][n - 1]);
			}
			// System.out.println("");
			n--;
			if (k <= n) {
				for (int i = n - 1; i >= l; i--) {
					swap(arr, m - 1, i);
					// System.out.print(arr[m - 1][i]);
				}
				// System.out.println("");
			}
			m--;
			for (int i = m - 1; i >= k; i--) {
				swap(arr, i, l);
				// System.out.print(arr[i][l]);
			}
			// System.out.println("");
			l++;

		}

	}

	private static void printMatrix(int m, int n, int[][] arr) {
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println("");
		}
	}

	private static void swap(int[][] arr, int k, int i) {
		curr = arr[k][i];
		arr[k][i] = prev;
		prev = curr;
	}

}
