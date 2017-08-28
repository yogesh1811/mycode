package DS.Arrays;

public class ArrayReversal_JugglingAlgo {

	/**
	 * swap 1st and last element 
	 * swap 2nd and 2nd last element do this till n/2
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 3, 23 };
		for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;

		}
		System.out.println(arr.toString());
	}

}
