package DS;

import java.util.Arrays;

public class BinarySearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// initializing unsorted int array
		   int intArr[] = {30,20,5,12,55};
		   Arrays.sort(intArr);
		   
		   int searchVal = 120;
		   
		   int retVal = Arrays.binarySearch(intArr,searchVal);
			
		   System.out.println("The index of element 12 is : " + retVal);

	}

}
