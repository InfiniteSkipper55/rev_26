package task2;

public class MiddleLetter {

	public static void main(String[] args) {
		String s = "hello good noon and have a noice day";
		System.out.println(isMidLetter(s));

	}
	
	public static String isMidLetter(String s) {
		String a[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
		//System.out.println(a[0].length());
		for (int i = 0; i < a.length; i++) {
			if(a[i].length() % 2 != 0) {
				sb.append(a[i].substring(0, a[i].length()/2)).append(Character.toUpperCase(a[i].charAt(a[i].length()/2))).append(a[i].substring(a[i].length()/2+1)).append(" ");
			}
			else {
				sb.append(Character.toUpperCase(a[i].charAt(0))).append(a[i].substring(1)).append(" ");
			}
		}
		return sb.toString().trim();
	}

}
