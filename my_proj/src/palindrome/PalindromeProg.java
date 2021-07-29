package palindrome;

public class PalindromeProg {

	public static void main(String[] args) {
		System.out.println(isPalindrome("mom"));
		
		System.out.println(isPal("mom"));

	}
	
	public static boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder(s);
		sb.reverse();
		String s1 = sb.toString();
		return s.equals(s1);
	}
	
	public static boolean isPal(String s) {
		return new StringBuilder(s).reverse().toString().equals(s);
	}

}
