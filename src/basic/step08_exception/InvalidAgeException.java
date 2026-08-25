package basic.step08_exception;

/**
 * 8단계 : 사용자 정의 예외
 *
 * mylab.student.exception.InvalidGradeException,
 * mylab.bank.exception.InsufficientBalanceException 과 완전히 같은 형태다.
 *
 *   - Exception 상속        → Checked 예외. 호출한 쪽이 반드시 try-catch 또는 throws 해야 한다.
 *   - RuntimeException 상속 → Unchecked 예외. 강제되지 않는다. (IllegalArgumentException 등)
 */
public class InvalidAgeException extends Exception {

	private static final long serialVersionUID = 1L;

	/** 메시지를 부모(Exception)에게 넘기면 getMessage() 로 꺼낼 수 있다. */
	public InvalidAgeException(String message) {
		super(message);
	}
}
