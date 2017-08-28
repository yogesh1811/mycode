package Algo.backtracking;

public class Nqueen {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int[][] inputArr = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 0 } };
		if (findSolution(inputArr, 4)) {
			printSolution(inputArr);
		} else {
			System.out.println("False");
		}

	}

	private static void printSolution(int[][] inputArr) {
		for (int i = 0; i < inputArr.length; i++) {
			for (int j = 0; j < inputArr.length; j++)
				System.out.print(inputArr[i][j]);
			System.out.println("");
		}

	}

	private static boolean findSolution(int[][] board, int n) {
		return findQueeenPosition(board, 0);
	}

	private static boolean findQueeenPosition(int[][] board, int row) {
		int n = board.length;
		if (row >= n) {
			return true;
		}
		for (int col = 0; col <= n - 1; col++) {
			if (isSafePlace(board, row, col)) {
				board[row][col] = 1;
				if (findQueeenPosition(board, row + 1)) {
					return true;
				}
			}
			// back tracking placing queen back to 0
			board[row][col] = 0;
		}
		return false;
	}

	private static boolean isSafePlace(int[][] board, int row, int col) {
		// check in same row
		for (int i = col; i < board.length; i++) {
			if (board[row][i] == 1) {
				return false;
			}
		}
		// check for same col
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == 1)
				return false;
		}
		// check in upper diagonal left side
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == 1)
				return false;
		}
		// check in uper diagonal right side
		for (int i = row, j = col; i >= 0 && j <= board.length - 1; i--, j++) {
			if (board[i][j] == 1)
				return false;
		}
		return true;
	}
}
