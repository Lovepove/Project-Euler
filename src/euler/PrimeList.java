package euler;

import java.util.ArrayList;

public class PrimeList {
	
	/** Returns an ArrayList<Integer> with all primes up to 
	 * and including the number n if n is a prime
	 * @param int n
	 * @return ArrayList<Integer> of primes
	 */
	public static ArrayList<Integer> primeListUpToN(int n) {
		ArrayList<Integer> primes = new ArrayList<Integer>();
		boolean[] numberList = new boolean[n + 1];
		for (int i = 0; i <= n - 2; i++) {
			numberList[i + 2] = true;
		}
		for (int i = 2; i < numberList.length; i++) {
			for (int j = 2; i*j < numberList.length; j++) {
				numberList[i*j] = false;
			}
		}
		for (int i = 0; i < numberList.length; i++) {
			if (numberList[i] == true) {
				primes.add(i);
			}
		}
		return primes;
	}
}