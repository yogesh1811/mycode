package DS;

import java.util.Scanner;

public class AlgorithmicCrush {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		long input[] = new long[n];
		for (int i = 0; i < n; i++) {
			input[i] = 0;
		}

		int m = in.nextInt();
		//7542539201
		//2147483647
		int a[] = new int[m];
		int b[] = new int[m];
		long k[] = new long[m];
		
		for (int i = 0; i < m; i++) {
			a[i] = in.nextInt();
			b[i] = in.nextInt();
			k[i] = in.nextInt();
		}
		long max = 0;
		for (int i = 0; i < m; i++) {
			for (int j = (a[i]-1); j < b[i]; j++) {
				input[j] = input[j] + k[i];
				if(input[j]>max ){
					max = input[j];
				}
			}			
		}		
		/*for (int i = 0; i < input.length; i++) {
			//System.out.println(input[i]);
		}*/
		
		System.out.println(max);
		
		
		/*int ops[][][] = new int[m][m][m];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < m; j++) {
				for (int j2 = 0; j2 < m; j2++) {
					ops[i][j][j2] = in.nextInt();
					System.out.println(ops[i][j][j2] + "\n");
					
				}
			}
		}*/
		
		
		
	}

}
