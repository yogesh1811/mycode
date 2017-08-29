package Algo.dp;

public class EditDistance {

	/**
	 * 
	 * There are three operations permitted on a word: replace, delete, insert.
	 * For example, the edit distance between "a" and "b" is 1, the edit
	 * distance between "abc" and "def" is 3.
	 * 
	 * if x == y, then dp[i][j] == dp[i-1][j-1] if x != y, and we insert y for
	 * word1, then dp[i][j] = dp[i][j-1] + 1 if x != y, and we delete x for
	 * word1, then dp[i][j] = dp[i-1][j] + 1 if x != y, and we replace x with y
	 * for word1, then dp[i][j] = dp[i-1][j-1] + 1 When x!=y, dp[i][j] is the
	 * min of the three situations.
	 */
	public static void main(String[] args) {
		System.out.println(findMinimumEditDistance("yogesh", "yogi"));

	}

	private static int findMinimumEditDistance(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();

		// len1+1, len2+1, because finally return dp[len1][len2]
		int[][] dp = new int[len1 + 1][len2 + 1];

		for (int i = 0; i <= len1; i++) {
			dp[i][0] = i;
		}

		for (int j = 0; j <= len2; j++) {
			dp[0][j] = j;
		}

		// iterate though, and check last char
		for (int i = 0; i < len1; i++) {
			char c1 = s1.charAt(i);
			for (int j = 0; j < len2; j++) {
				char c2 = s2.charAt(j);

				// if last two chars equal
				if (c1 == c2) {
					// update dp value for +1 length
					dp[i + 1][j + 1] = dp[i][j];
				} else {
					int replace = dp[i][j] + 1;
					int insert = dp[i][j + 1] + 1;
					int delete = dp[i + 1][j] + 1;

					int min = replace > insert ? insert : replace;
					min = delete > min ? min : delete;
					dp[i + 1][j + 1] = min;
				}
			}
		}

		return dp[len1][len2];
	}

}
