package Algo.backtracking;

public class Sudoku {

	/**
	 * @param args
	 */

	public static void main(String[] args) {
		int[][] grid = { { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
				{ 5, 2, 0, 0, 0, 0, 0, 0, 0 }, { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
				{ 0, 0, 3, 0, 1, 0, 0, 8, 0 }, { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
				{ 0, 5, 0, 0, 9, 0, 6, 0, 0 }, { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 7, 4 }, { 0, 0, 5, 2, 0, 6, 3, 0, 0 } };

		if (SolveSudoku(grid) == true)
			printGrid(grid);
		else
			System.out.println("No solution exists");

	}

	private static boolean SolveSudoku(int[][] grid) {
		int row = 0, col = 0;
		boolean flag = false;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] == 0) {
					row = i;
					col = j;
					flag = true;
					break;
				}
			}
			if (flag) {
				break;
			}
		}
		// If there is no unassigned location, we are done
		if (!flag)
			return true; // success!

		// consider digits 1 to 9
		for (int num = 1; num <= 9; num++) {
			// if looks promising
			if (isSafe(grid, row, col, num)) {
				// make tentative assignment
				grid[row][col] = num;

				// return, if success, yay!
				if (SolveSudoku(grid))
					return true;

				// failure, unmake & try again
				grid[row][col] = 0;
			}
		}
		return false; // this triggers backtracking
	}

	private static boolean isSafe(int[][] grid, int row, int col, int num) {

		return !UsedInRow(grid, row, num) && !UsedInCol(grid, col, num)
				&& !UsedInBox(grid, row - row % 3, col - col % 3, num);
	}

	private static boolean UsedInBox(int[][] grid, int boxStartRow,
			int boxStartCol, int num) {
		for (int row = 0; row < 3; row++)
			for (int col = 0; col < 3; col++)
				if (grid[row + boxStartRow][col + boxStartCol] == num)
					return true;
		return false;
	}

	private static boolean UsedInCol(int[][] grid, int col, int num) {
		for (int row = 0; row < grid.length; row++)
			if (grid[row][col] == num)
				return true;
		return false;
	}

	private static boolean UsedInRow(int[][] grid, int row, int num) {
		for (int col = 0; col < grid.length; col++)
			if (grid[row][col] == num)
				return true;
		return false;
	}

	static void printGrid(int[][] grid) {
		for (int row = 0; row < grid.length; row++) {
			for (int col = 0; col < grid.length; col++)
				System.out.print(grid[row][col] + " ");
			System.out.println("");
		}
	}
}
