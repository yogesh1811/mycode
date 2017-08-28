package DS.Codiblity;

public class FibFrog {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};
		System.out.println(solution(A));

	}

	public static int solution(int[] A) {

		int[] f = new int[30];
		f[0] = 1;
		f[1] = 2;
		for (int i = 2; i < f.length; ++i)
			f[i] = f[i - 1] + f[i - 2];

		int[] mins = new int[A.length + 1];
		for (int i = 0; i < mins.length; ++i) {
			if (i < A.length && A[i] == 0) {
				mins[i] = -1;
				continue;
			}
			int min = Integer.MAX_VALUE;
			for (int j = f.length - 1; j >= 0; --j) {
				int k = i - f[j];
				if (k < -1)
					continue;
				if (k == -1) {
					min = 1;
					break;
				}
				if (mins[k] < 0)
					continue;
				int newMin = mins[k] + 1;
				if (newMin < min)
					min = newMin;
			}
			if (min != Integer.MAX_VALUE)
				mins[i] = min;
			else
				mins[i] = -1;

		}
		return mins[A.length];

	}
}
