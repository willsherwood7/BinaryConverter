package code;
import java.util.*;


public class Binary {
	public static void main (String [] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Would you like to (1) convert from decimal to binary or (2) convert from binary to decimal?");
		int oneOrTwo = keyboard.nextInt();
		System.out.println("What number would you like to convert?");
		if (oneOrTwo == 1) {
			long num = keyboard.nextLong();
			System.out.print(decimalToBinary(num));
		}
		else {
			String str = keyboard.next();
			System.out.print(binaryToDecimal(str));
		}	
	}
	
	public static String decimalToBinary(long decimal) {
		String toReturn = "";
		while (decimal != 0) {
			toReturn = "" + (int) (decimal % 2) + toReturn;
			decimal = decimal / 2;
		}
		return toReturn;
	}
	
	public static String binaryToDecimal(String binary) {
		long toReturn = 0;
		int index = 0;
		for (int i = binary.length() - 1; i >= 0; i--) {
			int digit = Character.getNumericValue(binary.charAt(i));
			toReturn += (long)(digit * Math.pow(2, index));
			binary = binary.substring(0, binary.length() - 1);
			index++;
		}
		return "" + toReturn;
	}
}
