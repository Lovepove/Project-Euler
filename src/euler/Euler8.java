package euler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Euler8 {
	
	public static void fiveLargestProduct() {
		try {
			Scanner scan = new Scanner(new File("Euler8Input"));
			String input = null;
			while (scan.hasNext()) {
				input = "" + scan.next();
			}
			scan.close();
			String inputSubString = null;
			int max = 0;
			int subStringProduct;
			for (int i = 0; i < input.length()-4; i++) {
				subStringProduct = 0;
				inputSubString = input.substring(i, i + 5);
				for (int j = 0; j < inputSubString.length(); j++) {
					char c = inputSubString.charAt(j);
					int x = Character.getNumericValue(c);
					if (subStringProduct == 0) {
						subStringProduct += x;
					} else {
						subStringProduct *= x;
					}
				}
				if (max < subStringProduct) {
					max = subStringProduct;
				}
			}
			System.out.println(max);
		} catch (FileNotFoundException e) {
			System.out.println("No such file was found");
			System.exit(1);
		}
	}

}
