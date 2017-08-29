package Algo.dp;

public class ShortestCommonSupersequence {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String X = "AGGTAB";
		String Y = "GXTXAYB";
		System.out.println("Length of the shortest supersequence is: "
				+ superSeq(X, Y, X.length(), Y.length()));

	}

	static int superSeq(String X, String Y, int m, int n) {
		if (m == 0)
			return n;
		if (n == 0)
			return m;

		if (X.charAt(m - 1) == Y.charAt(n - 1))
			return 1 + superSeq(X, Y, m - 1, n - 1);

		return 1 + Math.min(superSeq(X, Y, m - 1, n), superSeq(X, Y, m, n - 1));
	}

}
