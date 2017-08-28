package DS.Matrix;

public class kthSmallestMat {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] arr = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 },
				{ 24, 29, 37, 48 }, { 32, 33, 39, 50 } };
		kthSmallest(arr,4,3);
	}

	public static void kthSmallest(int[][] a, int n, int k) {
		int low = a[0][0];
		int high = a[n - 1][n - 1];

		if (Count(a, n, n, high) == k) {
			System.out.println(high);
			return;
		} else if (Count(a, n, n, low) == k) {
			System.out.println(low);
			return;
		}

		while (low <= high) {
			int mid = (low + high) / 2;
			int c = Count(a, n, n, mid);
			// System.out.println(mid+","+c);
			if (c < k) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		System.out.println(low);
	}

	private static int Count(int[][] a, int rows, int cols, int v) {
		int i = rows - 1;
		int j = 0;
		int result = 0;
		while (i >= 0 && j < cols) {
			System.out.println(a[i][j]);
			if (a[i][j] <= v) {
				result += i + 1;
				j++;
			} else {
				i--;
			}
		}
		return result;
	}

}
