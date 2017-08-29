package Algo.dp;

public class Fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = 9;
		System.out.println("Fibonacci number is" + " " + fib(n));

	}

	static int fib(int n) {
		int f[] = new int[n + 1];
		f[0] = 0;
		f[1] = 1;
		for (int i = 2; i <= n; i++)
			f[i] = f[i - 1] + f[i - 2];
		return f[n];
	}

}
