package hackerrank.algorithms.string;

public class CheckStringRoated {

	public static void main(String[] args) {
		String a = "amazon";
		String b = "onamaz";
		System.out.println(isRoatedByTowPlace(a, b));
	}

	private static String isRoatedByTowPlace(String a, String b) {
		if (a.substring(2, a.length()).equals(b.substring(0, b.length() - 2))
				&& a.substring(0, 2).equals(b.substring(b.length() - 2, b.length()))) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
