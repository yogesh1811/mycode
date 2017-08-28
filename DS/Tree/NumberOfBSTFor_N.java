package DS.Tree;

public class NumberOfBSTFor_N {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Number of BST for number" + countTrees(3));
	}

	public static int countTrees(int n) {
		int[] catalan = new int[n + 1];
		catalan[0] = 1;
		catalan[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				catalan[i] += catalan[j] * catalan[i - j - 1];
			}
		}
		return catalan[n];
	}
}
