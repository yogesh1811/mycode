package DS.String;

public class LongestPalinSubstring {

	public static void main(String[] args) {
		String str = "forgeeksyskeegfor";
		System.out.println("Length is: " + longestPalSubstr(str));
	}

	private static int longestPalSubstr(String str) {
		int maxLength = 1; // The result (length of LPS)

		int start = 0;
		int len = str.length();

		int low, high;

		// One by one consider every character as center
		// point of even and length palindromes
		for (int i = 1; i < len; ++i) {
			// Find the longest even length palindrome with
			// center points as i-1 and i.
			low = i - 1;
			high = i;
			while (low >= 0 && high < len
					&& str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}

			// Find the longest odd length palindrome with
			// center point as i
			low = i - 1;
			high = i + 1;
			while (low >= 0 && high < len
					&& str.charAt(low) == str.charAt(high)) {
				if (high - low + 1 > maxLength) {
					start = low;
					maxLength = high - low + 1;
				}
				--low;
				++high;
			}
		}

		System.out.print("Longest palindrome substring is: ");
		printSubStr(str, start, start + maxLength - 1);

		return maxLength;
	}

	private static void printSubStr(String str, int low, int high) {
		System.out.println(str.substring(low, high + 1));

	}

}
