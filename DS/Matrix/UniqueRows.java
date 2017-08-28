package DS.Matrix;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

public class UniqueRows {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int R = 3;
		int C = 6;
		int arr[][] = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 10, 11, 12 },
				{ 1, 2, 3, 4, 5, 6 } };
		Map<String, Vector<Integer>> rowMap = new HashMap<String, Vector<Integer>>();
		getUniqueRows(arr, rowMap, R, C);
		for (Entry<String, Vector<Integer>> entry : rowMap.entrySet()) {
			System.out.println(entry);
		}

	}

	private static void getUniqueRows(int[][] arr,
			Map<String, Vector<Integer>> rowMap, int r, int c) {
		for (int i = 0; i < r; i++) {
			String key="";
			Vector<Integer> temp = new Vector<Integer>();
			for (int j = 0; j < c; j++) {
				key+=arr[i][j];
				temp.add(arr[i][j]);
			}
			rowMap.put(key, temp);			
		}
		
		

	}

}
