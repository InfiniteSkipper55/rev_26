package task2;

public class PalindromeReverse {

	public static void main(String[] args) {
		String s = "hello this is the string you want to reverse it if it is not palindrome boob noon soos totot";
		System.out.println(isPalindrome(s));

	}
	
	public static String isPalindrome(String s) {
		String a[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a.length; i++) {
			sb.append(new StringBuilder(a[i]).reverse().toString()).append(" ");
		}
		return sb.toString().trim();
	}

}
