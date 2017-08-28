package DS;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayRotation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int d = in.nextInt();
		
        int nums[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            nums[arr_i] = in.nextInt();            
        }
        rotate(nums,d);
	}

	public static void rotate(int[] nums, int k) {
		if (k > nums.length)
			k = k % nums.length;
		int[] result = new int[nums.length];
		/*
		 * Right rotated
		 * 
		 * for (int i = 0; i < k; i++) {
			result[i] = nums[nums.length - k + i];
		}
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[i] = nums[j];
			j++;
		}*/
		int j = 0;
		for (int i = k; i < nums.length; i++) {
			result[j] = nums[i];
			j++;
		}
		
		for (int i = 0; i < k; i++) {
			result[j] = nums[i];
			j++;
			
		}
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}
		
		//System.arraycopy(result, 0, nums, 0, nums.length);
		
		
				
		
	}

}
