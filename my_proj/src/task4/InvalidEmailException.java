package task4;

public class InvalidEmailException extends RuntimeException {
	public InvalidEmailException(){
		super();
	}
	public InvalidEmailException(String message) {
		super(message);
	}
}
