import java.util.*;

public class PalindromeChecker {
	public static void main(String[] args) {
		System.out.println("Palindrome Checker v0.1.0");

		Scanner sc = new Scanner(System.in);

		System.out.print("Input text: ");
		String str = sc.nextLine();

		boolean result = true;

		for (int i = 0; i <= str.length()/2; i++) {
			if (str.charAt(i) != str.charAt(str.length()-1-i)) {
				result = false;
				break;
			}
		}

		System.out.print("Is it a Palindrome? : ");
		if (!result) {
			System.out.println("false");
		} else {
			System.out.println("true");
		}

		sc.close();
	}
}