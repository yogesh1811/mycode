package hackerrank.algorithms.string;

public class ReverseEachWordInString {

	public static void main(String[] args) {
		String s = "i.like.this.program.very.much";
		printReverseEachWord(s);
	}

	private static void printReverseEachWord(String s) {
		String[] arr = s.split("\\.");
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			StringBuffer temp = new StringBuffer();
			temp.append(arr[i]);
			sb.append(temp.reverse() + ".");
		}
		System.out.println(sb.substring(0, sb.length() - 1));

	}

}
