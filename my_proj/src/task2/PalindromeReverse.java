package task2;

public class PalindromeReverse {

	public static void main(String[] args) {
		String s = "hello this is the string you want to reverse it if it is not palindrome";
		System.out.println(isPalindrome(s));

	}
	
	public static boolean isPalindrome(String s) {
		String a[] = s.split(" ");
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String s1 = sb.toString();
		return s.equals(s1);
	}

}
