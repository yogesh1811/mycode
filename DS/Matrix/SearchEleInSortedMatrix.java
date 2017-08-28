package DS.Matrix;

public class SearchEleInSortedMatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int arr[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 },
				{ 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
		search(arr, 4, 29);
	}

	private static void search(int[][] arr, int n, int ele) {
		int i = 0, j = n - 1; // set indexes for top right
		// element
		while (i < n && j >= 0) {
			if (arr[i][j] == ele) {
				System.out.print(ele + " Found at arr[" + i + "][" + j + "]");
				return;
			}
			if (arr[i][j] > ele)
				j--;
			else
				i++;
		}
		System.out.print("n Element not found");
		return;

	}

}
