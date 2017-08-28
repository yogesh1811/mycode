package DS.Codiblity;

import java.util.HashSet;
import java.util.Set;

public class OddOccurrencesInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(solution(A));
	}

	public static int solution(int[] A) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			if (set.contains(A[i])) {
				set.remove(A[i]);
			} else {
				set.add(A[i]);
			}
		}
		if (set.size() == 0)
			return 0;
		return set.iterator().next();

	}

	/*
	 * public static int[] solution(int[] A, int K) { int[] B = new
	 * int[A.length]; for(int i = 0; i < A.length; i++) { B[(i + K) % A.length]
	 * = A[i]; } return B; }
	 */

}
