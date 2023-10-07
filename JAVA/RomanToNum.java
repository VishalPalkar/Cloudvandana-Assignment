import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RomanToNum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a Roman number: ");
		String romanNumeral = scanner.nextLine().toUpperCase(); 

		int result = romanToNumber(romanNumeral);
		System.out.println("The equivalent number is: " + result);
	}

	public static int romanToNumber(String s) {
		Map<Character, Integer> romanValues = new HashMap<>();
		romanValues.put('I', 1);
		romanValues.put('V', 5);
		romanValues.put('X', 10);
		romanValues.put('L', 50);
		romanValues.put('C', 100);
		romanValues.put('D', 500);
		romanValues.put('M', 1000);

		int num = 0;
		int preValue = 0;

		for (int i = s.length() - 1; i >= 0; i--) {
			int currentValue = romanValues.get(s.charAt(i));

			if (currentValue < preValue) {
				num -= currentValue;
			} else {
				num += currentValue;
			}
			preValue = currentValue;
		}
		return num;
	}
}


