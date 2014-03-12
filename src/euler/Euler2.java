package euler;

public class Euler2 {

	public static void main(String[] args) {
		int fib1 = 1;
		int fib2 = 0;
		int sum = 0;
		for (int i = 0; i < 4000000;) {
			if (fib1 > fib2) {
				fib2 = fib1 + fib2;
				i = fib2;
				if (i % 2 == 0) {
					sum = sum + i;
				}
			} else {
				fib1 = fib2 + fib1;
				i = fib1;
				if (i % 2 == 0) {
					sum = sum + i;
				}
			}
		}
		System.out.println(sum);
	}
}