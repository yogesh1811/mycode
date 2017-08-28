package DS.String;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Scanner;

public class StringGameV1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner ss = new Scanner(System.in);

		int test = ss.nextInt();
		while (test-- > 0) {
			String str = ss.next();
			int k = ss.nextInt();

			int arr[] = new int[26];

			for (int i = 0; i < str.length(); i++) {
				arr[(int) str.charAt(i) - 97]++;
			}

			PriorityQueue<Integer> pq = new PriorityQueue(
					Collections.reverseOrder());

			for (int j = 0; j < 26; j++) {
				if (arr[j] > 0)
					pq.add(arr[j]);
			}

			while (k > 0) {

				int t = pq.poll();
				t -= 1;
				pq.add(t);

				k--;
			}
			int ans = 0;
			while (!pq.isEmpty()) {
				int pp = pq.poll();

				ans += (pp * pp);
			}

			System.out.println(ans);
		}
	}
}
