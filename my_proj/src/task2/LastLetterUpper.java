package task2;

public class LastLetterUpper {

	public static void main(String[] args) {
		String s = "hello this is the string you want to convert the last letter of each word in uppercase";
		System.out.println(convertLastLetterTitle(s));

	}
	
	public static String convertLastLetterTitle(String s) {
		
		String a[] = s.split(" ");
		StringBuilder sb = new StringBuilder();
	
		for(int i = 0; i < a.length; i++) {
			sb.append(a[i].substring(0, a[i].length()-1)).append(Character.toUpperCase(a[i].charAt(a[i].length()-1))).append(" ");
		}
		return sb.toString().trim();
	}

}
