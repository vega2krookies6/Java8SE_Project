package mylab.student.exception;

public class InvalidGradeException extends Exception {
	//private String errMessage;
	public InvalidGradeException(String errMessage) {
		super(errMessage);
	}
}
