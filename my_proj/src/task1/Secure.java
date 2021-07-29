package task1;

public class Secure {
	public static void main(String[] args) {
		System.out.println(isSecure("https://en.wikipedia.org/wiki/Main_Page"));
		System.out.println(isSecure("http://en.wikipedia.org/wiki/Main_Page"));
	}
	
	public static String isSecure(String s) {
		if(s.startsWith("https")) {
			return "secure"; 
		}
		else {
			return "not secure";
		}
	}

}
