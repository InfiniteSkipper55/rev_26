package titleCase;

public class TitleCaseProg {
	public static void main(String[] args) {
		String s = "hello this is the string you want to convert the first letter of each word in uppercase";
		System.out.println(convertTitle(s));
	}
	
	public static String convertTitle(String s) {
		String a[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < a.length; i++) {
			sb.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1)).append(" ");
		}
		return sb.toString().trim();
	}

}
