package euler;
import java.util.ArrayList;

public class Euler3 {
	
	public static void main(String[] args){
		ArrayList<Integer> primeFactors = primeFactors(600851475143l);
		for (Integer i : primeFactors) {
			System.out.println(i);
		}
	}
	
	private static ArrayList<Integer> primeFactors(long n) {
		ArrayList<Integer> primes = PrimeList.primeListUpToN(100000);
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		for (int i = 0; i < primes.size(); i++) {
			int current = primes.get(i);
			if (n % current == 0) {
				primeFactors.add(current);
				n = n / current;
			}
		}
		return primeFactors;
	}

}
