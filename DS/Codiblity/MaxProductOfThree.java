package DS.Codiblity;

import java.util.Arrays;

public class MaxProductOfThree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { -3, 1, 2, -2, 5, 6 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		Arrays.sort(A);
		int n = A.length-1;
		int pos = A[n] * A[n - 1] * A[n - 2];
        int neg = A[0] * A[1] * A[n];
        return Math.max(neg, pos);

	}
}
