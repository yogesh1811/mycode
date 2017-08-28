package DS;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SparseArrays {

	/**
	 * @param args
	 * 
	 * 
	 *            30 30 36 30 15 15 15 15 46 96 90 100 86 86 86 86 100 200 100
	 *            200 -100 200 -100 200
	 * 
	 *            25626 25757 24367 24267 16 100 2 7277
	 */
	public static void main(String[] args) {
		/*
		 * Scanner in = new Scanner(System.in); int sq=0,rec=0,no=0; int arr[][]
		 * = new int[6][4]; for(int arr_i=0; arr_i < 6; arr_i++){ for(int
		 * arr_j=0; arr_j < 4; arr_j++){ arr[arr_i][arr_j] = in.nextInt(); } }
		 * 
		 * for(int i=0; i < 6; i++){
		 * 
		 * if((arr[i][0] == arr[i][2]) && (arr[i][1] == arr[i][3]) && (arr[i][1]
		 * == arr[i][2])){ sq++; }else if ((arr[i][0] == arr[i][2]) &&
		 * (arr[i][1] == arr[i][3])){ rec++; }else{ no++; }
		 * 
		 * } System.out.println(sq + " " +rec + " " + no);
		 */

		Scanner in = new Scanner(System.in);
		int arr[] = new int[8];
		for (int i = 0; i < 8; i++) {
			arr[i] = in.nextInt();
		}

		int result[] = new int[15];
		LinkedList l = new LinkedList();
		// int j = 0;
		for (int i = 0; i < 8 - 1; i++) {
			if (i == 0) {
				l.add(arr[i]);
				l.add(arr[i + 1] - arr[i]);
			} else {
				int diff = arr[i + 1] - arr[i];
				/*
				 * if(diff > 217 || diff<-127 ){ l.add(-128); }else{
				 */
				l.add(diff);
				// }
			}
		}
		StringBuffer sb = new StringBuffer();
		for (Iterator iterator = l.iterator(); iterator.hasNext();) {
			Integer object = (Integer) iterator.next();

			if ((object > 127 || object < -127) && object != arr[0]) {
				sb.append("-128 " + object + " ");
			} else {
				sb.append(object + " ");
			}
		}
		System.out.print(sb.toString().substring(0, sb.length()-1));

		/*
		 * String nSer[] = new String[n]; for (int arr_i = 0; arr_i < n;
		 * arr_i++) { nSer[arr_i] = in.next(); } int q = in.nextInt(); String
		 * qSer[] = new String[q]; for (int arr_i = 0; arr_i < q; arr_i++) {
		 * qSer[arr_i] = in.next(); } int count = 0; for (int i = 0; i <
		 * qSer.length; i++) { for (int j = 0; j < nSer.length; j++) { if
		 * (qSer[i].equals(nSer[j])) { count++; } } System.out.println(count);
		 * count = 0; }
		 */
	}

	class Shape {
		public int A;
		public int B;
		public int C;
		public int D;
	}

}
