package euler;

public class Euler6 {
	
	public static void sumSquareDifference() {
		int sumSquares = 0;
		int squareSums = 0;
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sumSquares+= (i * i);

		}
		sum = (100 * 101) / 2;
		squareSums = sum * sum;
		int difference = squareSums - sumSquares;
		System.out.println(difference);
	}

}
