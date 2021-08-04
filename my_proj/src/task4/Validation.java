package task4;

public class Validation {

	public boolean isValidPAN(String p) throws InvalidPANException{
		if(p != null && p.matches("[A-Z]{5}[0-9]{4}[A-Z]{1}")) {
			return true;
		}
		else {
			throw new InvalidPANException("Entered PAN " + p +" is invalid");
		}
	}
	
	public boolean isValidEmail(String email) throws InvalidEmailException{
		if(email.matches("^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$")) {
			return true;
		}
		else {
			throw new InvalidEmailException("Entered email address " + email + " is invalid");
		}
	}
	
	public boolean isValidAadhar(String aadhar) throws InvalidAadharCardException{
		if(aadhar.matches("^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$")) {
			return true;
		}
		else {
			throw new InvalidAadharCardException("Entered Aadhar Card number " + aadhar + " is invalid");
		}
	}
}
