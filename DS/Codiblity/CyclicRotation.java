package DS.Codiblity;

public class CyclicRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };

		System.out.println(solution(A, 2));

	}

	public static int[] solution(int[] A, int K) {
		int[] B = new int[A.length];
		for (int i = 0; i < A.length; i++) {
			B[(i + K) % A.length] = A[i];
		}
		return B;
	}
}
