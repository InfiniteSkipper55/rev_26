package task1;

public class URL {
	public static void main(String[] args) {
		String s = "https://en.wikipedia.org/wiki/Main_Page";
		url(s);
	}
	
	/*public static void url(String s) {
		 System.out.println(s.replaceAll("[// / :]", "").replace("httpsen.wikipedia.orgwikiMain_Page", "en.wikipedia.org"));
	}*/
	public static void url(String s) {
		 System.out.println(s.replaceAll("^(https?://)?(www\\.)?", ""));
	}

}
