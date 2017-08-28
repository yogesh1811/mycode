package DS.Codiblity;

import java.util.ArrayList;
import java.util.List;

public class BinaryGap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(findBinaryGap(529));
	}

	private static int findBinaryGap(int N) {
		List<Integer> bList = new ArrayList<Integer>();
		convert(bList, N);
		int bit = 0, cnt = 0;
		int max = 0;
		for (Integer num : bList) {
			if (num == 1) {
				bit = 1;
				max = Math.max(max, cnt);
				cnt = 0;
				continue;
			}
			if (bit == 1) {
				cnt++;
			}
		}
		return max;
	}

	public static void convert(List<Integer> bList, int num) {
		if (num > 0) {
			convert(bList, num / 2);
			bList.add(num % 2);
		}
	}
}
