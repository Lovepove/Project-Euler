package euler;

public class Euler5 {
	
	public static int smallestMultiple() {
		int smallestMultiple = 1;
		for (int i = 1; i <= 20; i++) {
			if (smallestMultiple % i != 0) {
				smallestMultiple++;
				i = 1;
			}
		}
		System.out.println(smallestMultiple);
		return smallestMultiple;
	}

}
