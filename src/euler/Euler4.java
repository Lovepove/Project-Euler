package euler;

public class Euler4 {

	public static int palindrome() {
		int palindrome = 0;
		for (int i = 999; i > 99; i--) {
			for (int j = 999; j > 99; j--) {
				String palindromeCheck = "" + i * j;
				if (palindromeCheck.charAt(0) == palindromeCheck.charAt(palindromeCheck.length()-1)) {
					if (palindromeCheck.charAt(1) == palindromeCheck.charAt(palindromeCheck.length() - 2)) {
						if (palindromeCheck.charAt(2) == palindromeCheck.charAt(palindromeCheck.length() - 3))  {
							if (i * j > palindrome) {
								palindrome = i * j;
							}
						}
					}
				}
			}
		}
		return palindrome;
	}
}
