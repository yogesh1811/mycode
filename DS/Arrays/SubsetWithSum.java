package hackerrank.algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class SubsetWithSum {

	public static void main(String[] args) {
		int[] w = { 10, 7, 5, 18, 12, 20, 15 };

		Arrays.sort(w);

		// List<Vector<Integer>> subsets = new ArrayList<Vector<Integer>>();
		// findSubsetForSum(w, 19, 0, subsets);
		Vector<Integer> v = new Vector<Integer>();

		subset_sum(w, 19, w.length, v);
		System.out.println(v);

	}

	static boolean subset_sum(int s[], int sum, int n, Vector<Integer> v) {
		if (sum == 0) {
			return true;
		}
		if (n <= 0) {
			return false;
		}
		if (sum - s[n - 1] >= 0) {
			v.addElement(s[n - 1]);
			if (subset_sum(s, sum - s[n - 1], n - 1, v))
				return true;
			v.remove(v.size()-1);
		}	
		if (subset_sum(s, sum, n - 1, v)) {
			return true;
		}
		return false;
	}

	private static void findSubsetForSum(int[] w, int sum, int index, List<Vector<Integer>> subsets) {
		int s = 0;
		Vector<Integer> v = new Vector<Integer>();
		for (int i = index; i < w.length; i++) {
			if (w[i] < sum) {
				v.addElement(w[i]);
				s += w[i];
				if (s == sum) {
					subsets.add(v);
					break;
				}

			}

		}

	}

}
