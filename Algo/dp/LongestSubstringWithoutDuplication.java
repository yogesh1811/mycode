package hackerrank.algorithms.dp;

public class LongestSubstringWithoutDuplication {

	public static void main(String[] args) {
		System.out.println(longestSubstringWithoutDuplication("abcde"));
		System.out.println(longestSubstringWithoutDuplication("ababa"));
		System.out.println(longestSubstringWithoutDuplication("aabbc"));
		System.out.println(longestSubstringWithoutDuplication("abcdabcd"));
		System.out.println(longestSubstringWithoutDuplication("ababcde"));

	}

	public static int longestSubstringWithoutDuplication(String s) {
		int[] prevP = new int[26];
		int[] dp = new int[s.length() + 1];
		int maxLen = 0;
		for (int i = 0; i < prevP.length; i++)
			prevP[i] = -1;

		for (int i = 1; i <= s.length(); i++) {
			if (prevP[s.charAt(i - 1) - 'a'] < 0 || i - 1 - prevP[s.charAt(i - 1) - 'a'] > dp[i - 1]) {
				dp[i] = dp[i - 1] + 1;
			} else {
				dp[i] = i - 1 - prevP[s.charAt(i - 1) - 'a'];
			}
			prevP[s.charAt(i - 1) - 'a'] = i - 1;
			maxLen = Math.max(maxLen, dp[i]);
		}
		return maxLen;
	}

}
