package basic.step10_layer.exception;

/**
 * 10단계 : exception 패키지의 역할
 *
 * "찾지 못했다" 를 null 로 돌려주면 호출한 쪽이 검사를 잊기 쉽다.
 * 업무 규칙 위반은 이렇게 전용 예외로 만들어 던지면 놓칠 수 없다.
 * (mylab.bank.exception.AccountNotFoundException 과 같은 자리)
 */
public class MemberNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public MemberNotFoundException(String message) {
		super(message);
	}
}
