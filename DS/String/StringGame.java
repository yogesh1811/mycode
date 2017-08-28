package DS.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class StringGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		String[] inputs = new String[q];
		Integer[] ks = new Integer[q];

		for (int i = 0; i < q; i++) {
			inputs[i] = (in.next());
			ks[i] = (in.nextInt());
		}
		for (int i = 0; i < q; i++) {
			getCount(inputs[i], ks[i]);
		}
	}

	private static void getCount(String s, int k) {
		
		Map<String, Integer> charFreq = new HashMap<String, Integer>();

		for (int i = 0; i < s.length(); i++) {
			String c = String.valueOf(s.charAt(i));
			if (charFreq.containsKey(c)) {
				int cnt = charFreq.get(c);
				/*
				 * if (cnt > maxCnt) { maxCnt = cnt; maxC = c; }
				 */
				charFreq.put((c), cnt + 1);
			} else {
				charFreq.put((c), 1);
			}
		}
		// Sort max count 1st
		List<Entry<String, Integer>> values = new ArrayList<Entry<String, Integer>>(
				charFreq.entrySet());

		Collections.sort(values, new Comparator<Entry<String, Integer>>() {
			public int compare(Entry<String, Integer> o1,
					Entry<String, Integer> o2) {

				return o2.getValue().compareTo(o1.getValue());

			}
		});

		// Reduce count till k
		Double sum = 0.0;
		for (Entry<String, Integer> entry : values) {
			int cnt = 0;
			if (k > entry.getValue()) {
				k = k - entry.getValue();

			} else {
				cnt = entry.getValue() - k;
				k=0;
			}
			if(cnt>0)
			sum = sum + cnt* cnt;
		}

		System.out.println(sum.intValue());

	}

}
