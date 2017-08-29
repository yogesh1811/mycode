package Algo.dp;

public class ClimbingStairs {

	/**
	 * You are climbing a stair case. It takes n steps to reach to the top.
	 * 
	 * Each time you can either climb 1 or 2 steps. In how many distinct ways
	 * can you climb to the top?
	 */
	public static void main(String[] args) {

		System.out.println(findWaysOfClimbingStairs(3));

	}

	private static int findWaysOfClimbingStairs(int n) {
		int[] stairs = new int[n + 1];
		if (n < 3) {
			return n;
		}
		stairs[1] = 1;
		stairs[2] = 2;

		for (int i = 3; i <= n; i++) {
			stairs[i] = stairs[i - 1] + stairs[i - 2];
		}
		return stairs[n];
	}

}
