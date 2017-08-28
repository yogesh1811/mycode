package DS.Arrays;

public class PeakElement {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] arr = { 10, 20, 15, 2, 23, 90, 67 };
		printPeakElement(arr, 1, arr.length - 1);
	}

	private static void printPeakElement(int[] arr, int start, int end) {

		for (int i = start; i <= end; i++) {
			if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
				System.out.println(arr[i]);
			}
		}

	}

}
