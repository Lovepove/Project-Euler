package euler;

public class Euler1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int sum = 0;

		for (int i = 0; i < 1000; i++) {
			if (i % a == 0 || i % b == 0) {
				sum = sum + i;
			}
		}
		System.out.println(sum);
	}
}
