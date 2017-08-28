package Algo.backtracking;

public class Numbe2WordDailPad {

	static final String[] hashTable = { "", "", "abc", "def", "ghi", "jkl",
			"mno", "pqrs", "tuv", "wxyz" };

	public static void main(String[] args) {
		int number[] = { 0, 4, 5 };
		printWords(number, number.length);
	}

	static void printWords(int number[], int n) {
		char result[] = new char[n + 1];
		result[n] = '\n';
		printWordsUtil(number, 0, result, n);
	}

	static void printWordsUtil(int number[], int curr_digit, char output[],
			int n) {
		// Base case, if current output word is prepared
		int i = 0;
		if (curr_digit == n) {
			System.out.print(output.toString());
			System.out.print(" ");
			return;
		}

		// Try all 3 possible characters for current digit in number[]
		// and recur for remaining digits
		while (curr_digit < n) {
			while (i < hashTable[number[curr_digit]].length()) {
				if (number[curr_digit] == 0 || number[curr_digit] == 1) {
					curr_digit++;
					continue;
				}
				output[curr_digit] = hashTable[number[curr_digit]].charAt(i);
				printWordsUtil(number, curr_digit + 1, output, n);
				i++;
			}
			curr_digit++;
		}
	}

}
