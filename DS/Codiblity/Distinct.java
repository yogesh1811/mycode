package DS.Codiblity;

import java.util.HashSet;
import java.util.Set;

public class Distinct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { -3, 1, 2, -2, 5, 6 };
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {
		Set<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < A.length; i++) {
			s.add(A[i]);
		}
		return s.size();
	}
}
