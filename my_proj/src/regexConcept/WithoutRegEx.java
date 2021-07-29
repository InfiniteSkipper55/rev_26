package regexConcept;

public class WithoutRegEx {
	
	//To print PAN there should be 5 Uppercase letters, 4 digits and 1 Uppercase letter

	public static void main(String[] args) {
		System.out.println("DONPT7538E");

	}
	
	/*public static boolean isValidPAN(String p){
		boolean b = false;
		if(p.length() == 10 && Character.isUpperCase(p.charAt(9))){
			int upper = 0;
			for(int i = 0; i < 5; i++) {
				upper++;
			}
			if(upper == 5) {
				int digits = 0;
				for(int i = 5; i < 9; i++) {
					
				}
			}
		}
		
	}*/

}
