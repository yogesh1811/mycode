package DS.Matrix;

public class SpiralMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int a[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 },
				{ 13, 14, 15, 16, 17, 18 } };
		spiralFindPosElement(R, C, a, 50);
	}

	private static void spiralFindPosElement(int m, int n, int[][] arr,
			int element) {
		int k = 0, l = 0, i = 0;
		int eleCount = 0;
		while (k < m && l < n) {
			// Print the first row from the remaining rows
			for (i = l; i < n; i++) {
				eleCount++;
				if (arr[k][i] == element) {
					System.out.print("\n" + arr[k][i] + "\n fond=>" + eleCount);
					return;
				}
				System.out.print(arr[k][i]);

			}
			System.out.println("");
			k++;
			// Print the last column from the remaining columns
			for (i = k; i < m; i++) {
				eleCount++;
				if (arr[i][n - 1] == element) {
					System.out.print("\n" + arr[i][n - 1] + "\n fond=>"
							+ eleCount);
					return;
				}
				System.out.print(arr[i][n - 1]);
			}
			System.out.println("");
			n--;
			// Print the last row from the remaining rows */
			if (k < m) {
				for (i = n - 1; i >= 0; i--) {
					eleCount++;
					if (arr[k + 1][i] == element) {
						System.out.print("\n" + arr[k + 1][i] + "\n fond=>"
								+ eleCount);
						return;
					}
					System.out.print(arr[k + 1][i]);
				}
				System.out.println("");
				m--;
			}
			// Print the first column from the remaining columns */
			if (l < n) {
				for (i = m - 1; i >= k; --i) {
					eleCount++;
					if (arr[i][l] == element) {
						System.out.print("\n" + arr[i][l] + "\n fond=>"
								+ eleCount);
						return;
					}
					System.out.print(arr[i][l]);
				}
				System.out.println("");
				l++;
			}
			eleCount = -1;
		}
		System.out.println(eleCount);
	}

}
