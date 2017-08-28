package DS.Arrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		/*
		 * int[] A = new int[100]; for (int i = 1; i < 101; i++) { A[i - 1] =
		 * 100 + i; } System.out.println(solution(A));
		 */

		int[] A = { 1, 3, 2 };
		System.out.println(solution(A));

		/*
		 * double d = 42.1 + 42.2; float d1 = 42.1f + 42.2f;
		 * 
		 * 
		 * System.out.println("value: " + d); System.out.println("value: %f " +
		 * d1); System.out.printf("value: %.2f", d1);
		 */

		/*
		 * List<Integer> list = Arrays.asList(25, 50, 7, 11);
		 * 
		 * System.out.println(findBiggestSum(list));
		 */

	}

	public static int solution(int[] A) {
		if (A == null) {
			return 1;
		}
		if (A.length == 1 && A[0] != 1) {
			return 1;
		}
		if (A.length == 1 && A[0] == 1) {
			return 2;
		}
		Arrays.sort(A);
		boolean one = false;
		int min = Integer.MAX_VALUE;

		int ch = -1;
		for (int i = 0; i < A.length; i++) {
			if (A[i] < 0) {
				continue;
			} else {
				ch = 0;
				break;
			}
		}
		if (ch == -1)
			return 1;

		for (int i = 1; i < A.length; i++) {
			if (A[i - 1] == 1 || A[i] == 1) {
				one = true;
			}
			if ((A[i] - A[i - 1] >= 2) && (A[i] > 0 && A[i - 1] > 0)) {
				// System.out.println(A[i - 1] + 1);
				min = Math.min(min, A[i - 1] + 1);
			}
		}
		if (!one) {
			return 1;
		} else {
			return Math.min(min, A[A.length - 1]+1);
		}

	}

	private static int findBiggestSum(List<Integer> list) {
		if (list == null || list.size() < 2) {
			return 0;
		}
		Collections.sort(list);
		return (list.get(list.size() - 1) + list.get(list.size() - 2));

	}
}
