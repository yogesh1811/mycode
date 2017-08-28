package hackerrank.algorithms;

public class Fibonacci {

	public static void main(String[] args) {
		generateFibonacciArray(10000);
	}
	private static void generateFibonacci(int n) {
		long a =0, b=1;		
		for(int i=2 ; i<n; i++){
			long sum = a+b;
			a = b;
			b = sum;		
			System.out.println(sum);
		}			
	}
	private static long[] generateFibonacciArray(int n) {
		//long a =0, b=1;
		long[] retArr = new long[n];
		retArr[0] =0;
		retArr[1] =1;
		for(int i=2 ; i<n; i++){
			/*long sum = a+b;
			a = b;
			b = sum;*/		
			retArr[i] = retArr[i-1]+retArr[i-2];
		}	
		System.out.println(retArr[retArr.length-1]);
		return retArr;
	}
}
