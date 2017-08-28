package DS.Codiblity;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

public class Brackets {

	static Map<Character, Character> oposites = new HashMap<Character, Character>();
	static {
		oposites.put('{', '}');
		oposites.put('[', ']');
		oposites.put('(', ')');
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println(solution("{)"));
	}

	public static int solution(String S) {
		Deque<Character> stack = new ArrayDeque<Character>();
		for (Character c : S.toCharArray()) {
			if (oposites.keySet().contains(c)) {
				stack.addFirst(c);
			} else {
				Character closed = stack.pollFirst();
				if (!c.equals(oposites.get(closed))) {
					return 0;
				}
			}
		}
		return 0 == stack.size() ? 1 : 0;
	}
}
