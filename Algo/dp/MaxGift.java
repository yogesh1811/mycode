package hackerrank.algorithms.dp;

public class MaxGift {

	public static void main(String[] args) {
		int[][] gifts = { { 1, 10, 3, 8 }, { 12, 2, 9, 6 }, { 5, 7, 4, 11 }, { 3, 7, 16, 5 } };

		System.out.println(getMaxValue(gifts));

	}

	public static int getMaxValue(int[][] values) {
		int rows = values.length;
		int cols = values[0].length;
		int[][] maxValues = new int[rows][cols];
		int sum = values[0][0];
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				int left = 0;
				int up = 0;

				if (i > 0) {
					up = maxValues[i - 1][j];
				}

				if (j > 0) {
					left = maxValues[i][j - 1];
				}

				maxValues[i][j] = Math.max(left, up) + values[i][j];
				sum += Math.max(left, up);
			}
		}

		return maxValues[rows - 1][cols - 1];
	}

	public static int getMaxValue1(int[][] values) {
		int rows = values.length;
		int cols = values[0].length;
		int[][] maxValues = new int[rows][cols];
		int sum = values[0][0];
		int i = 0, j = 0;
		while (i == rows && j == cols) {
			if(i<rows){
				int d = values[i+1][j];
			}
			if(j<cols){
				int r = values[i][j+1];
			}
			
			
	
		
		}

		return maxValues[rows - 1][cols - 1];
	}
}
