package Algo.backtracking;

public class RatNMaze {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int maze[][] = { { 1, 0, 0, 0 }, { 1, 1, 0, 1 }, { 0, 1, 0, 0 },
				{ 1, 1, 1, 1 } };
		solveMaze(maze);
	}

	private static boolean solveMaze(int[][] maze) {
		int path[][] = { { 0, 0, 0, 0 }, { 0, 0, 0, 0 }, { 0, 0, 0, 0 },
				{ 0, 0, 0, 0 } };

		if (solveMazeUtil(maze, 0, 0, path) == false) {
			System.out.print("Solution doesn't exist");
			return false;
		}

		printPath(path);
		return true;
	}

	private static boolean solveMazeUtil(int[][] maze, int x, int y,
			int[][] path) {
		int mazeSize = maze.length - 1;
		if (x == mazeSize && y == mazeSize) {
			path[x][y] = 1;
			return true;
		}
		if (canMove(maze, x, y)) {
			path[x][y] = 1;
			if (solveMazeUtil(maze, x + 1, y, path))
				return true;

			if (solveMazeUtil(maze, x, y + 1, path))
				return true;
			path[x][y] = 0;
			return false;
		}
		return false;
	}

	private static boolean canMove(int[][] maze, int x, int y) {
		int n = maze.length;
		return (x >= 0 && x < n && y >= 0 && y < n && maze[x][y] == 1);
	}

	private static void printPath(int[][] path) {
		for (int i = 0; i < path.length; i++) {
			for (int j = 0; j < path.length; j++)
				System.out.print(" " + path[i][j] + " ");
			System.out.println();
		}

	}

}
