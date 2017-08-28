package DS.String;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class SecondMostRepeatedString {

	/*
	 * 1 6 aaa bbb ccc bbb aaa aaa
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int q = in.nextInt();
		List<String[]> inputs = new ArrayList<String[]>(q);

		for (int i = 0; i < q; i++) {

			int n1 = in.nextInt();
			String[] input = new String[n1];
			for (int j = 0; j < n1; j++) {
				input[j] = in.next();
			}
			inputs.add(input);

		}
		for (Object input1 : inputs) {
			print2ndRepeatedWord((String[]) input1);
		}

	}

	private static void print2ndRepeatedWord(String[] words) {
		// String[] words = words.split(" ");
		Map<String, Word> wordMap = new HashMap<String, Word>();
		for (String word : words) {
			if (wordMap.containsKey(word)) {
				wordMap.put(word, new Word(word, wordMap.get(word).count + 1));
			} else {
				wordMap.put(word, new Word(word, 1));
			}
		}
		List<Entry<String, Word>> values = new ArrayList<Entry<String, Word>>(
				wordMap.entrySet());

		Collections.sort(values, new Comparator<Entry<String, Word>>() {
			public int compare(Entry<String, Word> o1, Entry<String, Word> o2) {

				return o2.getValue().count.compareTo(o1.getValue().count);

			}
		});
		System.out.println(values.get(1).getValue().word);

	}

}

class Word {
	String word;

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	Integer count;

	Word(String word, Integer count) {
		this.word = word;
		this.count = count;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + count;
		result = prime * result + ((word == null) ? 0 : word.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		if (count != other.count)
			return false;
		if (word == null) {
			if (other.word != null)
				return false;
		} else if (!word.equals(other.word))
			return false;
		return true;
	}

}
