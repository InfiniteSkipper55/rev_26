package task4;

public class CustomExceptions {

	public static void main(String[] args) {
		Validation v = new Validation();
		try {
			if(v.isValidPAN("DOMPO7896Wp")) {
				System.out.println("PAN Validated successfully");
			}
		}
		catch(InvalidPANException e){
			System.out.println(e.getMessage());
		}
		
		try {
			if(v.isValidEmail("kaushik.rao09@gmail.com")) {
				System.out.println("Email Address Validated successfully");
			}
		}
		catch(InvalidEmailException e){
			System.out.println(e.getMessage());
		}
		
		try {
			if(v.isValidAadhar("3675 9834 6015")) {
				System.out.println("Aadhar Card Number Validated successfully");
			}
		}
		catch(InvalidAadharCardException e){
			System.out.println(e.getMessage());
		}
	}

}
