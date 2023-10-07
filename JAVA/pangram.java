import java.util.HashSet;
import java.util.Scanner;

public class PangramString {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine().toLowerCase();

		int count = 0;
		
		
		HashSet<Integer> s = new HashSet<Integer>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i); 
			int a = (int) ch;
			s.add(a);
		}

		for (int a : s) {
			
			if (a >= 65 && a <= 90 || a >= 97 && a <= 122) {
				count++;
			}
		}
		
		if (count == 26) {
			System.out.println(" It is apangram string...");
		} else {
			System.out.println("It is not a pangram string...");

		}
	}
}