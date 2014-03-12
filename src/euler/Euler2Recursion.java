package euler;

public class Euler2Recursion {
	
	public static int fibSum() {
		return fibSum(1, 2, 0, 4000000);
	}
	
	private static int fibSum(int a, int b, int result, int max) {
		if (a > max || b > max) {
			return result;
		} 
		int fib = a + b;
		if (a < b) {
			a = b;
		}
		if (fib % 2 == 0) {
			return fibSum(fib, a, result + fib, 4000000);
		} else {
			return fibSum(fib, a, result, 4000000);
		}
	}
}
