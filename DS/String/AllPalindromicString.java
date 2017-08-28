package hackerrank.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AllPalindromicString {

	public static void main(String[] args) {
		String s = "nitin";

		printAllPallindromUtil(s);

	}

	private static void printAllPallindromUtil(String s) {
		char[] strArr = s.toCharArray();

		Map<Character, StringBuffer> m = new HashMap<Character, StringBuffer>();

		for (int i = 0; i < strArr.length; i++) {
			if (m.get(strArr[i]) == null) {
				m.put(strArr[i], new StringBuffer().append(strArr[i]));
			} else {
				m.put(strArr[i], m.get(strArr[i]).append(strArr[i]));
			}
		}
		Set<String> v = new HashSet<String>();

		/*
		 * for (Entry<Character, StringBuffer> entry : m.entrySet()) { if
		 * (entry.getValue().reverse().equals(entry.getValue())) {
		 * System.out.println(entry.getValue()); } }
		 */

		addString(strArr, 0, v);

		System.out.println(v);

	}

	private static void addString(char[] strArr, int index, Set<String> v) {

		StringBuffer str = new StringBuffer();
		for (int i = index; i < strArr.length; i++) {
			str.append(strArr[i]);
			String temp = str.toString();
			if (str.reverse().toString().equals(temp)) {
				v.add(str.toString());
			}
			str.reverse();
		}
		if (index < strArr.length) {
			addString(strArr, index + 1, v);
		}

	}

}
