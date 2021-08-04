package task4;

public class InvalidAadharCardException extends RuntimeException{
	public InvalidAadharCardException(){
		super();
	}
	public InvalidAadharCardException(String message) {
		super(message);
	}

}
