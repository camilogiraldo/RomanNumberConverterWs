package co.udea.empresariales.romanconverter;

public class RomanConversor {

	public static String INVALID_NUMBER = "INVALID NUMBER";
	private static final int[] VALUES = { 1000, 900, 500, 400, 100, 90, 50, 40,
			10, 9, 5, 4, 1 };
	private static final String[] SYMBOLS = { "M", "CM", "D", "CD", "C", "XC",
			"L", "XL", "X", "IX", "V", "IV", "I" };

	public String convertNumber(int number) {
		StringBuilder result = new StringBuilder();
		int remaining = number;
		if (number <= 0 || number > 1000) {
			return (INVALID_NUMBER);
		}
		for (int i = 0; i < VALUES.length; i++) {
			remaining = appendRomanNumerals(remaining, VALUES[i], SYMBOLS[i],
					result);

		}

		return result.toString();
	}

	public int appendRomanNumerals(int number, int value, String romanDigits,
			StringBuilder builder) {
		int result = number;
		while (result >= value) {
			builder.append(romanDigits);
			result = result - value;
		}

		return result;
	}
}
