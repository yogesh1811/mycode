package DS.Codiblity;

import java.util.HashSet;
import java.util.Set;

public class Hotel {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] A = { 60, 80, 40 };
		int[] B = { 2, 3, 5 };

		System.out.println(solution(A, B, 5, 2, 200));

	}

	public static int solution(int[] A, int[] B, int floors, int maxPerson,
			int maxWeight) {
		Set<Integer> stops = new HashSet<Integer>();
		int stopsTillNow = 0;
		long groessWeight = 0;
		int personInLift = 0;
		int currPerson = 0;
		boolean startLift = false;
		while (currPerson < A.length) {

			if (B[currPerson] <= floors
					&& (groessWeight + A[currPerson]) <= maxWeight
					&& (personInLift + 1) <= maxPerson) {
				groessWeight += A[currPerson];
				personInLift++;
				stops.add(B[currPerson]);
				if (currPerson == A.length - 1)
					startLift = true;
				currPerson++;
			} else {
				startLift = true;
			}

			if (startLift) {
				stopsTillNow += stops.size() + 1;
				startLift = false;
				personInLift = 0;
				groessWeight = 0;
				stops.clear();
			}
		}
		return stopsTillNow;
	}
}
