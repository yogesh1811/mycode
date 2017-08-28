package DS;


public class FindArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		 * Integer A[] = new Integer[10]; Integer B[] = new Integer[2];
		 */

		
		 /*int A[] = new int[] {4,9,3,7,8}; int B[] = new int[]{3,7};*/
		 

		
		/* int A[] = new int[] {1,3,5}; int B[] = new int[]{1};*/
		 

		
		 /*int A[] = new int[] {7,8,9}; int B[] = new int[]{8,9,10};*/
		 

		int A[] = new int[] { 4,9,3,7,8,3,7,1 };
		int B[] = new int[] { 3,7};

		System.out.println(findArray(A, B));

	}

	private static int findArray(int[] array, int[] subArray) {
		
		if (array == null || subArray == null || array.length == 0
				|| subArray.length == 0) {
			return -1;
		}
		if (array.length < subArray.length) {
			return -1;
		}
		boolean match = false;
		for (int i = array.length - 1; i >= subArray.length - 1; i--) {
			int temp = i;
			for (int j = subArray.length - 1; j >= 0; j--) {
				if (array[i] == subArray[j]) {
					match = true;
					i--;
				} else {
					match = false;
					break;
				}
			}
			if (match) {
				return i + 1;
			}
			i = temp;
		}
		return -1;
	}
}
