package DS.Arrays;

import java.util.Arrays;

public class MinDiffTwoArray {

	/**
	 * 
	 * Find minimum difference between any two elements.
	 * 
	 * solution 1 - two loop - O(n^2)
	 * 
		solution 2 - A. Sort array - nlog(n)
				 B. Loop array only one time O(n)
				 hence total complexity is nLog(n)
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int intArr[] = { 1, 5, 3, 19, 18, 25 };
		Arrays.sort(intArr);
		int min = Integer.MAX_VALUE;
			     
     /*  
      *  solution 1
      *  
      *  // Find the min diff by comparing difference
        // of all possible pairs in given array
        for (int i=0; i<n-1; i++)
            for (int j=i+1; j<n; j++)
                if (Math.abs((intArr[i] - intArr[j]) )< diff)
                    min = Math.abs((intArr[i] - intArr[j]));
     
		*/
		
		/*
		 *  solution 2
		 *  
		 *  */		
		for (int i = 0; i < intArr.length - 1; i++) {
			min = Math.min(min, intArr[i+1] - intArr[i]);
		}
		System.out.println("Min+>" + min);

	}

}
