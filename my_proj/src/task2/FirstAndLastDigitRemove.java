package task2;

public class FirstAndLastDigitRemove {

	public static void main(String[] args) {
		String a[] = {"121", "100", "101", "205", "525", "639", "747"};
		StringBuffer sb = new StringBuffer();
	
		for (int i = 0; i < a.length; i++) {
			if(a[i].charAt(0) == a[i].charAt(a[i].length()-1)) {
				
			}
			else {
				sb.append(a[i]).append(" ");
			}
		}
		System.out.println(sb.toString().trim());

	}

}
