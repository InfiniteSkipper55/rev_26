package coding_challenge;

public class July_Thirty {
	//abab then print b or else print Z
	public static String lovePalindrome(String str) {
		char c = str.charAt(str.length()-1);
		String s = Character.toString(c).concat(str);
		StringBuilder sb = new StringBuilder(s);
		if(s.equals(sb.reverse().toString())) {
			return Character.toString(c);
		}
		else {
			return "Z";
		}
	}
}
